package com.mgs.dlt.utils;

import org.apache.http.HttpStatus;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *  m_ 2018/6/23.
 */
public class SimpleCORSFilter implements Filter {
    private boolean isCross = false;

    @Override
    public void destroy() {
        isCross = false;
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
            throws IOException, ServletException {
        try {

            HttpServletRequest hreq = (HttpServletRequest) req;



            HttpServletResponse hresp = (HttpServletResponse) resp;

            //跨域
            hresp.setHeader("Access-Control-Allow-Origin",hreq.getHeader("Origin"));

            //跨域 Header
            hresp.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
            hresp.setHeader("Access-Control-Allow-Headers", "Content-Type,XFILENAME,XFILECATEGORY,XFILESIZE");
            hresp.setHeader("Access-Control-Allow-Credentials", "true");
            hresp.setHeader("Access-Control-Max-Age", "3600");




            // 浏览器是会先发一次options请求，如果请求通过，则继续发送正式的post请求

            // 配置options的请求返回

            if (hreq.getMethod().equals("OPTIONS")) {

                hresp.setStatus(HttpStatus.SC_OK);

                // hresp.setContentLength(0);

                hresp.getWriter().write("OPTIONS returns OK");

                return;

            }

            // Filter 只是链式处理，请求依然转发到目的地址。

            chain.doFilter(req, resp);

        } catch (Exception e) {

            e.printStackTrace();

        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String isCrossStr = filterConfig.getInitParameter("IsCross");
        isCross = isCrossStr.equals("true") ? true : false;
        System.out.println(isCrossStr);
    }

}

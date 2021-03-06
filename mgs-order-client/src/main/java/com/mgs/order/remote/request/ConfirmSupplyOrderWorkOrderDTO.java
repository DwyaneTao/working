package com.mgs.order.remote.request;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ConfirmSupplyOrderWorkOrderDTO implements Serializable{

    /**
     * 供货单编码
     */
    private String supplyOrderCode;

    /**
     * 通知金额
     */
    private BigDecimal notifyAmt;

    /**
     * 确认金额
     */
    private BigDecimal confirmAmt;

    private String operator;

    /**
     * 订单归属人
     */
    private String orderOwnerName;
}

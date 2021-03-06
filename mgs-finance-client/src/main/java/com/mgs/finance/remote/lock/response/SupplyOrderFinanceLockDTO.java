package com.mgs.finance.remote.lock.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SupplyOrderFinanceLockDTO implements Serializable{

    /**
     * 供货单id
     */
    private Integer supplyOrderId;

    /**
     * 供货单号
     */
    private String supplyOrderCode;

    /**
     * 下单日期
     */
    private Date createdDt;

    /**
     * 分销商名称
     */
    private String supplierName;

    /**
     * 酒店名称
     */
    private String hotelName;

    /**
     * 房型名称
     */
    private String roomName;

    /**
     * 入住日期
     */
    private Date startDate;

    /**
     * 离店日期
     */
    private Date endDate;

    /**
     * 入住人
     */
    private String guest;

    /**
     * 间数
     */
    private Integer roomQty;

    /**
     * 锁定状态：0未锁定，1已锁定
     */
    private Integer lockStatus;
}

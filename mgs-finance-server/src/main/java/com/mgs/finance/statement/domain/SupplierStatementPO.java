package com.mgs.finance.statement.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Data
@Table(name = "f_supplier_statement")
public class SupplierStatementPO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 账单编码
     */
    @Column(name = "statement_code")
    private String statementCode;

    /**
     * 账单名称
     */
    @Column(name = "statement_name")
    private String statementName;

    /**
     * 账单状态
     */
    @Column(name = "statement_status")
    private Integer statementStatus;

    /**
     * 机构编码
     */
    @Column(name = "supplier_code")
    private String supplierCode;

    /**
     * 机构名称
     */
    @Column(name = "supplier_name")
    private String supplierName;

    /**
     * 开始日期
     */
    @Column(name = "start_date")
    private Date startDate;

    /**
     * 结束日期
     */
    @Column(name = "end_date")
    private Date endDate;

    /**
     * 币种
     */
    private Integer currency;

    /**
     * 账单金额
     */
    @Column(name = "statement_amt")
    private BigDecimal statementAmt;

    /**
     * 已付金额
     */
    @Column(name = "paid_amt")
    private BigDecimal paidAmt;

    /**
     * 未付金额
     */
    @Column(name = "unpaid_amt")
    private BigDecimal unpaidAmt;

    /**
     * 收款未确认
     */
    @Column(name = "unconfirmed_received_amt")
    private BigDecimal unconfirmedReceivedAmt;

    /**
     * 付款未确认
     */
    @Column(name = "unconfirmed_paid_amt")
    private BigDecimal unconfirmedPaidAmt;

    /**
     * 结算状态
     */
    @Column(name = "settlement_status")
    private Integer settlementStatus;

    /**
     * 结算日期
     */
    @Column(name = "settlement_date")
    private Date settlementDate;

    /**
     * 商家编码
     */
    @Column(name = "company_code")
    private String companyCode;

    /**
     * 创建人
     */
    @Column(name = "created_by")
    private String createdBy;

    /**
     * 创建时间
     */
    @Column(name = "created_dt")
    private Date createdDt;

    /**
     * 修改人
     */
    @Column(name = "modified_by")
    private String modifiedBy;

    /**
     * 修改时间
     */
    @Column(name = "modified_dt")
    private Date modifiedDt;

    /**
     * 实际结算时间
     */
    private Date realSettlementDate;

}
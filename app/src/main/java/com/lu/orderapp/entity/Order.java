package com.lu.orderapp.entity;

import java.io.Serializable;

/**
 * Created by lu on 10/15/17.
 */

public class Order implements Serializable{
    private static final long serialVersionUID = 1924533924616041432L;
    private String orderId;         //订单编号
    private String ApplyDateTime;   //申请时间
    private String orderType;       //订单类型（普通流程/临时急需流程）
    private String reason;          //申请原因
    private String candidateSupplier;//候选供应商
    private String comment;         //备注
    private String attachments;     //附件

    public Order(){}
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getApplyDateTime() {
        return ApplyDateTime;
    }

    public void setApplyDateTime(String applyDateTime) {
        ApplyDateTime = applyDateTime;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getCandidateSupplier() {
        return candidateSupplier;
    }

    public void setCandidateSupplier(String candidateSupplier) {
        this.candidateSupplier = candidateSupplier;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAttachments() {
        return attachments;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", ApplyDateTime='" + ApplyDateTime + '\'' +
                ", orderType='" + orderType + '\'' +
                ", reason='" + reason + '\'' +
                ", candidateSupplier='" + candidateSupplier + '\'' +
                ", comment='" + comment + '\'' +
                ", attachments='" + attachments + '\'' +
                '}';
    }
}
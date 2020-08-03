package com.norma.met.lab.model;

import javassist.bytecode.ByteArray;

public class Report {

    private Object order;
    private String customer;
    private String customerEmail;
    private String customerDepartment;
    private String reportNr;
    private String title;
    private String status;
    private Object reportPDF;


    public Report(Object order, String customer, String customerEmail, String customerDepartment, String reportNr, String title, String status, Object reportPDF) {
        this.order = order;
        this.customer = customer;
        this.customerEmail = customerEmail;
        this.customerDepartment = customerDepartment;
        this.reportNr = reportNr;
        this.title = title;
        this.status = status;
        this.reportPDF = reportPDF;
    }

    public String getReportNr() {
        return reportNr;
    }

    public void setReportNr(String reportNr) {
        this.reportNr = reportNr;
    }

    public Object getOrder() {
        return order;
    }

    public void setOrder(ByteArray order) {
        this.order = order;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerDepartment() {
        return customerDepartment;
    }

    public void setCustomerDepartment(String customerDepartment) {
        this.customerDepartment = customerDepartment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getReportPDF() {
        return reportPDF;
    }

    public void setReportPDF(ByteArray reportPDF) {
        this.reportPDF = reportPDF;
    }
}

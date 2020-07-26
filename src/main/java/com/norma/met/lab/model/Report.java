package com.norma.met.lab.model;

public class Report {

    private Object order;
    private String customer;
    private String customerDepartment;
    private String title;
    private String status;
    private Object reportPDF;


    public Object getOrder() {
        return order;
    }

    public void setOrder(Object order) {
        this.order = order;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
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

    public void setReportPDF(Object reportPDF) {
        this.reportPDF = reportPDF;
    }

    public Report(Object order, String customer, String customerDepartment, String title, String status, Object reportPDF) {
        this.order = order;
        this.customer = customer;
        this.customerDepartment = customerDepartment;
        this.title = title;
        this.status = status;
        this.reportPDF = reportPDF;


    }
}

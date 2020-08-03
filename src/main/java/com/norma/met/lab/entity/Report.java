package com.norma.met.lab.entity;

import javax.persistence.*;

@Entity
@Table(name = "report")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String customer;
    private String customerEmail;
    private int reportFileId;
    private int orderFileId;
    private int customerDepartmentId;
    private String title;
    private String status;
    private int ReportNr;

    public Report() {

    }

    public Report(int id, String customer, String customerEmail, int reportFileId, int orderFileId, int customerDepartmentId, String title, String status, int reportNr) {
        this.id = id;
        this.customer = customer;
        this.customerEmail = customerEmail;
        this.reportFileId = reportFileId;
        this.orderFileId = orderFileId;
        this.customerDepartmentId = customerDepartmentId;
        this.title = title;
        this.status = status;
        ReportNr = reportNr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getReportFileId() {
        return reportFileId;
    }

    public void setReportFileId(int reportFileId) {
        this.reportFileId = reportFileId;
    }

    public int getOrderFileId() {
        return orderFileId;
    }

    public void setOrderFileId(int orderFileId) {
        this.orderFileId = orderFileId;
    }

    public int getCustomerDepartmentId() {
        return customerDepartmentId;
    }

    public void setCustomerDepartmentId(int customerDepartmentId) {
        this.customerDepartmentId = customerDepartmentId;
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

    public int getReportNr() {
        return ReportNr;
    }

    public void setReportNr(int reportNr) {
        ReportNr = reportNr;
    }
}

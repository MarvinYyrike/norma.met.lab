package com.norma.met.lab.entity;

import javax.persistence.*;

@Entity
@Table(name = "report_file")
public class ReportFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Object reportPDF;
    private Object reportDraft;

    public ReportFile() {
    }

    public ReportFile(int id, Object reportPDF, Object reportDraft) {
        this.id = id;
        this.reportPDF = reportPDF;
        this.reportDraft = reportDraft;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getReportPDF() {
        return reportPDF;
    }

    public void setReportPDF(Object reportPDF) {
        this.reportPDF = reportPDF;
    }

    public Object getReportDraft() {
        return reportDraft;
    }

    public void setReportDraft(Object reportDraft) {
        this.reportDraft = reportDraft;
    }
}

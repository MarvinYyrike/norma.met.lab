package com.norma.met.lab.service;

import com.norma.met.lab.model.Report;

public interface ReportService {


    void generateReport(Report report);

    void editReportData(String reportNo);

    void editReport(Report report);

    void finishReport(int reportId);
}

package com.norma.met.lab.service;

import com.norma.met.lab.repository.CustomerDepartmentRepository;
import com.norma.met.lab.repository.OrderFileRepository;

import com.norma.met.lab.model.Report;
import com.norma.met.lab.repository.ReportFileRepository;
import com.norma.met.lab.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportServiceImpl implements ReportService{


    @Autowired
    CustomerDepartmentRepository customerDepartmentRepository;
    OrderFileRepository orderFileRepository;
    ReportFileRepository reportFileRepository;
    ReportRepository reportRepository;




    public void generateReport(Report report) {
        //TODO siin võiks visata ette wordi põhja vastava infoga, mida saaks kohe täita
        //TODO täidab andmebaasis read

    }

    public void editReportData(String reportNo) {
        //TODO siin saab muuta andmebaasis andmeid raporti kohta
        //TODO siin saab raporti drafti ja seda edasi muuta

    }

    public void editReport(Report report) {

    }
    public void finishReport(int reportId) {
        //TODO siin saadab raporti ja orderi customeri emailile ja uuendab statuse 'finished'
        //TODO lisab PDFi andmebaasi (varasemalt wordi kujul)

    }
}

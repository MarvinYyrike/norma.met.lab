package com.norma.met.lab.service;

import com.norma.met.lab.dao.ReportDAO;
import com.norma.met.lab.model.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

    @Autowired
    ReportDAO reportDAO;



    public void generateReport(Report report) {
        //TODO siin võiks visata ette wordi põhja vastava infoga, mida saaks kohe täita
        //TODO täidab andmebaasis read
        reportDAO.generateReport(report);
    }

    public void editReport(String reportNo) {
        //TODO siin saab muuta andmebaasis andmeid raporti kohta
        //TODO siin saab raporti drafti ja seda edasi muuta
        reportDAO.editReport(reportNo);
    }

    public void editReport(Report report) {
        reportDAO.editReport(report);
    }
    public void finishReport(int reportId) {
        //TODO siin saadab raporti ja orderi customeri emailile ja uuendab statuse 'finished'
        //TODO lisab PDFi andmebaasi (varasemalt wordi kujul)
        reportDAO.finishReport(reportId);
    }
}

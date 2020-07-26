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
        //TODO siin võiks visata ette wordi põhja olemasoleva infoga, mida saaks kohe täita/hiljem editida/
        reportDAO.generateReport(report);
    }

    public void editReport(Report report) {
        //TODO siin saab muuta andmebaasis andmeid raporti kohta
    }

    public static void finishReport(int reportId) {
        //TODO siin saadab raporti ja orderi customeri emailile ja uuendab statuse 'finished'
    }
}

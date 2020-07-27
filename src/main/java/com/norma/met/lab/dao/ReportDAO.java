package com.norma.met.lab.dao;

import com.norma.met.lab.model.Report;
import org.springframework.stereotype.Repository;

@Repository
public class ReportDAO {
    public void generateReport(Report report) {
        //TODO andmebaasi võiks minna kõik raporti info
    }

    public void editReport(String reportNo) {
        //TODO siin saab drafti laadida ja seda muutma hakata
    }

    public void editReport(Report report) {
        //TODO siin saab muuta andmeid raporti tabelis, faile ei puutu
    }

    public void finishReport(int reportId) {
        //TODO muudab drafti finaliks, saadab raporti emailile välja
    }
}

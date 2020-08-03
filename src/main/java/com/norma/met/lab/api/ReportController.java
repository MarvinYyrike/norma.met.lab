package com.norma.met.lab.api;

import com.norma.met.lab.model.Report;
import com.norma.met.lab.service.ReportService;
import com.norma.met.lab.service.ReportServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("report")
public class ReportController {

   @Autowired
   ReportService reportService;

    //TODO generateReport (võtab sisse igasugu andmeid raporti kohta)
    @PostMapping
    public void generateReport(Report report) {
        reportService.generateReport(report);
    }
    //TODO editReport (saab raportit muuta, viskab viimase wordi ette)
    @PutMapping("/edit_file")
    public void editReport (String reportNo){
        reportService.editReportData(reportNo);
    }

    @PutMapping("/edit")
    public void editReport (Report report){
        reportService.editReport(report);
    }

    @PutMapping("/finish")
    public void finishReport (int reportId){
        reportService.finishReport(reportId);
    }
}

package com.interfaces.usingdefaultmethods.dataexportfeature;

public class FinanceReportExporter implements ReportExporter {
    @Override
    public void exportToCSV() {
        System.out.println("Finance report exported to CSV");
    }
    @Override
    public void exportToPDF() {
        System.out.println("Finance report exported to PDF");
    }
    @Override
    public void exportToJSON() {
        System.out.println("Finance report exported to JSON");
    }
}

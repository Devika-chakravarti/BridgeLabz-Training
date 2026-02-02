/*Data Export Feature
○ Scenario: A reporting module can export in CSV and PDF. Later, JSON support
was added.
○ Task: Add a default method exportToJSON() to avoid code changes in all
implementers.*/

package com.interfaces.usingdefaultmethods.dataexportfeature;

public class ReportApp {
    public static void main(String[] args) {

        ReportExporter sales = new SalesReportExporter();
        ReportExporter finance = new FinanceReportExporter();

        sales.exportToCSV();
        sales.exportToPDF();
        sales.exportToJSON();

        finance.exportToCSV();
        finance.exportToPDF();
        finance.exportToJSON();
    }
}

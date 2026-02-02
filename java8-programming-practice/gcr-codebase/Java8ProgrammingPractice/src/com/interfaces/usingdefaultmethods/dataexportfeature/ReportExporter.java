package com.interfaces.usingdefaultmethods.dataexportfeature;

public interface ReportExporter {
    void exportToCSV();
    void exportToPDF();
    default void exportToJSON() {
        System.out.println("Exporting report in JSON format (default)");
    }
}


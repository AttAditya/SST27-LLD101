package com.example.report;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        ReportBundleFacade reportBundleFacade = new ReportBundleFacade();
        reportBundleFacade.export(Map.of("name", "Quarterly"));
    }
}

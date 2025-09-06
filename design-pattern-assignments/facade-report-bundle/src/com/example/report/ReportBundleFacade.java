package com.example.report;

import java.nio.file.Path;
import java.util.Map;

public class ReportBundleFacade {
    private final JsonWriter jsonWriter;
    private final Zipper zipper;
    private final AuditLog auditLog;

    public ReportBundleFacade() {
        this.jsonWriter = new JsonWriter(); 
        this.zipper = new Zipper(); 
        this.auditLog = new AuditLog();
    }

    public void export(
        String outputDir,
        String jsonFileName,
        String zipFileName,
        Map<String, Object> data
    ) {
        Path outputDirPath = Path.of(outputDir);
        Path zipPath = Path.of(outputDir, zipFileName);
        
        Path json = this.jsonWriter.write(
            data,
            outputDirPath,
            jsonFileName
        );
            
        Path zip = this.zipper.zip(json, zipPath);
        
        auditLog.log("exported " + zip);
        System.out.println("DONE " + zip);
    }

    public void export(Map<String, Object> data) {
        String outputDir = "out";
        String jsonFileName = "report";
        String zipFileName = "report.zip";

        export(outputDir, jsonFileName, zipFileName, data);
    }
}

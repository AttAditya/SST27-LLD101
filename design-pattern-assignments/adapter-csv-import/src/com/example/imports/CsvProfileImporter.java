package com.example.imports;

import java.nio.file.Path;
import java.util.List;

public class CsvProfileImporter implements ProfileImporter {
    private final NaiveCsvReader csvReader;
    private final ProfileService profileService;
    
    public CsvProfileImporter(
        NaiveCsvReader csvReader,
        ProfileService profileService
    ) {
        this.csvReader = csvReader;
        this.profileService = profileService;
    }

    @Override
    public int importFrom(Path csvFile) {
        List<String[]> data = csvReader.read(csvFile);
        int profilesCount = 0;

        for (String[] line: data) {
            try {
                profileService.createProfile(
                    line[0],
                    line[1],
                    line[2]
                );

                profilesCount++;
            } catch (Exception exception) {
                System.out.println(
                    "Failed for: " +
                    line[0] +
                    " " +
                    line[1] +
                    " " +
                    line[2] +
                    "\n" +
                    exception.getMessage()
                );
            }
        }
                
        return profilesCount;
    }
}

package com.example.config;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

import javax.management.InstanceAlreadyExistsException;

public class AppSettings implements Serializable {
    private final Properties props = new Properties();
    private static AppSettings instance;
    
    private AppSettings() throws InstanceAlreadyExistsException {
        if (instance != null)
            throw new InstanceAlreadyExistsException(
                "AppSettings Instance already exists"
            );

        instance = this;
    }

    public static synchronized AppSettings getInstance() {
        try {
            return new AppSettings();
        } catch (InstanceAlreadyExistsException ignored) {
            return instance;
        }
    }

    public void loadFromFile(Path file) {
        try (InputStream in = Files.newInputStream(file)) {
            props.load(in);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public String get(String key) {
        return props.getProperty(key);
    }
}

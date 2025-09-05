package com.example.video;

import java.nio.file.Path;

public class VideoPipelineFacade {
    private final Decoder decoder;
    private final Encoder encoder;
    private final FilterEngine filterEngine;

    private Path inputPath;
    private Path outputPath;
    private Frame[] frames;

    public VideoPipelineFacade() {
        this.decoder = new Decoder();
        this.filterEngine = new FilterEngine();
        this.encoder = new Encoder();
    }

    private void setPaths(String inputPath, String outputPath) {
        this.inputPath = Path.of(inputPath);
        this.outputPath = Path.of(outputPath);
    }

    private void decodeFrames() {
        this.frames = this.decoder.decode(this.inputPath);
    }

    private void applyFilters() {
        frames = filterEngine.grayscale(frames);
        frames = filterEngine.scale(frames, 0.5);
    }

    private void encodeVideo() {
        this.outputPath = this.encoder.encode(
            this.frames,
            this.outputPath
        );
    }

    private void close() {
        System.out.println("Wrote " + this.outputPath);
    }

    public void process(String inputPath, String outputPath) {
        this.setPaths(inputPath, outputPath);
        
        this.decodeFrames();
        this.applyFilters();
        this.encodeVideo();
        
        this.close();
    }
}

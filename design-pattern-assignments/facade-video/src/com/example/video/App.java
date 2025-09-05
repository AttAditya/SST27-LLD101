package com.example.video;

public class App {
    public static void main(String[] args) {
        VideoPipelineFacade videoPipeline = new VideoPipelineFacade();
        
        String inputPath = "in.mp4";
        String outputPath = "out.mp4";

        videoPipeline.process(inputPath, outputPath);
    }
}

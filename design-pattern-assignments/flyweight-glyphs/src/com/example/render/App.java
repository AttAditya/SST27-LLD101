package com.example.render;

import com.example.render.textstyle.TextStyleFactory;

public class App {
    public static void main(String[] args) {
        TextStyleFactory textStyleFactory = TextStyleFactory.getInstance();
        Renderer r = new Renderer(textStyleFactory);

        System.out.println(
            "Cost=" + r.render("Hello Flyweight! ".repeat(2000))
        );
    }
}

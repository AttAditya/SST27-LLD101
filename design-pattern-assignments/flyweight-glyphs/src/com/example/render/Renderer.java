package com.example.render;

import com.example.render.textstyle.TextStyle;
import com.example.render.textstyle.TextStyleFactory;

public class Renderer {
    private final TextStyleFactory textStyleFactory;

    public Renderer(TextStyleFactory textStyleFactory) {
        this.textStyleFactory = textStyleFactory;
    }

    public int render(String text) {
        int cost = 0;

        for (char c : text.toCharArray()) {
            TextStyle style = textStyleFactory.getTextStyle(
                "Inter",
                14,
                (c % 7 == 0)
            );

            Glyph g = new Glyph(c, style);
            cost += g.getTextStyle().drawCost();
        }
        return cost;
    }
}

package com.example.render.textstyle;

import java.util.HashMap;
import java.util.Map;

public class TextStyleFactory {
    private final Map<String, TextStyle> styles;
    private static TextStyleFactory instance;

    private TextStyleFactory() {
        if (instance != null)
            throw new IllegalStateException();

        styles = new HashMap<>();
        instance = this;
    }

    public static TextStyleFactory getInstance() {
        if (instance == null) new TextStyleFactory();
        return instance;
    }

    public TextStyle getTextStyle(
        String font,
        int size,
        boolean bold
    ) {
        String fontKey = font + "/" + size + "/" + bold;
        if (!this.styles.containsKey(fontKey))
            styles.put(
                fontKey,
                new TextStyle(fontKey, size, bold)
            );

        return styles.get(fontKey);
    }
}

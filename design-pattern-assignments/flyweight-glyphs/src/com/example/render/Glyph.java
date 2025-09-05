package com.example.render;

import com.example.render.textstyle.TextStyle;

public class Glyph {
    private final char ch;
    private final TextStyle textStyle;

    public Glyph(char ch, TextStyle textStyle) {
        this.ch = ch;
        this.textStyle = textStyle;
    }

    public char getCh() {
        return this.ch;
    }

    public TextStyle getTextStyle() {
        return this.textStyle;
    }
}

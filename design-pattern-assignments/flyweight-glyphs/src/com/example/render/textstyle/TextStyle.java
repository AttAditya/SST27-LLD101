package com.example.render.textstyle;

public class TextStyle {
    private final String font;
    private final int size;
    private final boolean bold;

    public TextStyle(String font, int size, boolean bold) {
        this.font = font;
        this.size = size;
        this.bold = bold;
    }

    public int drawCost() {
        return this.size + (this.bold ? 10 : 0);
    }

    public String getFont() {
        return this.font;
    }

    public int getSize() {
        return this.size;
    }

    public boolean isBold() {
        return this.bold;
    }
}

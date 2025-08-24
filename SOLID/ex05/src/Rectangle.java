package solid.ex05.src;

public class Rectangle implements FullyResizable {
    private int height;
    private int width;

    @Override
    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    @Override
    public void setWidth(int newWidth) {
        this.width = newWidth;
    }

    @Override
    public int area() {
        return this.width * this.height;
    }
}

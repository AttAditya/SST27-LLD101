package solid.ex05.src;

public class Square implements ResizableHeight, AreaAvailable {
    private int height;

    @Override
    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    @Override
    public int area() {
        return this.height * this.height;
    }
}


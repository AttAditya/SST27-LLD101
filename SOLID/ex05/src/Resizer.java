package solid.ex05.src;

public class Resizer {
    public static int areaAfterResize(FullyResizable fullyResizable) {
        fullyResizable.setWidth(5);
        fullyResizable.setHeight(4);
        
        return fullyResizable.area();
    }
}

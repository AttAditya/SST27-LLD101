package solid.ex05.src;

public class Demo05 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        
        System.out.println(rectangle.area());
        System.out.println(square.area());

        System.out.println(Resizer.areaAfterResize(rectangle));
        // System.out.println(Resizer.areaAfterResize(square)); <- Won't allow now
    }
}

package solid.ex07.src;
public class BasicPrinter implements PrintingMachine {
    @Override
    public void print(String text) {
        System.out.println("Print: " + text);
    }
}

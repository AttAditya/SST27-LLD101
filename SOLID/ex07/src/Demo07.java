package solid.ex07.src;
public class Demo07 {
    public static void main(String[] args) {
        PrintingMachine machine = Configs.printingMachine;
        
        machine.print("Hello");
        // machine.scan("/tmp/out"); <- Not Allowed
    }
}

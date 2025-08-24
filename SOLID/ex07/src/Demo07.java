package solid.ex07.src;
public class Demo07 {
    public static void main(String[] args) {
        Machine machine = Configs.machine;
        System.out.println(machine);
        
        // machine.print("Hello"); <- Just a vague machine can't do anything...
        // machine.scan("/tmp/out"); <- Not Allowed Tho, so Success ig...
    }
}

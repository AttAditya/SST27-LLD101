package solid.ex06.src;

class Aviary {
    public void release(Flyable flyable) {
        flyable.fly();
        System.out.println("Released");
    }
}

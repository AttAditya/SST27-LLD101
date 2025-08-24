package solid.ex02.src;

public class Player implements Playable {
    private Frame last;

    public void play(byte[] fileBytes) {
        Frame f = new Frame(fileBytes);
        last = f;

        System.out.println("\u25B6 Playing " + fileBytes.length + " bytes");
        System.out.println("Cached last frame? " + (last!=null));
    }
}


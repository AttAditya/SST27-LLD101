package solid.ex01.src;

public class EmailClient extends CommunicationClient {
    public void send(String to, String body) {
        System.out.println("[EMAIL to=" + to + "] " + body);
    }
}


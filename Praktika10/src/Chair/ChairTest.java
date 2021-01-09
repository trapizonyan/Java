package Chair;

public class ChairTest {
    public static void main(String[] args) {
        Client client = new Client();
        AbstractChairFactory chair = new ChairFactory();
        client.setChair(chair.createMagicChair());
        client.sit();
    }
}
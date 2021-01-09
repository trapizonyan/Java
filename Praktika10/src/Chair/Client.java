package Chair;

public class Client{
    Chair chair;

    public void sit() {
        System.out.println(chair.run());
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}

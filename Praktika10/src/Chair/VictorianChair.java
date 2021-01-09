package Chair;

public class VictorianChair implements Chair{
    int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean run() {
        getAge();
        return true;
    }
}
package Chair;

public class ChairFactory implements AbstractChairFactory {

    @Override
    public VictorianChair createVictorianChair(int age) {
        return new VictorianChair(age);
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public FunctionChair createFunctionalChair() {
        return new FunctionChair();
    }
}
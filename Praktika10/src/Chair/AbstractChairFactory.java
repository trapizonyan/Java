package Chair;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair(int age);
    MagicChair createMagicChair();
    FunctionChair createFunctionalChair();
}
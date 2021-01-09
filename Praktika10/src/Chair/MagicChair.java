package Chair;

public class MagicChair implements Chair{
    public void doMagic() {
        System.out.println("asd");
    }

    @Override
    public boolean run() {
        doMagic();
        return true;
    }
}
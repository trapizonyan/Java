package pr12;

public class Telephone {
    private final String number;
    private String kod;

    public Telephone(String number) {
        this.number = parseNumber(number);
    }

    public String parseNumber(String number) {
        boolean isPlus = number.charAt(0) == '+';

        kod = number.substring(0, number.length() - 10);
        if (!isPlus) {
            this.kod = "+" + kod;
        }


        number = number.substring(number.length() - 10, number.length());
        return this.kod + "(" + number.substring(0, 3) + ")" + "-" + number.substring(3, 6) + "-" + number.substring(6, 10);
    }

    @Override
    public String toString() {
        return "number = " + number;
    }

    public static void main(String[] args) {
        Telephone telephone1 = new Telephone("+23432411324");
        Telephone telephone2 = new Telephone("23143214321");
        System.out.println(telephone1);
        System.out.println(telephone2);
    }
}

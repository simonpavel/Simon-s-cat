package curency;

public class Euro extends Curency {
    public Euro(double kursNBU) {
        super(kursNBU);
    }


    @Override
    String getCurrencyName() {
        return "Euro";
    }
}

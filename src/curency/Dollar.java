package curency;

public class Dollar extends Curency {


    public Dollar(double kursNBU) {

        super(kursNBU);
    }

    @Override
    String getCurrencyName() {
        return "Dollar";
    }
}

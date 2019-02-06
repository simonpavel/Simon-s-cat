package curency;

public class Chief extends Curency{


    public Chief(double kursNBU) {
        super(kursNBU);
    }

    @Override
    String getCurrencyName() {
        return "Chief";
    }
}

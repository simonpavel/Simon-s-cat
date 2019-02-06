package curency;

abstract public class Curency {
    private double kursNBU;
    private double marga = 0.1;

    public Curency (double kursNBU) {
        this.kursNBU = kursNBU;
    }

    public double getKursNBU() {
        return kursNBU;
    }

    public void setKursNBU(double kursNBU) {
        this.kursNBU = kursNBU;
    }

    public double getMarja() {
        return marga;
    }

    public void setMarja(double marga) {
        this.marga = marga;
    }

    public double exchengeСurrencyToHrn (double amountOfCurrency) {
        double temp_result = amountOfCurrency * kursNBU * (1 - marga);
        System.out.println("For " + amountOfCurrency + " ("+kursNBU+") "+getCurrencyName()+" you get: " + temp_result + " UAH");
        return temp_result;
    }

    abstract String getCurrencyName();
}

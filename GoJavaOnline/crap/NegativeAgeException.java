package test;

public class NegativeAgeException extends Throwable{
    private int ageValue;

    public NegativeAgeException(final int ageValue) {

        this.ageValue = ageValue;
    }

    public int getAgeValue() {

        return ageValue;
    }
}

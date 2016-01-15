package flowersUml;

public class FalseValueException extends Throwable{
    private int trueNumber;

    public FalseValueException(final int trueNumber) {
        this.trueNumber = trueNumber;
    }

    public int getTrueNumber() {
        return trueNumber;
    }
}

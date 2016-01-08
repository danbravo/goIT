package mod4.figures;

public class Rectangle extends Figure {
    private double recA;
    private double recB;

    @Override
    public double square() {
        double recS = recA * recB;
        return recS;
    }

    public Rectangle(double recA, double recB) {
        this.recA = recA;
        this.recB = recB;
    }
}

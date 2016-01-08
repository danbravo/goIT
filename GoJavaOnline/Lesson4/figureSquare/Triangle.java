package mod4.figures;

public class Triangle extends Figure{
    private double a;
    private double b;
    private double c;

    @Override
    public double square() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

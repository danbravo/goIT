package mod4.figures;

public class Circle extends Figure{
    private double r;

    @Override
    double square() {
        double S = Math.PI * (r * r);
        return S;
    }

    public Circle(double r) {
        this.r = r;
    }
}

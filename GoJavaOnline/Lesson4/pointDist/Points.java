package mod4.figures.point;

public class Points {
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public Points(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double pointsDist () {
        double point1 = Math.pow((x2 - x1), 2);
        double point2 = Math.pow((y2 - y1), 2);
        return Math.sqrt(point1 + point2);
    }
}

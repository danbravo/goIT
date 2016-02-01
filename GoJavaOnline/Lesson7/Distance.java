package mod4.figures.point;

public class Distance {

    public double pointsDist (Points p1, Points p2) {
        double point1 = Math.pow((p2.getX() - p1.getX()), 2);
        double point2 = Math.pow((p2.getY() - p1.getY()), 2);
        double dist = Math.sqrt(point1 + point2);
        return dist;
    }

}

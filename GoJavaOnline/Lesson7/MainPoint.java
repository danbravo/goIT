package mod4.figures.point;

import java.awt.*;
import java.util.Scanner;

public class MainPoint extends Distance{
    public static void main(String[] args) {
        float dist = (float)new Distance().pointsDist(new Points(-1, 5), new Points(1, 5));
        float dist2 = (float)new Distance().pointsDist(new Points(-2, -3), new Points(4, 6));

        System.out.println("Distance between p1(-2,1) and p2(1,5) is: " + dist);
        System.out.println("Distance between p1(-2,-3) and p2(-4,4) is: " + dist2);
    }
}

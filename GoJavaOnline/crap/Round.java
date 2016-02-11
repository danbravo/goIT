package test;

import java.util.Scanner;

public class Round {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter first circle's radius:");
        double radius1 = scanner.nextDouble();

        System.out.println("Please, enter second circle's radius:");
        double radius2 = scanner.nextDouble();

        double area1 = Math.PI * radius1 * radius1;
        double area2 = Math.PI * radius2 * radius2;

        System.out.println("First circle's area is " + area1);
        System.out.println("Second circle's area is " + area2);

        if (area1 > area2) {
            System.out.println("First circle is bigger than second circle");
        } else {
            if (area1 == area2){
                System.out.println("Circles are equal");
            } else {
                System.out.println("Second circle5 is bigger that first circle");
            }
        }
        }
}

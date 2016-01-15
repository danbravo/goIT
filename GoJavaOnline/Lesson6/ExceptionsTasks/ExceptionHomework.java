package flowersUml;

import java.util.Scanner;

public class ExceptionHomework {
    public static void main(String[] args) {
        System.out.println("Enter the number of spikes:");

        final Scanner scanner = new Scanner(System.in);

        final String userInput = scanner.next();

        try {
            final int spikes = Integer.parseInt(userInput);
            Rose rose = new Rose();

            if (spikes < rose.getNumberOfSpikes() || spikes > rose.getNumberOfSpikes()) {
                throw new FalseValueException(spikes);
            }
            System.out.println("Correct!\nNumber of spikes is: " + spikes);
        } catch (NumberFormatException e) {
            System.out.println(e.getLocalizedMessage() + "\nERROR\nSpikes number should be an integer!");
        } catch (FalseValueException ef) {
            System.out.println("Entered number is '" + ef.getTrueNumber() + "'\nNumber should be = 10");
        }
    }
}

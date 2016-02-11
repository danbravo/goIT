package test;

import java.util.Scanner;

public class CommandSwitch {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter command:");

        final String command = scanner.nextLine();

        switch (command) {
            case "start":
                System.out.println("System is starting");
                break;
            case "stop":
                System.out.println("System is shutting down");
                break;
            default:
                System.out.println("Unknown command: '" + command + "'");
        }

    }

}

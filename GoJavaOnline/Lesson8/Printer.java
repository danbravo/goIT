package mod8;


import java.util.Collection;

public class Printer {
    public void listPrinter (Collection listToPrint, int columns) {
        int j = 1;

        for(Object item : listToPrint) {
            if(j > columns) {
                System.out.println();
                j = 1;
            }
            System.out.printf("%-5s", item);
            System.out.println("\n");
        }
    }
}

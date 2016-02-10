package mod8;

import fileUml.*;
import flowersUml.*;

import java.util.ArrayList;
import java.util.Collections;

public class SomeCollections {
    public static void main(String[] args) {

        //task1
        Printer printer = new Printer();

        ArrayList<File> filesList = new ArrayList<>();
        filesList.add(new Audio("Hit me Baby", "Britney Spears"));
        filesList.add(new Audio("Show me the meaning", "Backstreet Boys"));
        filesList.add(new Audio("Zapahlo vesnoi", "Byturka"));

        System.out.printf("%-25s%-25s", "Album", "Artist");
        System.out.print("\n" + "------------------------------------------------" + "\n");
        printer.listPrinter(filesList, 2);



        //task2
        ArrayList<Flower> flowerList = new ArrayList<>();
        Collections.addAll(flowerList,
                new Aster(),
                new Chamomile(),
                new Rose(),
                new Tulip()
        );

    }
}

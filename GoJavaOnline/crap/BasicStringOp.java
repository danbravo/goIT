package test;

import java.util.Arrays;

public class BasicStringOp {
    public static void main(String[] args) {
        final char[] charArrayToString = {'a', 'r', 'r', 'a', 'y'};

        final String stringToDisplay = Arrays.toString(charArrayToString)
                .replace(",", "") //remove the commas
                .replace("[", "") //remove the right bracket
                .replace("]", "")
                .replace(" ", "")
                .trim(); //trim empty cells at end

        System.out.println(stringToDisplay);

    }
}

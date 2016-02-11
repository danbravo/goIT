package test;

import java.util.Arrays;

public class CharArrayToString {
    public static void main(String[] args) {
//        char[] charArray = new char[256];
//
//        for (int i = 0; i < charArray.length; i++) {
//            charArray[i] = (char) i;
//        }
//
//        for (char e : charArray) {
//            System.out.println(e);
//        }

        char[] charArray1 = {'a', 'r', 'r', 'a', 'y'};

        final String stringOfChars = Arrays.toString(charArray1);
        System.out.printf(stringOfChars);
    }
}

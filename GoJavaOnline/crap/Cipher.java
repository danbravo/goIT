package test;


import java.util.Arrays;

public class Cipher {
    private static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static int key = 5;

    public Cipher(int key) {
        this.key = key;
    }

    public static void main(String[] args) {
        String s = "SomeImportantShit";
        StringBuilder message = new StringBuilder(s);

        char[] encriptedMessage = new char[message.length()];

        for (int i = 0; i < message.length(); i++) {
            String charIndex = String.valueOf(message.charAt(i));

            if (charIndex.equalsIgnoreCase(String.valueOf(alphabet[i]))) {
                encriptedMessage[i] = alphabet[i + key];
                continue;
            }


            if (!(charIndex.equalsIgnoreCase(String.valueOf(alphabet[i])))) {
                String.valueOf(encriptedMessage[i]).indexOf(alphabet[i]);
            }

            System.out.println();

        }
    }


//    public static void main(String[] args) {
//        String input = "AomeImportantShit";
//
//        char[] cypherChars = input.toLowerCase().toCharArray();
//
//        char[] encodedChars = new char[cypherChars.length];
//
//        for (int i = 0; i < cypherChars.length; i++) {
//            Character k = Character.valueOf(cypherChars[i]);
//            Character a = Character.valueOf(alphabet[i]);
//            if (a.compareTo(k) == 0) {
//                encodedChars[i] = alphabet[i + key];
//            } else {
//                for (int j = i + 1; j < alphabet.length; j++) {
//                    Character al = Character.valueOf(alphabet[j]);
//                    if (al.compareTo(k) == 0) {
//                        encodedChars[i] = alphabet[j + key];
//                    }
//                }
//            }
//        }
//        System.out.println(Arrays.toString(encodedChars));
//    }
}

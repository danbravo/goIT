package GoJavaOnline.Lesson9;

public class Cipher {
    public static int key = 6;

    public String encode (String firstInput) {

        if (firstInput.isEmpty()) {
            throw new RuntimeException("This text is empty!");
        }

        StringBuilder encoded = new StringBuilder();

        for (int i = 0; i < firstInput.length(); i++) {
            char charOfInput = firstInput.charAt(i);
            charOfInput += key;
            encoded.append(charOfInput);
        }
        return encoded.toString();
    }

    public String decode (String secondInput) {

        if (secondInput.isEmpty()) {
            throw new RuntimeException("This text is empty!");
        }

        StringBuilder decoded = new StringBuilder();

        for (int i = 0; i < secondInput.length(); i++) {
            char charOfInput = secondInput.charAt(i);
            charOfInput -= key;
            decoded.append(charOfInput);
        }
        return decoded.toString();
    }
}

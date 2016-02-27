package test;

public class PalindromeWithStringBuilder {
    public static void main(String[] args) {
        String palindrome = "moom";

        StringBuilder builder = new StringBuilder(palindrome);

        builder.reverse();

        if (palindrome.equals(builder.toString())) {
            System.out.println("is Palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}

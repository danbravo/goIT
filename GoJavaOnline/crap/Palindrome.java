package test;

public class Palindrome {
    public static void main(String[] args) {
        String palindrome = "moom";
        char charArray[] = palindrome.toCharArray();
        boolean isPalindrome = true;

//        for (int i = 0; i < charArray.length / 2; i++) {
//            isPalindrome = isPalindrome && (charArray[i] == charArray[charArray.length - i - 1]);
//            if(!isPalindrome) {
//                break;
//            }
//        }

        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - i - 1]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}

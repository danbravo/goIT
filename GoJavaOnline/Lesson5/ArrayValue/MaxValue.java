package mod5.maxNumArray;

public class MaxValue {

    public static void main(String[] args) {
        int[] someArray = {90, 8, -2, 30, 51, 3, 7, -15, 9, 101};

        int max = someArray[0];
        int min = someArray[0];

        for (int i = 0; i < someArray.length; i++) {
            if (max < someArray[i]) {
                max = someArray[i];
            }
            if (min > someArray[i]) {
                min = someArray[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

}

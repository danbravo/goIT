package mod5.maxNumArray;

public class ArraySort {
    public static void main(String[] args) {
        double[] doubleArray = {3.0, -5.0, 90.0, -500.0, 66.0, 7.0, 49.0, 13.0, 5.0};

        double k;
        int i, j;

        for (i = 1; i < doubleArray.length; i++) {
            k = doubleArray[i];

            for (j = i - 1; j >= 0 && doubleArray[j] > k; j--) {
                doubleArray[j + 1] = doubleArray[j];
            }

            doubleArray[j + 1] = k;
        }

        for (double elem : doubleArray) {
            System.out.println(elem);
        }
    }
}

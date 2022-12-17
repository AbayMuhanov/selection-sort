import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 5, 6, 9, 1, 4, 8, 6, 7, 2, 3,};

        for (int x : arr) {
            SelectionSort.selectionSort(arr);
        }
        System.out.println(Arrays.toString(arr));

    }
}
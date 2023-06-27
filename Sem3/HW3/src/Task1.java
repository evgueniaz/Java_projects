import java.util.ArrayList;
import java.util.Arrays;


public class Task1 {
    public static void main(String[] args) throws Exception {
        int[] array1 = { 8, 0, -3, 5, 6, 9, 8, -4, 2, -99, 43 };
        mergeSort(array1);
        System.out.println(Arrays.toString(array1));
        int[] arr1 = {4, 9, 1, -5, 0, 2, 6};
        mergeSort(arr1);
        System.out.println(Arrays.toString(arr1));
    }


        public static void mergeSort(int[] array) {
            if (array.length < 2) {
                return;
            }
            int mid = array.length / 2;
            int[] left = new int[mid];
            int[] right = new int[array.length - mid];

            for (int i = 0; i < mid; i++) {
                left[i] = array[i];
            }
            for (int i = mid; i < array.length; i++) {
                right[i - mid] = array[i];
            }
            mergeSort(left);
            mergeSort(right);

            merge(array, left, right, mid, array.length - mid);
        }

        public static void merge(
        int[] array, int[] left, int[] right, int l, int r) {
        
            int i = 0, j = 0, k = 0;
            while (i < l && j < r) {
                if (left[i] <= right[j]) {
                    array[k++] = left[i++];
                }
                else {
                    array[k++] = right[j++];
                }
            }
            while (i < l) {
                array[k++] = left[i++];
            }
            while (j < r) {
                array[k++] = right[j++];
            }
        }

}
// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.util.Collections.max;
import static java.util.Collections.min;


public class Task3 {

    public static void main(String[] args) throws Exception {
        
        Integer[] array1 = new Integer [] {8, 0, -3, 5, 6, 9, 8, -4, 2, -99, 43};
        List<Integer> arr = Arrays.asList(array1);
        System.out.println(arr);
        // deleteEven(arr);
        // System.out.println(arr);

        int max = max(arr);
        int min = min(arr);
        int maxEl = arr.get(0);
        int minEl = arr.get(0);
        int sumEls = 0;
        for (int el : arr) {
            if (el > maxEl) {
                maxEl = el;
            }
            if (el < minEl) {
                minEl = el;
            }
            sumEls += el;
        }
        float averageEl = (float)sumEls/arr.size();
        System.out.println("The maximum value of the list is " + maxEl);
        System.out.println("The minimum value of the list is " + minEl);
        System.out.println("The average value of the list elements is " + averageEl);
    }

}

// Пусть дан произвольный список целых чисел, удалить из него четные числа
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Task2 {

    public static void main(String[] args) throws Exception {
        
        Integer[] array1 = new Integer [] {8, 0, -3, 5, 6, 9, 8, -4, 2, -99, 43};
        List<Integer> arr = Arrays.asList(array1);
        System.out.println(arr);
        deleteEven(arr);
        // System.out.println(arr);
    }

    public static void deleteEven(List<Integer> lst) {
            
            for (int i = 0; i < lst.size(); i++) {
                if (lst.get(i) % 2 == 0) {
                    lst.remove(i);
                }
            }
            System.out.println(lst);
    }
        
}

          


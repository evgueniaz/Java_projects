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
            
        List<Integer> swap = new ArrayList<>();
        for (Integer item: lst) {
            if (item % 2 == 0) {
                swap.add(item);
                }   
            }
        System.out.println("Элементы которые нужно удалить: " + swap);
        lst.removeAll(swap);
        System.out.println("Результирующий массив: " + lst);
        }
}

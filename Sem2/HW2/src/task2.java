// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.logging.*;


public class task2 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task2.class.getName());
        FileHandler fh = new FileHandler("log.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Sort Array");
        int [] array = {6, 11, 0, -9, 2, 81, -3};
        body.printArrayInt(array);
        int[] newArr = listSort(array);
        System.out.printf("\n Sorted Array: \n");
        body.printArrayInt(newArr);
    }
    public static int[] listSort(int [] arr){
        for(int j = 0; j < arr.length-1; j++) {
            
            for (int i = 0; i < arr.length - j-1; i++){
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }
    
}
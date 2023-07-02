// 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
// 2. Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) throws Exception {
        
        fillList();
        printList(rooster);
        reverse(rooster);
        printList(reverseRooster);
    }
    public static LinkedList<String> rooster = new LinkedList<>();
    private static LinkedList<String> fillList(){
        
        boolean flag = true;
        Scanner elems = new Scanner(System.in);

        while (flag) {
            System.out.printf("Enter an element to be added to the list or press 'Enter' to exit : ");
            String el = elems.nextLine();
            if (el == "") {
                flag = false;
            }
            else {
                rooster.add(el);
            } 
        }
        return rooster; 
    }

    private static void printList(LinkedList<String> list){
        for(Object el: list){
            System.out.printf(el + " ");
        }
        System.out.println();
    }

    public static LinkedList<String> reverseRooster = new LinkedList<>();

    private static LinkedList<String> reverse(LinkedList<String> list){
        
        for (int i = list.size() - 1; i >= 0; i--) {
            reverseRooster.add(list.get(i));
        }
        return reverseRooster;
    }
    // reverse(rooster);

}

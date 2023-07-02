// Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) throws Exception {

        // public static Deque<Object> queue = new LinkedList<>();
        fillList();
        System.out.println();
        printList(queue);
        System.out.println();
        boolean getIteration = true;
        while (getIteration) {
            System.out.println("Enter a number to choose an operation to be done: 1 - place an element to the end of the line; 2- show the first element of the line and delete it; 3 - show the first element of the line without deleting it;  4 - quit the task");
            System.out.println();
            Scanner scanner = new Scanner(System.in);
            int cmd = scanner.nextInt();

            switch (cmd) {
                case 1:
                    enqueue(queue);
                    System.out.println();
                    printList(queue);
                    break;
                case 2:
                    System.out.println("The first element was: " + dequeue(queue)); 
                    System.out.println();
                    printList(queue);
                    break;
                case 3:
                    System.out.println("The first element is: " + first(queue));
                    System.out.println();
                    printList(queue);
                    break;
                case 4:
                    getIteration = false;
                    break;
            }
        }
    }

    public static Deque<Object> queue = new LinkedList<>();
    private static Deque<Object> fillList(){
        
        boolean flag = true;
        Scanner elems = new Scanner(System.in);

        while (flag) {
            System.out.println();
            System.out.printf("Enter an element to be added to the list or press 'Enter' to exit : ");
            String el = elems.nextLine();
            if (el == "") {
                flag = false;
            }
            else {
                queue.add(el);
            } 
        }
        return queue; 
    }

    private static void printList(Deque<Object> list){
        System.out.println();
        System.out.println("The list consists of the following elements: ");
        for(Object el: list){
            System.out.printf(el + " ");
        }
        System.out.println();
    }


    public static void enqueue(Deque<Object> list){
        System.out.println("Enter an element to be added into a queue: ");
        Scanner scanner1 = new Scanner(System.in);
        Object element = scanner1.nextLine();
        list.addLast(element);
    }


    public static Object dequeue(Deque<Object> list){
        Object item = list.pollFirst();
        return item;
    }


    public static Object first(Deque<Object> list){
        return list.peekFirst();
    }   
}
   

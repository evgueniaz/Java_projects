// Реализуйте структуру телефонной книги с помощью HashMap. Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.(можно выводить без сортировки, но обязательно в отдельном методе)

// package Sem5.HW5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) throws Exception {
    Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
    addNumber("Ivanov", 123, bookPhone);
    addNumber("Basov", 4321, bookPhone);
    addNumber("Petrov", 78432, bookPhone);
    addNumber("Pavlov", 121212, bookPhone);
    addNumber("Ivanov", 987987, bookPhone);
    addNumber("Petrov", 123123, bookPhone);
    fillBook(bookPhone);
    printBook(bookPhone);
    }

    public static void fillBook(Map<String, ArrayList<Integer>> contact) {
        boolean flag = true;
        Scanner elems_1 = new Scanner(System.in);
        Scanner elems_2 = new Scanner(System.in);

        while (flag) {
            System.out.printf("Enter a Last Name to be added to the phonebook or press 'Enter' to exit : ");
            String el_1 = elems_1.nextLine();
            if (el_1 == "") {
                flag = false;
            }
            else {
                System.out.printf("Enter a phone numberof this person to be added to the phonebook : ");
                Integer el_2 = elems_2.nextInt();
                addNumber(el_1, el_2, contact);;
            } 
        }
    }
    
    public static void addNumber(String key, Integer value, Map<String, ArrayList<Integer>> contact) {
        if (contact.containsKey(key)) {
            contact.get(key).add(value);
        } 
        else {
            ArrayList<Integer> lst = new ArrayList<>();
            lst.add(value);
            contact.put(key, lst);
        }
    }
    
    public static void printBook(Map<String, ArrayList<Integer>> contact){
        for (var item : contact.entrySet()) {
            String phones = "";
            for (int el: item.getValue()) {
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
}

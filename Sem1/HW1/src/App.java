// Задание
// 1) Вычислить сумма чисел от 1 до n
// 2) Вывести все простые числа от 1 до 1000
// 3) Реализовать простой калькулятор
// 4) (задание со *) Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
// 5) (задание со *) Доделать задания 5, 8, 9 из презинтации к уроку

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {
        
        // System.out.println("Sum of natural numbers up to your number equals " 
        // + task1());
        // task2();
        //  task3();
        // task4();
        task5();
    }

    // 1) Вычислить сумма чисел от 1 до n
    private static int task1() {
        Scanner nat_num = new Scanner(System.in);
        System.out.printf("Enter a natural number : ");
        int n = Integer.parseInt(nat_num.nextLine());
        while (n < 1) {
            System.out.println("You've entered not a natural number!");
            System.out.printf("Enter a natural number : ");
            n = Integer.parseInt(nat_num.nextLine());
        }
        int addition = 0;
        for (int i = 1; i <= n; i++) {
            addition += i;
        }
        return addition;            
    }
    
    // 2) Вывести все простые числа от 1 до 1000
    private static void task2() {
        List<Integer> prime_num = new ArrayList<>(); 

        for (int i = 2; i < 1000; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false; 
                    break;
                }
            }
            if (flag) {prime_num.add(i);}
        }
        System.out.println("Prime numbers up to 1000 are: " + prime_num);
    }

    // 3) Реализовать простой калькулятор
    private static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an operation to be performed: +, - , * or / ");
        char operation = scanner.next().charAt(0);

        System.out.println("Enter the first number: ");
        float num1 = scanner.nextFloat();

        System.out.println("Enter the second number: ");
        float num2 = scanner.nextFloat();

        if (!(operation == '+' || operation == '-' || operation == '*' || operation == '/')) {
        System.err.println("You've entered an invalid symbol. Please enter + or - or * or /");
        }

        if (operation == '/' && num2 == 0.0) {
        System.err.println("Division by zero is impossible.");
        }

        switch (operation) {
        case '+':
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            break;
        case '-':
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            break;
        case '*':
            System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
            break;
        case '/':
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            break;
        default:
            System.err.println("This operation is invalid.");
            break;
        }
    }

    // 4) (задание со *) Задано уравнение вида q + w = e, q, w, e >= 0. 
    // Некоторые цифры могут быть заменены знаком вопроса, например, 
    // 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. 
    // Предложить хотя бы одно решение или сообщить, что его нет.

    private static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Given an equation of the form: q + w = e, q, w, e >= 0 ");
        System.out.println("Enter a number for 'q' replacing a digit by '?':  ");
        String num1 = scanner.nextLine();
        System.out.println("Enter a number for 'w' replacing a digit by '?':  ");
        String num2 = scanner.nextLine();
        System.out.println("Enter a number for 'e' replacing a digit by '?':  ");
        String num3 = scanner.nextLine();
        
        System.out.println("Your equation is: " + num1 + " + " + num2 + " = " + num3);
        
        if (num1.length() > num3.length() || num2.length() > num3.length()) {
        System.err.println("There is no possible solution!");
        }

        int n3 = Integer.parseInt(num3);
        Integer count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                String n1 = num1.replaceAll("\\?", Integer.toString(i));
                String n2 = num2.replaceAll("\\?", Integer.toString(j));
                int q = Integer.parseInt(n1);
                int w = Integer.parseInt(n2);
                if (q + w == n3) {
                    System.out.println("A solution found: " + q + " + " + w + " = " + n3);
                    count ++;
                }
            }
        }
        if (count == 0) {
            System.out.println("Sorry for not beeing able to find a solution :(");
        }
    }


    // На вход некоторому исполнителю подаётся два числа (a, b). 
    // У исполнителя есть две команды
    // - команда 1 (к1): увеличить в с раза, а умножается на c
    // - команда 2 (к2): увеличить на d ( +2 ), к a прибавляется d
    // Написать программу, которая выдаёт набор команд, позволяющий число a 
    // превратить в число b или сообщить, что это невозможно
    // Пример 1: а = 1, b = 7, c = 1, d = 3
    // ответ: к1, к1, к1, к1, к1, к1 или к1, к2, к1, к1, к1 или к1, к1, к2, к1. 
    // Пример 2: а = 11, b = 7, c = 2, d = 1
    // ответ: “”. 

    private static double task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter a factor: ");
        int mult = scanner.nextInt();
        System.out.println("Enter an addend: ");
        int augm = scanner.nextInt();

        String res = "";
        transformation(num1, num2, mult, augm, res);

        private static void transformation(int a, int b, int c, int d, String result) {
            if (a > b) {
            return;
            }
            if (a == b) {
                System.out.println(result);
                return;
            }
            transformation(a * c, b, c, d, result + "k1");
            transformation(a + d, b, c, d, result + "k2");
        }
    }  
}




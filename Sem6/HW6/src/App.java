// Подумать над структурой класса Ноутбук(или Единорогов) для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Переопределить toString, equals и hashCode(как на семинаре).
// Вывести на печать экземпляры класса, сравнить пару экземпляров и найти один экземпляр в наборе.

// Задание со звездочкой:
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import LaptopLibrary.Laptop;

public class App {
    public static void main(String[] args) throws Exception {

        Laptop laptop1 = new Laptop("Acer", 8, 512, 512, "blue", "AMD", 15.6);
        Laptop laptop2 = new Laptop("Dell", 24, 216, 512, "grey", "Intel", 14.2);
        Laptop laptop3 = new Laptop("Lenovo", 16, 1024, 0, "black", "Intel", 17.2);
        Laptop laptop4 = new Laptop("Honor", 16, 512, 216, "black", "AMD", 15.6);
        Laptop laptop5 = new Laptop("Xiomi", 8, 1024, 0, "blue", "Intel", 14.2);
        Laptop laptop6 = laptop4;
        Laptop laptop7 = laptop3;

        Set<Laptop> uniqueLaptop = new HashSet<Laptop>();
        uniqueLaptop.add(laptop1);
        uniqueLaptop.add(laptop2);
        uniqueLaptop.add(laptop3);
        uniqueLaptop.add(laptop4);
        uniqueLaptop.add(laptop5);
        uniqueLaptop.add(laptop6);
        uniqueLaptop.add(laptop7);
       
        System.out.println(laptop1.equals(laptop5));

        System.out.printf("The number of unique laptops is: %d \n", uniqueLaptop.size());
        System.out.println(Set<Laptop>);

        Map<Integer, String> mapCriteria = new HashMap<>();
        mapCriteria.put(1, "Brand");
        mapCriteria.put(2, "RAM");
        mapCriteria.put(3, "SSD");
        mapCriteria.put(4, "HDD");
        mapCriteria.put(5, "Color");
        mapCriteria.put(6, "Processor");
        mapCriteria.put(7, "Screen size");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите желаемые характеристики: 1. объем оперативной памяти: ");
        int ramUser = sc.nextInt();
        System.out.println("объем накопителя: ");
        int storUser = sc.nextInt();
        
        System.out.println("диагональ");
        double digUser = sc.nextDouble();
        
        for(Laptop lap: uniqueLaptop) {
            if ((lap.getRam() >= ramUser) && (lap.getStorageCap() >= storUser)  && lap.getDiagonal() >= digUser) {
                System.out.println(lap.toString());
            }
        }
        sc.close();
        
    }
}


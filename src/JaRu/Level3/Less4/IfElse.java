package JaRu.Level3.Less4;

/*
Есть программа, которая принимает на вход возраст и определяет, нужно в школу или уже пора в институт. Но она работает неправильно. Например, пятилетнего ребенка отправляют в институт! Исправить программу несложно: достаточно в нужном месте поставить фигурные скобки.

Требования:
•	Программа должна считывать число c клавиатуры.
•	Программа должна использовать команду System.out.println() или System.out.print().
•	Если возраст меньше 18 и больше либо равен 6, нужно вывести только сообщение "нужно ходить в школу".
•	Если возраст больше либо равен 18, нужно вывести только сообщение "пора в институт".
•	Если возраст меньше 6, то ничего выводить не нужно.


package com.javarush.task.pro.task03.task0303;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 18)
            if (age >= 6)
                System.out.println("нужно ходить в школу");
            else
                System.out.println("пора в институт");
    }
}
 */
import java.util.Scanner;

public class IfElse {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int age = scanner.nextInt();
    if (age < 18){
        if (age >= 6)
            System.out.println("нужно ходить в школу");
    }else
            System.out.println("пора в институт");


}
}

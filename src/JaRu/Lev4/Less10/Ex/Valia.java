package JaRu.Lev4.Less10.Ex;
/*
В методе main() есть переменная double glass = 0.5, которая символизирует наполовину заполненный стакан. Для пессимиста он наполовину пуст, а для оптимиста - наполовину полон.
Необходимо считать с клавиатуры данные типа boolean, используя метод nextBoolean() объекта типа Scanner. В зависимости от полученных данных, округлить переменную glass: до целого числа вниз (0), если пессимист (false) и до целого числа вверх (1), если оптимист (true).
Результат вывести на экран.

Пример ввода:
true

Пример вывода:
1

Подсказка:
Чтобы округлить вещественное число до целого вниз, используй метод Math.floor(), вверх - метод Math.ceil().
•	Программа должна считывать c клавиатуры данные типа boolean.
•	Программа должна выводить целое число на экран согласно условию.
•	В программе необходимо использовать метод Math.floor().
•	В программе необходимо использовать метод Math.ceil().
 */

import java.util.Scanner;

public class Valia {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner sc = new Scanner(System.in);
        boolean valia = sc.nextBoolean();
        if (valia) {
            int a = (int) Math.ceil(glass);
            System.out.println(a);
        } else {
            int b = (int) Math.floor(glass);
            System.out.println(b);
        }
    }
}

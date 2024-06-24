package JaRu.Lev4.Less5.Exersize;

/*
Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка или символ. Выведи на экран максимальное четное число из введенных. Если введено несколько таких чисел, необходимо вывести любое из них.
Пример ввода:
8
9
8
4
5
e

Пример вывода:
8

	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить число на экран.
•	Программа должна выводить на экран максимальное четное из введенных целых чисел.
•	Если введено несколько максимальных четных чисел, необходимо вывести любое.
•	Если среди введенных символов нет четного числа или введен только один не числовой символ, то вывести на экран минимальное значение числа типа int.
•	Считывать данные с клавиатуры необходимо в цикле while.
 */

import java.util.Scanner;

public class WhileMaxEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -2147483648;
        while (sc.hasNextInt()) {
            int number = sc.nextInt();
            boolean even = number % 2 == 0;
            while (even) {
                if (number > max) {
                max = number;
                    System.out.println(max);
                }
            }
        }
    }
}
package JaRu.Lev4.Less5.Exersize;

/*
Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка или символ. Выведи на экран минимальное число из введенных. Если введено несколько таких чисел, необходимо вывести любое из них.

Пример ввода:
8
4
9
4
5
e

Пример вывода:
4

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить число на экран.
•	Программа должна выводить на экран минимальное из введенных целых чисел.
•	Если введено несколько минимальных чисел, необходимо вывести любое.
•	Если введен только один нечисловой символ, то вывести на экран максимальное значение числа типа int.
•	Считывать данные с клавиатуры необходимо в цикле while.
 */

import java.util.Scanner;

public class WhileMin {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int min = Integer.MAX_VALUE;
//
//
//        while (scanner.hasNextInt()) {
//            int x = scanner.nextInt();
//            if (x < min || x == min)
//                min = x;
//            System.out.println(min);
//        }

//        Scanner console = new Scanner(System.in);
//        int min = Integer.MAX_VALUE;
//        while (true) {
//            if (console.hasNextInt()) {
//                int up = console.nextInt();
//                if (min>up) min=up;
//            } else break;
//        }
//        console.close();
//        System.out.println(min);

        Scanner con = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        while (con.hasNextInt()) {
            int num = con.nextInt();
            if (min > num) min = num;
        }
        System.out.println(min);
    }
}

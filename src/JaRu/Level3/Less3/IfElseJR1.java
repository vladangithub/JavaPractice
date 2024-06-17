package JaRu.Level3.Less3;
/*
Ввести с клавиатуры температуру на улице. Если температура меньше 0, вывести надпись "на улице холодно", иначе - вывести надпись "на улице тепло".

Требования:
Программа должна считывать значение температуры c клавиатуры.
Программа должна использовать команду System.out.println() или System.out.print().
Если температура меньше 0, вывести только сообщение "на улице холодно".
Если температура больше либо равна 0, вывести только сообщение "на улице тепло".
 */

import java.util.Scanner;

public class IfElseJR1 {
    public static void main(String[] args) {

        String cold = "на улице холодно";
        String warm = "на улице тепло";
        Scanner scanner = new Scanner(System.in);
        int weather = scanner.nextInt();

        if (weather < 0 ) {
            System.out.println(cold);
        } else {
            System.out.println(warm);
        }
    }
}

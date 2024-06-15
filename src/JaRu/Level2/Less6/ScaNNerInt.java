package JaRu.Level2.Less6;
import java.util.Scanner;
/*
Считай с клавиатуры три целых числа.
Выведи на экран их среднее арифметическое.
 */

public class ScaNNerInt {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        int num3 = sc3.nextInt();

        int middleNum = (num1 + num2 + num3) / 3;

        System.out.print(middleNum);
    }

}

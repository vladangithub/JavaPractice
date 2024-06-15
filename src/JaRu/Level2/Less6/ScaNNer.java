package JaRu.Level2.Less6;
/*
Считай с клавиатуры три строки.
А затем:

Выведи на экран третью строку в неизменном виде.
Выведи на экран вторую строку, предварительно преобразовав ее к верхнему регистру.
Выведи на экран первую строку, предварительно преобразовав ее к нижнему регистру.
 */

import java.util.Scanner;

public class ScaNNer {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String s1 = sc1.nextLine();
        Scanner sc2 = new Scanner(System.in);
        String s2 = sc2.nextLine();
        Scanner sc3 = new Scanner(System.in);
        String s3 = sc3.nextLine();

        System.out.println(s3);
        System.out.println(s2.toUpperCase());
        System.out.println(s1.toLowerCase());
    }
}

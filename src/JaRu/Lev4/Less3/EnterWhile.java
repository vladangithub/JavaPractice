package JaRu.Lev4.Less3;
/*
Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму, пока пользователь не введет слово "ENTER".
Вывести на экран полученную сумму и завершить программу.

Требования:
•	Программа должна считывать данные c клавиатуры.
•	Необходимо посчитать сумму введенных целых чисел и вывести её на экран, если пользователь ввел стоп слово.
•	В программе необходимо использовать цикл while.

"Нужно вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "ENTER"."
Давай по порядку расшифровывать задачу.

1. Нам нужно вводить что-то с клавиатуры. Для этого существуют разные способы, пусть это будет Scanner
Scanner scanner = new Scanner(System.in);

2. С клавиатуры будет что-то вводиться, это надо где-то сохранять, создадим переменную, назовём её input. Мы не знаем, будут вводится числа или слово, поэтому сначала будем всё считывать как String. Также нам нужна переменная, в которой мы считаем сумму, это int. Изначально, пока ничего не введено, сумма равна нулю.
Scanner scanner = new Scanner(System.in);
String input;
int sum = 0;

3. Будет что-то делаться, пока не наступит некое условие - "пока пользователь не введёт слово "ENTER". Это цикл while, и мы в условии продолжения цикла прямо и считаем в переменную input ввод, и сразу же проверим, а не "ENTER" ли это. Восклицательный знак тут важен ;)
Scanner scanner = new Scanner(System.in);
String input;
int sum = 0;
while ( ! (input = scanner.nextLine()).equals("ENTER") ) {
     // тут что-то будем делать
}

Что именно будет делаться в цикле? Введённое число надо прибавлять к сумме. Число мы уже считали в input и проверили, что это не "ENTER". Но input - это String, строку нельзя просто прибавить к сумме, поэтому вызываем парсер строки в целое число.
Scanner scanner = new Scanner(System.in);
String input;
int sum = 0;
while ( ! (input = scanner.nextLine()).equals("ENTER") ) {
     sum += Integer.parseInt(input);
}


Осталось вывести на экран сумму.

Тут в этом решении тебе наверняка встретятся незнакомые тебе методы - не постесняйся их погуглить. Поначалу всё это страшно и непонятно, потом станет легко и просто.


 */

import java.util.Scanner;


public class EnterWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
//            System.out.println(sum); вот в чем ошибка, считал после каждой итерации
//            scanner.close();
        }
        System.out.println(sum);

    }
}

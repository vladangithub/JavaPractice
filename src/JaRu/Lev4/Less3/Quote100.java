package JaRu.Lev4.Less3;

/*
Используя цикл while вывести на экран сто раз цитату (переменная quote):
«Я никогда не буду работать за копейки. Амиго»

Каждое значение вывести с новой строки.

Требования:
•	Программа должна выводить текст на экран.
•	Программа должна выводить на экран 100 раз содержимое переменной quote.
•	В программе необходимо использовать цикл while.
 */

public class Quote100 {
    public static void main(String[] args) {
        String quote = "Я никогда не буду работать за копейки. Амиго";

        int i = 0;
        while (i < 100){
            System.out.println(quote);
            i++;
        }
    }
}

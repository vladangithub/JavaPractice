package JaRu.Lev4.Less4;

/*
Вывести на экран сумму чисел от 1 до 100 включительно, не кратных 3. Для этого используй цикл while.

Подсказка: чтобы в цикле перейти к следующему числу, используй оператор continue.

Требования:
•	Программа должна вывести в консоль сумму всех чисел от 1 до 100 включительно, не кратных 3.
•	В программе необходимо использовать цикл while.
•	В программе необходимо использовать оператор continue.
 */

public class Continue100 {
    public static void main(String[] args) {
        int i = 1;
        int summmm = 0;
        while (i <= 100) {
            if (i % 3 == 0) {
                i++;
                continue;
            }
            summmm = summmm + i;
            i++;
        }

        System.out.println(summmm);
    }
}

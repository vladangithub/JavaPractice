package JaRu.Lev4.Less5.Lectures;
/*
Давайте напишем программу, которая вводит числа с клавиатуры (пока пользователь вводит что-то похожее на числа) и выводит на экран их сумму. Вот как будет выглядеть код такой программы (приводим только код внутри метода main).

Создаем объект Scanner для чтения данных с консоли.
В переменной sum будем хранить сумму чисел.
Пока в консоли вводят целые числа

считываем очередное число в переменную x.
Добавляем x к сумме чисел (переменная sum).

Выводим подсчитанную сумму на экран.
 */

import java.util.Scanner;

public class WhileSumm {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int summ = 0;
        while (console.hasNextInt()) {
            int q = console.nextInt();
            summ += q;
            System.out.println(summ);
        }

    }
}

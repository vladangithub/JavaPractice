package JaRu.Lev4.Less6.Lect;

/*
напишем программу, которая вводит с клавиатуры 10 строк и выводит на экран, сколько из этих строк было чисел.
Создаем объект Scanner для чтения данных с консоли.
        В переменной count будем хранить количество чисел.
                Цикл от 0 до 10 (не включая 10).

        Если в консоли ввели число,
                то увеличиваем count на единицу.
        Считываем строчку из консоли и никуда ее не сохраняем.

                Выводим подсчитанную сумму на экран.

 */
import java.util.Scanner;
public class StringForNum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 10; i++)
        {
            if (console.hasNextInt())
                count++;
            console.nextLine();
        }
        System.out.println(count);

    }
}

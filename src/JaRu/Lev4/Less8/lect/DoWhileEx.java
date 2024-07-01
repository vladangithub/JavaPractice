package JaRu.Lev4.Less8.lect;
/*
В этой задаче нужно:

Ввести с клавиатуры строку и число number, которое больше 0 и меньше 5.
Вывести на экран строку number раз с помощью цикла do-while. Каждое значение нужно вывести с новой строки.
Если число number меньше/равно 0 или больше/равно 5, то введенную строку нужно вывести на экран один раз.
Пример ввода:
абв
2

Пример вывода:
абв
абв

Требования:
•	Программа должна считывать данные c клавиатуры.
•	Программа должна выводить данные на экран.
•	Программа должна выводить на экран строку number раз.
•	Программа должна выводить на экран строку один раз, если число number меньше/равно 0 или больше/равно 5.
•	В программе необходимо использовать цикл do-while.
 */
import java.util.Scanner;
public class DoWhileEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String b = scanner.nextLine();
        int number = scanner.nextInt();


        if ((number <=0 || number >= 5))//вводим условны оператор if, если число нумбер меньше или =0 ИЛИ нумбер >=5
            System.out.println(b);// если условие if true(хоть одно из сторон) выводим на экран строку Б 1 раз.
        else {                     //иначе если условие if false
            //то выполняем условие do

            do {
                for (int i = 0; i < number; i++) {    //включаем цикл со счетчиком
                    System.out.println(b);          //выводим на экран Б столько раз сколько мы написали number
                }
            }
            while (number <= 0 || number >= 5);     // не выполнится никогда и закончится программа, потому что наверху где if не выполнилось

        }
//if (number > 0 && number < 5) {
//    do {
//    System.out.println(input);
//    number--;
//}while (number > 0 && number < 5);
//} else if (number <= 0 && number >= 5) {}
//        System.out.println(input);


    }
}

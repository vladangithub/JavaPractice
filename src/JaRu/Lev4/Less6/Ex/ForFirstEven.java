package JaRu.Lev4.Less6.Ex;

/*
Напиши программу, в которой с помощью цикла for на экран будут выведены чётные числа от 1 до 15.
Каждое значение нужно выводить с новой строки.

Требования:
•	Программа должна выводить текст на экран.
•	Программа должна выводить чётные числа от 1 до 15. Каждое значение вывести с новой строки.
•	В программе необходимо использовать цикл for.
 */

public class ForFirstEven {
    public static void main(String[] args) {
        for(int i = 1; i < 15; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }


}
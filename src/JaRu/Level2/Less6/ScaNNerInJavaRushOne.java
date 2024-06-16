package JaRu.Level2.Less6;
import java.util.Scanner;

public class ScaNNerInJavaRushOne {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner("Люблю тебя, Петра творенье,\n" +
//                "Люблю твой строгий, стройный вид,\n" +
//                "Невы державное теченье,\n" +
//                "Береговой ее гранит");
//        String s = scanner.nextLine();
//        System.out.println(s);
//        s = scanner.nextLine();
//        System.out.println(s);
//        s = scanner.nextLine();
//        System.out.println(s);
//        s = scanner.nextLine();
//        System.out.println(s);


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите число: ");
//
//        int num = sc.nextInt();
//        System.out.println("Ваше введенное число: " + num);

//        Scanner scannerInt = new Scanner(System.in);
//        System.out.println("ВВедите число: ");
//
//        if (scannerInt.hasNextInt()) {
//            int number = scannerInt.nextInt();
//            System.out.println("Вы ввели число: " + number);
//        } else {
//            System.out.println("Вы ввели неверный символ!");
//        }


        /*
        Мы используем в качестве разделителя строк метод useDelimeter() класса Scanner: он отвечает за деление входящих данных на части. В нашем случае для разделения строк в качестве аргумента передаётся и используется одиночная кавычка ("'"). Следующий за этой кавычкой текст отображается на новой строке, так как в цикле while мы используем метод println() класса System для считывания данных.

        Scanner scan = new Scanner("На голой ветке'" +
                "Ворон сидит одиноко.'" +
                "Осенний вечер." +
                "''***''" +
                "В небе такая луна,'" +
                "Словно дерево спилено под корень:'" +
                "Белеет свежий срез." +
                "''***''" +
                "Как разлилась река!'" +
                "Цапля бредет на коротких ножках,'" +
                "По колено в воде.");

        scan.useDelimiter("'");

        while (scan.hasNext()) {
            System.out.println(scan.next());
        }

        scan.close();
        */

        /*
        В этом же примере есть еще один метод, на который нужно обязательно обратить внимание — close(). Как и любой объект, работающий с потоками ввода-вывода, сканер должен быть закрыт по завершении своей работы, чтобы больше не потреблять ресурсы нашего компьютера.

Никогда не забывай о методе close()!
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

        int number = sc.nextInt();

        System.out.println("Спасибо! Вы ввели число " + number);

        sc.close();//вот теперь мы сделали все правильно!
    }
}

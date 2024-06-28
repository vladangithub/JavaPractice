package JaRu.Lev4.Less6.Lect;
/*
3. Рисуем на экране с помощью цикла for
Давайте напишем программу, которая рисует на экране треугольник: в первой строчке выводит 10 звездочек, во второй — 9 звездочек, затем 8, и т.д.
 */

public class ForStars {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            int stars = 10 - i;
            for (int j = 0; j < stars; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

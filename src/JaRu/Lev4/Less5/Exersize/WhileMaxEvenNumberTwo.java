package JaRu.Lev4.Less5.Exersize;
import java.util.Scanner;

public class WhileMaxEvenNumberTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        while (sc.hasNextInt()) {
            int number = sc.nextInt();
            if ((max < number) && (number % 2 == 0)){
                max = number;
            }

        }
        System.out.println(max);
    }
}

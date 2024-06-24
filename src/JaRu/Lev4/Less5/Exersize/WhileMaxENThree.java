package JaRu.Lev4.Less5.Exersize;
import java.util.Scanner;

public class WhileMaxENThree {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        while(key.hasNextInt()){
            int num = key.nextInt();
            if(max<num&&(num%2)==0)
                max = num;
        }System.out.println(max);
    }

}

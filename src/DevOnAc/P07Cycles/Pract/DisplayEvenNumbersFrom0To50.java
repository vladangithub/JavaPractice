package DevOnAc.P07Cycles.Pract;

public class DisplayEvenNumbersFrom0To50 {
    public static void main(String[] args) {
        int from = 0;
        int to = 50;
        int step = 2;

        for (int i = from; i <= to; i += step) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
}

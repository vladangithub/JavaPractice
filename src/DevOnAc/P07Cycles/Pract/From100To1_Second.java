package DevOnAc.P07Cycles.Pract;

public class From100To1_Second {
    public static void main(String[] args) {
        int from = 100;
        int to = 1;
        int step = 1;

        for (int i = from; i >= to; i-= step) {
            System.out.print(i + " ");
        }
    }
}

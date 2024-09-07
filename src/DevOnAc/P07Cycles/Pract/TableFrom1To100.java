package DevOnAc.P07Cycles.Pract;

public class TableFrom1To100 {
    public static void main(String[] args) {
        int from = 1;
        int to = 100;
        int col = 10;

        for (int i = from; i <= to; i++) {
            System.out.print(i + "\t");

            if (i % col == 0){
                System.out.println();
            }
        }
    }
}

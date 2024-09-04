package DevOnAc.P07Cycles.Pract;

public class DisplayNumFrom100To1 {
    public static void main(String[] args) {

        var from = 100;
        var to = 1;
        var step = 1;

        for (int i = from; i >=to ; i-= step) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

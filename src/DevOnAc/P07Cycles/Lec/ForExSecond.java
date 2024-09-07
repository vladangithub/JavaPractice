package DevOnAc.P07Cycles.Lec;

public class ForExSecond {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        for (int i = 0; i < 5; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();

        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 50; i <= 100; i += 5) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        for (int i = 100; i >= 50; i -= 3) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
}


/*
for (int i = 0; i < 5; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println("\n");

        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        for (int i = 4; i >= 0; i--) {
            System.out.print(i + 1 + " ");
        }
        System.out.println("\n")
 */
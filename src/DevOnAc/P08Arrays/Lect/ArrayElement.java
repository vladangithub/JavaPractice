package DevOnAc.P08Arrays.Lect;


import java.util.Arrays;

public class ArrayElement {
    public static void main(String[] args) {
        int[] array = {8, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array));

        System.out.println(array[0]);

        array[0] = 45;
        System.out.println(Arrays.toString(array));

        array[9] = 148;
        array[0] = 11148;

        System.out.println(Arrays.toString(array));
        System.out.println(array[0] + " ");
        System.out.println(array[1] + " ");
        System.out.println(array[2] + " ");
        System.out.println(array[3] + " ");
        System.out.println(array[4] + " ");
        System.out.println(array[5] + " ");
        System.out.println(array[6] + " ");
        System.out.println(array[7] + " ");
        System.out.println(array[8] + " ");
        System.out.println(array[9] + " ");

    }
}

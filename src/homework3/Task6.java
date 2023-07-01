package homework3;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {

        System.out.println("----------------------------");
        System.out.println("Task 6");
        System.out.println("Create an array and fill it.Print count elements which can be divided by 2");
        System.out.println("----------------------------");

        int[] array = new int[]{12, 5, -456, 6, 4448, 8, -45, 1, 56};
        int count = 0;

        System.out.println("array =  " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println("----------------------------");
        System.out.println("Count = " + count);

    }
}

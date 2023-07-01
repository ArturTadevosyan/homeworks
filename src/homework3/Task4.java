package homework3;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        System.out.println("----------------------------");
        System.out.println("Task 4");
        System.out.println("Create an array and fill it ,Print all elements which can be divided by 5");
        System.out.println("----------------------------");

        int[] array = new int[]{0, 5, -456, 6, 4448, 8, -45, 1, 56, 100};
        System.out.println("array =  " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}

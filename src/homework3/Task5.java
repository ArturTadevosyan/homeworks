package homework3;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        System.out.println("----------------------------");
        System.out.println("Task 5");
        System.out.println("Create an array and fill it. Print all elements which are between 24.12 and 467.23");
        System.out.println("----------------------------");


        double[] array = new double[]{25.266, 0, 5, 256.5, 496, 6, 56, 24.121, 4448, 8, 800, -45, 1, 100};
        System.out.println("array =  " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 24.12 && array[i] <= 467.23) {
                System.out.println("array[ " + i + " ] = " + array[i]);
            }
        }

    }

}

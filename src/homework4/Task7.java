package homework4;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        System.out.println("----------------------------");
        System.out.println("Task 7");
        System.out.println("Given an integer, 0 < N < 21 print its first 10 multiples");
        System.out.println("Each multiple N x i  (where  0 < i < 11 ) should be printed on a new line in the from: N x i = result");
        System.out.println("----------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please write 0 <-> 21 range , one number = ");
        int multipleNumber = scanner.nextInt();
        while (multipleNumber > 21 || multipleNumber < 0) {
            System.out.println("Please write correct number 0 <-> 21 ,your number is out of this range = " + multipleNumber);
            multipleNumber = scanner.nextInt();
        }
        for (int i = 1; i < 11; i++) {
            System.out.println(multipleNumber + " x " + i + " = " + multipleNumber * i);
        }

    }
}

package homework2;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("----------------------------");
        System.out.println("Task 2");
        System.out.println("Create an array and fill it with numbers 1:1000");
        System.out.println("----------------------------");

        //first example
        int[] num1 = new int[1000];
        int i = 0;
        System.out.println("while loop");
        while (i < num1.length) {
            num1[i] = i + 1;
            System.out.println("num1[ "+ i +" ] = "+num1[i]);
            i++;
        }
        System.out.println("-------------------------");
        System.out.println("for loop");

        //second example
        int[] num2 = new int[1000];
        for (int j = 0; j < num2.length; j++) {
            num2[j] = j + 1;
            System.out.println("num1[ "+ j +" ] = " + num2[j]);
        }
    }

}

package homework2;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("----------------------------");
        System.out.println("Task 1");
        System.out.println("Create an array and fill it with 2 number");
        System.out.println("----------------------------");
        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            num[i] = 2;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("num[ "+ i +" ] " + num[i]);
        }


    }
}

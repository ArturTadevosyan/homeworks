package homework;

public class Xndragirq1 {

    public static void main(String[] args) {

        int a = 5, b = -4, c = 8;

        //Task 24
        System.out.println("------------------------");
        System.out.println("Task 24 -> Թվերից Ճիշտ երկուսը հավասար են երկուսի");
        System.out.println("a = " + a + " , " + "b = " + b +" , " + "c = " + c);
        System.out.println("------------------------");

        if ((a == 2 && b == 2) || (b == 2 && c == 2) || (a == 2 && c == 2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //Task 27
        System.out.println("\n------------------------");
        System.out.println("Task 27 ->  Եթե Թվաբանական Պրոգրեսիա են true else false");
        System.out.println("a = " + a + " , " + "b = " + b +" , " + "c = " + c);
        System.out.println("------------------------");

        if (b - a == c - b) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //Task 28
        System.out.println("\n------------------------");
        System.out.println("Task 28 -> Եթե Թվերը Երկրաչափական պրոգրեսիա են true else false");
        System.out.println("a = " + a + " , " + "b = " + b +" , " + "c = " + c);
        System.out.println("------------------------");

        double a1 = 2, b1 = 4, c1 = 8;
        if (b1 / a1 == c1 / b1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //Task 29
        System.out.println("\n------------------------");
        System.out.println("Task 29 -> Թվերը Ըստ աճման կարգի");
        System.out.println("a = " + a + " , " + "b = " + b +" , " + "c = " + c);
        System.out.println("------------------------");

        if (a < b && a < c) {
            if (b < c) {
                System.out.println(a + "->" + b + "->" + c);
            } else {
                System.out.println(a + "->" + c + "->" + b);
            }
        } else if (b < c) {
            if (a < c) {
                System.out.println(b + "->" + a + "->" + c);
            } else {
                System.out.println(b + "->" + c + "->" + a);
            }
        } else {
            if (a < b) {
                System.out.println(c + "->" + a + "->" + b);
            } else {
                System.out.println(c + "->" + b + "->" + a);
            }
        }

        //Task 30
        System.out.println("\n------------------------");
        System.out.println("Task 30 -> Թվերը Ըստ նվազման կարգի");
        System.out.println("a = " + a + " , " + "b = " + b +" , " + "c = " + c);
        System.out.println("------------------------");

        if (a > b && a > c) {
            if (b > c) {
                System.out.println(a + "->" + b + "->" + c);
            } else {
                System.out.println(a + "->" + c + "->" + b);
            }
        } else if (b > c) {
            if (a > c) {
                System.out.println(b + "->" + a + "->" + c);
            } else {
                System.out.println(b + "->" + c + "->" + a);
            }
        } else {
            if (a > b) {
                System.out.println(c + "->" + a + "->" + b);
            } else {
                System.out.println(c + "->" + b + "->" + a);
            }
        }

    }
}

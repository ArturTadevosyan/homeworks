package homework;

public class TasksWith3DigitNumbers {

    public static void main(String[] args) {

        int number1 = 5, number2 = -4, number3 = 8;

        //Task 24
        System.out.println("------------------------");
        System.out.println("Task 24 -> Թվերից Ճիշտ երկուսը հավասար են երկուսի");
        System.out.println("number1 = " + number1 + " , " + "number2 = " + number2 + " , " + "number3 = " + number3);
        System.out.println("------------------------");

        if ((number1 == 2 && number2 == 2) || (number2 == 2 && number3 == 2) || (number1 == 2 && number3 == 2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //Task 27
        System.out.println("\n------------------------");
        System.out.println("Task 27 ->  Եթե Թվաբանական Պրոգրեսիա են true հակառակ դեպքում false");
        System.out.println("number1 = " + number1 + " , " + "number2 = " + number2 + " , " + "number3 = " + number3);
        System.out.println("------------------------");

        if (number2 - number1 == number3 - number2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //Task 28
        System.out.println("\n------------------------");
        System.out.println("Task 28 -> Եթե Թվերը Երկրաչափական պրոգրեսիա են true հակառակ դեպքում false");
        System.out.println("number1 = " + number1 + " , " + "number2 = " + number2 + " , " + "number3 = " + number3);
        System.out.println("------------------------");

        double numberD1 = 2, numberD2 = 4, numberD3 = 8;
        if (numberD2 / numberD1 == numberD3 / numberD2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //Task 29
        System.out.println("\n------------------------");
        System.out.println("Task 29 -> Թվերը Ըստ աճման կարգի");
        System.out.println("number1 = " + number1 + " , " + "number2 = " + number2 + " , " + "number3 = " + number3);
        System.out.println("------------------------");

        if (number1 < number2 && number1 < number3) {
            if (number2 < number3) {
                System.out.println(number1 + "->" + number2 + "->" + number3);
            } else {
                System.out.println(number1 + "->" + number3 + "->" + number2);
            }
        } else if (number2 < number3) {
            if (number1 < number3) {
                System.out.println(number2 + "->" + number1 + "->" + number3);
            } else {
                System.out.println(number2 + "->" + number3 + "->" + number1);
            }
        } else {
            if (number1 < number2) {
                System.out.println(number3 + "->" + number1 + "->" + number2);
            } else {
                System.out.println(number3 + "->" + number2 + "->" + number1);
            }
        }

        //Task 30
        System.out.println("\n------------------------");
        System.out.println("Task 30 -> Թվերը Ըստ նվազման կարգի");
        System.out.println("number1 = " + number1 + " , " + "number2 = " + number2 + " , " + "number3 = " + number3);
        System.out.println("------------------------");

        if (number1 > number2 && number1 > number3) {
            if (number2 > number3) {
                System.out.println(number1 + "->" + number2 + "->" + number3);
            } else {
                System.out.println(number1 + "->" + number3 + "->" + number2);
            }
        } else if (number2 > number3) {
            if (number1 > number3) {
                System.out.println(number2 + "->" + number1 + "->" + number3);
            } else {
                System.out.println(number2 + "->" + number3 + "->" + number1);
            }
        } else {
            if (number1 > number2) {
                System.out.println(number3 + "->" + number1 + "->" + number2);
            } else {
                System.out.println(number3 + "->" + number2 + "->" + number1);
            }
        }

    }
}

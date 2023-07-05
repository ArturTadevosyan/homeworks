package homework;

public class Tasks2With3DigitNumbers {
    public static void main(String[] args) {
        int number = 600;
        boolean t;
        System.out.println("number = " + number);
        double hundreds = number / 100;
        System.out.println("hundreds = " + hundreds);
        double tens = (number / 10) % 10;
        System.out.println("tens = " + tens);
        double unit = number % 10;

        if (unit == 0 ){
            System.err.println("Միավորի արժեքը պետք է լինի ոչ 0");
            return;
        }
        System.out.println("unit = " + unit);
        double numberDigitSum = unit + tens + hundreds;
        System.out.println("------------------------");

        System.out.println("\n------------------------");
        System.out.println("Task 51");
        System.out.println("-------------------------");
        t = unit == tens + hundreds;

        System.out.println("Task 51 answer ->  t = " + t);

        System.out.println("\n------------------------");
        System.out.println("Task 52");
        System.out.println("-------------------------");
        t = unit == tens || unit == hundreds || hundreds == tens;

        System.out.println("Task 52 answer ->  t = " + t);


        System.out.println("\n------------------------");
        System.out.println("Task 53");
        System.out.println("-------------------------");
        int k = 100;
        System.out.println("k = " + k);
        double answer;
        if (number > k) {
            answer = number / numberDigitSum;
        } else {
            answer = number / unit;
        }
        System.out.println("Task 53 answer = " + answer);

        //Task54
        System.out.println("\n------------------------");
        System.out.println("Task 54");
        System.out.println("-------------------------");
        double max;
        if (unit > tens && unit > hundreds) {
            max = unit;
        } else if (tens > unit && tens > hundreds) {
            max = tens;
        } else {
            max = hundreds;
        }
        System.out.println("Task 54 answer max = " + max);

        //Task55
        System.out.println("\n------------------------");
        System.out.println("Task 55");
        System.out.println("-------------------------");
        double min;
        if (unit < tens && unit < hundreds) {
            min = unit;
        } else if (tens < unit && tens < hundreds) {
            min = tens;
        } else {
            min = hundreds;
        }
        System.out.println("Task 55 answer min = " + min);

        //Task56
        System.out.println("\n------------------------");
        System.out.println("Task 56");
        System.out.println("-------------------------");

        if (unit > tens) {
            answer = number / numberDigitSum;
        } else {
            answer = number;
        }
        System.out.println("Task 56 answer  = " + answer);


        //Task57
        System.out.println("\n------------------------");
        System.out.println("Task 57");
        System.out.println("-------------------------");

        if (number > 300) {
            answer = tens / unit;
        } else {
            answer = hundreds / unit;
        }
        System.out.println("Task 57 answer  = " + answer);


        //Task58
        System.out.println("\n------------------------");
        System.out.println("Task 58");
        System.out.println("-------------------------");
        char f;
        if (tens + hundreds < 5) {
            f = 'a';
        } else {
            f = 'b';
        }
        System.out.println("Task 58 answer f = " + f);


        //Task 59
        System.out.println("\n------------------------");
        System.out.println("Task 59 -> Թվերը Ըստ աճման կարգի");
        System.out.println("------------------------");

        if (unit < tens && unit < hundreds) {
            if (tens > hundreds) {
                System.out.println(unit + "->" + tens + "->" + hundreds);
            } else {
                System.out.println(unit + "->" + hundreds + "->" + tens);
            }
        } else if (tens < hundreds && tens < unit) {
            if (unit < hundreds) {
                System.out.println(tens + "->" + unit + "->" + hundreds);
            } else {
                System.out.println(tens + "->" + hundreds + "->" + unit);
            }
        } else {
            if (unit > tens) {
                System.out.println(hundreds + "->" + unit + "->" + tens);
            } else {
                System.out.println(hundreds + "->" + tens + "->" + unit);
            }
        }


        //Task 60
        System.out.println("\n------------------------");
        System.out.println("Task 60 -> Թվերը Ըստ նվազման կարգի");
        System.out.println("------------------------");

        if (unit > tens && unit > hundreds) {
            if (tens > hundreds) {
                System.out.println(unit + "->" + tens + "->" + hundreds);
            } else {
                System.out.println(unit + "->" + hundreds + "->" + tens);
            }
        } else if (tens > hundreds && tens > unit) {
            if (unit > hundreds) {
                System.out.println(tens + "->" + unit + "->" + hundreds);
            } else {
                System.out.println(tens + "->" + hundreds + "->" + unit);
            }
        } else {
            if (unit > tens) {
                System.out.println(hundreds + "->" + unit + "->" + tens);
            } else {
                System.out.println(hundreds + "->" + tens + "->" + unit);
            }
        }

    }
}

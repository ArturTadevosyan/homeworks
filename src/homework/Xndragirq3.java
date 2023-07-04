package homework;

public class Xndragirq3 {
    public static void main(String[] args) {
        int number = 686;
        boolean t;
        System.out.println("number = " + number);
        double haryuravor = number / 100;
        System.out.println("haryuravor = " + haryuravor);
        double tasnavor = (number / 10) % 10;
        System.out.println("tasnavor = " + tasnavor);
        double miavor = number % 10;
        System.out.println("miavor = " + miavor);
        double numberDigitSum = miavor + tasnavor + haryuravor;
        System.out.println("------------------------");

        System.out.println("\n------------------------");
        System.out.println("Task 51");
        System.out.println("-------------------------");
        if (miavor == tasnavor + haryuravor) {
            t = true;
        } else {
            t = false;
        }
        System.out.println("Task 51 answer ->  t = " + t);

        System.out.println("\n------------------------");
        System.out.println("Task 52");
        System.out.println("-------------------------");
        if (miavor == tasnavor || miavor == haryuravor || haryuravor == tasnavor) {
            t = true;
        } else {
            t = false;
        }
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
            answer = number / miavor;
        }
        System.out.println("Task 53 answer = " + answer);

        //Task54
        System.out.println("\n------------------------");
        System.out.println("Task 54");
        System.out.println("-------------------------");
        double max;
        if (miavor > tasnavor && miavor > haryuravor) {
            max = miavor;
        } else if (tasnavor > miavor && tasnavor > haryuravor) {
            max = tasnavor;
        } else {
            max = haryuravor;
        }
        System.out.println("Task 54 answer max = " + max);

        //Task55
        System.out.println("\n------------------------");
        System.out.println("Task 55");
        System.out.println("-------------------------");
        double min;
        if (miavor < tasnavor && miavor < haryuravor) {
            min = miavor;
        } else if (tasnavor < miavor && tasnavor < haryuravor) {
            min = tasnavor;
        } else {
            min = haryuravor;
        }
        System.out.println("Task 55 answer min = " + min);

        //Task56
        System.out.println("\n------------------------");
        System.out.println("Task 56");
        System.out.println("-------------------------");

        if (miavor > tasnavor) {
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
            answer = tasnavor / miavor;
        } else {
            answer = haryuravor / miavor;
        }
        System.out.println("Task 57 answer  = " + answer);


        //Task58
        System.out.println("\n------------------------");
        System.out.println("Task 58");
        System.out.println("-------------------------");
        char f;
        if (tasnavor + haryuravor < 5) {
            f = 'a';
        } else {
            f = 'b';
        }
        System.out.println("Task 58 answer f = " + f);


        //Task 59
        System.out.println("\n------------------------");
        System.out.println("Task 59 -> Թվերը Ըստ աճման կարգի");
        System.out.println("------------------------");

        if (miavor < tasnavor && miavor < haryuravor) {
            if (tasnavor > haryuravor) {
                System.out.println(miavor + "->" + tasnavor + "->" + haryuravor);
            } else {
                System.out.println(miavor + "->" + haryuravor + "->" + tasnavor);
            }
        } else if (tasnavor < haryuravor) {
            if (miavor < haryuravor) {
                System.out.println(tasnavor + "->" + miavor + "->" + haryuravor);
            } else {
                System.out.println(tasnavor + "->" + haryuravor + "->" + miavor);
            }
        } else {
            if (miavor > tasnavor) {
                System.out.println(haryuravor + "->" + miavor + "->" + tasnavor);
            } else {
                System.out.println(haryuravor + "->" + tasnavor + "->" + miavor);
            }
        }


        //Task 60
        System.out.println("\n------------------------");
        System.out.println("Task 60 -> Թվերը Ըստ նվազման կարգի");
        System.out.println("------------------------");

        if (miavor > tasnavor && miavor > haryuravor) {
            if (tasnavor > haryuravor) {
                System.out.println(miavor + "->" + tasnavor + "->" + haryuravor);
            } else {
                System.out.println(miavor + "->" + haryuravor + "->" + tasnavor);
            }
        } else if (tasnavor > haryuravor) {
            if (miavor > haryuravor) {
                System.out.println(tasnavor + "->" + miavor + "->" + haryuravor);
            } else {
                System.out.println(tasnavor + "->" + haryuravor + "->" + miavor);
            }
        } else {
            if (miavor > tasnavor) {
                System.out.println(haryuravor + "->" + miavor + "->" + tasnavor);
            } else {
                System.out.println(haryuravor + "->" + tasnavor + "->" + miavor);
            }
        }

    }
}

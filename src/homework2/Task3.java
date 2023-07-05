package homework2;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("----------------------------");
        System.out.println("Task 3");
        System.out.println("Create an array and fill it with odd numbers -20:20");
        System.out.println("----------------------------");

        //Ամեն մի տասնյակում(0->10) կա 5 ( 1, 3, 5, 7, 9) ամբողջ կենտ թիվ; որը հանդիսանում է 10-ի կեսը( 10/2 = 5 );
        //Վերցնում ենք մեզ տրված միջակայքը և մեժ թվից հանում ֆոքր թիվը ,ստանալով միջակայքի երկարությունը
        //Այնուհետև ստուգում ենք այդ թվի կենտ լինելը,եթե կենտ է , պետք է 2-ի բաժանելուց հետո գումարենք 1
        //Քանի որ ամբողջ թվերի բաժանումից հետո վերցվում է միայն թվի ամբողջ մասը
        //Ստանալով միջակայքւմ առկա կենտ թվերի քանակը , մեր զանգվաժի երկարությանը տալիս ենք այդ ստացվաժ թիվը։
        //Այնուհետև for ցիկլի միջոցով վերցնելով միջակայքի թվերը ստուգում ենք դրանց կենտ լինելը և կենտ լինելու դեպքում տեղադրում այն մեր մասիվի մեջ

        int start = -20;
        int end = 20;
        int rangeLength;
        if (end > start) {
            rangeLength = end - start;
        } else {
            rangeLength = start - end;
        }
        int arrayOddLength;
        if (rangeLength % 2 != 0) {
            arrayOddLength = 1 + rangeLength / 2;
        } else {
            arrayOddLength = rangeLength / 2;
        }

        System.out.println("set array length = " + arrayOddLength);
        int[] oddNumbers = new int[arrayOddLength];
        int n = 0;
        for (int l = start; l <= end; l++) {
            if (l % 2 != 0) {
                oddNumbers[n] = l;
                n++;
            }
        }


        System.out.println("for loop");
        //for
        for (int j = 0; j < oddNumbers.length; j++) {
            System.out.println("oddNumbers[ " + j + " ] = " + oddNumbers[j]);
        }
        System.out.println("-------------------------------");
        System.out.println("foreach loop");

        //foreach
        for (int oddNumber : oddNumbers) {
            System.out.print(oddNumber + " | ");
        }
    }
}

package homework;

public class XndirRoom {
    public static void main(String[] args) {
        //Task 1
        int x = 2;

        switch (x) {
            case 1:
            case 3:
            case 5:
                System.out.println("Դասի օր");
                break;
            case 2:
            case 4:
            case 6:
                System.out.println("Ազատ օր");
                break;
            case 7:
                System.out.println("Լիրակի");
                break;
            default:
                System.out.println("Չկա տենց շաբաթվա օր");
        }

    }
}

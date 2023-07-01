package homework1;

public class Homework1 {
    public static void main(String[] args) {

        System.out.println("---Primitive Type---");
        System.out.println(" 1)byte\n 2)short\n 3)int\n 4)long\n 5)float\n 6)double\n 7)boolean\n 8)char");

        System.out.println("---------1)byte-----------");
        System.out.println("byte data type is an 8-bit signed integer");
        System.out.println("byte data type default value is 0");
        System.out.println("byte data type value range is -> -2^7(" + Byte.MIN_VALUE + ") <-> 2^7-1(" + Byte.MAX_VALUE + ")");
        byte b0 = 0;
        System.out.println("b1 = " + b0);
        byte b1 = 15;
        System.out.println("b1 = " + b1);
        byte b2 = -128;
        System.out.println("b2 = " + b2);
        byte b3 = 100;
        System.out.println("b3 = " + b3);

        System.out.println("---------2)short-----------");
        System.out.println("short data type is an 16-bit signed integer");
        System.out.println("short data type default value is 0");
        System.out.println("short data type value range is -> -2^15(" + Short.MIN_VALUE + ") <-> 2^15-1(" + Short.MAX_VALUE + ")");
        short s0 = 0;
        System.out.println("s0 = " + s0);
        short s1 = 10000;
        System.out.println("s1 = " + s1);
        short s2 = -20000;
        System.out.println("s2 = " + s2);
        short s3 = 15;
        System.out.println("s3 = " + s3);

        System.out.println("----------3)int----------");
        System.out.println("int data type is an 32-bit signed integer");
        System.out.println("int data type default value is 0");
        System.out.println("int data type value range is -> -2^31(" + Integer.MIN_VALUE + ") <-> 2^31-1(" + Integer.MAX_VALUE + ")");
        int i0 = 0;
        System.out.println("i0 = " + i0);
        int i1 = -122445465;
        System.out.println("i1 = " + i1);
        int i2 = 456545664;
        System.out.println("i2 = " + i2);
        int i3 = 100;
        System.out.println("i3 = " + i3);

        System.out.println("----------4)long----------");
        System.out.println("long data type is an 64-bit signed integer");
        System.out.println("long data type default value is 0L");
        System.out.println("long data type value range is -> -2^63(" + Long.MIN_VALUE + ") <-> 2^63-1(" + Long.MAX_VALUE + ")");
        long l0 = 0;
        System.out.println("l0 = " + l0);
        long l1 = -12244546545664L;
        System.out.println("l1 = " + l1);
        long l2 = 8965456645545646545L;
        System.out.println("l2 = " + l2);
        long l3 = 100;
        System.out.println("l3 = " + l3);

        System.out.println("---------5)float-----------");
        System.out.println("float data type is a single-precision 32-bit IEEE floating pointer");
        System.out.println("float data type default value is 0.0f");
        float f0 = 0f;
        System.out.println("f0 = " + f0);
        float f1 = -1.2244f;
        System.out.println("f1 = " + f1);
        float f2 = 8965.465f;
        System.out.println("f2 = " + f2);
        float f3 = 100f;
        System.out.println("f3 = " + f3);

        System.out.println("----------6)double----------");
        System.out.println("double data type is a double-precision 64-bit IEEE floating pointer");
        System.out.println("double data type default value is 0.0d");
        double d0 = 0;
        System.out.println("d0 = " + d0);
        double d1 = -1.2244;
        System.out.println("d1 = " + d1);
        double d2 = 8965.46646556445;
        System.out.println("d2 = " + d2);
        double d3 = 156546564.454;
        System.out.println("d3 = " + d3);

        System.out.println("----------7)boolean----------");
        System.out.println("boolean data type is an 1-bit ");
        System.out.println("boolean data type default value is {false}");
        System.out.println("boolean data type only two possible values: {true} and {false}");
        boolean bool1 = false;
        System.out.println("bool1 = " + bool1);
        boolean bool2 = true;
        System.out.println("bool2 = " + bool2);

        System.out.println("----------8)char----------");
        System.out.println("char data type is a single 16-bit Unicode character");
        System.out.println("char data type value range is -> ('\\u0000') or 0 <-> ('\\uffff') or  2^16-1(65535)");
        char c1 = 56;
        System.out.println("c1 = " + c1);
        char c2 = 'a';
        System.out.println("c2 = " + c2);
        char c3 = 10000;
        System.out.println("c3 = " + c3);
        char c4 = '\u0021';
        System.out.println("c4 = " + c4);
        char c5 = '\u1fe4';
        System.out.println("c5 = " + c5);

    }
}
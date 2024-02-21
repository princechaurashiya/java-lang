import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println(num);

        // Type casting
        int num = (int)(67.56f);
        System.out.println(num);


//        int a = 257;
//        byte b = (byte) a; // 257 % 257  = 1
        // automatic type promotion in expressions


//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c;
//        System.out.println(d);

//
//        int number = 'A';
//        System.out.println(number);
//        System.out.println("नमस्ते");
//        System.out.println("你好");
//
//        System.out.println( 3 * 5.3245f);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b)  + (i / c ) - (d * s);
        //float + int - double = double
        System.out.println((f*b) +" " + (i/c) +" "+ (d * s ));
        System.out.println(result);



    }
}

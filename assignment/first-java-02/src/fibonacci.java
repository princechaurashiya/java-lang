//To calculate Fibonacci Series up to n numbers.
import java.util.Scanner;

public class fibonacci {
        public static void main(String[] args) {
            Scanner in = new Scanner (System.in);
            System.out.println("Enter nth number:");
        int n = in.nextInt();
            int a = 0,b = 1;
            System.out.println("Fibonacci series :");
        for (int i = 0; i<n; i++){
            System.out.println(a +" ");
            int temp =a+b;
            a = b;
            b=temp;

        }
    }
}

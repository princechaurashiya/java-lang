import java.util.Scanner;

public class CheckAddorEven {
    //Write a program to print whether a number is even or odd, also take input from the user.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int num =in.nextInt();
        if (num%2==0){
            System.out.printf("%d is Even numbmer\n",num);
        }
        else {
            System.out.printf("%d is Odd number\n",num);

        }
    }
}

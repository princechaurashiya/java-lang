import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
         float num1 = input.nextInt();
        System.out.println("Inter Second number");
        float num2 = input.nextInt();
        float sum = num1 + num2;
        System.out.println("Sum = "+ sum);
    }
}

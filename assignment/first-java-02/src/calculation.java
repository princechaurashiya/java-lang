import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value.
// (Use if conditions)
public class calculation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Enter operator:");
            char op = in.nextLine().trim().charAt(0);

            float result = 0;
            if (op == '+' || op == '-' || op == '*' || op == '/') {

                System.out.println("Enter 1st num:");
                float num1 = in.nextFloat();
                System.out.println("Enter 2nd num:");
                float num2 = in.nextFloat();

                if (op == '+') {
                    result = num1 + num2;
                } else if (op == '-') {
                    result = num1 - num2;
                } else if (op == '*') {
                    result = num1 * num2;
                } else if (op == '/') {
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Envalid division, Try again:");
                    }
                }

            } else if (op == 'X' || op == 'x') {
                break;
            }
            else {
                System.out.println("Envalid operator retry:");
            }
            System.out.println("result ="+result);

           in.nextLine();

        }
        in.close();
    }
}

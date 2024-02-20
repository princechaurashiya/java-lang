import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please inter some Integer: ");
        int rollno = input.nextInt();
        System.out.println(rollno);

         int a = 234_000_000;
        System.out.println(a);

        input.nextLine();

        System.out.println("Please inter some String: ");
        String name = input.nextLine();
        System.out.println(name);

        System.out.print("Please inter some float number: ");
        float marks = input.nextFloat();
        System.out.println(marks);

        System.out.print("Please inter some double number: ");
        double largeDecimalNumber = input.nextDouble();
        System.out.println(largeDecimalNumber);

        System.out.print("Please inter some long integer number: ");
        long largeIntegerNumber = input.nextLong();
        System.out.println(largeIntegerNumber);

        System.out.print("Please  Enter True or False: ");
        boolean check = input.nextBoolean();
        System.out.println(check);

        input.close(); // Close the Scanner object when done

    }
}



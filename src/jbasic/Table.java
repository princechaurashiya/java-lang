import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        System.out.print("Enter the number of table which you want to print: ");
        Scanner input =new Scanner (System .in);
        int a= input.nextInt();
        for(int i=1; i<=10; i++) {
           int c = i * a;
            System.out.println(c);
        }
    }
}

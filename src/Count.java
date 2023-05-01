import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        System.out.println("count up to:");
        Scanner input =new Scanner(System.in);
        int a= input.nextInt();
        for(int i=1; i<=a; i++){
            System.out.print(" "+i);
            if (i%10==0) {
                System.out.println();
            }
        }
    }
}

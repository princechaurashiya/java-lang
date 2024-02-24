import java.util.Scanner;

//Take name as input and print a greeting message for that particular name.
public class inputName {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter name:");
        String name =in.nextLine();
        System.out.println("Hello  Welcome \uD83D\uDE4F "+name);
    }



}

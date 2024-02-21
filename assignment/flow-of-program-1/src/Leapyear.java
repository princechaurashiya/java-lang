//Input a year and find whether it is a leap year or not.

import java.util.*;
public class Leapyear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Year");
        int year = in.nextInt();

        if (year % 4 == 0 && year % 100 !=0){
            System.out.println("Given number is Leap Year");
        } else if
            (year % 400 == 0) {
            System.out.println("Given Year is a leap Year");
        }
        else{
            System.out.println("Giver year is not a leap year");
        }
    }
}

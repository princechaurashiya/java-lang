
public class Recursion {
    
    public static void main(String[] args) {
       int b =5;
     int c = add( b);
       System.out.println(c);
    }  

public static int add(int a) {
    if(a <= 0)s
    return 1;
    return a* add(a-1);
   
}
}
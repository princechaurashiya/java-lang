import java.util.Scanner;

public class Worker {
    public String name;
    public int id ;
    public float salary;
    public Worker(String name, int id, float salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public Worker(){
        this.name = "prince kumar";
        this.id = 90;
        this.salary = 12332;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
    public void print(){
        System.out.println(this);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your name :: ");
        String name = input.next();
        System.out.print("enter your id :: ");
        int id = input.nextInt();
        System.out.print("enter salary :: ");
        float salary = input.nextFloat();
        Worker second = new Worker(name,id,salary);
        second.print();
        Worker first = new Worker("ram",35,532532.4f);
        first.print();
    }
}

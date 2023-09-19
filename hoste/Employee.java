public class Employee {
    public String name;
    public int id ;
    public float salary;

    public Employee (String name, int id , float salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public Employee (){
        this.name="pkc";
        this.id=25432;
        this.salary=500000;
    }
    public String toString(){
        return "Employee { \n" +
        "name :" + name +"\n" +
        "id :" + id  +"\n" +
        "salary :" + salary +'}';
        }
    public void print(){
        System.out.println(this);
     }
    public static void main(String[] args){
        Employee first = new Employee( "ram",  53445,  800000.5f);
         first.print();
         }
}

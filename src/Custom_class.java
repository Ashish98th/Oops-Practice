
/* (Q)Create a class Employee with following properties and methods
~salary(property)(int)
~getsalary(method returning int)
~name(property)(string)
~getName(method returning string)
~setName(methodchanging name)
 */

class Employee{
    int salary;
    String name;

    public int getsalary(){
        return salary;
    }
    public String getName(){
        return name;

    }
    public void SetName(String n){
        name=n;

    }
}

public class Custom_class {
    public static void main(String args[]){
      Employee Ashish = new Employee();
      //Ashish.getName();
      Ashish.getsalary();
     Ashish.SetName("Code with Harry");
     String name1= Ashish.getName();
        System.out.println(name1);
    }
}

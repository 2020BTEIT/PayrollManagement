import java.util.ArrayList;
import java.util.List;

abstract class Employee
{
    private String name;
    private int id;
    public Employee(String name,int id)
    {
        this.name=name;
        this.id=id;
    }
    public String getName()
    {
        return name;
    }
    public  int getId()
    {return  id;
    }
    public abstract double calculateSalary();
    @Override
    public String toString()
    {
        return "Employee[name="+name+", id="+id+", salary="+calculateSalary()+"]";
    }

}

class FullTimeEmployee extends Employee
{

private double monthlysalary;
public FullTimeEmployee(String name,int id,double monthlysalary)
{ super(name,id);
this.monthlysalary=monthlysalary;
}
@Override
public double calculateSalary()
{return  monthlysalary;

}

}
class PartTimeEmployee extends Employee
{
private int hoursworked;
private double hourlyrate;
public PartTimeEmployee(String name,int id ,int hoursworked,double hourlyrate)
{ super(name,id);
  this.hoursworked=hoursworked;
this.hourlyrate=hourlyrate;
}
@Override
public double calculateSalary()
{return hourlyrate*hoursworked;
}

}
class Payrollsystem
{
    private ArrayList<Employee>employeelist;

}





public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
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
    public Payrollsystem()
    {
        employeelist=new ArrayList<>();
    }
    public void addemployee(Employee e)
    {
        employeelist.add(e);
    }
    public  void removeemployee(int id)
    {
        Employee e=null;
        for(Employee e1:employeelist)
        {
          if(e1.getId()==id)
          {
              e=e1;
              break;
          }
        }
        if(e!=null)
        {
            employeelist.remove(e);
        }
    }
    public void displayemployee()
    {
        for(Employee e:employeelist)
        {
            System.out.println(e);
        }
    }

}





public class Main {
    public static void main(String[] args) {
        Payrollsystem p=new Payrollsystem();
        FullTimeEmployee f=new FullTimeEmployee("Vikas",2,2000);
        PartTimeEmployee pt=new PartTimeEmployee("Harshad",1,7,200);
        p.addemployee(f);
        p.addemployee(pt);
        System.out.println("Initial Employee details:");
        p.displayemployee();
        System.out.println("Removing employee details");
        p.removeemployee(2);
        System.out.println("Remaining Employee details:");
        p.displayemployee();
    }
}
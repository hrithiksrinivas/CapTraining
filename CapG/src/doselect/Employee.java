package doselect;

import java.util.*;
//import java.util.function.*;
import java.util.stream.Collectors;
//import java.util.stream.Stream;
class Employee 
{
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append("name: ");
        sb.append(name);
        sb.append(" salary: ");
        sb.append("" + salary+">");
        return sb.toString();

    }
    String name;
    int salary;
    Employee(String name,int salary)
    {
        this.name=name;
        this.salary=salary;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setSalary(int salary)
    {
        this.salary=salary;
    }
    public int getSalary()
    {
        return salary;
    }
    
}
class EmployeeInfo{
    enum SortMethod {BYNAME,BYSALARY
    };
    List<Employee> sort(List<Employee> emps, final SortMethod method)
    {
        if(method == SortMethod.BYNAME)
        {
        	 emps.stream().sorted(Comparator.comparing(Employee::getName))
        			.forEach(System.out::print);
        	 
        }
        else if(method == SortMethod.BYSALARY)
        {
        	 emps.stream().sorted(Comparator.comparing(Employee::getSalary))
 			.forEach(System.out::print);
        }
        return emps;
    }
    boolean isCharacterPresentInAllNames(List<Employee> entities, String character)
    {
    	/*entities.stream().sorted(Comparator.comparing(Employee::getName))
		.forEach(Employee -> System.out.println(Employee.getName()));
    	
    	entities.stream().map(String	::toLowerCase).filter(s->s.st(character));*/
    	String s = entities.stream().map(Employee::getName).collect(Collectors.joining(""));
    	if(s.contains(character))
    	{
    	return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
        ArrayList<Employee> emp = new ArrayList<Employee>();
        EmployeeInfo empinfo = new EmployeeInfo();
        emp.add(new Employee("Mickey", 100000));
        emp.add(new Employee("Timmy", 50000));
        emp.add(new Employee("Annny", 40000));
        //System.out.println(emp);
        empinfo.sort(emp,SortMethod.BYNAME);
        System.out.println();
        empinfo.sort(emp,SortMethod.BYSALARY);
        System.out.println();
        System.out.println("Enter the character");
        String c = sc.next();
        System.out.println(empinfo.isCharacterPresentInAllNames(emp, c));
        sc.close();
    }
   
}

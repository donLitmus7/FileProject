import java.util.Scanner;
import java.util.List;
public class Ui{
public static void main(String args[])
{
String filePath=args[0];
EmployeeService employeeservice=new EmployeeService();
List<EmployeePOJO> employeeList;
Scanner scanner=new Scanner(System.in);
outer:
while(true){
System.out.println("\nMENU");
System.out.println("1.Display Details:");
System.out.println("2.Exit");
switch(scanner.nextInt())
{
case 1:employeeList=employeeservice.getEmployeeDetails(filePath);
	for (EmployeePOJO employeepojo:employeeList )
	{ System.out.println("\n\n\n");
       System.out.println(employeepojo);
	}
	break;

case 2:break outer;
 default :System.out.println("Enter a valid input");
}


}
}}
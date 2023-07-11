import java.util.Scanner;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
public class Ui{
public static void main(String args[]) throws Exception
{
String filePath=args[0];
LoggerCreate.logInfo("started running");
EmployeeService employeeservice=new EmployeeService();
List<EmployeePOJO> employeeList;
Scanner scanner=new Scanner(System.in);
outer:
while(true){
System.out.println("\nMENU");
System.out.println("1.Display Details:");
System.out.println("2.Exit");
LoggerCreate.logInfo("MENU displayed");
switch(scanner.nextInt())
{
case 1:employeeList=employeeservice.getEmployeeDetails(filePath);
	for (EmployeePOJO employeepojo:employeeList )
	{ System.out.println("\n\n\n");
       System.out.println(employeepojo);
	LoggerCreate.logInfo("Printed");
	}
	break;

case 2:LoggerCreate.logInfo("Exit invoked");
break outer;
 default :System.out.println("Enter a valid input");
	LoggerCreate.logError("Invalid input n menu");

}


}
}}
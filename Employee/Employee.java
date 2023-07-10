import java.util.List;
import java.util.ArrayList;
class Employee{
public void getEmployeeDetails(String textFileName)
{

EmployeeDAO employeeDao=new EmployeeDAO(textFileName);
return employeeDao.readAndReturn();
}

}
import java.util.List;
import java.util.ArrayList;
class EmployeeService{
public List<EmployeePOJO> getEmployeeDetails(String textFileName)
{
List<EmployeePOJO> employeeList;
EmployeeDAO employeeDao=new EmployeeDAO(textFileName);

return employeeDao.readAndReturn();
}

}
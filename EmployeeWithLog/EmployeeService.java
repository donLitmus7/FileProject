import java.util.List;
import java.util.ArrayList;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
class EmployeeService{
public List<EmployeePOJO> getEmployeeDetails(String textFileName) throws Exception
{

LoggerCreate.logInfo("Method invoked-getEmployeeDetails ");
List<EmployeePOJO> employeeList;
EmployeeDAO employeeDao=new EmployeeDAO(textFileName);

return employeeDao.readAndReturn();
}

}
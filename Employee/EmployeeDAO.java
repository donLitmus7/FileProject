import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
class EmployeeDAO{
private String fileName;
EmployeeDAO(String fileName){

this.fileName=fileName;

}
public List<EmployeePOJO> readAndReturn(){
List<EmployeePOJO> employeepojoList=new ArrayList<>();
BufferedReader reader;

		try {
			reader = new BufferedReader(new FileReader(fileName));
			String line = reader.readLine();

			while (line != null) {
			EmployeePOJO employeepojoObj=new EmployeePOJO();
			employeepojoObj.setId(line.split(",")[0]);
			employeepojoObj.setName(line.split(",")[1]);
				employeepojoList.add(employeepojoObj);
				line = reader.readLine();
			}

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
return employeepojoList;
}

}
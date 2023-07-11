import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
class LoggerCreate {
	private static BufferedWriter f_writer;
	//create and open file
	public static void CreateLog() throws Exception {
		f_writer= new BufferedWriter(new FileWriter("Log.txt",true));
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		f_writer.write("\n"+dtf.format(now)+"\t");
		
		
	}
	public static void logInfo(String message) throws Exception{
		CreateLog();
		f_writer.write("info\t"+message+"\t");
		
		f_writer.close();
	}
	public static void logWarning(String message) throws Exception{
		CreateLog();
		f_writer.write("Warning\t"+message+"\t");
		
		f_writer.close();
	}
	public static void logError(String message) throws Exception{
		CreateLog();
		f_writer.write("Error\t"+message+"\t");
		
		f_writer.close();
	}
	
	
}
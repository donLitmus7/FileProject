import java.io.PrintWriter;
import java.io.FileWriter;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
class LoggerCreate {
	private  static PrintWriter f_writer;
	static{
		try{
		 f_writer =new PrintWriter(new FileWriter("Log.txt",true));
	}
	catch(Exception e)
	{
		;
	}
	
	}
	//create and open file
	private static void CreateLog() throws Exception {
		
	
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		f_writer.write("\n"+dtf.format(now)+"\t");
		
		
	}
	public static void logInfo(String message) throws Exception{
		CreateLog();
		f_writer.write("info\t"+message+"\t");
		
		f_writer.flush();
	}
	public static void logWarning(String message) throws Exception{
		CreateLog();
		f_writer.write("Warning\t"+message+"\t");
		
		f_writer.flush();
	}
	public static void logError(String message) throws Exception{
		CreateLog();
		f_writer.write("Error\t"+message+"\t");
		
		f_writer.flush();
	}
	
	
}
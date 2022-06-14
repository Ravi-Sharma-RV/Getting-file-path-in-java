import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.stream.Stream;

public class AuditAutomation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ArrayList<String> str1 = new ArrayList<String>();
		ArrayList<String> str2 = new ArrayList<String>();
		ArrayList<String> resultstr = new ArrayList<String>();

		String prodFilePath = "C:\\Users\\easvarh\\Documents\\EDA_Migration_Audit\\OneDrive_2022-06-14\\CA and repository Files UG EDA\\MB EDA CA & Repository\\Jars";
		String srcFilePath = "C:\\Users\\easvarh\\Documents\\EDA_Migration_Audit\\OneDrive_2022-06-14\\CA and repository Files UG EDA\\MU EDA CA & Repository\\Jars";
		String outputFilePath = " -outputfile C:\\Users\\easvarh\\Documents\\EDA_Migration_Audit\\Output_MB_MU\\";

		
		File[] prodFiles = new File(prodFilePath).listFiles();
		File[] srcFiles = new File(srcFilePath).listFiles();
		

		for (File file : prodFiles) {
		    if (file.isFile()) {
		    	str1.add("java -jar zipdiff.jar -file1 "+"\"" +file.getPath()+ "\"");
		    }
		}
		for (File file : srcFiles) {
		    if (file.isFile()) {
		    	str2.add(" -file2 "+"\"" +file.getPath()+ "\"" + outputFilePath +file.getName().replace("jar", "html"));
		    }
		}
		
		for(int i=0;i<str1.size();i++) {
			resultstr.add(str1.get(i) + " "+str2.get(i));
		}
		
		resultstr.forEach(n -> System.out.println(n));
		
		//System.out.println("CMD starts");
//		
//		ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "cd \"C:\\Users\\easvarh\\Documents\\zipdiff-0.4\\zipdiff-0.4\\build\" && dir");
//		builder.redirectErrorStream(true);
//		String cmd =  resultstr.get(0);
//		Process p = Runtime.getRuntime().exec("cmd /c"+cmd);
//		System.out.println("CMD executed");
//		BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
//		String line;
//		while (true) {
//			line = r.readLine();
//			if (line == null) { break; }
//			System.out.println(line);
//		        }

	}

}

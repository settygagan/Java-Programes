package Interface;
import java.io.FileWriter;
import java.io.IOException;


public class File_Handling {
	
	public static void main(String[]args) {
		try {
			FileWriter java = new FileWriter("Java.txt");
			java.write("Java is high level,"
					+ "And Programing Language");
			java.close();
			System.out.println("File is Created");
		}
		catch(IOException e) {
			System.out.println("File Not Created");
			e.printStackTrace();
		}
	}
}

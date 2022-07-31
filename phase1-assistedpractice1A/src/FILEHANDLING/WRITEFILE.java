package FILEHANDLING;

import java.io.FileWriter;
import java.io.IOException;

public class WRITEFILE {

	public static void main(String[] args) {
		String data ="1, harika,guntur ,AP";
		
		try {
			FileWriter output = new FileWriter("newdata.txt");
			output.write(data);
			System.out.println("Data is writted successfully");
			output.close();
		} catch (IOException e) {
			System.out.println("File write error....");
		}

	}

}
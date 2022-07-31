package FILEHANDLING;

import java.io.FileWriter;
import java.io.IOException;

public class UPDATEFILE {

	public static void main(String[] args) {
		String data ="This data is appended";
		try {
			FileWriter output = new FileWriter("newdata.txt",true);
			output.write(data);
			System.out.println("data updated successfully..");
			output.close();
		} catch (IOException e) {
			System.out.println("file updated error ...");
		}

	}

}
package filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		File myFile = new File("data.txt");
		try {
			if(myFile.createNewFile()) {
				System.out.println("File created  Successfully...");
			}
			else {
				System.out.println("File creation error...");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

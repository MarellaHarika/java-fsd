package FILEHANDLING;
import java.io.*;


public class DELETEFILE {
	 
	
	    public static void main(String[] args)
	    {
	        File file= new File("newdata.txt");

	 
	        if (file.delete()) {
	            System.out.println("File deleted successfully");
	        }
	        else {
	            System.out.println("Failed to delete the file");
	        }
	    }
	}

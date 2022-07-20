import java.util.regex.*;    
import java.util.*;    
public class valid{  
    public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();  
        emails.add("harika@gmail.co.in");  
        emails.add("harika^gmail.com");  
        emails.add("harika@gmail.com");  
        emails.add("harika@gmailcom");  
        //Add invalid email in list    
        emails.add("harika#gmail.com");  
        //Regular Expression   
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";  
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);  
        //Iterate email array list  
        for(String email : emails){  
            //Create instance of matcher   
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
} 


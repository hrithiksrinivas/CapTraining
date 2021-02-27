package com.CapG.day_5;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

		public static boolean
	    isValidEmail(String email) 
	    { 
	  
	        // Regex to check valid Email. 
	        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]"
	        		+ "+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]"
	        		+ "+)*@(?:[a-zA-Z0-9-]+\\.)"
	        		+ "+[a-zA-Z]{2,6}$"; 
	  
	        // Compile the ReGex 
	        Pattern p = Pattern.compile(regex); 
	  
	        // If the password is empty 
	        // return false 
	        if (email == null) { 
	            return false; 
	        } 
	  
	        // Pattern class contains matcher() method 
	        // to find matching between given password 
	        // and regular expression. 
	        Matcher m = p.matcher(email); 
	  
	        // Return if the password 
	        // matched the ReGex 
	        return m.matches(); 
	    } 
	  
	    // Driver Code. 
	    public static void main(String args[]) 
	    { 
	  
	        // Test Case 1: 
	        String str1 = "Geeks@portal20"; 
	        System.out.println(isValidEmail(str1)); 
	  
	        // Test Case 2: 
	        String str2 = "Geeksforgeeks@g.com"; 
	        System.out.println(isValidEmail(str2)); 
	  
	        // Test Case 3: 
	        String str3 = "Geeks@ portal9"; 
	        System.out.println(isValidEmail(str3)); 
	  
	        // Test Case 4: 
	        String str4 = "1234"; 
	        System.out.println(isValidEmail(str4)); 
	  
	        // Test Case 5: 
	        String str5 = "Gfg@20"; 
	        System.out.println(isValidEmail(str5)); 
	  
	        // Test Case 6: 
	        String str6 = "geeks@portal20"; 
	        System.out.println(isValidEmail(str6)); 
	    } 

}

package lab3;

import java.util.Arrays;  

public class Lab_3_Exercise_8 { 
  
    // Function that checks whether  
    // the string is in alphabetical  
    // order or not  
    static boolean isPositiveString(String s)  
    {  
        // length of the string  
        int n = s.length();  
        
        // create a character array  
        // of the length of the string  
        char c[] = new char [n];  
        
        // assign the string  
        // to character array  
        for (int i = 0; i < n; i++) {  
            c[i] = s.charAt(i);  
        }  
        
        // sort the character array  
        Arrays.sort(c);  
        
        // check if the character array  
        // is equal to the string or not  
        for (int i = 0; i < n; i++)  
            if (c[i] != s.charAt(i))   
                return false;  
                
        return true;      
    }  
      
    public static void main(String args[]) 
    { 
        String s = "ANT";  
        if (isPositiveString(s))  
            System.out.println("true");  
         else
             System.out.println("false");  
    }
    }

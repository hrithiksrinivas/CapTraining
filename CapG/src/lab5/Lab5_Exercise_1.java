//Validate the age of a person and display proper message by using user defined exception. Age of a person should be above 15.
package lab5;


public class Lab5_Exercise_1 {
	static void validate(int age) throws InvalidAgeException{  
	     if(age<15)  
	      throw new InvalidAgeException("not valid");  
	     else  
	      System.out.println("Your age is validated!!!");  
	   }  
	     
	   public static void main(String args[]){  
	      try{  
	      validate(16);  
	      }catch(Exception m){System.out.println("Exception occured: "+m);}  
	  
	      System.out.println("Alls well....that ends well!");  
	  }  

}

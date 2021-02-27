package doselect;

import java.util.Scanner;

public class HandlingStuff 
{
	String string1 = null;
	String string2 = null;
	String operator = null;  //this should either be '+ or '-'
	
	HandlingStuff()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1");
		string1 = sc.nextLine();
		System.out.println("Enter String 2");
		string2 = sc.nextLine();
		System.out.println("Enter the operator");
		operator = sc.nextLine();
		sc.close();
	}
	String handleException(HandlingStuff H)
	{
		String s ="";
		byte flag =0,flag1=0;
		try
		{
			try
			{
				if(H.string1 == "" || H.string2 == "")
				{
					throw new NullPointerException();		
				}
				else {flag =1;}
			}
			catch(NullPointerException e) 
			{
				System.out.println("Strings should not be null");
				//s ="Strings should not be null";
				
			}
			
			try
			{
				//System.out.println(H.operator);
				if((H.operator.equals("+") || H.operator.equals("-")) && (H.operator != ""))
				{
					flag1 =1;
				}
				else
				{
					throw new Exception("Wrong operator");
				}
			}
			catch(Exception e)
			{
				System.out.println(H.operator + " is the wrong operator or it is null");
				//s=H.operator + " is the wrong operator or it is null";
				//flag = 1;
			}
			if(flag==1 && flag1==1) {
			throw new Exception(); }
			}
		catch(Exception e1) 
		{
						//System.out.println("No Exception");
			s ="No Exception";
		}
		
		return s;
	}
	
	String doOperation(HandlingStuff H)
	{
		String result = null;
		switch(H.operator)
		{
		case "+": //add both strings
		{
			result = H.string1.concat(string2);
			break;
		}
		case "-": //replace contents of string 2 in string 1 with empty string
		{
			
				result = string1.replace(string2, "");
				break;
		}
		}
		return result;
	}
	public static void main(String[] args)
	{
		HandlingStuff ob1 = new HandlingStuff();
		System.out.println(ob1.handleException(ob1));
		System.out.println(ob1.doOperation(ob1));
		
		
		
	}
}

package lab3;
import java.util.*;
import java.io.*;
public class Lab_3_Exercise_5 {
	 public static void main(String args[])throws IOException
     {
                 int numL=1,numW=0;           
                 char ch;
                 Scanner scr=new Scanner(System.in);
                 System.out.print("\nEnter File name: ");
                 String str=scr.nextLine();
                 FileInputStream f=new FileInputStream(str);
                 int n=f.available();
                 for(int i=0;i<n;i++)
                 {
                             ch=(char)f.read();
                             if(ch=='\n')
                             numL++;
                             else if(ch==' ')
                                         numW++;
                              scr.close();   
                              f.close();
                 }
                 System.out.println("\nNumber of lines : "+numL);
                 System.out.println("\nNumber of words : "+(numL+numW));
                 System.out.println("\nNumber of characters : "+n);
                

     }
}



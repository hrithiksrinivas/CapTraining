package lab3;
import java.util.*;
public class Lab_3_Exercise_1 {
	 public static void main(String args[])
     {
                 Scanner sc=new Scanner(System.in);
System.out.println("\nEnter sequence of integers with space b/w them and press enter : ");
                 String integer=sc.nextLine();
                 StringTokenizer token=new StringTokenizer(integer);
                 int integr=0,sum=0;
                 System.out.println("\nEntered digits are : ");
                 while(token.hasMoreTokens())
                 {
                             String s=token.nextToken();
                             integr=Integer.parseInt(s);
                             System.out.print(integr+" ");
                             sum=sum+integr;
                 }
                 System.out.println();
                 System.out.println("Sum is : "+sum);
                 sc.close();
     }

}

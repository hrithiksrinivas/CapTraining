package lab3;

import java.util.Scanner;

public class Lab_3_Exercise_2 {
     
      public String getImage(String str)
      {
             StringBuffer apnd = new StringBuffer(str);
             apnd.append('|');
             StringBuffer sb = new StringBuffer(str);
             sb.reverse();
             apnd.append(sb);
             return apnd.toString();
      }
      public static void main(String[] ar)
      {
    	  Lab_3_Exercise_2 ex2 = new Lab_3_Exercise_2();
             Scanner s = new Scanner(System.in);
             System.out.println("Enter a String");
             String str = s.next();
             System.out.println(ex2.getImage(str));
             s.close();
      }
}
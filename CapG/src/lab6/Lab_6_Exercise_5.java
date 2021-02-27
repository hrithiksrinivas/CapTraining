package lab6;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Lab_6_Exercise_5 {
     
      public int getSecondSmallest(int[] arr){
             List<Integer> intList = new ArrayList<Integer>();
             for(int i: arr){
                    intList.add(i);
             }
             Collections.sort(intList);
             return intList.get(1);
      }
      public static void main(String[] args) {
    	  Lab_6_Exercise_5 l = new Lab_6_Exercise_5();
             int arr[] = {38,53,44,66,33,76,87,99,66,11,32,55,22};
             int i = l.getSecondSmallest(arr);
             System.out.println("Second smallest element in the array is " + i);
      }

}




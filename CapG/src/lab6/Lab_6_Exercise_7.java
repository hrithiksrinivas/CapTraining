package lab6;

import java.util.Arrays;
import java.util.Collections;

public class Lab_6_Exercise_7 {
	/*function reverses the elements of the array and then sorts it*/
    static void getSorted(Integer a[]) 
    { 
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
        Collections.sort(Arrays.asList(a));
        System.out.println(Arrays.asList(a)); 
    } 
  
    public static void main(String[] args) 
    { 
        Integer [] arr = {10, 23, 13, 27, 50}; 
        getSorted(arr); 
    } 
}

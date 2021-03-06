package lab6;

//Java program to sort hashmap by values 
import java.util.*; 


public class Lab_6_Exercise_1{ 

 // function to sort hashmap by values 
 public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) 
 { 
     // Create a list from elements of HashMap 
     List<Map.Entry<String, Integer> > list = 
            new LinkedList<Map.Entry<String, Integer> >(hm.entrySet()); 

     // Sort the list 
     Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
         public int compare(Map.Entry<String, Integer> o1,  
                            Map.Entry<String, Integer> o2) 
         { 
             return (o1.getValue()).compareTo(o2.getValue()); 
         } 
     }); 
       
     // put data from sorted list to hashmap  
     HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
     for (Map.Entry<String, Integer> aa : list) { 
         temp.put(aa.getKey(), aa.getValue()); 
     } 
     return temp; 
 } 

 // Driver Code 
 public static void main(String[] args) 
 { 

     HashMap<String, Integer> hm = new HashMap<String, Integer>(); 

     // enter data into hashmap 
     hm.put("Raju", 90); 
     hm.put("Ravi", 83); 
     hm.put("Divya", 100); 
     hm.put("Jaya", 64); 
     hm.put("Amit", 87); 
     hm.put("Arijit", 65); 
     Map<String, Integer> hm1 = sortByValue(hm); 

     // print the sorted hashmap 
     for (Map.Entry<String, Integer> en : hm1.entrySet()) { 
         System.out.println("Key = " + en.getKey() +  
                       ", Value = " + en.getValue()); 
     } 
 } 
} 




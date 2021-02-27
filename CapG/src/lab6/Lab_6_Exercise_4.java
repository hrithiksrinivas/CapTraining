package lab6;
import java.util.HashMap;
import java.util.Set;
public class Lab_6_Exercise_4 {
      public HashMap<String,String> getStudent(HashMap<String,Integer> stdnt)
      {
             HashMap<String,String> medal = new HashMap<>();
             Set<String> set = stdnt.keySet();
             for(String s:set)
             {
                    Integer marks = stdnt.get(s);
                    if(marks>=90)
                    {
                          medal.put(s,"Gold");
                    }
                    else if(marks >=80)
                    {
                          medal.put(s,"Silver");
                    }
                    else if(marks>=70)
                    {
                          medal.put(s,"Bronze");
                    }
             }
             return medal;
      }
      public static void main(String[] arr)
      {
             HashMap<String,Integer> stdnt = new HashMap<>();
             Lab_6_Exercise_4 l = new Lab_6_Exercise_4();
             
             stdnt.put("RN53",65);
             stdnt.put("RN54",73);
             stdnt.put("RN55",81);
             stdnt.put("RN56",45);
             stdnt.put("RN57",97);
             System.out.println("Congragulations!!!");
             System.out.println(l.getStudent(stdnt));
      }
}

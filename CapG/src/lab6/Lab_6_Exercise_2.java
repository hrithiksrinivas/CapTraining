package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab_6_Exercise_2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter String ");
		String s = sc.nextLine(); 
		Map<Character, Integer> result = countChars(s.toCharArray());
		for(Map.Entry<Character, Integer> en: result.entrySet()) {
			System.out.println("Character = " + en.getKey() +  
                    ", Occurance = " + en.getValue()); 
			sc.close();
		}
	}

	private static Map<Character, Integer> countChars(char[] charArray) {
		String s=String.valueOf(charArray);
		Map<Character, Integer> charCountMap = new HashMap<>();
		char[] strArray = s.toCharArray();
		for(char i:strArray) {
			if (charCountMap.containsKey(i)){
                charCountMap.put(i, charCountMap.get(i) + 1); 
            } 
            else { 
                charCountMap.put(i, 1); 
            } 
		}
		return charCountMap;
	}
}
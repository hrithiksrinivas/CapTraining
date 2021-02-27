package doselect;
import java.util.*;
public class ListOfOperations 
{
	public ArrayList<Integer> makeArrayListInt(int s)
	{
		ArrayList<Integer> a1 = new ArrayList<>();
		for(int i=0;i<s;i++)
		{
			a1.add(0);
		}
		return a1;
	}
	public ArrayList<Integer> reverseList(ArrayList<Integer> list)
	{
		Collections.reverse(list);
		return list;
	}
	public ArrayList<Integer> changeList(ArrayList<Integer> list,int m,int n)
	{
		//System.out.println(list.size());
		for(int i = 0;i < list.size();i++)
		{
			//System.out.println("checl");
			if(list.get(i) == m)
			{
				//System.out.println("checif");
				list.set(i, n);
			}
			else {}
		}
		return list;
	}
	
	
	
	public static void main(String[] args) {
		ListOfOperations lop = new ListOfOperations();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of arraylist");
		int s = sc.nextInt();
		System.out.println(lop.makeArrayListInt(s));
		System.out.println("Enter the size of second array list");
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		int size = sc.nextInt();
		for(int i = 0;i<size;i++)
		{
			a2.add(sc.nextInt());
		}
		System.out.println(lop.reverseList(a2));
		System.out.println("Enter m and n");
		int m = sc.nextInt();
		int n = sc.nextInt();		
		System.out.println(lop.changeList(a2,m,n));
		sc.close();
	}
}

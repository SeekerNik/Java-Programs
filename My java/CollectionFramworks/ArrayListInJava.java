package CollectionFramworks;

import java.util.*;;

public class ArrayListInJava {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		ArrayList l1=new ArrayList(10);
		ArrayList l2=new ArrayList();
		l1.add(33);
		l1.add(45);
		l1.add("hello");
		
		l2.add(l1);
		Iterator i1=l2.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}

	}

}

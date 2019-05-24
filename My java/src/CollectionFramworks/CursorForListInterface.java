package CollectionFramworks;

import java.util.*;

public class CursorForListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*There are three cursors 
		 * 1.Enumeration ->it is used only for vector and Stack
		 * 2.Iterator
		 * 3.ListIterator*/
		
		ArrayList a1=new ArrayList();
		LinkedList l1=new LinkedList();
		
		
		a1.add("hello");
		a1.add("fuck");
		l1.add("get");
		l1.add(22);
		l1.add(34);
		Vector v1=new Vector(a1);
		v1.add("fuck you");
		v1.add("hello there");
		System.out.println(a1);
		System.out.println(l1);
		System.out.println(v1);
		Enumeration e1=v1.elements();
		Iterator i1=a1.iterator();
		ListIterator li=l1.listIterator();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
	}

}

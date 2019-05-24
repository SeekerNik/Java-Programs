package CollectionFramworks;
import java.util.*;
class Phonebook
{
	public String name;
	public Integer mobile_no;
	
	public Phonebook(String name,Integer i)
	{
		this.name=name;
		this.mobile_no=i;
	}
	
	public String getname()
	{
		return name;
	}
	
	public Integer getmob()
	{
		return mobile_no;
	}

}

class Mycomp implements Comparator
{
	public int compare(Object o2,Object o1)
	{
		Phonebook ph1=(Phonebook)o1;
		Phonebook ph2=(Phonebook)o2;
		
		if(ph1.mobile_no<ph2.mobile_no)
		{
			return (-1);
		}
		
		else
		{
			return 1;
		}
	}
}
public class MyComparator 
{
	public static void main(String args[])
	{
	Phonebook p1,p2,p3;
	p1=new Phonebook("Nikhil", 798820605);
	p2=new Phonebook("Sid",892819283);
	p3=new Phonebook("Nalla",813829210);
	
	TreeSet ts=new TreeSet(new Mycomp());
	ts.add(p1);
	ts.add(p2);
	ts.add(p3);
	Phonebook phone;
	Iterator i1=ts.iterator();
	while(i1.hasNext())
	{
		phone=(Phonebook) i1.next();
		System.out.println(phone.getname()+" "+phone.getmob());
	}
	
	
	}
}

















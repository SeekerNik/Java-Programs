import java.lang.String;
public class StringFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		String s2="hello";
		String s3=new String("hello");
		
		int s4=s1.compareTo(s2);
		System.out.println(s4);
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		String s5=s1.toUpperCase();
		System.out.println(s5);
		
		
				

	}

}

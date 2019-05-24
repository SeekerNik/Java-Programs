public class SetterMethod
{
	public static void main(String ard[])
{
	Deatails nik=new Deatails("India","Haryana","123001");
	System.out.println(nik.getcountry());
	System.out.println(nik.getstate());
	System.out.println(nik.getpincode());
	
	nik.setcountry("Bharat");
	nik.setstate("Punjab");
	nik.setpincode("140307");
	
	System.out.println(nik.getcountry());
	System.out.println(nik.getstate());
	System.out.println(nik.getpincode());
	
	
}
}
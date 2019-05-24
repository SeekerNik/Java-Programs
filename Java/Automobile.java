public class Automobile
{
	String brand;
	String model;
	int year;
	
	public Automobile(String brand,String model,int year )
	{
		this.brand=brand;
		this.model=model;
		this.year=year;
	}
	
	public String getbrand()
	{
		return brand;
	}
	public String getmodel()
	{
		return model;
	}
	
	public int getyear()
	{
		return year;
	}
}
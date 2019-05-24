import java.util.*;
public class nik1
{
public static void main(String arg[])
{String a1;
	Scanner grade = new Scanner(System.in);
	System.out.println("enter the grade");
	
	a1=grade.next();
	switch(a1)
	{
		case "A+":System.out.println("Great student");
		break;
		case "A":System.out.println("Great student");
		break;
		case "A-":System.out.println("Great student");
		break;
		case "b+":System.out.println("average student");
		break;
		case "b-":System.out.println("average student");
		break;
		case "b":System.out.println("average student");
		break;
		case "c+":System.out.println("poor student");
		break;
		case "c-":System.out.println("poor student");
		break;
		case "c":System.out.println("poor student");
		break;
		case "d":System.out.println("failed");
		break;
		case "d+":System.out.println("failed");
		break;
		case "d-":System.out.println("failed");
		break;
	}
	
	
}
}
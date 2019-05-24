import java.util.*;
class Bank
{
int bc, ifsc;
String ba;
}
class Emp extends Bank
{
int emp_id;
void enterEmpdetail()
{
Scanner in=new Scanner(System.in);
System.out.print("Enter the branch code: ");
bc=in.nextInt(); 
System.out.print("Enter the ifsc code: ");
ifsc=in.nextInt(); 
System.out.print("Enter the branch address: ");
ba=in.next(); 
System.out.print("Enter the emp id: ");
emp_id=in.nextInt(); 
}
void print()
{
System.out.println(bc);
System.out.println(ifsc);
System.out.println(ba);
System.out.println(emp_id);
}
}
class Customer extends Bank
{
String acc_no;
void enterCustomer()
{
Scanner in=new Scanner(System.in);
System.out.print("Enter the branch code: ");
bc=in.nextInt(); 
System.out.print("Enter the ifsc code: ");
ifsc=in.nextInt(); 
System.out.print("Enter the branch address: ");
ba=in.next();
System.out.print("Enter the account number: ");
acc_no=in.next();
}
void print()
{
System.out.println(bc);
System.out.println(ifsc);
System.out.println(ba);
System.out.println(acc_no);
}
}
public class Program
{
public static void main(String args[])
{
Emp e=new Emp();
Customer c=new Customer();

}
}
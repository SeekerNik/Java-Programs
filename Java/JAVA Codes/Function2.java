import java.util.*;
public class Function2
{
static int b(int y)
{
if(y+10<50)
{
return y;
}
else
{
return 52;
}
}

static int k(int x)
{
if(x%2==0 && x>10)
{
return 10;
}
else
{
return 5;
}
}

static int m(int a)
{
if(a%5==0)
{
return k(11);
}
else
{
return b(22);
}
}

public static void main(String args[])
{
int a;
a=m(125);
System.out.print(a);
}
}


import java.util.*;
class countoddeven
{
public static void main(String args[])
{
	int n,a,e=0,o=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n value:");
	n=sc.nextInt();
	while(n>0)
	{
		a=n%10;
		if(a%2==0)
			e++;
		else
			o++;
		n=n/10;
	}
	System.out.println("odd digits="+o);
	System.out.println("even digits="+e);
	
}
}
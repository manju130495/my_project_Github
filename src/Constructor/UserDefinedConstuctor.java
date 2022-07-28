package Constructor;

public class UserDefinedConstuctor 
{
	int a;
	int b;
	
 UserDefinedConstuctor()
{
	a=20;
	b=5;
	}
	public void addition()
	{
		System.out.println(a+b);
	}
	public void multiplication()
	{
		System.out.println(a*b);
	}
	public static void main(String[] args) 
	{
		UserDefinedConstuctor s1=new UserDefinedConstuctor();
		s1.addition();
		s1.multiplication();
		
	}

}

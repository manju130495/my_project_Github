package Constructor;

public class sample1 
{
	public static void main(String[] args) 
	{
		sample1 v =new sample1();
		v.c1();     //Default Constructor
		v.c2();
		
	}
		public void c1()
		{
			System.out.println("running method c1");
		}
		public void c2()
		{
			System.out.println("running method c2");
		}

}

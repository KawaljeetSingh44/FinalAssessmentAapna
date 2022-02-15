package polymorphismStaticAndDynamic;

import org.junit.Test;

public  class StaticPolymorphism 
{
	int sum;
	public void sum(int a,int b) 
	{
		sum = a + b;
	System.out.println(sum);
		
	}
	
	public void  sum(int a,int b,int c)
	{
		 sum = a + b + c;
		 System.out.println(sum);
		
	}
	
	public void sum(int a,int b,int c,int d)
	{
		sum = a  + b + c + d;
		System.out.println(sum);
		
	}
	// static Polymorphism is achieved by method overloading
class overloading
{
	
	public static void main(String args[])
	{
	//creating object for StaticPolymorphism class.
	StaticPolymorphism addition = new StaticPolymorphism();
	addition.sum(5,7);
	addition.sum(6,7,8);
	addition.sum(9,4,5,3);// methods overloaded
	}
		
		
	}
@Test
public void Test() {
	sum(4,3);
	sum(3,6,7);
	sum(6,7,8); //method over loaded
}

	

}

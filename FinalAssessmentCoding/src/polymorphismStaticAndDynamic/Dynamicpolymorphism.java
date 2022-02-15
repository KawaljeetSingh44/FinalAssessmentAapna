package polymorphismStaticAndDynamic;

public class Dynamicpolymorphism implements Operators

{
	

	// dynamic Polymorphism is achieveved by overridding.
	@Override
	public  int addition(int a, int b) {
		int sum = a+b;
		return sum;
	}

	
	@Override
	public int subtraction(int a, int b) {
		int sub = a-b;
		return sub;
	}

	@Override
	public int multiplication(int a, int b) {
	int mul = a * b;
	return mul;
	}

	@Override
	public int division(int a, int b) {
		int div = a/b;
		return div;
	}
	
	
	
	

}

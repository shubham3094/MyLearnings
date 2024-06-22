
public class FinallyContructorStaticAndInstanceinitializer {

	FinallyContructorStaticAndInstanceinitializer(){
		System.out.println("This is constructor 1");
	}

	FinallyContructorStaticAndInstanceinitializer(String s){
		System.out.println("This is constructor 2"+s);
	}

	static 
	{
		System.out.println("this is static block 1");
	}
	{
		System.out.println("this is instance 1");
	}
	{
		System.out.println("this is instance 2");
	}
	static
	{
		System.out.println("this is static block 2");
	}

	public static void main(String[] args) {

		new FinallyContructorStaticAndInstanceinitializer();
		new FinallyContructorStaticAndInstanceinitializer("shubham");

		try {
			System.out.println("this is try");
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println("this is catch");
		}
		finally {
			System.out.println("this is finally block");
		}
	}

}

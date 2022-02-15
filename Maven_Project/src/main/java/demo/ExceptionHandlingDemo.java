package demo;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		try{
		System.out.println("Hellooo");
		int i= 1/0;
		}
		catch(Exception exp)
		{
			System.out.println("Msg: "+ exp.getMessage());
			System.out.println("Cause: "+ exp.getCause());
			exp.printStackTrace();
		}
		
		finally
		{
			System.out.println("Final");
		}
	}

}

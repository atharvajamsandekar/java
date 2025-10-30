public class Atharva4
{
 public static void main(String args[])
 {
  try
  {
   int a=7;
   int b=0;
   int c=a/b;
   System.out.println("Result:"+c);
   }
   catch(ArithmeticException e)
   {
    System.out.println("Error:Can't divide by zero.");
   }
   catch(Exception e)
   {
    System.out.println("An error occured.");
	}
	finally
	{
	 System.out.println("Finally Block Executed");
	}
	System.out.println("Exception handled successfully");
	}
}
	 
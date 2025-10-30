class A
{
	int n;
	String s;
 public A()
 {
  System.out.println("Default Constructor of A");
 }
public A(int  n ,String s)
{
 this.n=n;
 this.s=s;
 System.out.println("Constructor of A with 2 Parameters");
}
public void display()
{
	 System.out.println("Entered number is="+n+"Entered string is="+s);
}
}

class B extends A
{
	int n1;
	String s1;
	double d1;
 public B()
 {
  System.out.println("Default Constructor of B");
 }
public B(int  n1 ,String s1,double d1)
{
 this.n1=n1;
 this.s1=s1;
 this.d1=d1;
 System.out.println("Constructor of B with 3 Parameters");
}
public void display()
{
	 System.out.println("Entered number is="+n1+"Entered string is="+s1+"Entered double is="+d1);
}
}

public class Atharva3
{
	 public static void main(String args[])
	 {
		A a1=new A();
		a1.display();
		A a2=new A(10,"Atharva");
		a2.display();
		B b1=new B();
		b1.display();
		B b2=new B(12,"Monya",45.7);
		b2.display();
	 }
}

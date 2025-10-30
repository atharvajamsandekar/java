class B
{
	int n;
	double d;
	String s;
 public B()
 {
  System.out.println("Default constructor");
 }
 public B(int n)
 {
	  this.n=n;
	  System.out.println("Constructor with 1 parameter");
 }
 public B(int n,double d,String s)
 {
	 this.n=n;
	 this.d=d;
	 this.s=s;
	 System.out.println("Constructor with 3 parameter");
 }
public void display()
{
	 System.out.println("Entered no="+n+"Entered double="+d+"Entered string ="+s);
}
}
class C
{
	 public void area(int r)
	 {
		  System.out.println("Area of circle is:"+3.14*r*r);
	 }
	 public void area(int l,int b)
	 {
		  System.out.println("Area of rectangle is:"+l*b);
	 }
}
public class Atharva1
{
	 public static void main(String args[])
	 {
		  B b1=new B();
		  b1.display();
		  B  b2=new B(78);
		  b2.display();
		  B b3=new B(46,45.99,"FAMT");
		  b3.display();
		  
		  C c1=new C();
		  c1.area(10);
		  c1.area(20,30);
	 }
}

public class Atharva
{ 
  private int n;
  private String s;
  private double d;

  public void setN(int n1)
  {
    n = n1;
  }

  public void setS(String s1)
  {
    s = s1;
  }

  public void setD(double d1)
  {
    d = d1;
  }

  public int getN()
  {
    return n;
  }

  public String getS()
  {
    return s;
  }

  public double getD()
  { 
    return d;
  }

  public void display()
  { 
    System.out.println("Entered number is: " + n);
    System.out.println("Entered string is: " + s);
    System.out.println("Entered double is: " + d);
  }

  public static void main(String args[])
  {
    Atharva a = new Atharva();
    a.setN(48);
    a.setS("Atharva");
    a.setD(45.18);
    a.display();
  }
}

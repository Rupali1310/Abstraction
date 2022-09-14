package finalpackage;

public final class City 
{ final int a=20;
	public final void pune()
	{//a=20; we can  not asssign final varible in method
	System.out.println("method with final keywoerd");

	}
 City()//constructor cannot define as final 
{
		System.out.println("constructor");

}
 
 public static void main(String args[])
 {
	 City c=new City();
		System.out.println(c.a);
		c.pune();

 }
 
}

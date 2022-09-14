package finalpackage;

public class Village //extends City; we can extend final class
{
void sangvi()
{
	System.out.println("method of village");

}
public static void main(String args[])
{
	City c=new City();
	c.pune();//method call load final  method inother class 
	Village v=new Village();
	v.sangvi();
	
}
}

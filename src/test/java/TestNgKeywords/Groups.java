package TestNgKeywords;

import org.testng.annotations.Test;

public class Groups 
{
	@Test (groups = "software company")
	public void infosys()
	{
		System.out.println("infosys");
	}
   
	@Test (groups = "software company")
	public void wipro()
	{
		System.out.println("wipro");
	}
	@Test(groups = "Automobile")
	public void maruti()
	{
		System.out.println("maruti");
	}
	@Test (groups = "Automobile")
	public void Tata()
	{
		System.out.println("Tata");
	}



}

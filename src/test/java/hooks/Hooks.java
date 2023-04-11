package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks 
{

	@Before(order= 10 )
	public void connecttoDB() 
	{
		System.out.println(" connected");
	}
	
	@After(order = 10)
	public void disconnect_db() {
		System.out.println("disconnect");
	}
	
	@Before(order= 20)
	public void loginToApp() {
		System.out.println("login done");
	}
	
	@After(order= 20)
	public void logoutfromApp() 
	{
	System.out.println("logout done");	
	}
	
}

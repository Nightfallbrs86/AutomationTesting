package runner;


import org.junit.After;
import org.junit.Before;
import config.Driver;
import pages.BasePage;

public class Hooks extends Driver {
	
	BasePage page = new BasePage();
	
	@Before
	public void setup(){
		getDriver();
		page.acessarUrl();
	}
	
	@After
	public void sair(){
		finish();
	}
}

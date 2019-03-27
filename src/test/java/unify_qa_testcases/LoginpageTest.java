package unify_qa_testcases;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import unify_qa_base.Testbase;
import unify_qa_pages.Homepage;
import unify_qa_pages.Loginpage;

public class LoginpageTest extends Testbase{
	Loginpage loginPage;
	Homepage homePage;
	public LoginpageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new Loginpage();	
	}
	@Test
	public void loginTest(){
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"),prop.getProperty("domain"));
	}
	
	
	
}

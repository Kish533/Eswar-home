package unify_qa_testcases;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import unify_qa_base.Testbase;
import unify_qa_pages.Homepage;
import unify_qa_pages.Loginpage;
import unify_qa_pages.Org_Contactspage;

public class HomepageTest extends Testbase{
	Loginpage loginPage;
	Homepage homePage;
	Org_Contactspage org_contactspage; 

	public HomepageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		
		org_contactspage = new Org_Contactspage();
		loginPage = new Loginpage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"),prop.getProperty("domain"));
	}
	
	@Test(priority=1)
	public void verifyCustomersLinkTest(){
	
		org_contactspage = homePage.clickonCustomers();
		//return new Org_Contactspage();
	}
	
}

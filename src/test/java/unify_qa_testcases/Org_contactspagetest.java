package unify_qa_testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import unify_qa_base.Testbase;
import unify_qa_pages.Homepage;
import unify_qa_pages.Loginpage;
import unify_qa_pages.Org_Contactspage;
import unify_qa_pages.Org_Createpage;

public class Org_contactspagetest extends Testbase {
	Loginpage loginpage;
	Homepage homepage;
	Org_Contactspage org_contactspage;
	Org_Createpage org_createpage;

	public Org_contactspagetest() {
		super();

	}

	@BeforeMethod
	public void setUp() throws InterruptedException {

		initialization();
		org_createpage = new Org_Createpage();
		org_contactspage = new Org_Contactspage();
		loginpage = new Loginpage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"),
				prop.getProperty("domain"));

		org_contactspage = homepage.clickonCustomers();
	}

	@Test(priority = 1)
	public void createOrg() {
		org_createpage = org_contactspage.createOrg();

	}

}

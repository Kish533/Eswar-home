package unify_qa_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import unify_qa_base.Testbase;

public class Homepage extends Testbase {
	
	@FindBy(xpath = "//a[@class='popNavLink'][contains(text(),'CRM')]")
	WebElement crm;
	@FindBy(xpath = "//a[@title='Customers']")
	WebElement customers;

	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	public Org_Contactspage clickOnCustomersLink(){
		customers.click();
		return new Org_Contactspage();
	}
	
	public Org_Contactspage clickonCustomers(){
		Actions action = new Actions(driver);
		action.moveToElement(crm).build().perform();
		customers.click();
		return new Org_Contactspage();
	}
	
}

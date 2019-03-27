package unify_qa_pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import unify_qa_base.Testbase;

public class Org_Contactspage extends Testbase {
	public static JavascriptExecutor js;
	@FindBy(id = "orgAddBtnId")
	WebElement addorgbtn;
	@FindBy(css = "//input[@id='combobox-1310-inputEl']")
	WebElement selectdomain;

	public Org_Contactspage() {
		PageFactory.initElements(driver, this);
	}

	public Org_Createpage createOrg() {
		addorgbtn.click();
		// js.executeScript("document.getElementById('orgAddBtnId').click();");

		return new Org_Createpage();
	}

}

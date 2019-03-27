package unify_qa_pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import unify_qa_base.Testbase;

public class Loginpage extends Testbase{
	
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="domain")
	WebElement domain;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbtn;
	
	public Loginpage(){
		PageFactory.initElements(driver, this);
	}
	public Homepage login(String un, String pwd,String dm){
		username.sendKeys(un);
		password.sendKeys(pwd);
		domain.sendKeys(dm);
		//loginBtn.click();
		    	JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();", loginbtn);
		    	
		return new Homepage();
	}

}

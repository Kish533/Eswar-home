package unify_qa_base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class Testbase {

	public static WebDriver driver;
	public static Properties prop;
	
	
	public Testbase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/unify_qa_config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void initialization(){
		//System.setProperty("webdriver.chrome.driver","/home/eswaracharyulu/Downloads/chromedriver");
		
		String browsername = prop.getProperty("browser");		
		if(browsername.equals("chrome")) {
			driver = new ChromeDriver();
			}
		else if(browsername.equals("IE")) {
			driver = new InternetExplorerDriver();
		}
		else if(browsername.equals("FF")) {
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
	
	
	JavascriptExecutor js = (JavascriptExecutor) driver;  
	
}

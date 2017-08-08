package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	public static WebDriver driver;
	
	
	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ta\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
	    driver = new FirefoxDriver();
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.store.demoqa.com");
        driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	    
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
	    driver.findElement(By.id("log")).sendKeys("testuser_1");
	    driver.findElement(By.id("pwd")).sendKeys("Test@123");
	    driver.findElement(By.id("login")).click();
	    
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Successfully");
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
	}
 
	@Then("^Message displayed Logout Successfully$")
	public void message_displayed_Logout_Successfully() throws Throwable {
        System.out.println("LogOut Successfully");
	}

}

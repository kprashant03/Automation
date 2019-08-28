package Society_Account;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class Test_Account_Login {
	
	WebDriver driver;
  
  public void login() {
	  
	driver.findElement(By.id("txtEmail")).click();
  	driver.findElement(By.id("txtEmail")).sendKeys("himanshukumar@gmail.com");
  	
  	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  	
  	driver.findElement(By.id("txtPassword")).click();
  	driver.findElement(By.id("txtPassword")).sendKeys("himanshuhh");
  	
  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  	
  	driver.findElement(By.xpath("//*[@id=\"cbRemember\"]")).click();
  	
  	driver.findElement(By.id("btnLogin")).click();
  }
  
  @BeforeTest
  public void beforetest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\\\Prashant\\\\Selenium\\\\Chromedriver\\\\chromedriver.exe");
  	  driver = new ChromeDriver();
  	  driver.get("http://societyhubdemo.webrelier.com/Society/MasterLogin.aspx");
  	  driver.manage().window().maximize();
  }
}



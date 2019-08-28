package Society_Account;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test_SocietyStaff extends Test_Account_Login{
  
	@Test (priority = 1)
  public void view() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[3]/a")).click();
  }
	
	@AfterTest
	public void close() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
}

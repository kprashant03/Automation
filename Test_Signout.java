package Society_Account;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test_Signout extends Test_Account_Login{
   
	@Test (priority=1)
  public void view() throws InterruptedException {
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/header/nav/div/ul/li/a")).click();
	   
	    Thread.sleep(2000);
	    driver.findElement(By.id("btn_logout")).click();
  }
	
	@AfterTest
	void close() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
}

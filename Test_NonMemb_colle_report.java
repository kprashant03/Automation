package Society_Account;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test_NonMemb_colle_report extends Test_Account_Login{
  
	@Test (priority = 1)
		public void view() throws InterruptedException {
			driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[11]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[11]/ul/li[2]/a")).click();
	  }
	
	@Test (priority = 2)
	void non_member() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[11]/ul/li[2]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("cphpagebody_btn_Print")).click();
	}
	
	@AfterTest 
	void close() {
		driver.close();
		
	}
}

package Society_Account;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_Mem_Cheque_Report extends Test_Account_Login{
  
	@Test (priority = 1)
  public void view() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[11]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[11]/ul/li[1]/a")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[11]/ul/li[1]/ul/li[2]/a")).click();
  }
	@Test (priority = 2)
	void all_report() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddlchqlist\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddlchqlist\"]/option[1]")).click();
		
		Thread.sleep(2000);
		//driver.findElement(By.id("cphpagebody_btn_Print")).click();
		//Thread.sleep(2000);
		//driver.navigate().back();
	}
	@Test (priority = 3)
	void paid_report() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddlchqlist\"]/option[2]")).click();
		
		Thread.sleep(2000);
		//driver.findElement(By.id("cphpagebody_btn_Print")).click();
	}
	
	@Test (priority = 4)
	void unpaid_report () throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddlchqlist\"]/option[3]")).click();
	}
	@Test (priority = 5)
	void pending_report () throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddlchqlist\"]/option[4]")).click();
	}
	@Test (priority = 6)
	void bounce_report () throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddlchqlist\"]/option[5]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("cphpagebody_btn_Print")).click();
	}
}

package Society_Account;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_NonMem_Cheque_Report extends Test_Account_Login{
  
	@Test (priority = 1)
  public void view() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[11]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[11]/ul/li[1]/a")).click();	
  }
	
	@Test (priority = 2)
	public void all_report() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[11]/ul/li[1]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddlchqlist\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddlchqlist\"]/option[1]")).click();
	}
	
	@Test (priority = 3)
	public void paid_report () throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddlchqlist\"]/option[2]")).click();
	}
	
	@Test (priority = 4)
	public void unpaid_report() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddlchqlist\"]/option[3]")).click();
	}
	
	@Test (priority = 5)
	public void pending_report() throws InterruptedException {
		Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddlchqlist\"]/option[4]")).click();	
	}
	
	@Test (priority = 6)
	public void bounce_report() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddlchqlist\"]/option[5]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("cphpagebody_btn_Print")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"button-strip\"]/paper-button[1]")).click();
	}
}

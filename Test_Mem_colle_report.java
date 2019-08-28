package Society_Account;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_Mem_colle_report extends Test_Account_Login{
  
	@Test (priority = 1)
	public void view() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[11]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[11]/ul/li[2]/a")).click();
  }
	
	@Test (priority = 2)
	void member_collection() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[11]/ul/li[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_drp_paid_amt\"]")).click();
		Thread.sleep(2000);
		
		//all_reports
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_drp_paid_amt\"]/option[1]")).click();
		Thread.sleep(2000);
	}
	
	@Test (priority = 3)
	void priyanka() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_drp_paid_amt\"]/option[2]")).click();
		Thread.sleep(2000);
	}
	
	@Test (priority = 4)
	void prashant1() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_drp_paid_amt\"]/option[3]")).click();
		Thread.sleep(2000);
	}
	
	@Test (priority = 5)
	void sujata() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_drp_paid_amt\"]/option[4]")).click();
		Thread.sleep(2000);
	}
	
	@Test (priority = 6)
	void prashant2() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_drp_paid_amt\"]/option[5]")).click();
		Thread.sleep(2000);
	}
}


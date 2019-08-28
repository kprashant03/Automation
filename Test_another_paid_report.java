package Society_Account;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test_another_paid_report extends Test_Account_Login{
  
	@Test (priority = 1)
		public void view() throws InterruptedException {
			driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[11]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[11]/ul/li[2]/a")).click();
	  }
	
	@Test (priority = 2)
	void other_reports() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[11]/ul/li[2]/ul/li[3]/a")).click();
		Thread.sleep(2000);
		
		//all_reports
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddl_search_member\"]/option[1]")).click();
	}
	
	@Test (priority = 3)
	void priyanka() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddl_search_member\"]/option[2]")).click();
		Thread.sleep(5000);
	}
	
	@Test (priority = 4)
	void mahesh() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddl_search_member\"]/option[3]")).click();
		Thread.sleep(5000);
	}
	
	@Test (priority = 5)
	void other() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddl_search_member\"]/option[4]")).click();
		Thread.sleep(5000);
	}
	
	@Test (priority = 6)
	void sujata1() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddl_search_member\"]/option[5]")).click();
		Thread.sleep(5000);
	}
	
	@Test (priority = 7)
	void sujata2() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddl_search_member\"]/option[6]")).click();
		Thread.sleep(5000);
	}

	@Test (priority = 8)
	void prashant() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddl_search_member\"]/option[7]")).click();
		Thread.sleep(5000);
	}

	@AfterTest
	void close() {
		driver.close();
	}
  }

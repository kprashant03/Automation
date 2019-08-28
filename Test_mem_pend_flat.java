package Society_Account;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_mem_pend_flat extends Test_Account_Login {
   
	@Test  (priority=1)
  public void view() {
	   driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[7]/a")).click();
	   driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[7]/ul/li[2]/a")).click();
  }
	
	@Test (priority = 2)
	public void search() throws InterruptedException {
		driver.findElement(By.id("cphpagebody_ddl_wingname")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddl_wingname\"]/option[3]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("cphpagebody_txt_flat_no")).sendKeys("102");
		
		Thread.sleep(2000);
		driver.findElement(By.id("cphpagebody_btn_search_by_flatwing")).click();
	}
	
	@Test (priority = 3)
	public void generate() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_generated_reciepts_btn_pay_0\"]")).click();
		
		driver.findElement(By.id("cphpagebody_txtpaidAmt")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("cphpagebody_txtpaidAmt")).sendKeys("1000");
		
		driver.findElement(By.id("cphpagebody_txtAmountTOpay")).sendKeys("730");
		
		driver.findElement(By.id("cphpagebody_txt_note")).sendKeys("Done");
		
		driver.findElement(By.id("cphpagebody_ddl_pay_mode")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddl_pay_mode\"]/option[2]")).click();
		
		driver.findElement(By.id("cphpagebody_txt_note")).sendKeys("Done");
		
		Thread.sleep(2000);
		driver.findElement(By.id("cphpagebody_btn_create_reciept")).click();
	}
}

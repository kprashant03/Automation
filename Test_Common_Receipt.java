package Society_Account;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_Common_Receipt extends Test_Account_Login{
  
	@Test (priority = 1)
  public void view() {
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[6]/a")).click();
  }
	
	@Test (priority = 2)
	public void common() {
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[6]/ul/li[1]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddl_duration\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddl_duration\"]")).sendKeys("6 Month");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("cphpagebody_txt_note")).click();
		driver.findElement(By.id("cphpagebody_txt_note")).sendKeys("Maintainance");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.id("cphpagebody_txt_fromdate")).click();
		driver.findElement(By.id("cphpagebody_txt_fromdate")).sendKeys("08/23/2019");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.id("cphpagebody_txt_to_date")).click();
		driver.findElement(By.id("cphpagebody_txt_to_date")).sendKeys("08/30/2019");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.id("cphpagebody_txt_due_date")).click();
		driver.findElement(By.id("cphpagebody_txt_due_date")).sendKeys("09/28/2019");
		
		driver.findElement(By.id("cphpagebody_ddl_fine_type")).click();
		driver.findElement(By.id("cphpagebody_ddl_fine_type")).sendKeys("Amount");
		
		driver.findElement(By.id("cphpagebody_txt_fine")).sendKeys("100");
		
		driver.findElement(By.id("cphpagebody_ddl_discount_type")).click();
		driver.findElement(By.id("cphpagebody_ddl_discount_type")).sendKeys("Amount");
		
		driver.findElement(By.id("cphpagebody_txt_discount_amt")).sendKeys("20");
		
		driver.findElement(By.id("cphpagebody_ddl_member_type")).click();
		driver.findElement(By.id("cphpagebody_ddl_member_type")).sendKeys("Owner");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("cphpagebody_btn_generate_receipts")).click();
	}
}

package Society_Account;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_Profile extends Test_Account_Login{
  
	@Test (priority = 1)
  public void view() throws InterruptedException {
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/header/nav/div/ul/li/a")).click();
	   
	    driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/header/nav/div/ul/li/ul/li[2]/div[1]/a")).click();
  }
	@Test (priority = 2)
	void edit_profile() throws InterruptedException {
		driver.findElement(By.id("cphpagebody_btnedit")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("cphpagebody_txtname")).clear();
		driver.findElement(By.id("cphpagebody_txtname")).sendKeys("Himanshu Kumar");
		
		driver.findElement(By.id("cphpagebody_txt_contact2")).clear();
		driver.findElement(By.id("cphpagebody_txt_contact2")).sendKeys("9031708859");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("cphpagebody_txt_wing")).sendKeys("A");
		
		driver.findElement(By.id("cphpagebody_txt_floor_no")).sendKeys("2");
		driver.findElement(By.id("cphpagebody_txt_flat_no")).sendKeys("204");
		
		Thread.sleep(2000);
		driver.findElement(By.id("cphpagebody_btnsave")).click();
	}
	
	@Test (priority = 3)
	void profile_pic() {
		driver.findElement(By.id("cphpagebody_imgupload")).sendKeys("D:\\Prashant_Selinium_WorkSpace\\John.jpg");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("cphpagebody_btnUploadDp")).click();
	}
}

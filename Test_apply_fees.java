package Society_Account;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test_apply_fees extends Test_Account_Login {
 
	@Test (priority=1)
	public void view() {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[5]/a")).click();
	
	driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[5]/ul/li[2]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddl_fee_head\"]")).sendKeys("parking");
	
	driver.findElement(By.id("cphpagebody_txt_discription")).sendKeys("parking charge");
	driver.findElement(By.id("cphpagebody_txt_fee")).sendKeys("1400");
	}
	
	@Test(priority=2)
	public void add()  {
		driver.findElement(By.id("cphpagebody_Add_Fee")).click();
	}


	@Test (priority=3)
	public void delete()  {
	driver.findElement(By.xpath("//*[@id=\"cphpagebody_grd_fee_fixed\"]/tbody/tr[6]/td[1]/a[2]")).click();
}
}
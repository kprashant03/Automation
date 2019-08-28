package Society_Account;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_Edit_Fee extends Test_Account_Login{
   
	@Test (priority = 1)
  public void view() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[5]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[5]/ul/li[2]/a")).click();
  }
	
	@Test (priority = 2)
	public void edit() {
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_grd_fee_fixed\"]/tbody/tr[5]/td[1]/a[1]")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_grd_fee_fixed\"]/tbody/tr[5]/td[4]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_grd_fee_fixed\"]/tbody/tr[5]/td[4]/input")).sendKeys("Water");
		
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_grd_fee_fixed\"]/tbody/tr[5]/td[5]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_grd_fee_fixed\"]/tbody/tr[5]/td[5]/input")).sendKeys("Pump Maintainance");
		
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_grd_fee_fixed\"]/tbody/tr[5]/td[6]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_grd_fee_fixed\"]/tbody/tr[5]/td[6]/input")).sendKeys("500");
		
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_grd_fee_fixed\"]/tbody/tr[5]/td[1]/a[1]")).click();
	}
}

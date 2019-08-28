package Society_Account;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_Del_Fee extends Test_Account_Login{
  
	@Test (priority = 1)
  public void view() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[5]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[5]/ul/li[2]/a")).click();
  }
	
	@Test (priority = 2)
	public void del() {
		//int id;
		//for(id=4;id<=8;id++) {
			driver.findElement(By.xpath("//*[@id=\"cphpagebody_grd_fee_fixed\"]/tbody/tr[6]/td[1]/a[2]")).click();
		//}
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.navigate().back();
	}
	
	
}

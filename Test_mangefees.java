package Society_Account;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_mangefees  extends Test_Account_Login{
  
	@Test (priority=1)
  public void view() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[5]/a")).click();
  }
@Test  (priority=2)
public void add()  {
	driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[5]/ul/li[1]/a")).click();
	driver.findElement(By.id("cphpagebody_txt_title")).sendKeys("fund");
	driver.findElement(By.id("cphpagebody_btn_upload_docs")).click();
	driver.findElement(By.xpath("//*[@id=\"cphpagebody_grd_docs\"]/tbody/tr[5]/td[1]/a[1]")).click();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\"cphpagebody_grd_docs\"]/tbody/tr[5]/td[3]/input")).clear();
	driver.findElement(By.xpath("//*[@id=\"cphpagebody_grd_docs\"]/tbody/tr[5]/td[3]/input")).sendKeys("society fund");
}
}


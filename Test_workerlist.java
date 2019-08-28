package Society_Account;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_workerlist  extends Test_Account_Login{
  
	@Test  (priority=1)
  public void view() {
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[4]/a")).click();  }


@Test (priority=2)
public void Test()  {
	driver.findElement(By.id("cphpagebody_grd_worker_list_btnSalary_0")).click();
	driver.findElement(By.xpath("//*[@id=\"cphpagebody_txtfromdate\"]")).sendKeys("12-03-2018");
	driver.findElement(By.xpath("//*[@id=\"cphpagebody_txtTodate\"]")).sendKeys("11-04-2018");
	driver.findElement(By.id("cphpagebody_txtPresentDay")).click();
	driver.findElement(By.id("cphpagebody_txtsalary")).click();
	driver.findElement(By.id("cphpagebody_txtdeduction")).click();
	driver.findElement(By.id("cphpagebody_txtBonus")).click();
	driver.findElement(By.id("cphpagebody_txtnet")).click();
}
@Test (priority=3)
 public void genrate() {
	driver.findElement(By.xpath("//*[@id=\"cphpagebody_btnsave\"]")).click();
	
}
@Test  (priority=4)
public void print()  {
	driver.findElement(By.id("cphpagebody_btn_Print")).click();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.navigate().back();
	 
	
}
@Test  (priority=5)
public void cancel() {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\"button-strip\"]/paper-button[2]")).click();

}

}

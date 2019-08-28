package Society_Account;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_stocks  extends Test_Account_Login {
  @Test(priority=1)
  public void view() {
	  driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[11]/a")).click();
	   driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[11]/ul/li[3]/a")).click();
	   driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[11]/ul/li[3]/ul/li[5]/a")).click();
	   driver.findElement(By.id("cphpagebody_ddlStockTitle")).click();
  }
  @Test(priority=2)
  public void all() {
	  driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddlStockTitle\"]/option[1]")).click();
}
  @Test(priority=3)
  public void saman() {
	  driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddlStockTitle\"]/option[2]")).click();
}
  @Test(priority=4)
  public void led() {
	  driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddlStockTitle\"]/option[3]")).click();
}
  @Test(priority=5)
  public void chair() {
	  driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddlStockTitle\"]/option[4]")).click();
}
  @Test(priority=6)
  public void print() {
	  driver.findElement(By.id("cphpagebody_btn_Print")).click();
}
  
}

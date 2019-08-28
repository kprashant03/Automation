package Society_Account;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_pendingcolofothermemeber extends Test_Account_Login {
  @Test (priority=1)
  public void view() {
	  driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[11]/a")).click();
	   driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[11]/ul/li[3]/a")).click();
	   driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[11]/ul/li[3]/ul/li[4]/a")).click();
	   driver.findElement(By.id("cphpagebody_ddl_search_member")).click();
	   driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddl_search_member\"]/option")).click();
  }
  @Test (priority=2)
  public void print() {
	  driver.findElement(By.id("cphpagebody_btn_Print")).click();
  }
}

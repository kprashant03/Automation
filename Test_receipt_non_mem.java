package Society_Account;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.testng.annotations.Test;

public class Test_receipt_non_mem extends Test_Account_Login {
   @Test (priority=1)
  public void view() throws InterruptedException {
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[10]/a")).click();
       
	   
  }
  @Test (priority = 2)
  void stock() throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  //driver.findElement(By.xpath("//*[@id=\"cphpagebody_txt_stock_title\"]")).clear();
	  //driver.findElement(By.xpath("//*[@id=\"cphpagebody_txt_stock_title\"]")).sendKeys("Lights");
	  
	  //Thread.sleep(2000);
	  driver.findElement(By.id("cphpagebody_txt_stock_pieces")).clear();
	  driver.findElement(By.id("cphpagebody_txt_stock_pieces")).sendKeys("50");
	  
	 // Thread.sleep(2000);
	  driver.findElement(By.id("cphpagebody_txt_price_per_piece")).clear();
	  driver.findElement(By.id("cphpagebody_txt_price_per_piece")).sendKeys("150");
  }
}

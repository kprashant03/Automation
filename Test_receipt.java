package Society_Account;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_receipt extends Test_Account_Login {
  @Test
  public void view() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[9]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[9]/ul/li[1]/a")).click();
	  
	  driver.findElement(By.id("cphpagebody_txt_rid")).click();
	  driver.findElement(By.id("cphpagebody_txt_rid")).sendKeys("107");
	  driver.findElement(By.id("cphpagebody_btn_searchbyid")).click();
	  
	  Thread.sleep(2000);
	  driver.findElement(By.id("cphpagebody_grd_reprint_rcpts_btn_print_0")).click();
	  driver.findElement(By.id("cphpagebody_btn_print")).click();
	  
	  driver.findElement(By.id("button-strip")).click();
  }
}

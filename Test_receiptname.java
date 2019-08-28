package Society_Account;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_receiptname  extends Test_Account_Login{
	
   @Test  (priority=1)
  public void view() {
	   driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[9]/a")).click();
	   driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[9]/ul/li[1]/a")).click();
  }
   @Test (priority=2)
   public void search()  {
	   driver.findElement(By.id("cphpagebody_txt_personname")).click();
	   driver.findElement(By.id("cphpagebody_txt_personname")).sendKeys("prashant");
	   driver.findElement(By.id("cphpagebody_btn_searchbyName")).click();
	   
	   driver.findElement(By.id("cphpagebody_grd_reprint_rcpts_btn_print_0")).click();
	   driver.findElement(By.id("cphpagebody_btn_print")).click();
   }
}

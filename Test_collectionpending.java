package Society_Account;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_collectionpending  extends Test_Account_Login{
   @Test  (priority=1)
  public void view() {
	   driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[7]/a")).click();
	   driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[7]/ul/li[1]/a")).click();
	   
  }
   @Test (priority=2)
   public void genrate()  {
	   driver.findElement(By.id("cphpagebody_generated_reciepts_btn_pay_0")).click();
	   
	   
   }
   @Test  (priority=3)
   public void create()  {
	   driver.findElement(By.id("cphpagebody_ddl_fine_type")).click();
	   driver.findElement(By.id("cphpagebody_ddl_fine_type")).sendKeys("percent");
	   
	   driver.findElement(By.id("cphpagebody_ddl_discount_type")).click();
	   driver.findElement(By.id("cphpagebody_ddl_discount_type")).sendKeys("Amount");
	   
	   driver.findElement(By.id("cphpagebody_txt_paid_amt")).click();
	   driver.findElement(By.id("cphpagebody_txt_paid_amt")).sendKeys("1000");
	   
	  driver.findElement(By.id("cphpagebody_ddl_pay_mode")).click();
	   driver.findElement(By.id("cphpagebody_ddl_pay_mode")).sendKeys("cash");
	   driver.findElement(By.id("cphpagebody_btn_create_reciept")).click();
	  
	  


   }
   
}


package Society_Account;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_expencepending extends Test_Account_Login {
	
   @Test (priority=1)
  public void view() {
	   driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[8]/a")).click();
	   driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[8]/ul/li[3]/a")).click();
	   
	   
  }
   @Test (priority=2)
   public void search() {
	 driver.findElement(By.id("cphpagebody_txt_member_name")).sendKeys("asds");
	 driver.findElement(By.id("cphpagebody_btn_search_by_member")).click();
   }
   @Test (priority=3)
   public void pay()  {
	   driver.findElement(By.id("cphpagebody_generated_reciepts_btn_pay_0")).click();
	   
	   driver.findElement(By.id("cphpagebody_txtAmountTOpay")).click();
	   driver.findElement(By.id("cphpagebody_txtAmountTOpay")).sendKeys("1000");
	   
	   driver.findElement(By.id("cphpagebody_txt_note")).click();
	   driver.findElement(By.id("cphpagebody_txt_note")).sendKeys("make payment immediately");
	   
	   driver.findElement(By.id("cphpagebody_DropDownList1")).click();
	   driver.findElement(By.id("cphpagebody_DropDownList1")).sendKeys("cash");
	   
	   driver.findElement(By.id("cphpagebody_Button1")).click();
   }
}

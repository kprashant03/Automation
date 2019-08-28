package Society_Account;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_fixunpaidamtmember  extends  Test_Account_Login{
   @Test   (priority=1)
  public void view() {
	   driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[11]/a")).click();
	   driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[11]/ul/li[3]/a")).click();
	   driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[11]/ul/li[3]/ul/li[2]/a")).click();
	   
  }
   @Test (priority=2)
   public void search()  {
	   driver.findElement(By.id("cphpagebody_drp_unpaid_amt")).click();
	   
   }
   @Test (priority=3)
   public void all() {
	   driver.findElement(By.xpath("//*[@id=\"cphpagebody_drp_unpaid_amt\"]/option[1]")).click();
	   
   }
   @Test (priority=4)
   public void priyanka() {
	   driver.findElement(By.xpath("//*[@id=\"cphpagebody_drp_unpaid_amt\"]/option[2]")).click();
	   
}
   @Test (priority=5)
   public void sujata() {
	   driver.findElement(By.xpath("//*[@id=\"cphpagebody_drp_unpaid_amt\"]/option[8]")).click();
	   
}
   @Test (priority=6)
   public void print() {
	   driver.findElement(By.id("cphpagebody_btn_Print")).click();
	   
}
}

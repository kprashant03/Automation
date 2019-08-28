package Society_Account;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_dashboard  extends Test_Account_Login{
  @Test (priority=1)
  public void view() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[2]/a")).click();
  }
  @Test (priority=2)
  public void addcoll() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"cphpagebody_lnk_manageweekendhomes\"]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[2]/a")).click();
  }
  @Test (priority=3)
  public void applyfee() throws InterruptedException {
	  driver.findElement(By.id("cphpagebody_lnk_manageusers")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[2]/a")).click();
  }
  @Test (priority=4)
  public void gencomrecpt() throws InterruptedException {
	  driver.findElement(By.id("cphpagebody_lnk_addnewproperty")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[2]/a")).click();
  }
  @Test (priority=5)
  public void pendchq() throws InterruptedException {
	  driver.findElement(By.id("cphpagebody_btnrscdl")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[2]/a")).click();
  }
  @Test (priority=6)
  public void penchqmem() throws InterruptedException {
	  driver.findElement(By.id("cphpagebody_btnCancelRequest")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[2]/a")).click();
  }
  @Test (priority=2)
  public void pendfixamt() throws InterruptedException {
	  driver.findElement(By.id("cphpagebody_LinkButton1")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[2]/a")).click();
  }
}

package Society_Account;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_Pending_Mem_Cheque extends Test_Account_Login{
  
	@Test (priority = 1)
  public void view() {
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[7]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[7]/ul/li[4]/a")).click();
  }
	@Test (priority = 2)
	public void clear_cheque() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_grd_member_cheque_status_btn_clear_0\"]")).click();
	}
}

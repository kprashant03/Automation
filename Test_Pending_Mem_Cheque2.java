package Society_Account;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_Pending_Mem_Cheque2 extends Test_Account_Login{
	
	@Test (priority = 1)
	  public void view() {
			driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[7]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[7]/ul/li[4]/a")).click();
	  }
	
	@Test (priority = 2)
	public void bounce_cheque() {
		driver.findElement(By.id("cphpagebody_grd_member_cheque_status_btn_bounce_0")).click();
	}
}

  
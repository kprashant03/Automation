package Society_Account;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_member_receipt_online1 extends Test_Account_Login{
	@Test  (priority=1)
	  public void view() throws InterruptedException {
			driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[6]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[6]/ul/li[2]/a")).click();
			
			driver.findElement(By.id("cphpagebody_rb_nonauditable")).click();
			driver.findElement(By.id("cphpagebody_ddl_wingname")).sendKeys("b");
			
			driver.findElement(By.id("cphpagebody_txt_flat_no")).sendKeys("101");
			driver.findElement(By.xpath("//*[@id=\"cphpagebody_btn_img_serach_by_flat_no\"]")).click();
			
			Thread.sleep(5000);
			driver.findElement(By.id("cphpagebody_txt_from_date")).sendKeys("15-02-2019");
			
			driver.findElement(By.id("cphpagebody_txt_to_date")).sendKeys("10-06-2019");
			
			driver.findElement(By.id("cphpagebody_txt_particular_amt")).sendKeys("2500");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddl_fine_type\"]")).click();
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddl_fine_type\"]/option[2]")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.id("cphpagebody_txt_fine_amt")).clear();
			
			Thread.sleep(2000);
			driver.findElement(By.id("cphpagebody_txt_fine_amt")).sendKeys("500");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.id("cphpagebody_ddl_discount_type")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddl_discount_type\"]/option[2]")).click();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.id("cphpagebody_txt_discount")).clear();
			
			Thread.sleep(2000);
			driver.findElement(By.id("cphpagebody_txt_discount")).sendKeys("200");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.id("cphpagebody_txtpaidAmt")).clear();
			
			Thread.sleep(2000);
			driver.findElement(By.id("cphpagebody_txtpaidAmt")).sendKeys("2000");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			/*Thread.sleep(5000);
			driver.findElement(By.id("cphpagebody_txt_unpaid_amt")).clear();
			
			Thread.sleep(2000);
			driver.findElement(By.id("cphpagebody_txt_unpaid_amt")).sendKeys("800");
			*/
		
			driver.findElement(By.id("cphpagebody_txt_note")).sendKeys("Please make payment immmediately");
			
			Thread.sleep(5000);
			driver.findElement(By.id("cphpagebody_ddl_pay_mode")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddl_pay_mode\"]/option[4]")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.id("cphpagebody_txt_transaction_id")).sendKeys("12300020");
			
			Thread.sleep(5000);
			driver.findElement(By.id("cphpagebody_btn_create_reciept")).click();
		}
	}


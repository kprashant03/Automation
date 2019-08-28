package Society_Account;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_Expense_Receipt extends Test_Account_Login{
  
	@Test
  public void  view() {
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[8]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[8]/ul/li[1]/a")).click();
  }
	@Test (priority = 2)
	public void generate() throws InterruptedException {
		//driver.findElement(By.id("cphpagebody_demo")).sendKeys("Ankita");
		
		driver.findElement(By.id("cphpagebody_rb_auditable1")).click();
		
		driver.findElement(By.id("cphpagebody_txt_reciept_head")).sendKeys("Maintainance");
		driver.findElement(By.id("cphpagebody_txt_member_name1")).sendKeys("Ankita");
		
		driver.findElement(By.id("cphpagebody_ddl_wing_name")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddl_wing_name\"]/option[2]")).click();
		
		driver.findElement(By.id("cphpagebody_txt_pincode")).sendKeys("411014");
		driver.findElement(By.id("cphpagebody_txt_address")).sendKeys("Kharadi");
		
		driver.findElement(By.id("cphpagebody_txt_emailid_1")).sendKeys("ankita1234@gmail.com");
		driver.findElement(By.id("cphpagebody_txt_contactno1")).sendKeys("9658741320");
		
		driver.findElement(By.id("cphpagebody_txt_due_date")).sendKeys("06-30-2019");
		//
		
		driver.findElement(By.id("cphpagebody_ddl_fine_type")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddl_fine_type\"]/option[3]")).click();
		
		driver.findElement(By.id("cphpagebody_ddl_discount_type")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddl_discount_type\"]/option[3]")).click();
		
		driver.findElement(By.id("cphpagebody_txt_total_amt")).sendKeys("1200");
		
		driver.findElement(By.id("cphpagebody_txt_fine")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("cphpagebody_txt_fine")).sendKeys("10");
		
		driver.findElement(By.id("cphpagebody_txt_discount")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("cphpagebody_txt_discount")).sendKeys("5");
		
		driver.findElement(By.id("cphpagebody_txt_paid_amount1")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("cphpagebody_txt_paid_amount1")).sendKeys("1000");
		
		driver.findElement(By.id("cphpagebody_txtAmountTOpay")).sendKeys("1260");
		
		driver.findElement(By.id("cphpagebody_txt_unpaid_amount1")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("cphpagebody_txt_unpaid_amount1")).sendKeys("260");
		
		driver.findElement(By.id("cphpagebody_txt_note")).sendKeys("Please make payment immediately");
		
		driver.findElement(By.id("cphpagebody_Button1")).click();
	}
}

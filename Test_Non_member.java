package Society_Account;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_Non_member extends Test_Account_Login{
   
		@Test  (priority=1)
	public void view() {
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[6]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/aside/section/ul/li[6]/ul/li[3]/a")).click();
  }
  
	
     	@Test  (priority=2)
	public void genrate() throws InterruptedException {
	  driver.findElement(By.id("cphpagebody_rb_auditable1")).click();
	  driver.findElement(By.id("cphpagebody_txt_member_name1")).sendKeys("Kumar Shashank");
	  
	  driver.findElement(By.id("cphpagebody_txt_address")).click();
	  driver.findElement(By.id("cphpagebody_txt_address")).sendKeys("viman nagar");
	  
	  driver.findElement(By.id("cphpagebody_txt_pincode")).click();
	  driver.findElement(By.id("cphpagebody_txt_pincode")).sendKeys("411014");
	  
	  driver.findElement(By.id("cphpagebody_txt_emailid_1")).click();
	  driver.findElement(By.id("cphpagebody_txt_emailid_1")).sendKeys("kshashank141@gmail.com");
	  
	  driver.findElement(By.id("cphpagebody_txt_contactno1")).sendKeys("9584752120");
	  
	  driver.findElement(By.id("cphpagebody_txt_due_date")).sendKeys("05-30-2019");
	  
	  driver.findElement(By.id("cphpagebody_ddl_fine_type")).click();
	  driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddl_fine_type\"]/option[3]")).click();
	  
	  driver.findElement(By.id("cphpagebody_ddl_discount_type")).click();
	  driver.findElement(By.xpath("//*[@id=\"cphpagebody_ddl_discount_type\"]/option[3]")).click();
	  
	  driver.findElement(By.id("cphpagebody_txt_particular_amt")).sendKeys("1500");
	  
	  driver.findElement(By.id("cphpagebody_txt_fine")).clear();
	  Thread.sleep(2000);
	  driver.findElement(By.id("cphpagebody_txt_fine")).sendKeys("15");
	  
	  driver.findElement(By.id("cphpagebody_txt_discount")).clear();
	  Thread.sleep(2000);
	  driver.findElement(By.id("cphpagebody_txt_discount")).sendKeys("5");
	  
	  driver.findElement(By.id("cphpagebody_txtAmountTOpay")).clear();
	  Thread.sleep(2000);
	  driver.findElement(By.id("cphpagebody_txtAmountTOpay")).sendKeys("1000");
	  
	  driver.findElement(By.id("cphpagebody_txt_note")).sendKeys("Please make payment immediately");
	  
	  Thread.sleep(5000);
	  driver.findElement(By.id("cphpagebody_DropDownList1")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"cphpagebody_DropDownList1\"]/option[3]")).click();
	  
	  Thread.sleep(2000);
	  driver.findElement(By.id("cphpagebody_txt_bank_name1")).sendKeys("icici");
	  driver.findElement(By.id("cphpagebody_txt_cheque_no1")).sendKeys("120658009");
	  
	  Thread.sleep(2000);
	  driver.findElement(By.id("cphpagebody_txt_cheque_date1")).sendKeys("06-28-2019");
	  
	  Thread.sleep(5000);
	  driver.findElement(By.id("cphpagebody_Button1")).click();

	
}
}
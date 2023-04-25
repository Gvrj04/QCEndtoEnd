package QCommission.End2End;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FIle1 {

		
	@Test
	public void TestCase1() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://portal.qcommission.net/qcommissionportal/");
		driver.findElement(By.xpath("//input[@name='tb_userid']")).sendKeys("Compadmin@qc_vasanth.com");
		driver.findElement(By.xpath("//input[@name='tb_password']")).sendKeys("admin12");
		driver.findElement(By.cssSelector("input[name='bt_login']")).click();
		driver.quit();
		
	}	
}

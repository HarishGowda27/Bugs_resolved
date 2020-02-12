package jobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class frames {
	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\System\\ADSoftware\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame("iframe1");
		
		driver.findElement(By.xpath("/html/body/div[1]/a[1]")).click();
		
		driver.close();
		
	}
}
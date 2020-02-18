package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Locator_class {
	

private static WebElement element = null;

//Driver
		public  static WebElement Driver(WebDriver driver)
		{
			System.setProperty("webdriver.chrome.driver", "C:\\System\\ADSoftware\\Chromedriver\\chromedriver.exe");
			return element;
		}

	//server IP
	public  static WebElement Navigate(WebDriver driver)
	{
		driver.navigate().to("http://10.0.0.202/");
		return element;
	}

	//username
	public  static WebElement Username(WebDriver driver)
	{
	    element = driver.findElement(By.name("username"));
		return element;
	}
	
	//password
	public  static WebElement Password(WebDriver driver)
	{
	    element = driver.findElement(By.name("password"));
		return element;
	}
	
	//submit 
	public  static WebElement Submit(WebDriver driver)
	{
	    element = driver.findElement(By.name("submit"));
		return element;
	}
	
	//jobs pixflex-menu-jobs
	public  static WebElement jobs_dropdown(WebDriver driver)
	{
	    element = driver.findElement(By.id("pixflex-menu-jobs"));
		return element;
	}
	
	//Versa jobs versa_active
	public  static WebElement Versa_job(WebDriver driver)
	{
	    element = driver.findElement(By.id("versa_active"));
		return element;
	}
	
	//New job btn btn-primary pixflex-cursor pixflex-tooltip
	public  static WebElement Versa_job_new(WebDriver driver)
	{
	    element = driver.findElement(By.linkText("New"));
		return element;
	}
	
	//Job_Name job_name
			public  static WebElement Job_Name(WebDriver driver)
			{
			
				element = driver.findElement(By.id("job_name"));
				return element;
			}
	
	//Filestream
			public  static WebElement Filein(WebDriver driver)
			{
			    WebElement click6 = driver.findElement(By.id("versa_src_filestream"));
				click6.click();
			    return element;
			}
	
			//gstaf_src_file_stream_file_location Filelocation
			public  static WebElement Filein_location(WebDriver driver)
			{
			    WebElement path = driver.findElement(By.id("gstaf_src_file_stream_file_location"));
				path.sendKeys("/storage/device/SmokeQA/big_buck_bunny_1080p.mp4");
			    return element;
			}
			
			//scroll
			public  static WebElement Scroll(WebDriver driver)
			{
				JavascriptExecutor jsss1 = (JavascriptExecutor) driver;
		  		jsss1.executeScript("scroll(0,1000)");
		  		return element;
			}
	
	
	//Test Pattern versa_src_test_pattern
	public  static WebElement test_pattern(WebDriver driver)
	{
	    element = driver.findElement(By.id("versa_src_test_pattern"));
		return element;
	}
	
	//Add Input add_pfmt_input
	public  static WebElement add_input(WebDriver driver)
	{
	    element = driver.findElement(By.id("add_pfmt_input"));
		return element;
	}
	
	//Next input_next
	public  static WebElement input_next(WebDriver driver)
	{
	    element = driver.findElement(By.id("input_next"));
		return element;
	}
	
	//Process Next process_next
	public  static WebElement process_next(WebDriver driver)
	{
	    element = driver.findElement(By.id("process_next"));
		return element;
	}
	
	//Add profile show_profile
	public  static WebElement Add_profile(WebDriver driver)
	{
		 element = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/div/div/div/div/form/div[3]/div/div[2]/div/div[6]/div/div[2]/a"));
		return element;
	}
	
	//Select HD_profile pfmt_profile_preset
	public  static WebElement profile_HD_Profile(WebDriver driver)
	{
		Select dropdown = new Select(driver.findElement(By.id("pfmt_profile_preset")));  
		dropdown.selectByVisibleText("OTT_HD_854x480");
		return element;
	}
	
	//Select PAL_profile 
	public  static WebElement profile_PAL_Profile(WebDriver driver)
	{
		Select dropdown = new Select(driver.findElement(By.id("pfmt_profile_preset")));  
		dropdown.selectByVisibleText("OTT_PAL_720x576");
		return element;
	}
	
	//Select NTSC_profile 
		public  static WebElement profile_NTSC_Profile(WebDriver driver)
		{
			Select dropdown = new Select(driver.findElement(By.id("pfmt_profile_preset")));  
			dropdown.selectByVisibleText("OTT_NTSC_720x480");
			return element;
		}	
	
	//Select P2P_profile P2P_1920x1080
		public  static WebElement profile_P2P_Profile(WebDriver driver)
		{
			Select dropdown = new Select(driver.findElement(By.id("pfmt_profile_preset")));  
			dropdown.selectByVisibleText("P2P_1920x1080");
			return element;
		}
		
	//Select Bcast_profile
		public  static WebElement profile_Bcast_Profile(WebDriver driver)
		{
			Select dropdown = new Select(driver.findElement(By.id("pfmt_profile_preset")));  
			dropdown.selectByVisibleText("Bcast_1920x1080");
			return element;
		}
		
	//Cancel profile cancel_preset
		public  static WebElement Cancel(WebDriver driver)
		{
			 element = driver.findElement(By.id("cancel_preset"));
			return element;
		}
		
	//Profile Next profile_next
		public  static WebElement Next_Profile(WebDriver driver)
		{
			 element = driver.findElement(By.id("profile_next"));
			return element;
		}
		

}

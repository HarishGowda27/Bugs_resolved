package bugpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Locators.Locators_Pages;

public class BUG_2126 {
	

	 static WebDriver driver = null; 
	 
	 @Test		
		public static void job1() throws InterruptedException {
			
		Locators_Pages.Driver(driver);
		
		driver = new ChromeDriver();
		
		Locators_Pages.Navigate(driver);
		
		Locators_Pages.Window_maximize(driver);
		
		Locators_Pages.Username(driver);
		
		Locators_Pages.Password(driver);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Locators_Pages.Submit(driver);
		
		Locators_Pages.jobs_dropdown(driver).click();
		
		Locators_Pages.Versa_job(driver);
		
		Locators_Pages.Versa_job_new(driver);
		
		Locators_Pages.Job_Name(driver).sendKeys("BUG_2126");
		
		Locators_Pages.Filein(driver);
		
		Locators_Pages.Filein_location(driver);
	
		Locators_Pages.Scroll(driver);
		
		Locators_Pages.add_input(driver);
		
		Locators_Pages.input_next(driver);
		
		Locators_Pages.process_next(driver);
		
		Locators_Pages.Add_profile(driver);
		
		Locators_Pages.profile_HD_Profile(driver);
		
		Locators_Pages.Next_Profile(driver);
		
		Locators_Pages.rtmp_streamer(driver);
		
		Locators_Pages.Streamer_Name(driver).sendKeys("Rtmp_out_Streamer_1");
		
		Locators_Pages.add_streamer(driver);
		
		Locators_Pages.Thread(driver);
		
		Locators_Pages.Add_job(driver);
		
		Locators_Pages.Thread(driver);
		
		Locators_Pages.Job_Start(driver);
		
		Locators_Pages.Scroll(driver);
		
		Locators_Pages.Thread(driver);
		
		Locators_Pages.Job_Stop(driver);
		
		Locators_Pages.All_jobs_list(driver);
	
		driver.close();
	 }

}

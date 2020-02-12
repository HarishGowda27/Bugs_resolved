package Statpage_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Statpage_locators {

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
		
		
		
		//Stat page
		//Input******
		public  static WebElement Input_Bitrate(WebDriver driver)
		{
		    element = driver.findElement(By.id("input_stream_stat_bitrate_0_0"));
			return element;
		}
		
		public  static WebElement Input_Avg_Bitrate(WebDriver driver)
		{
		    element = driver.findElement(By.id("input_stream_stat_avg_bitrate_0_0"));
			return element;
		}
		
		public  static WebElement Recived_data(WebDriver driver)
		{
		    element = driver.findElement(By.id("input_stream_stat_bytes_total_0_0"));
			return element;
		}
		
		
		public  static WebElement Per_Completed(WebDriver driver)
		{
		    element = driver.findElement(By.id("input_stream_stat_percentage_completion_0_0"));
			return element;
		}
		
		public  static WebElement Uptime(WebDriver driver)
		{
		    element = driver.findElement(By.id("input_stream_stat_uptime_0_0"));
			return element;
		}
		
		
		public  static WebElement Live_started(WebDriver driver)
		{
		    element = driver.findElement(By.id("input_stream_live_started_0_0"));
			return element;
		}
		
		
		
	//Profile******
		public  static WebElement Profile_Bitrate(WebDriver driver)
		{
		    element = driver.findElement(By.id("input_stream_live_started_0_0"));
			return element;
		}
	
		
		public  static WebElement Profile_Avg_Bitrate(WebDriver driver)
		{
		    element = driver.findElement(By.id("pfmt_video_stat_bitrate_0_0"));
			return element;
		}
		
		public  static WebElement Profile_Framerate(WebDriver driver)
		{
		    element = driver.findElement(By.id("pfmt_video_stat_fps_0_0"));
			return element;
		}
		
		public  static WebElement Profile_Avg_Framerate(WebDriver driver)
		{
		    element = driver.findElement(By.id("pfmt_video_stat_fps_avg_0_0"));
			return element;
		}
		
		public  static WebElement Last_Key_Frame(WebDriver driver)
		{
		    element = driver.findElement(By.id("pfmt_video_stat_last_key_frame_0_0"));
			return element;
		}
		
	//output******
		public  static WebElement Protocol_type(WebDriver driver)
		{
		    element = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[6]/div[2]/div/div/div/div/div[1]/div/div[2]"));
			return element;
		}
		
		public  static WebElement Playlist_Name(WebDriver driver)
		{
		    element = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[6]/div[2]/div/div/div/div/div[2]/div/div[2]"));
			return element;
		}
		
		public  static WebElement Playback_URL(WebDriver driver)
		{
		    element = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[6]/div[2]/div/div/div/div/div[3]/div/div[2]"));
			return element;
		}
		
		public  static WebElement Presets(WebDriver driver)
		{
		    element = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[6]/div[2]/div/div/div/div/div[4]/div/div[2]/div"));
			return element;
		}
		
		
		public  static WebElement Playlist_length(WebDriver driver)
		{
		    element = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[6]/div[2]/div/div/div/div/div[5]/div/div[2]"));
			return element;
		}
		
}

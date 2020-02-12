package jobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class experiment {
	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\System\\ADSoftware\\Chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Index.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Skip Sign In")).click();
        
	/*	
	 //**Mouse Hover
	 
		Actions actions = new Actions(driver);   
		WebElement menuOption = driver.findElement(By.linkText("Interactions"));
		actions.moveToElement(menuOption);
		  
		WebElement menuOption1 = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/ul/li[1]/a"));
		actions.moveToElement(menuOption1).perform();
		
		WebElement selectMenuOption = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/ul/li[1]/ul/li[2]/a"));
	    selectMenuOption.click();
	    
	    //**
	    
	*/ 
	    
		
		
	    //**Frame
	    
	    Actions actions2 = new Actions(driver);
	    WebElement Frame = driver.findElement(By.linkText("SwitchTo"));
	    actions2.moveToElement(Frame).perform();
	    
	    WebElement action3 = driver.findElement(By.linkText("Frames"));
	    action3.click();
	    
	    driver.findElement(By.linkText("Iframe with in an Iframe")).click();
	    
	    
	/*	    
	    //single frame
	    WebElement frame = driver.findElement((By.xpath("//*[@id=\"singleframe\"]")));
	    driver.switchTo().frame(frame);
	  
	    driver.findElement((By.xpath("/html/body/section/div/div/div/input"))).sendKeys("Selenium");
   */
	    		/* 			
	    //iframe button
	    Actions button = new Actions(driver);
	    WebElement iframe = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a"));
	    button.moveToElement(iframe).perform();
	     */	
	    /*	
		
		//First find the element using any of locator stratedgy
		WebElement iframeElement = driver.findElement(By.id("IF1"));

		//now use the switch command
		driver.switchTo().frame(0);

		//Do all the required tasks in the frame 0
		//Switch back to the main window
		driver.switchTo().defaultContent();
		driver.quit();
	    
	     */	
	    //iframe
	 //   Actions action31 =  new Actions(driver);
	  //  WebElement click = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
	   // action31.moveToElement(click).perform();
	    // driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("abc");
	    
	    //
	   
		
	/*	
		//Alert
		
		Actions actions = new Actions(driver);   
		WebElement menuOption = driver.findElement(By.linkText("SwitchTo"));
		actions.moveToElement(menuOption).perform();
		
		WebElement selectMenuOption1 = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[1]/a"));
	    selectMenuOption1.click();
	  
	    */
	    

	
	}
}
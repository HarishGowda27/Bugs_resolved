package bugpack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BUG_2102 {
	
	public WebDriver driver;

	public int rows;

	public int columns;

	@Test(dataProvider = "testdata")

	public void LongRunDemo(String url, String importpath,String jobname) throws InterruptedException

	{

		System.setProperty("webdriver.chrome.driver", "C:\\System\\WebDrivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(url);

		Thread.sleep(500);

		driver.findElement(By.name("username")).clear();

		driver.findElement(By.name("username")).sendKeys("admin");

		driver.findElement(By.name("password")).clear();

		driver.findElement(By.name("password")).sendKeys("pixfix@123");

		driver.findElement(By.id("submitbutton")).click();

		Thread.sleep(500);

		// driver.findElement(By.linkText("Jobs")).click();

		// Thread.sleep(500);

		driver.findElement(By.xpath("//*[@id=\"left_scroll\"]/div/div[4]/a[1]/span")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("Import")).click();

		Thread.sleep(3000);

		StringSelection stringSelection = new StringSelection(importpath);

		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

		clipboard.setContents(stringSelection, null);

		Robot robot = null;

		try

		{
			robot = new Robot();
		}

		catch (AWTException e)

		{
			e.printStackTrace();
		}

		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(150);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		driver.findElement(By.id("import_job")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button")).click();

		Thread.sleep(4000);
		
		Select drpCountry = new Select(driver.findElement(By.id("query_limit")));
  		drpCountry.selectByVisibleText("200");
          
  		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[@data-type='start' and @data-job_name='"+jobname+"']")).click();

		Thread.sleep(7000);

		driver.navigate().refresh();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[@data-type='stat' and @data-job_name='"+jobname+"']")).click();

		Thread.sleep(5000);

		String s1 = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[1]/div/div/div[4]/div[1]/span[3]")).getText();
		
		String s8 = driver.findElement(By.id("input_stream_stat_bitrate_0_0")).getText();

		String s9 = driver.findElement(By.id("input_stream_stat_avg_bitrate_0_0")).getText();

		String s10 = driver.findElement(By.id("input_stream_stat_bytes_total_0_0")).getText();
		// complete
		String s11 = driver.findElement(By.id("input_stream_stat_percentage_completion_0_0")).getText();
		//uptime
		String s12 = driver.findElement(By.id("input_stream_stat_uptime_0_0")).getText();
	   //live start
		String s13 = driver.findElement(By.id("input_stream_live_started_0_0")).getText();

		
		String s14 = driver.findElement(By.id("pfmt_video_stat_bitrate_0_0")).getText();

		String s15 = driver.findElement(By.id("pfmt_video_stat_bitrate_avg_0_0")).getText();

		String s16 = driver.findElement(By.id("pfmt_video_stat_fps_0_0")).getText();
		
		String s17 = driver.findElement(By.id("pfmt_video_stat_fps_avg_0_0")).getText();
		
		String s18 = driver.findElement(By.id("pfmt_video_stat_last_key_frame_0_0")).getText();

		String s19 = driver.findElement(By.id("pfmt_audio_stat_bitrate_0_0")).getText();

		String s20 = driver.findElement(By.id("pfmt_audio_stat_bitrate_avg_0_0")).getText();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		
		Thread.sleep(500);
		
		new Select(driver.findElement(By.id("notification_type"))).selectByVisibleText("Error + Info");
		
		Thread.sleep(3000);
		
		String s46 = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[7]/div[2]/div/div[2]")).getText();
		
		Thread.sleep(500);
		
		String k = "Imported Successfully";
	
		Thread.sleep(3000);

		String c= ""+k+"  "+jobname+"  "+s46+"  "+s1+"  "+s8+"  "+s9+"  "+s10+""
 				+ "  "+s11+"  "+s12+"  "+s13+"  "+s14+"  "+s15+"  "+s16+"  "+s17+"  "+s18+"  "+s19+"  "+s20+"";
 				
 			
		String d = c.replaceAll("  ", ",");

		System.out.println(d);

		driver.findElement(By.xpath("//*[@id=\"left_scroll\"]/div/div[4]/a[1]/span")).click();

		Thread.sleep(1000);


		try

		{

			boolean b3 = driver.findElement(By.xpath("//a[@data-type='stop' and @data-job_name='"+jobname+"']"))
					.isDisplayed();

	 		if (b3 == true)

			{
	 			Thread.sleep(5000);
	 			
				driver.findElement(By.xpath("//a[@data-type='stop' and @data-job_name='"+jobname+"']")).click();

				Thread.sleep(1000);
				
				driver.close();

			}

		}

		catch (Exception e)

		{

			driver.close();

		}
	}

	@DataProvider(name = "testdata")

	public Object[][] passData() throws Exception

	{

		System.setOut(new PrintStream(new FileOutputStream("C:\\System\\Automatiom_Exceldata\\BUGS_Auto_json\\BUGS_resolvedOutput.csv",true)));

		String a = "Import Status  Job Name  Notification  Job Status"
				+ "  I/P Bitrate  I/P Avg Bitrate  Received Data  % Completed  Uptime  Job Start Time  Video Bitrate  Video Avg Bitrate"
				+ "  Video Framerate  Video Avg Framerate  Last Key Frame  Audio Bitrate  Audio Avg Bitrate";
		String b = a.replaceAll("  ", ",");

		System.out.println(b);

		File excel = new File("C:\\System\\Automatiom_Exceldata\\BUGS_Auto_json\\Spreadsheet\\BUG_2102.xlsx");

		FileInputStream fis = new FileInputStream(excel);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet ws = wb.getSheet("Sheet1");

		int rows = ws.getLastRowNum();

		int columns = ws.getRow(0).getLastCellNum();

		Object[][] data = new Object[rows][columns];

		for (int i = 1; i <= rows; i++)

		{

			XSSFRow row = ws.getRow(i);

			for (int j = 0; j < columns; j++)

			{

				XSSFCell cell = row.getCell(j);

				Object value = cellToObject(cell);

				data[i - 1][j] = value;

			}

		}

		return data;

	}

	public static Object cellToObject(XSSFCell cell)

	{

		Object result;

		if (cell.getCellType() == cell.CELL_TYPE_NUMERIC)

		{
			int i = (int) cell.getNumericCellValue();

			result = i;

		} else {
			result = cell.toString();

		}

		return result.toString();

	}

}

package jobs;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Filein_udpout_versa {

public WebDriver driver;
	
	public int rows;

	public int columns;

	@Test(dataProvider = "testdata")

	public void LongRunDemo(String url, String importpath,String jobname) throws InterruptedException

	{

		
		System.setProperty("webdriver.chrome.driver", "C:\\System\\ADSoftware\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("10.0.0.202");

		Thread.sleep(500);

		driver.findElement(By.name("username")).clear();

		driver.findElement(By.name("username")).sendKeys("admin");

		driver.findElement(By.name("password")).clear();

		driver.findElement(By.name("password")).sendKeys("pixfix@123");

		driver.findElement(By.id("submitbutton")).click();

		Thread.sleep(500);
		}
	

		@DataProvider(name = "testdata")

		public Object[][] passData() throws Exception

		{
			File excel = new File("C:\\System\\Automatiom_Exceldata\\Create_jobs\\ServerIP.xlsx");

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

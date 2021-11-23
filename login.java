package allureport;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class login 
{
	WebDriver driver;
	private WebElement username;
	private WebElement password;
	
	login()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","//System.setProperty(\"webdriver.chrome.driver\",\"C:\\\\Users\\\\Anjli\\\\Downloads\\\\chromedriver_win32 (6)\\\\chromedriver.exe\")");
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Anjli\\Desktop\\geckodriver.exe");
		 driver=new ChromeDriver();
		//WebDriver driver= new FirefoxDriver();

		//driver.get("https://www.youtube.com");
		driver.get("http://localhost/avactis/sign-in.php");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("anjalimasal0718@gmail.com");
		driver.findElement(By.name("passwd")).clear();
		driver.findElement(By.name("passwd")).sendKeys("7558338321@m");
		
	driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[2]/form/div[5]/div/input")).click();
	
	//String ss="http://localhost/avactis/home.php";
	
	String actualTitle = driver.getCurrentUrl();
	System.out.print(actualTitle);
	String expectedTitle = "http://localhost/avactis/home.php";
	assertEquals(expectedTitle,actualTitle);
	
	}
	
}

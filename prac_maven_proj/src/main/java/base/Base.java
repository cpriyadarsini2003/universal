package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

public class Base 
{
	
	public static WebDriver driver;
	
	public static Properties p;
	
	//@BeforeSuite
	public void intialise() throws FileNotFoundException, IOException 
	{
		p = new Properties();
		p.load(new FileInputStream("src/main/java/config/config.properties"));
		System.out.println((p.getProperty("browsername")));
		if (p.getProperty("browsername").matches("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		if (p.getProperty("browsername").matches("chrome"))
		{
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}



}

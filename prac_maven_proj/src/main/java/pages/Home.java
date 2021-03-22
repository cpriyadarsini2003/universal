package pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class Home extends Base
{

	@FindBy(xpath="//input[@name='SearchString']") static WebElement search;
	@FindBy(xpath ="//img[@alt='Search Button']")static WebElement searchclick;
	
	public void open_url()
	{
		try {
			intialise();
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			
		} 
		
		PageFactory.initElements(driver, this);
		driver.get("https://www.universalclass.com/");
	}
	public void search() 
	{
		
		search.sendKeys("cooking");
		searchclick.click();
		
		
	}

	public void validate_courses() 
	{
		String str = driver.getCurrentUrl();
		if (str.contains("cooking")) 
		{
		System.out.println("the relevent courses are displayed");	
		}
		else 
		System.out.println("the relevent courses are not displayed");
	}

}

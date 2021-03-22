package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;



public class Subscribe extends Base

{
	@FindBy(xpath="//img[@alt ='Open Menu']") static WebElement drop;
	@FindBy(xpath="//span[text()='Subscribe']") static WebElement sub;
	
	public void dropdown() 
	{
	PageFactory.initElements(driver, this);
	drop.click();
	
	}
	
	public void subscribe() 
	{
		sub.click();
	}
	
}

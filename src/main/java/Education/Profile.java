package Education;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile {
	
	@FindBy(xpath="//span[normalize-space()='Profile']")
	private WebElement profiletab;
	
	@FindBy(xpath="(//div[@class='achievement-badge compact badge-overlay'])[1]")
	private WebElement showcase;
	
	@FindBy(xpath="//button[@class='_z9asim']")
	private WebElement badge;
	
	public Profile(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
	public void profiletab()
	{
		profiletab.click();
	}
	
	public void showcase()
	{
		showcase.click();
	}
	
	public void badge()
	{
		badge.click();
	}
	
	
	

}

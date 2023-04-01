package Education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	public Logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@class='_wozql4 _13hnk7qk']")
	private WebElement profilelink;
	
	public void profilelink()	
	{
		profilelink.click();
	}
	
	@FindBy(xpath="//span[normalize-space()='Log out']")
	private WebElement logoutbutton;
	
	public void logoutbutton()
	{
		logoutbutton.click();
	}


}

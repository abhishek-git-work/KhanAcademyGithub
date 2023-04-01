package Education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
// step 1: To declare Data Member (Variable) globally
	
	@FindBy(xpath="//a[@id='login-or-signup']")
	private WebElement loginlink;
	
	@FindBy(xpath="(//input[@class='_1azps1NaN'])[1]")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='uid-labeled-text-field-1-wb-id-field']")
	private WebElement password;
	
	@FindBy(xpath="//button[@role='button']")
	private WebElement loginbutton;
	
// Step 2: Initialization of Variable or DM / constructor creation
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
// step 3: Method creation
	
	public void loginlink()	
	{
		loginlink.click();
	}
	
	public void username()
	{
		username.sendKeys("abhishek.bramhankar@gmail.com");
	}
	
	public void password() 
	{
		password.sendKeys("abhishek&9420");
	}
	
	public void loginbutton()
	{
		loginbutton.click();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

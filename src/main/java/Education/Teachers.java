package Education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Teachers {

// step 1: To declare DM (Variable) globally
	
	@FindBy(xpath="//span[text()='Teachers']")
	private WebElement teacherlink;
	
	@FindBy(xpath="//input[@id='coach-email']")
	private WebElement teacherID;
	
	@FindBy(xpath="//input[@id='add-coach']")
	private WebElement addteacherbutton;
	
	@FindBy(xpath="//button[@class='accept simple-button green']")
	private WebElement acceptbutton;
	
	@FindBy(xpath="//button[@class='remove simple-button']")
	private WebElement removeteacherbutton;
	
	@FindBy(xpath="//button[@data-test-id='remove-coach-button-confirm']")
	private WebElement removeteacherconfirm;
	
	@FindBy(xpath="//a[@role='button']")
	private WebElement classcodebutton;
	
	@FindBy(xpath="//input[@maxlength='8']")
	private WebElement classcodevalue;
	
	@FindBy(xpath="//button[@type='button']")
	private WebElement classcodecontinue;
	
	@FindBy(xpath="//a[@role='button']")
	private WebElement classcodeback;
	
// Step 2: Initialization of Variable or DM / constructor creation
	
	public Teachers(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
// step 3: Method creation
	
	public void teacherlink()
	{
		teacherlink.click();
	}
	
	public void teacherID()
	{
		teacherID.sendKeys("abhishek.bramhankar@gmail.com");
	}
	
	public void addteacherbutton()
	{
		addteacherbutton.click();
	}
	
	public void acceptbutton()
	{
		acceptbutton.click();
	}
	
	public void removeteacherbutton()
	{
		removeteacherbutton.click();
	}
	
	public void removeteacherconfirm()
	{
		removeteacherconfirm.click();
	}
	
	public void classcodebutton()
	{
		classcodebutton.click();
	}
	
	public void classcodevalue()
	{
		classcodevalue.sendKeys("12345678");
	}
	
	public void classcodecontinue()
	{
		classcodecontinue.click();
	}
	
	public void classcodeback()
	{
		classcodeback.click();
	}
	
	
	
	
	
	

}

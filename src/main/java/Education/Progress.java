package Education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Progress {
	
	public Progress(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Progress']")
	private WebElement progress;
	
	public void progress()
	{
		progress.click();
	}
	
	@FindBy(xpath="//button[@data-test-id='date-range-filter']")
	private WebElement lastdaysdrop;
	
	public void lastdaysdrop()
	{
		lastdaysdrop.click();
	}
	
	@FindBy(xpath="//span[normalize-space()='Last 30 days']")
	private WebElement last30days;
	
	public void last30days()
	{
		last30days.click();
	}
	
	@FindBy(xpath="//span[normalize-space()='Today']")
	private WebElement last0days;
	
	public void last0days()
	{
		last0days.click();
	}
	
	@FindBy(xpath="//button[@data-test-id='course-type-filter']")
	private WebElement contentdrop ;
	
	public void contentdrop()
	{
		contentdrop.click();
	}
	
	@FindBy(xpath="//span[@class='_yxq7y94'][normalize-space()='Course mastery goals']")
	private WebElement Course;
	
	public void Course()
	{
		Course.click();
	}
	
	@FindBy(xpath="//button[@data-test-id='activity-type-filter']")
	private WebElement activitydrop ;
	
	public void activitydrop()
	{
		activitydrop.click();
	}
	
	@FindBy(xpath="//span[normalize-space()='Exercises']")
	private WebElement Exercises;

	public void Exercises()
	{
		Exercises.click();
	}
	
	@FindBy(xpath="//span[normalize-space()='Videos']")
	private WebElement Videos ;
	
	public void Videos()
	{
		Videos.click();
	}
	
	@FindBy(xpath="//span[normalize-space()='Articles']")
	private WebElement  Articles ;
	
	public void Articles()
	{
		Articles.click();
	}
	
	@FindBy(xpath="//span[normalize-space()='Quizzes']")
	private WebElement Quizzes ;
	
	public void Quizzes()
	{
		Quizzes.click();
	}
	
	@FindBy(xpath="//span[normalize-space()='Unit tests']")
	private WebElement Unittests ;
	
	public void Unittests()
	{
		Unittests.click();
	}
	
	@FindBy(xpath="//span[normalize-space()='Course challenges']")
	private WebElement Coursechallenges ;

	public void Coursechallenges()
	{
		Coursechallenges.click();
	}
	
	@FindBy(xpath="//span[normalize-space()='Mastery challenges']")
	private WebElement Masterychallenges ;
	
	public void Masterychallenges()
	{
		Masterychallenges.click();
	}
	
}	

	
	
	
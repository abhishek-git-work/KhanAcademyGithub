package Testing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Education.Login;
import Education.Logout;
import Education.Profile;
import Education.Progress;
import Education.Teachers;

public class TestNG {
	
	WebDriver driver;
	Login login;
	Teachers teacher;
	Logout logout;
	Progress progs;
	Profile profile;
	
	@BeforeClass
	public void beforeclass()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.khanacademy.org/");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		login = new Login(driver);
		login.loginlink();  					
		login.username();  					    
		login.password();    					
		login.loginbutton();  
	}
	
	@Test (priority=2)
	public void test_teacher() 
	{
		teacher = new Teachers(driver);
		teacher.teacherlink();   				
		teacher.teacherID();					
		teacher.addteacherbutton();   			
		driver.navigate().refresh();			
		teacher.acceptbutton();      			
		teacher.removeteacherbutton();  		
		teacher.removeteacherconfirm();    		
		teacher.classcodebutton();     			
		teacher.classcodevalue();     			
		teacher.classcodecontinue();   			
		teacher.classcodeback();          		
	}
	
	@Test (priority=3)
	public void test_progress()
	{
		progs = new Progress(driver);
		progs.progress();					
		progs.lastdaysdrop();					
		progs.last0days();						
		progs.lastdaysdrop();				
		progs.last30days();						
		progs.contentdrop();					
		progs.Course();							
		progs.activitydrop();					
		progs.Exercises();						
		progs.activitydrop();					
		progs.Videos();							
		progs.activitydrop();					
		progs.Articles();						
		progs.activitydrop();					
		progs.Quizzes();					
		progs.activitydrop();					
		progs.Unittests();					
		progs.activitydrop();					
		progs.Coursechallenges();			
		progs.activitydrop();				
		progs.Masterychallenges();				
	}
	
	@Test (priority=1, enabled=true)
	public void test_profile() throws InterruptedException 
	{
		Profile profile = new Profile(driver);	
		profile.profiletab();						
		profile.showcase();							
		profile.badge();	
		Thread.sleep(3000);
		driver.switchTo().alert().accept();   		
	}
	
	@AfterMethod
	public void aftermethod()
	{
		logout = new Logout(driver);
		logout.profilelink();
		logout.logoutbutton();
	}
	
	@AfterClass
	public void afterclass()
	{
		driver.close();
	}
	


}

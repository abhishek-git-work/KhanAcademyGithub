package Testing;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.Base;
import Education.Login;
import Education.Logout;
import Education.Profile;
import Education.Progress;
import Education.Teachers;
import utils.utility;

public class CrossBrowser extends Base{
	
	int testID;
	WebDriver driver;
	Login login;
	Teachers teacher;
	Logout logout;
	Progress progs;
	Profile profile;
	
	@Parameters("browser")
	
	@BeforeTest
	public void crossbrowser(String browsername)
	{
		System.out.println(browsername);
		
		if(browsername.equals("Chrome"))
		{
			driver = openChromebrowser();
		}
		
		if(browsername.equals("Firefox"))
		{
			driver = openFirefoxbrowser();
		}
		
		if(browsername.equals("Edge"))
		{
			driver = openEdgefoxbrowser();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.khanacademy.org/");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		login = new Login(driver);
		teacher = new Teachers(driver);
		progs = new Progress(driver);
		profile = new Profile(driver);	
		logout = new Logout(driver);
	}
	
	@BeforeMethod
	public void beforemethod()
	{	
		login.loginlink();  					
		login.username();  					    
		login.password();    					
		login.loginbutton();  
	}
	
	@Test // (priority=1)
	public void test_teacher() 
	{
		testID=3;
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
	
	@Test // (priority=2)
	public void test_progress()
	{
		testID=3;
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
//		Assert.fail();
	}
	
	@Test // (priority=3, enabled=true)
	public void test_profile() throws InterruptedException 
	{
		testID=3;
		profile.profiletab();						
		profile.showcase();							
		profile.badge();	
		Thread.sleep(3000);
		driver.switchTo().alert().accept();   		
	}
	
	@AfterMethod
	public void aftermethod(ITestResult result) throws IOException
	{	
		if(ITestResult.FAILURE == result.getStatus() ) 
		{
			utility.capturescreenshot(driver, testID);
		}
		
		logout.profilelink();
		logout.logoutbutton();
	}
	
	@AfterClass
	public void afterclass() 
	{
		login = null;
		teacher = null;
		progs = null;
		profile = null;	
		logout = null;
	}
	
	@AfterTest
	public void browserclose()
	{
		driver.close();
	}
	


}




package Testing;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Education.Login;
import Education.Profile;
import Education.Progress;
import Education.Teachers;

public class TestKhanAcademy {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.khanacademy.org/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//Login
		Login log = new Login(driver);
		log.loginlink();  						Thread.sleep(2000);
		log.username();  					    Thread.sleep(2000);
		log.password();    						Thread.sleep(2000);
		log.loginbutton();   					Thread.sleep(2000);

//Teacher
		Teachers teacher = new Teachers(driver);
		teacher.teacherlink();   				Thread.sleep(2000);
		teacher.teacherID();					Thread.sleep(2000);
		teacher.addteacherbutton();   			Thread.sleep(2000);
		driver.navigate().refresh();			Thread.sleep(2000);
		teacher.acceptbutton();      			Thread.sleep(2000);
		teacher.removeteacherbutton();  		Thread.sleep(2000);
		teacher.removeteacherconfirm();    		Thread.sleep(2000);
		teacher.classcodebutton();     			Thread.sleep(2000);
		teacher.classcodevalue();     			Thread.sleep(2000);
		teacher.classcodecontinue();   			Thread.sleep(2000);
		teacher.classcodeback();          		Thread.sleep(2000);
	
//Profile
		Profile pro = new Profile(driver);	
		pro.profiletab();						Thread.sleep(3000);
		pro.showcase();							Thread.sleep(3000);
		pro.badge();							Thread.sleep(3000);
		Alert a = driver.switchTo().alert();    		
		a.accept();      

//Progress
		Progress progs = new Progress(driver);
		progs.progress();						Thread.sleep(2000);
		progs.lastdaysdrop();					Thread.sleep(2000);
		progs.last0days();						Thread.sleep(2000);
		progs.lastdaysdrop();					Thread.sleep(2000);
		progs.last30days();						Thread.sleep(2000);
		progs.contentdrop();					Thread.sleep(2000);
		progs.Course();							Thread.sleep(2000);
		progs.activitydrop();					Thread.sleep(2000);
		progs.Exercises();						Thread.sleep(2000);
		progs.activitydrop();					Thread.sleep(2000);
		progs.Videos();							Thread.sleep(2000);
		progs.activitydrop();					Thread.sleep(2000);
		progs.Articles();						Thread.sleep(2000);
		progs.activitydrop();					Thread.sleep(2000);
		progs.Quizzes();						Thread.sleep(2000);
		progs.activitydrop();					Thread.sleep(2000);
		progs.Unittests();						Thread.sleep(2000);
		progs.activitydrop();					Thread.sleep(2000);
		progs.Coursechallenges();				Thread.sleep(2000);
		progs.activitydrop();					Thread.sleep(2000);
		progs.Masterychallenges();				Thread.sleep(2000);
		
		
		
		
		
	}

}

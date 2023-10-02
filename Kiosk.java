package maven.com.proj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Kiosk {
	WebDriver driver;
	@BeforeTest
	private void launchbro() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\cucumbur.org\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	@Test(priority = 0)
	private void loginpage() {
		driver.get("https://qa.chups.com/kiosk/login");
		driver.manage().window().maximize();

	}
	@Test(priority = 1)
	@Parameters("usename")
	private void userna(String s) {
		WebElement username = driver.findElement(By.xpath("//input[@id ='exampleFormControlInput1']"));
		username.sendKeys(s);

	}
	@Test(priority = 2)
	@Parameters("pass")
	private void pass(String s1) {
		WebElement pass = driver.findElement(By.xpath("//input[@id ='exampleFormControlInput2']"));
		pass.sendKeys(s1);

	}
	@Test(priority = 3)
	private void sing() {
		WebElement but = driver.findElement(By.xpath("//button[text() ='Sign In']"));
		but.click();

	}
	@Test(priority = 4)
	private void brand() {
		 WebElement bf = driver.findElement(By.xpath("//h4[text() ='Briyani Factory']"));
		   bf.click();

	}
	

}

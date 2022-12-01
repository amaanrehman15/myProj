import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import test.TakesScreenshot;
import test.driver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMAAN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys("amaan");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.cssSelector("button.submit.signInBtn")).click();
		
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); 

		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("amaan");
		
		 TakesScreenshot ss= ( TakesScreenshot)(driver);
		File src ts.getScreenshotas(OutputType.FILE);
		File file=new File(System.getProperty("user.dir")+"//ss.png");
		FileUtils.copyFile(src,file);
		
		 
	}
}

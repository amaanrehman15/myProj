import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightbookingEx {
   
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMAAN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
WebElement staticDropdown=driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
	
	Select dropdown=new Select(staticDropdown);
	dropdown.selectByIndex(3);
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(2000);
	
	int i=0;
	while(i<4) {
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
	}
	
	driver.findElement(By.id("btnclosepaxoption")).click();

	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[@value='BLR']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
	
	
			
	
	driver.findElement(By.cssSelector(".ui-state-default ui-state-highlight.ui-state-active")).click();	
	
	driver.findElement(By.id("autosuggest")).sendKeys("ind");
	Thread.sleep(3000);
	List<WebElement> options=	driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement option:options) {
		if(option.getText().equalsIgnoreCase("india")) {
			
			option.click();
			break;
			
		}

	
	
	}
	}
	
}

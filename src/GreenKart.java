import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMAAN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
	
		Thread.sleep(3000);
		String[] items = { "Cucumber", "Brocolli" ,"Beetroot"};
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		int j = 0;
		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			String fm = name[0].trim();

			List itemsList = Arrays.asList(items);
			if (itemsList.contains(fm))
				{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				}
			
			if (j==items.length) {
				break;}
		}

		
	}

}

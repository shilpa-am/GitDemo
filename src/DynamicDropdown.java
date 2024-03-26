import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@data-action-type='DISMISS']")).click();
		// driver.findElement(By.cssSelector("//input[@data-action-type='DISMISS']")).click();
		// driver.switchTo().alert().dismiss();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("case");
		Thread.sleep(1000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='s-suggestion-container']//div"));
		// System.out.println(list.size());

		for (WebElement listItem : list) {
			if (listItem.getText().contains("samsung")) {
				listItem.click();
				break;
			}
		}

		// get price of a item

		List<WebElement> listOfItems = driver
				// .findElements(By.cssSelector(".AdHolder.sg-col.s-widget-spacing-small h2
				// span"));
				.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

		System.out.println(listOfItems.size());

		// Actions act = new Actions(driver);

		for (WebElement listOfOneitem : listOfItems) {
			if (listOfOneitem.getText().contains("SPIDERCASE")) {
				System.out.println(listOfOneitem.getText());
				listOfOneitem.click();

				break;
			}
		}
		System.out.println(driver.findElement(By.xpath("//td[@class='a-span12']/span[1]")).getText());
		driver.close();
	}

}

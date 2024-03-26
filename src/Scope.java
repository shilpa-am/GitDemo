import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		WebElement firstColumnDriver = driver.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul"));
		System.out.println(firstColumnDriver.findElements(By.tagName("a")).size());

		for (int i = 1; i < firstColumnDriver.findElements(By.tagName("a")).size(); i++) {
			String clickOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);

			firstColumnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
			// driver.navigate().back();
			Thread.sleep(5000L);
		}
		Set<String> s = driver.getWindowHandles();
		Iterator<String> it = s.iterator();

		while (it.hasNext()) {

			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}

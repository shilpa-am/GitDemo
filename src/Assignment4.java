import org.openqa.selenium.chrome.*;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\Users\\\\\\\\HP\\\\\\\\Downloads\\\\\\\\chromedriver-win64\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		// driver.findElement(By.xpath("//a[contains(text(),'Multiple
		// Windows')]")).click();
		driver.findElement(By.linkText("Multiple Windows")).click();

		// driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		driver.findElement(By.cssSelector("a[href*='windows']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		driver.switchTo().window(childWindow);
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		driver.switchTo().window(parentWindow);
		System.out.println(driver.findElement(By.xpath("//div/div/h3")).getText());

	}

}

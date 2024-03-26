import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\Users\\\\\\\\HP\\\\\\\\Downloads\\\\\\\\chromedriver-win64\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		String year = "2026";
		String month = "1";
		String date = "15";
		String[] expectedResult = { month, date, year };
		d.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(3000));
		d.findElement(By.cssSelector("button.react-date-picker__calendar-button")).click();
		d.findElement(By.cssSelector("button[class='react-calendar__navigation__label']")).click();
		d.findElement(By.cssSelector("span.react-calendar__navigation__label__labelText")).click();
		d.findElement(By.xpath("//button[text()='" + year + "']")).click();
		d.findElement(By.cssSelector(".react-calendar__year-view__months__month")).click();
		d.findElement(By.xpath("//abbr[text()='" + date + "']")).click();
		List<WebElement> l = d.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i).getAttribute("value"));
			String actualResult = l.get(i).getAttribute("value");
			Assert.assertEquals(actualResult, expectedResult[i]);
		}
	}

}

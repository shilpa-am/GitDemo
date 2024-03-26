
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumIntroductions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
		Thread.sleep(3000);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(7000));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement dropDown = driver.findElement(By.cssSelector("select.form-control"));
		Select s = new Select(dropDown);
		// s.selectByIndex(0);
		s.selectByValue("consult");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), 'Checkout ( 0 )')]")));

		List<WebElement> l = driver.findElements(By.xpath("//button[contains(text(),'Add')]"));
		for (int i = 0; i < l.size(); i++) {
			l.get(i).click();
		}

		driver.findElement(By.xpath("//a[contains(text(), 'Checkout')]")).click();
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement mousehover = driver.findElement(By.cssSelector("span[id='nav-link-accountList-nav-line-1']"));
		a.moveToElement(mousehover).contextClick().build().perform();
		WebElement move = driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(move).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		

	}

}

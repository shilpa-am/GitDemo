import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class relativeLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		WebElement dateLabel = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(with(By.cssSelector("[name='bday']")).below(dateLabel)).click();

		WebElement text = driver.findElement(By.cssSelector("[for ='exampleCheck1']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(text)).click();
		WebElement rdbtn = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdbtn)).getText());
	}

}

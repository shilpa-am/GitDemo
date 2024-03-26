import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		List<WebElement> list = driver.findElements(By.cssSelector(".table-display tr"));
		int numOfColumns = list.size();
		System.out.println(numOfColumns);

		WebElement w = driver.findElement(By.id("product"));
		int columnsCount = w.findElements(By.tagName("tr")).size();
		int rowsCount = w.findElements(By.cssSelector(".table-display th")).size();
		System.out.println(columnsCount);
		System.out.println(rowsCount);
		List<WebElement> p = w.findElements(By.cssSelector(".table-display tr:nth-child(3)"));
		for (int i = 0; i < p.size(); i++) {
			System.out.println(p.get(i).getText());
		}

	}

}

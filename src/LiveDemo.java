import static org.testng.Assert.assertFalse;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LiveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> list = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> originalList = list.stream().map(s -> s.getText()).collect(Collectors.toList());
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(originalList.equals(sortedList));
		List<String> price;
		do {
			List<WebElement> list1 = driver.findElements(By.xpath("//tr/td[1]"));
			price = list1.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPriceVeggie(s))
					.collect(Collectors.toList());
			price.forEach(a -> System.out.println(a));
			if (price.size() < 1) {
				driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			}
		} while (price.size() < 1);
	}

	private static String getPriceVeggie(WebElement s) {
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();

		// TODO Auto-generated method stub
		return priceValue;
	}

}

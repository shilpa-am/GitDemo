import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.Assert;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ScrollingJavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\Users\\\\\\\\HP\\\\\\\\Downloads\\\\\\\\chromedriver-win64\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0,500)");
		// Thread.sleep(2000);
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=300");
		List<WebElement> l = d.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum = 0;
		for (int i = 0; i < l.size(); i++) {
			// System.out.println(l.get(i).getText());
			sum = sum + Integer.parseInt(l.get(i).getText());
		}
		// System.out.println(sum);
		// System.out.println(d.findElement(By.cssSelector(".totalAmount")).getText());
		String s = d.findElement(By.cssSelector(".totalAmount")).getText().split(" ")[3];
		// System.out.println(Integer.parseInt(s));
		int q = Integer.parseInt(s);
		Assert.assertEquals(q, sum);
		int sum1 = 0;
		List<WebElement> list = d.findElements(By.cssSelector(".table-display td:nth-child(3)"));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			sum1 = sum1 + Integer.parseInt(list.get(i).getText());

		}
		System.out.println(sum1);

	}

}

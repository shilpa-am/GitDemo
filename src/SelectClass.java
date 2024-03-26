import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.name("country"));
		Select sel = new Select(dropdown);
		sel.selectByIndex(5);
		sel.selectByValue("BAHAMAS");
		sel.selectByVisibleText("ANTIGUA AND BARBUDA");
		// ONLY for MULTI SELECT DROPDOWN
		// sel.deselectAll();
		// sel.deselectByIndex(1);
		// sel.deselectByValue(null);
		// sel.deselectByIndex(0);
		// sel.getAllSelectedOptions();
		// sel.isMultiple();
		// sel.equals(dropdown);
		WebElement o = sel.getFirstSelectedOption();
		String s = o.getText();
		// System.out.println(s);
		List<WebElement> l = sel.getOptions();
		String string = l.get(0).getText();
		//System.out.println(string);
		String newString =sel.toString();
		System.out.println(newString);

	}

}

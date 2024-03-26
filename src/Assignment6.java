import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		String option = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();

		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(dropdown);
		s.selectByVisibleText(option);
		driver.findElement(By.id("name")).sendKeys(option);
		driver.findElement(By.id("alertbtn")).click();
		// driver.switchTo().alert().getText();
		String alertText = driver.switchTo().alert().getText();
		if (alertText.contains(option)) {
			System.out.println("Alert message success");
		} else {
			System.out.println("failed");
		}

	}

}

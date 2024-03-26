import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href*='nested']")).click();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.id("content")).getText());
		
		
		
		
		//WebElement topFrame = driver.findElement(By.name("frame-top"));
		//driver.switchTo().frame(0);
		//driver.switchTo().frame(topFrame);
		//WebElement middelFrame = driver.findElement(By.name("frame-middle"));
		//driver.switchTo().frame(middelFrame);
		//System.out.println(driver.findElement(By.name("frame-middle")).getText());
		
		
		
	}

}

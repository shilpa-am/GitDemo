import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.collect.ImmutableBiMap.Builder;

public class SelectClassPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement d = driver.findElement(By.cssSelector("span.context-menu-one"));
		Actions act = new Actions(driver);
		act.contextClick(d).perform();
		WebElement menuOptions = driver.findElement(By.cssSelector("li.context-menu-icon-edit"));
		menuOptions.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		WebElement doubleClickButton = driver.findElement(By.cssSelector("button[ondblclick='myFunction()']"));
		act.doubleClick(doubleClickButton).perform();
		driver.switchTo().alert().accept();
		// Click and Hold
		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		WebElement clickAndHold = driver.findElement(By.id("clickable"));
		act.clickAndHold(clickAndHold).perform();

		// draganddrop by src and target
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		act.dragAndDrop(drag, drop).perform();
		// drag and drop by offset
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement dragObject = driver.findElement(By.id("draggable"));
		act.dragAndDropBy(dragObject, 150, 30).build().perform();

	}

}

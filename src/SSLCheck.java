import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		// Block pop-up windows
		options.setAcceptInsecureCerts(true);
		options.setExperimentalOption("exclude switches", Arrays.asList("disable-popup-blocking"));
		// Add the WebDriver proxy capability.
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:44444");
		options.setCapability("proxy", proxy);

		// Set download directory
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "/directory/path");
		options.setExperimentalOption("prefs", prefs);
		// FirefoxOptions options1 = new FirefoxOptions();
		// EdgeOptions options2 = new EdgeOptions();

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		// WebDriver driver = new GeckoDriver(options1);
		// WebDriver driver = new EdgeDriver(options2);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());

	}

}

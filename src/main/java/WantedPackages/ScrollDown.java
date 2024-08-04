package WantedPackages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		// declaration and instantiation of objects/variables
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\mounika_narayanappa\\eclipse-workspace\\SeleniumMounika\\newproject\\drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		// ChromeOptions options = new ChromeOptions();
		// options.setBinary("C:\\Softwares\\Automaton\\chromewebBrowser-win64\\chrome.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vanhusen.mp2912.repoproqa.org/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		String s = driver.getTitle();
		Thread.sleep(7000);
		System.out.println(s);		
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(3));
			driver.findElement(By.xpath("//p[text()=\"Log In\"]")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(3));
			
			driver.findElement(By.xpath("//input[@placeholder='Enter email']")).sendKeys("mounika_narayanappa@thbs.com");
            //WebElement username = driver.findElement(By.name("username"));
			driver.findElement(By.name("password")).sendKeys("ThbsThbs123!");
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
			//WebElement checkbox = driver.findElement(By.name("customCheckbox"));
			//checkbox.click();
			WebElement Loginbutton = driver.findElement(By.id("kc-login"));
			Loginbutton.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(3));
			Thread.sleep(5000);
			WebElement Hover = driver.findElement(By.xpath("(//*[local-name()='svg'])[6]"));
			Hover.click();
			Thread.sleep(8000);
			WebElement address = driver.findElement(By.xpath("//a[contains(@href,'/customerAddress')]"));
			address.click();
			Thread.sleep(8000);
			driver.findElement(By.xpath("//button[text()='Add Address']")).click();
			Thread.sleep(8000);
			driver.findElement(By.xpath("//span[text()='Locality']//following::input")).sendKeys("Bengaluru");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div//span[text()='Select']//following::div")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][text()='India']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div//span[text()='State']//following::div")).click();
			Thread.sleep(3000);
			//Goto Dropdown element
			WebElement dropdownElement = driver.findElement(By.xpath("//div//span[text()='State']//following::div"));
			Select dropdown = new Select(dropdownElement);
			// Select by visible text
	        dropdown.selectByVisibleText("Karnataka");
			
		} catch (Exception e) {
			System.out.println(e);
		}

//driver.quit();

	}

}
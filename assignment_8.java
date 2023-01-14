package mukesh_assignment8;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println("Task 1");
		String url = driver.getPageSource();
		boolean contains = url.contains("Facebook helps you connect and share with the people in your life");
		System.out.println(contains);
		System.out.println(
				"======================================================================================================================================");

		System.out.println("Task 2");
		List<WebElement> page = driver
				.findElements(By.xpath("//*[@class=\"uiList pageFooterLinkList _509- _4ki _703 _6-i\"]//a"));
		for (int i = 0; i < page.size(); i++) {
			WebElement ele = page.get(i);
			String str = ele.getText();
			System.out.println("visible text = "+str);
			if (str.equalsIgnoreCase("Create Page")) {
				ele.click();
				break;
			}
		}
		System.out.println(
				"======================================================================================================================================");
		System.out.println("Task 3");
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		driver.findElement(By.xpath("//*[@name=\"firstname\"]")).sendKeys("aaaaa");
		driver.findElement(By.xpath("//*[@name=\"lastname\"]")).sendKeys("aaaaa");
		driver.findElement(By.xpath("//*[@aria-label=\"Mobile number or email address\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@aria-label=\"New password\"]")).sendKeys("aaaaa");
		
		driver.findElement(By.xpath("//*[@name=\"sex\"][@value=\"1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"day\"]//option[@value=\"1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"month\"]//option[@value=\"1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"year\"]//option[@value=\"2000\"]")).click();
		
		driver.findElement(By.xpath("//*[@class=\"_6j mvm _6wk _6wl _58mi _3ma _6o _6v\"]")).click();
		
		System.out.println(
				"======================================================================================================================================");
		System.out.println("Task 4");
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		driver.findElement(By.cssSelector("input[class=\"inputtext _58mg _5dba _2ph-\"]")).sendKeys("aaaaa");
		driver.findElement(By.cssSelector("input[name=\"lastname\"]")).sendKeys("aaaaa");
		driver.findElement(By.cssSelector("input[aria-label=\"Mobile number or email address\"]")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[aria-label=\"New password\"]")).sendKeys("aaaaa");
		
		driver.findElement(By.cssSelector("input[name=\"sex\"][value=\"1\"]")).click();
		driver.findElement(By.cssSelector("select[id=\"day\"]>option[value=\"5\"]")).click();
		driver.findElement(By.cssSelector("select[id=\"month\"]>option[value=\"7\"]")).click();
		driver.findElement(By.cssSelector("select[id=\"year\"]>option[value=\"1990\"]")).click();
		
		driver.findElement(By.cssSelector("button[name=\"websubmit\"]")).click();
		
		System.out.println(
				"======================================================================================================================================");
		
		

	}

}

package APQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question8 {
public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://techfios.com/test/101/");
		
		
		driver.findElement(By.partialLinkText("FunctionWhite")).click();
		
		
		
		
		Thread.sleep(5000);
		
		driver.close();

}

}

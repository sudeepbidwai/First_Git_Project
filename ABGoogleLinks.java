package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ABGoogleLinks {
	WebDriver driver;
	
  @Test
  public void printAllGoogleLinkAndPrintURL() {
	  driver.get("http://www.google.com");
	  List<WebElement> allGoogleLinks= driver.findElements(By.tagName("a"));
	  
	  for(WebElement element:allGoogleLinks)
	  {
		  System.out.println(element.getText() + " : "+ element.getAttribute("href"));
	  }
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("I am inside before method");
	  
	  System.setProperty("webdriver.chrome.driver", "test\\\\resources\\\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}

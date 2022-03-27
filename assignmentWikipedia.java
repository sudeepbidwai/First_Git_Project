package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class assignmentWikipedia {
	
	WebDriver driver;
	
  @Test
  public void atestTtile() throws InterruptedException {
	  
	  driver.get("https://en.wikipedia.org/wiki/Main_Page");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.id("searchInput")).sendKeys("Selenium");
	  driver.findElement(By.id("searchButton")).click();
	  
	  String actualTital = driver.getTitle();
	  String expectedTitle = "Selenium - Wikipedia";
	  
	  assertEquals(actualTital, expectedTitle);
	 
  }
  
  @Test
  public void btestHeading() throws InterruptedException {
	  
	  Thread.sleep(3000);
	  String actualHeading= driver.findElement(By.xpath("//*[@id=\"firstHeading\"]")).getText();
	  System.out.println("Heading of page is : "+actualHeading);
	  String expectedHeading = "Selenium";
	  assertEquals(actualHeading, expectedHeading);
	 
  }
  
  @BeforeClass
	public void beforeClass() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "test\\resources\\\\chromedriver.exe");
	  driver = new ChromeDriver();
  }

  @AfterClass
  public void afterMethod() {
	  
	 driver.quit();
  }

}

package scripts;
//Addedd for test
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooLogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "test\\\\resources\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-IN&.intl=in&.done=https%3A%2F%2Fin.mail.yahoo.com%2Fd%2Ffolders%2F1%3Fguce_referrer%3DaHR0cHM6Ly9sb2dpbi55YWhvby5jb20v%26guce_referrer_sig%3DAQAAACYrYUsIrOQ_PgXac_k0XcMi9GnyW5Xhoixqlcluc6gjSv0XfV62CGQEbK8Q02ORXgz_LIS52rm_xhU-n6tfRFG_2h8d9eES6QWiLetQPUVxy4DXW4rTVYECjSeAbFY0EH-YTxRkBkPNyMRnwE9Mb_YiFYNRMmOKBNUw_EigAHTx");
		driver.manage().window().maximize();

		driver.findElement(By.name("username")).sendKeys("test_sudeep");
		//Updated comment
		// driver.findElement(By.name("persistent")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("signin")).click();
		Thread.sleep(3000);

		driver.findElement(By.name("password")).sendKeys("Laptop@123");
		driver.findElement(By.name("verifyPassword")).click();
		Thread.sleep(2000);

		String actualTital = driver.getTitle();
		String expectedTitle = "(1 unread) - test_sudeep@yahoo.com - Yahoo Mail";

		if (expectedTitle.equals(actualTital)) {
			System.out.println("Test Case Passed ..!!");
		}

		else {
			System.out.println("Test Case Failed ..!!");
		}
		

	}

}

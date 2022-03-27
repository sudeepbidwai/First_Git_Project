package scripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

//import pageobjectiteration3.NtLoginPage;

public class YahooComposePo extends LoadableComponent<YahooComposePo> {
	WebDriver driver;
	private String pageTitle = "barahatesagar786@yahoo.com - Yahoo Mail";

	@FindBy(xpath = "//a[@data-test-id='compose-button']")
	private WebElement composeButton;

	@FindBy(id = "message-to-field")
	private WebElement messegeToField;

	@FindBy(xpath = "//input[@data-test-id='compose-subject']")
	private WebElement subjectField;

	@FindBy(xpath = "//div[@data-test-id='rte']")
	private WebElement bodyField;

	@FindBy(xpath = "//button[@data-test-id='compose-send-button']")
	private WebElement sendButton;

	public YahooComposePo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		get();
	}

	public YahooComposePo goToComposeButton() {
		composeButton.click();
		return this;
	}

	public YahooComposePo goTomessegeField(String messege) {
		messegeToField.sendKeys(messege);
		return this;
	}

	public YahooComposePo goToSubjectField(String subject) {
		subjectField.sendKeys(subject);
		return this;
	}

	public YahooComposePo goToBodyField(String body) {
		bodyField.sendKeys(body);
		return this;
	}

	public YahooComposePo goToSendButton() {
		sendButton.click();
		return this;
	}

	@Override
	protected void isLoaded() throws Error {
		assertEquals(driver.getTitle(), pageTitle);

	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub

	}

}

package pages;

import java.awt.AWTException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import config.Utils;

public class SliderPage extends BasePage {
	public SliderPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(.,'Widgets')]")
	private WebElement widgets;

	@FindBy(xpath = "//a[contains(.,'Slider')]")
	private WebElement slider;

	@FindBy(xpath = "//div[@id='slider']//a[1]")
	private WebElement slide;

	// METHOD
	public void menuSelect() throws InterruptedException {
		widgets.click();
		slider.click();
		Thread.sleep(2000);
	}

	public void escape() throws AWTException, InterruptedException {
		Utils.escapeAd();
	}

	public void clickSliderBar() {
		WebElement slider = slide;
		Actions move = new Actions(driver);
		org.openqa.selenium.interactions.Action action = move.dragAndDropBy(slider, 275, 0).build();
		action.perform();

	}
}

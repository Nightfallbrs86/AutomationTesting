package pages;

import java.awt.AWTException;
import java.awt.Robot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import config.Utils;

public class FramesPage extends BasePage{
	public FramesPage() {
		PageFactory.initElements(driver, this);
	}
	
	// MENU
	@FindBy(xpath = "//a[contains(.,'SwitchTo')]")
	private WebElement switchTo;
	
	@FindBy(xpath ="//a[contains(.,'Frames')]" )
	private WebElement frames;
		
	//FRAME
	@FindBy(xpath = "(//a[@class='analystic'])[2]")
	private WebElement iFrameInIFrame;
	
	// METHOD
	public void menuSelect() throws InterruptedException{
		switchTo.click();
		frames.click();
		Thread.sleep(1500);
	}
	
	public void clickFrames() throws AWTException, InterruptedException {
		Utils.escapeAd();
    }
	
	public void clickIframeWithInAnIframe(){
        iFrameInIFrame.click();
	}

    public FramesPage inputTextFrame() throws AWTException, InterruptedException {
        Thread.sleep(5000);
        Robot robot = new Robot();
        Utils.keyPress(1, robot);

        return this;
    }
}

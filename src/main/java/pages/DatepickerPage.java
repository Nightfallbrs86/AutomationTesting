package pages;

import java.awt.AWTException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import config.Utils;

public class DatepickerPage extends BasePage {
	public DatepickerPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(.,'Widgets')]")
	private WebElement widgets;
	
	@FindBy(xpath = "//a[contains(.,'Datepicker')]")
	private WebElement datepicker;
	
	@FindBy(id = "datepicker2")
	private WebElement birth;
	
	@FindBy(id = "datepicker1")
	private WebElement birth1;
	
	@FindBy(xpath = "//span[text()='Prev']")
	private WebElement prev;
	
	@FindBy(xpath = "//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[3]/a")
	private WebElement date;
	
	// METHOD
	public void menuSelect() throws InterruptedException{
        widgets.click();
        datepicker.click();
        Thread.sleep(1500);
    }
	
	public void escape() throws AWTException, InterruptedException{
		Utils.escapeAd();
	}

	public void insertBirthdayDate(String birthday){
	        birth.sendKeys(birthday);
	    }
	
	public void insertSecondDate() throws InterruptedException {
        birth1.click();
        for(int i = 0; i < 423; i++)
        prev.click();
        Thread.sleep(2000);
        date.click();
    }
}


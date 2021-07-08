package runner;

import java.awt.AWTException;
import org.junit.Test;
import pages.DatepickerPage;
import pages.FramesPage;
import pages.RegisterPage;
import pages.SliderPage;

public class Runner extends Hooks {
	

	private RegisterPage register = new RegisterPage();
	private FramesPage iframes = new FramesPage();
	private DatepickerPage datepicker = new DatepickerPage();
	private SliderPage slider = new SliderPage();

	@Test
	public void deveInserirDadosPessoais() throws InterruptedException {
		register.insertText("Bruno", "Simões", "Lagoa Cajuba", "brunorabelosimoes@gmail.com", "9999999999");
		register.selectGender();
		register.selectHobbies();
		register.validateLanguages();
		register.selectSkills();
		register.selectCountries("Brazil", "United States of America");
		register.selectDate("1986", "April", "15");
		register.insertPassword("Br1234", "Br1234");
		register.insertPhoto();
		register.clickSubmit();
		
	}
	
	@Test
	public void deveEscreverFrame() throws AWTException, InterruptedException{
		iframes.menuSelect();
		iframes.clickFrames();
		iframes.clickIframeWithInAnIframe();
		iframes.inputTextFrame();
		
	}
	
	@Test
	public void deveInserirDatasNascimento() throws AWTException, InterruptedException{
		datepicker.menuSelect();
		datepicker.escape();
		datepicker.insertBirthdayDate("04/15/1986");
		datepicker.insertSecondDate();
		
	}
	
	@Test
	public void deveMoverSlide() throws AWTException, InterruptedException{
		slider.menuSelect();
		slider.escape();
		slider.clickSliderBar();
				
	}
	
	
}

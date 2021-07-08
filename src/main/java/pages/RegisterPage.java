package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BasePage {
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	// TEXT
	@FindBy(xpath = "//input[contains(@placeholder,'First Name')]")
	private WebElement firstName;

	@FindBy(xpath = "//input[contains(@placeholder,'Last Name')]")
	private WebElement lastName;

	@FindBy(xpath = "//textarea[@ng-model='Adress']")
	private WebElement address;

	@FindBy(xpath = "//input[contains(@type,'email')]")
	private WebElement email;

	@FindBy(xpath = "//input[contains(@type,'tel')]")
	private WebElement phone;
	
	@FindBy(xpath = "//label[contains(.,'Languages')]")
	private WebElement languages;

	// RADIO BUTTON
	@FindBy(xpath = "//input[@value='Male']")
	private WebElement gender;
	
	// CHECKBOX
	@FindBy(id = "checkbox2")
	private WebElement hobbies;
	
	// SELECT
	@FindBy(id = "Skills")
	private WebElement skills;

	@FindBy(id = "countries")
	private WebElement country;
	
	@FindBy(xpath = "//span[contains(@role,'combobox')]")
	private WebElement selectCountry;
	
	@FindBy (id = "country")
	private WebElement selectCountry1;
	
	@FindBy(id = "yearbox")
	private WebElement year;

	@FindBy (xpath = "//select[contains(@placeholder,'Month')]")
	private WebElement month;

	@FindBy(id = "daybox")
	private WebElement day;

	@FindBy(id = "firstpassword")
	private WebElement password;

	@FindBy(id = "secondpassword")
	private WebElement confirmPassword;

	//BUTTON
	@FindBy(id = "submitbtn")
	private WebElement submit;
	
	// METHOD
	public void insertText(String nome, String sobrenome, String endereco, String email1, String telefone){
		firstName.sendKeys(nome);
		lastName.sendKeys(sobrenome);
		address.sendKeys(endereco);
		email.sendKeys(email1);
		phone.sendKeys(telefone);
		
	}
	
	public void selectGender(){
		gender.click();
	}
	
	public void selectHobbies(){
		hobbies.click();
	}
	
	public void validateLanguages(){
		Assert.assertEquals(languages, driver.findElement(By.xpath("//label[contains(.,'Languages')]")) );
		
	}
	
	public void selectSkills(){
		selecionarPorTexto(skills,"Implementation" );
					
	}
	
	public void selectCountries(String pais, String selecionarPais) throws InterruptedException{
		selecionarPorTexto(country, pais);
		selecionarPorValue(selectCountry1, selecionarPais);
	
	}
	
	public void selectDate(String ano, String mes, String dia){
		selecionarPorValue(year, ano);
		selecionarPorValue(month, mes);
		selecionarPorValue(day, dia);
	}
	
	public void insertPassword(String senha,String confirmar){
		password.sendKeys(senha);
		confirmPassword.sendKeys(confirmar);
		
	}
	
	public void insertPhoto (){
		String filePath = System.getProperty("user.dir") + "/src/test/resources/files/work.jpg";
		driver.findElement(By.id("imagesrc")).sendKeys(filePath); 
	}
	
	public void clickSubmit(){
		submit.click();
	}
}

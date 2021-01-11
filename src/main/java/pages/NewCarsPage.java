package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class NewCarsPage extends BasePage {

	public NewCarsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(linkText = "Hyundai")
	private WebElement hyundai;

	@FindBy(linkText = "Maruti Suzuki")
	private WebElement maruti;

	@FindBy(linkText = "Toyota")
	private WebElement toyota;

	@FindBy(linkText = "Kia")
	private WebElement kia;

	public void selectHyundaicar() {

		hyundai.click();
		car.getCarTitile();
	}

	public void selectMaruticar() {

		maruti.click();
	}

	public void selectToyotacar() {
		
		toyota.click();
	}

	public void selectKiacar() {
			
		kia.click();
	}
}

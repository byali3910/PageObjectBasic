package testcases;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BasePage;
import base.Testbase;
import pages.HomePage;
import utilities.DataUtil;

public class CarPriceTest extends Testbase{

	@Test(dataProviderClass=DataUtil.class, dataProvider="getData")
	public void findCarTest(String brandName, String browserName) throws InterruptedException {
		
		setUp(browserName);
		if(brandName.equals("Hyundai"))
		{
			Assert.fail();
			HomePage home = new HomePage(driver);
			home.findNewCar().selectHyundaicar();
			Assert.assertTrue(BasePage.car.getCarTitile().contains(brandName));
			BasePage.car.getCarNameandPrice();
			BasePage.car.updateCarNameandPrice(brandName);
			
		}else if(brandName.equals("Kia"))
		{
			HomePage home = new HomePage(driver);
			home.findNewCar().selectKiacar();
			Assert.assertTrue(BasePage.car.getCarTitile().contains(brandName));
			BasePage.car.getCarNameandPrice();
			BasePage.car.updateCarNameandPrice(brandName);

			
		}else if(brandName.equals("Toyota"))
		{
			HomePage home = new HomePage(driver);
			home.findNewCar().selectToyotacar();
			Assert.assertTrue(BasePage.car.getCarTitile().contains(brandName));
			BasePage.car.getCarNameandPrice();
			BasePage.car.updateCarNameandPrice(brandName);

			
		}else if(brandName.equals("Maruti"))
		{
			HomePage home = new HomePage(driver);
			home.findNewCar().selectMaruticar();
			Assert.assertTrue(BasePage.car.getCarTitile().contains(brandName));			
			BasePage.car.getCarNameandPrice();
			BasePage.car.updateCarNameandPrice(brandName);

		}
		
		
		Thread.sleep(2000);
	}
}

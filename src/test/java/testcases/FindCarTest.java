package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.DataUtil;

import base.BasePage;
import base.Testbase;
import pages.HomePage;

public class FindCarTest extends Testbase{

	@Test(dataProviderClass=DataUtil.class, dataProvider="getData")
	public void findCarTest(String brandName, String browserName) throws InterruptedException {
		
		setUp(browserName);
		if(brandName.equals("Hyundai"))
		{
			HomePage home = new HomePage(driver);
			home.findNewCar().selectHyundaicar();
			Assert.assertTrue(BasePage.car.getCarTitile().contains(brandName));
			
		}else if(brandName.equals("Kia"))
		{
			HomePage home = new HomePage(driver);
			home.findNewCar().selectKiacar();
			Assert.assertTrue(BasePage.car.getCarTitile().contains(brandName));

			
		}else if(brandName.equals("Toyota"))
		{
			HomePage home = new HomePage(driver);
			home.findNewCar().selectToyotacar();
			Assert.assertTrue(BasePage.car.getCarTitile().contains(brandName));

			
		}else if(brandName.equals("Maruti"))
		{
			HomePage home = new HomePage(driver);
			home.findNewCar().selectMaruticar();
			Assert.assertTrue(BasePage.car.getCarTitile().contains(brandName));
			
		}
		
		
		Thread.sleep(5000);
	}
}

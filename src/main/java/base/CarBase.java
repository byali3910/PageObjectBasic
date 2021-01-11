package base;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarBase {

	WebDriver driver;

	public CarBase(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/h1")
	public WebElement carTitle;

	public String getCarTitile() {

		return carTitle.getText();
	}

	public void getCarBrandName() {

		
	}

	@FindBy(xpath = "//ul/li/div/div/div/div[2]/span[1]")
	public List<WebElement> carPrice;

	@FindBy(xpath = "//div[2]/div[3]/div[1]/ul/li/div/div/div/a/h3")
	public List<WebElement> carName;

	public ArrayList<String> list = new ArrayList<String>();

	public void getCarNameandPrice() {

		for (int i = 0; i < carPrice.size(); i++) {
			String text = carName.get(i).getText() + " Price is : " + carPrice.get(i).getText();
			list.add(text);
			System.out.println(text);

		}

		for (String li : list) {
			System.out.println(li);
		}
	}

	public void updateCarNameandPrice(String fileName) {

		String info = fileName + "car brand name and price\n";
		File file = new File(fileName);

		FileWriter fw;
		try {
			fw = new FileWriter(file, true);

			fw.write(info);
			String lineSeparator = System.getProperty("line.separator");

			for (int i = 0; i < list.size(); i++) {
				fw.write(list.get(i));
				fw.write(lineSeparator);
			}

			fw.flush();
			fw.close();
			FileUtils.copyFile(file, new File(".//carprice//" + fileName + ".txt"));
			FileUtils.deleteQuietly(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

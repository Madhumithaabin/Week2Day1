package Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelaniumLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement login = driver.findElement(By.id("username"));
		login.sendKeys("demosalesmanager");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");

		WebElement login1 = driver.findElement(By.className("decorativeSubmit"));
		login1.click();

		WebElement link = driver.findElement(By.linkText("CRM/SFA"));
		link.click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Madhumitha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Murugan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Madhu");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Software Engineer");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tester");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("350000");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("45c");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Testing");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Only for testing purpose");
		driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("456");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Mitha");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("06/02/1996");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Information Technology");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("5700");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("lion");
		WebElement countrycode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countrycode.clear();
		countrycode.sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("90");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("madhumithajessi@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Priya");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9840625751");
		driver.findElement(By.id("createLeadForm_primaryWebUrl"))
				.sendKeys("http://leaftaps.com/opentaps/control/login");

		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Madhumitha Murugan");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("3,RP road");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Tamil Nadu");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600064");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("55");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Selenium");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Chromepet");
		driver.findElement(By.className("smallSubmit")).click();

	}

}

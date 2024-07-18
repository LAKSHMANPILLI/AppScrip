package com.qe.project.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.qe.project.base.TestBase;

public class LumaApplication extends TestBase {

	@FindBy(xpath = "//span[text()='Gear']")
	WebElement Gear;

	@FindBy(xpath = "//a[@id='ui-id-25']/span")
	WebElement Bag;

	@FindBy(xpath = "//span[@class='base']")
	WebElement BagsText;
	@FindBy(xpath = "//a[@class='product-item-link']")
	List<WebElement> ListOfProducts;

	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[5]/div/div/strong/a")
	WebElement ProductBag;

	@FindBy(xpath  = "//*[@id=\"qty\"]")
	WebElement Quantity;
	@FindBy(xpath = "//button[@id='product-addtocart-button']/span")
	WebElement AddtoKart;
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='My Cart'])[1]/following::span[2]")
	WebElement AddToKartIcon;
	@FindBy(xpath = "//div[@id='minicart-content-wrapper']/div[2]/div[5]/div/a/span")
	WebElement VeiwEditKart;

	@FindBy(xpath = "editing-view-port")
	WebElement EditQuantity;
	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li[1]/button")
	WebElement ProccedCheckOut;
	@FindBy(xpath = "(//*[@id=\"customer-email\"])[1]")
	WebElement EnterEmail;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[3]")
	WebElement closeIcon ;
	@FindBy(xpath = "(//input[@class='input-text'])[4]")
	WebElement FirstName ;
	@FindBy(xpath = "(//input[@class='input-text'])[5]")
	WebElement LasttName;
	@FindBy(xpath = "(//input[@class='input-text'])[7]")
	WebElement Address;
	@FindBy(xpath = "(//input[@class='input-text'])[10]")
	WebElement City;
	
	
	@FindBy(xpath = "(//select[@class='select'])[1]")
	WebElement StateProvince;
	@FindBy(xpath = "(//input[@class='input-text'])[12]")
	WebElement PinCode ;
	@FindBy(xpath = "(//select[@class='select'])[2]")
	WebElement Country;
	@FindBy(xpath = "(//input[@class='input-text'])[13]")
	WebElement PhoneNo;
	@FindBy(xpath = "//span[text()='Next']")
	WebElement NextEnd;
	@FindBy(xpath = "//span[text()='Place Order']/parent::button")
	WebElement PlaceOrder;
	

	public LumaApplication() {
		PageFactory.initElements(driver, this);
	}

	public void Gear() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(Gear).perform();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement bagElement = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='ui-id-25']/span")));
		actions.moveToElement(bagElement).click().perform();
	}

	public void productBagClick() throws InterruptedException {
		Thread.sleep(2000);
		String text = BagsText.getText();
		System.out.println("BagsTextVerification verifiyed   " + text);// BagsTextVerification
		Assert.assertEquals(text, "Bags");
		int selectOptionTextsSize = ListOfProducts.size();
		for (int i = 1; i < selectOptionTextsSize; i++) {
			String selectOptionText = ListOfProducts.get(i).getText();// LIST OF ALL PRODUCTS PRINTED IN CONSOLE
			System.out.println(selectOptionText);
		}
		ProductBag.click();
	}

	public void quantity() throws InterruptedException {

		 WebDriverWait wait = new WebDriverWait(driver, 10);
	        
		 WebElement quantityElement = wait.until(ExpectedConditions.visibilityOf(Quantity));
	        wait.until(ExpectedConditions.elementToBeClickable(quantityElement));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", quantityElement);
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", quantityElement);
		//Thread.sleep(5000);
		//Quantity.click();
		Thread.sleep(1000);
		Quantity.clear();
		Thread.sleep(1000);
		Quantity.sendKeys("5");
	}

	public void addToKart() throws InterruptedException {
		Thread.sleep(1000);
		AddtoKart.click();
	}

	public void addToKartIcon() throws InterruptedException {

		 WebDriverWait wait = new WebDriverWait(driver, 10);
	        
	        // Wait for the Quantity element to be clickable
	        wait.until(ExpectedConditions.elementToBeClickable(AddToKartIcon));
		Thread.sleep(2000);
		AddToKartIcon.click();
	}

	public void veiwEditKart() throws InterruptedException {

		Thread.sleep(1000);
		VeiwEditKart.click();
	}

	public void editQuantity() throws InterruptedException {

		Thread.sleep(1000);
		EditQuantity.click();
		Thread.sleep(1000);
		EditQuantity.clear();
		Thread.sleep(1000);
		EditQuantity.sendKeys("4");
	}

	public void proccedCheckOut() throws InterruptedException {
		JavascriptExecutor j=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(0,750)");
		WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(ProccedCheckOut));
	Thread.sleep(2000);
	ProccedCheckOut.click();
	}

	public void enterEmail() throws InterruptedException {
		Thread.sleep(1000);
		EnterEmail.click();
		EnterEmail.sendKeys("test@yopmail.com");
	}
	
	
	
	
	public void firstName() throws InterruptedException {
		JavascriptExecutor j=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(0,450)");
		Thread.sleep(1000);
		FirstName.click();
		Thread.sleep(1000);
		FirstName.sendKeys("Lakshman");
	}

	public void lasttName() throws InterruptedException {
		Thread.sleep(1000);
		LasttName.click();
		Thread.sleep(1000);
		LasttName.sendKeys("Rao");
	}
	public void address() throws InterruptedException {
		Thread.sleep(1000);
		Address.click();
		Thread.sleep(1000);
		Address.sendKeys("BTM");
	}
	public void city() throws InterruptedException {
		Thread.sleep(1000);
		City.click();
		Thread.sleep(1000);
		City.sendKeys("Bengaluru");
	}
	public void stateProvince() throws InterruptedException, AWTException {
		JavascriptExecutor j=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(0,450)");
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(StateProvince));
		Select select = new Select(StateProvince);

        // Select by visible text
        select.selectByIndex(2);
//		StateProvince.click();
//		
//		Robot r1 = new Robot();
//		r1.delay(1000);
//		r1.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
//		r1.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
//		r1.keyPress(KeyEvent.VK_ENTER);
//		//StateProvince.sendKeys("");
	}
	public void pinCode() throws InterruptedException {
		Thread.sleep(1000);
		PinCode.click();
		PinCode.sendKeys("99540");
	}
	public void country() throws InterruptedException, AWTException {
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(Country));
		Select select = new Select(Country);

        // Select by visible text
        select.selectByIndex(3);
//		Country.click();
//		Country.sendKeys("India");
//		Robot r1 = new Robot();
//		r1.delay(1000);
//		r1.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
//		r1.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
//		r1.keyPress(KeyEvent.VK_ENTER);
	}
	public void phoneNo() throws InterruptedException {
		Thread.sleep(1000);
		PhoneNo.click();
		Thread.sleep(1000);
		PhoneNo.sendKeys("9398615827");
	}
	public void NextEnd() throws InterruptedException {
		Thread.sleep(1000);
		NextEnd.click();
		
	}
	public void placeOrder() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("billing-address-details");
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(PlaceOrder));
        Thread.sleep(1000);
		PlaceOrder.click();
		
	}


//
//	public void BCL() throws InterruptedException {
//		Brandcalllog.click();
//		//Brandcalllog.wait(22,20000);		Thread.sleep(2000);
//       driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
//	}

}

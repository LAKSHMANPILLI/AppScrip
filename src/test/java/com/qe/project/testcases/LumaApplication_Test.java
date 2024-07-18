package com.qe.project.testcases;
import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.w3c.dom.events.EventException;

import com.qe.project.base.TestBase;
import com.qe.project.pages.LumaApplication;

public class LumaApplication_Test extends TestBase {

	LumaApplication object1;
	//Excel1 e;
	@BeforeSuite
	public void setUp() throws InterruptedException {

		initialization();
		// login = new Sign_In();
	}

	
	@BeforeTest
	public void Luma() {
		object1=new LumaApplication();
	}
//	@Test(priority = 1)
//	public void TextVerifyd() throws InterruptedException, EventException, IOException {
//	
//		object1.LumaTextVerification();
//	}
	@Test(priority = 1)
	public void Gear() throws InterruptedException, EventException, IOException {
	
		object1.Gear();
	}
	
	@Test(priority = 2)
	public void productClick() throws InterruptedException{
		object1.productBagClick();
	}
	@Test(priority = 3)
	public void quantity() throws InterruptedException{
		object1.quantity();
	}
	@Test(priority = 4)
	public void addToKart() throws InterruptedException{
		object1.addToKart();
	}
	

	@Test(priority = 5)
	public void addToKartIcon() throws InterruptedException{
		object1.addToKartIcon();
	}

	@Test(priority = 6)
	public void veiwEditKart() throws InterruptedException{
		object1.veiwEditKart();
	}

//	@Test(priority = 6)
//	public void editQuantity() throws InterruptedException{
//		object1.editQuantity();
//	}

	@Test(priority = 7)
	public void proccedCheckOut() throws InterruptedException{
		object1.proccedCheckOut();
	}
	@Test(priority = 8)
	public void enterEmail() throws InterruptedException{
		object1.enterEmail();
	}
	
	@Test(priority = 9)
	public void firstName() throws InterruptedException, EventException, IOException {
	
		object1.firstName();
	}
	
	@Test(priority = 10)
	public void lasttName() throws InterruptedException{
		object1.lasttName();
	}
	@Test(priority = 11)
	public void address() throws InterruptedException{
		object1.address();
	}

	@Test(priority = 12)
	public void city() throws InterruptedException{
		object1.city();
	}

	@Test(priority = 13)
	public void stateProvince() throws InterruptedException, AWTException{
		object1.stateProvince();
	}
	@Test(priority = 14)
	public void pinCode() throws InterruptedException, EventException, IOException {
	
		object1.pinCode();
	}
	
	@Test(priority = 15)
	public void country() throws InterruptedException, AWTException{
		object1.country();
	}
	@Test(priority = 16)
	public void phoneNo() throws InterruptedException{
		object1.phoneNo();
	}

	@Test(priority = 17)
	public void NextEnd() throws InterruptedException{
		object1.NextEnd();
	}

	@Test(priority = 18)
	public void placeOrder() throws InterruptedException{
		object1.placeOrder();
	}


	@AfterSuite
	public void tearDown() {
		// driver.quit();

	}
}

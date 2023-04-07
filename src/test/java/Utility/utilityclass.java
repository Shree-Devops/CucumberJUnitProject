package Utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObject.ObjectCreation;

public class utilityclass {

	public WebDriver driver;
	public ObjectCreation obj;
	public DriverInitialization di;
	public genericUtils gu;
	
	public utilityclass() throws IOException {
		di = new DriverInitialization();
		obj= new ObjectCreation(di.initializeDriver());
		gu = new genericUtils(di.initializeDriver());
	}
}

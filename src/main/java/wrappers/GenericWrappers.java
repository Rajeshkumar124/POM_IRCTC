package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers {

	public static RemoteWebDriver driver;
	
	
	public static Properties prop;
	
	public void loadObjects() {
		try {
		prop = new Properties();
			prop.load(new FileInputStream("./src/test/java/object.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void unLoadObjects() {
		prop=null;
	}

	public void invokeApp(String browser, String url) {

		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverSever.exe");
				driver = new InternetExplorerDriver();
			}
			if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
				driver = new EdgeDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//System.out.println("The browser " + browser + " is launched with the url " + url + " successfully");
			reportStep("The browser " + browser + " is launched with the url " + url + " successfully", "pass");
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser " + browser + "not launched with the given url " + url+ " Session Not Created Exception");
			reportStep("The browser " + browser + "not launched with the given url " + url+ " Session Not Created Exception", "fail");
		} catch (InvalidArgumentException e) {
			//System.err.println("The browser " + browser + " not launched with the given url " + url+ " becuase url doesn't contain https");
			reportStep("The browser " + browser + " not launched with the given url " + url+ " becuase url doesn't contain https", "fail");
		} catch (WebDriverException e) {
			//System.err.println("the browser " + browser + " due to unknown error");
			reportStep("the browser " + browser + " due to unknown error", "fail");
		} 
	}

	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("The element with id " + idValue + " enetered with the data " + data);
			reportStep("The element with id " + idValue + " enetered with the data \" + data", "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with id " + idValue + " not found in the DOM");
			reportStep("The element with id " + idValue + " not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with the " + idValue + " is not visible in the DOM");
			reportStep("The element with the " + idValue + " is not visible in the DOM", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with the " + idValue + " is not interactable");
			reportStep("The element with the " + idValue + " is not interactable", "fail");

		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with the id " + idValue+ " not adble to locate becuase it is flashing in the application");
			reportStep("The element with the id " + idValue+ " not adble to locate becuase it is flashing in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with the id " + idValue + " not able to locate due to unknown error");
			reportStep("The element with the id " + idValue + " not able to locate due to unknown error", "fail");
		}
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("The element with the name " + nameValue + " enetered with the data" + data);
			reportStep("The element with the name " + nameValue + " enetered with the data\" + data", "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with name " + nameValue + " is not found in DOM ");
			reportStep("The element with name " + nameValue + " is not found in DOM ", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with name " + nameValue + " is not visible in DOM");
			reportStep("The element with name " + nameValue + " is not visible in DOM", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with the name " + nameValue + " not able to interact");
			reportStep("The element with the name " + nameValue + " not able to interact", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with the name " + nameValue+ " not able to locate because it is not stable in application");
			reportStep("The element with the name " + nameValue+ " not able to locate because it is not stable in application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with the id " + nameValue + " not able to locate due to unknown error");
			reportStep("The element with the id " + nameValue + " not able to locate due to unknown error", "fail");
		} 

	}

	public void enterByXpath(String xpathValue, String data) {
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			//System.out.println("The element with xpath " + xpathValue + " entered with the data" + data);
			reportStep("The element with xpath " + xpathValue + " entered with the data " + data, "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with xpath " + xpathValue + " is not found in DOM");
			reportStep("The element with xpath " + xpathValue + " is not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with xpath " + xpathValue + " is not visible in DOM");
			reportStep("The element with xpath " + xpathValue + " is not visible in DOM", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with xpath " + xpathValue + " is not interactable");
			reportStep("The element with xpath " + xpathValue + " is not interactable", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("the element with xpath " + xpathValue + " is not stable in the application");
			reportStep("the element with xpath " + xpathValue + " is not stable in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with xpath " + xpathValue + " not able to locate due to unknown error");
			reportStep("The element with xpath " + xpathValue + " not able to locate due to unknown error", "fail");
		} 

	}

	public void verifyTitle(String title) {
		try {
			String actualTitle = driver.getTitle();
			if (actualTitle.equals(title)) {
				//System.out.println("The title of the page " + actualTitle + " matched with the expected title" + title);
				reportStep("The title of the page " + actualTitle + " matched with the expected title " + title, "pass");
			} else {
				//System.err.println("The title of the page " + actualTitle + " not matched with the expected title+" + title);
				reportStep("The title of the page " + actualTitle + " not matched with the expected title " + title, "fail");
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The title of the page not able to find due to unknown error");
			reportStep("The title of the page not able to find due to unknown error", "fail");
		} 

	}

	public void verifyTextById(String id, String text) {
		try {
			String actualText = driver.findElementById(id).getText();
			if (actualText.equals(text)) {
				//System.out.println("The text with the id " + actualText + " matches with the expected text" + text);
				reportStep("The text with the id " + actualText + " matches with the expected text " + text, "pass");
			} else {
				//System.err.println("The text with the id " + actualText + " not matched with the expected text" + text);
				reportStep("The text with the id " + actualText + " not matched with the expected text " + text , "fail");
			}
		} catch (NoSuchElementException e) {
			//System.err.println("The text with the id " + id + " not able to found in DOM");
			reportStep("The text with the id " + id + " not able to found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The text with the id " + id + " not visible in the DOM");
			reportStep("The text with the id " + id + " not visible in the DOM", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("the text with the id " + id +  " not interactable");
			reportStep("the text with the id " + id + " not interactable", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The text with the id " + id + " is not stable in application");
			reportStep("The text with the id " + id + " is not stable in application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The text with the id " + id + "not able to found due to unknown error");
			reportStep("The text with the id " + id + " not able to found due to unknown error", "fail");
		} 

	}

	public void verifyTextByXpath(String xpath, String text) {
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			if (actualText.equals(text)) {
				//System.out.println("The text with the xpath " + xpath + " matches with the expected text" + text);
				reportStep("The text with the xpath " + xpath + " matches with the expected text " + text, "pass");
			} else {
				//System.err.println("The text with the xpath " + xpath + " not matches with the expected text " + text);
				reportStep("The text with the xpath " + xpath + " not matches with the expected text " + text, "fail");
			}

		} catch (NoSuchElementException e) {
			//System.err.println("The text with the xpath " + xpath + " not able to found in DOM");
			reportStep("The text with the xpath " + xpath + " not able to found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The text with the xpah " + xpath + " not visible in DOM");
			reportStep("The text with the xpah " + xpath + " not visible in DOM", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The text with the xpath " + xpath + " not able to interactable");
			reportStep("The text with the xpath " + xpath + " not able to interactable", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The text with the xpath " + xpath + " not stable in aplication");
			reportStep("The text with the xpath " + xpath + " not stable in aplication", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The text with the xpath " + xpath + "not found due to unknwon error");
			reportStep("The text with the xpath " + xpath + "not found due to unknwon error", "fail");
		} 
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		try {
			String actulaText = driver.findElementByXPath(xpath).getText();
			if (actulaText.contains(text)) {
				//System.out.println("The Xpath element with the " + xpath + " contains the actual text " + actulaText);
				reportStep("The Xpath element with the " + xpath + " contains the actual text", "pass");
				
			} else {
				//System.err.println("The text with the xpath " + xpath + " not contains actual text " + actulaText);
				reportStep("The text with the xpath " + xpath + " not contains actual text " + actulaText, "fail");
			}
		} catch (NoSuchElementException e) {
			//System.err.println("The text " + text + " with the xpath " + xpath + " not able to found in DOM");
			reportStep("The text " + text + " with the xpath " + xpath + " not able to found in DOM", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The text" + text + " with the xpath " + xpath + " not able to interact");
			reportStep("The text" + text + " with the xpath " + xpath + " not able to interact", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The text " + text + " with the xpath " + xpath + " not stable in the application");
			reportStep("The text " + text + " with the xpath " + xpath + " not stable in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The text " + text + " with the xpath " + xpath + "not able to locate due to unknown error");
			reportStep("The text " + text + " with the xpath " + xpath + "not able to locate due to unknown error", "fail");
		} 

	}

	public void clickById(String id) {
		try {
			driver.findElementById(id).click();
			//System.out.println("The element with the id " + id + "clicked successfully");
			reportStep("The element with the id " + id + " clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with the id" + id + "not able to click beacuse it is not found in DOM");
			reportStep("The element with the id " + id + " not able to click beacuse it is not found in DOM", "fail");
		} catch (ElementClickInterceptedException e) {
			//System.err.println("The element with the id" + id + "not able to click due to click intercepted");
			reportStep("The element with the id " + id + " not able to click due to click intercepted", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with the id " + id + " not able to click due to it is not insteractable");
			reportStep("The element with the id " + id + " not able to click due to it is not insteractable", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with the id " + id + " not able to click due to it is not stable in the application");
			reportStep("The element with the id " + id + " not able to click due to it is not stable in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with the id " + id + "not able to click due to unknown error");
			reportStep("The element with the id " + id + " not able to click due to unknown error", "fail");
		} 
	}

	public void clickByClassName(String classVal) {
		try {
			driver.findElementByClassName(classVal).click();
			//System.out.println("The element with the class name " + classVal + " clicked successfully");
			reportStep("The element with the class name " + classVal + " clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The elemement with the class name " + classVal + " not able to found in DOM");
			reportStep("The elemement with the class name " + classVal + " not able to found in DOM", "fail");
		} catch (ElementClickInterceptedException e) {
			//System.err.println("The element with the class name " + classVal + "not able to click due to click intercepted");
			reportStep("The element with the class name " + classVal + " not able to click due to click intercepted", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with the classname " + classVal + " not able to click due to it is not instearctable");
			reportStep("The element with the classname " + classVal + " not able to click due to it is not instearctable", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with the classname " + classVal + "not stavble in the apllication");
			reportStep("The element with the classname " + classVal + " not stavble in the apllication", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with the class name " + classVal + " not able to click due to unknown error");
			reportStep("The element with the class name " + classVal + " not able to click due to unknown error", "fail");
		} 

	}

	public void clickByName(String name) {
		try {
			driver.findElementByName(name).click();
			//System.out.println("The element with the name " + name + "clicked successfully");
			reportStep("The element with the name " + name + "clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The elemnent with the name " + name + "not able to found in DOM");
			reportStep("The elemnent with the name " + name + "not able to found in DOM", "fail");
		} catch (ElementClickInterceptedException e) {
			//System.err.println("The element with the name " + name + " not able to click due click intercepted ");
			reportStep("The element with the name " + name + " not able to click due click intercepted", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with the name " + name + " not able to click due to it is not interactable");
			reportStep("The element with the name " + name + " not able to click due to it is not interactable", "false");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with the name " + name + " not stable in the application");
			reportStep("The element with the name " + name + " not stable in the application", "fail");
		} catch (WebDriverException e2) {
			//System.err.println("the elelment with the name " + name + " not able to click due to unknown error");
			reportStep("the elelment with the name \" + name + \" not able to click due to unknown error", "fail");
		}

	}

	public void clickByLink(String name) {
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The link element with the link text " + name + " clicked sucessfully");
			reportStep("The link element with the link text " + name + " clicked sucessfully", "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The link element with the link text " + name + " not able found in DOM");
			reportStep("The link element with the link text " + name + " not able found in DOM", "fail");
		} catch (ElementClickInterceptedException e) {
			//System.err.println("The link with the link text " + name + " not able to click due to click intercepted");
			reportStep("The link with the link text " + name + " not able to click due to click intercepted", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The link element with the link text " + name + " not visible");
			reportStep("The link element with the link text " + name + " not visible", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The link element with the link text " + name + " Not able to interact");
			reportStep("The link element with the link text " + name + " Not able to interact", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The link element with the link text " + name + " not stable in the application");
			reportStep("The link element with the link text " + name + " not stable in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The link element with the link text " + name + " Not able to click due to unknown error");
			reportStep("The link element with the link text \" + name + \" Not able to click due to unknown error", "fail");
		} 

	}

	public void clickByLinkNoSnap(String name) {
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The link element with the name" + name + "clicked sucessfully");
			reportStep("The link element with the name " + name + " clicked sucessfully", "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The link element with the name " + name + " not able found in DOM");
			reportStep("The link element with the name " + name + " not able found in DOM", "fail");
		} catch (ElementClickInterceptedException e) {
			//System.err.println("The link with the name " + name + "not able to click due to click intercepted");
			reportStep("The link with the name " + name + " not able to click due to click intercepted", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The link element with the name" + name + " not visible");
			reportStep("The link element with the name " + name + " not visible", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The link element with the name" + name + "Not able to interact");
			reportStep("The link element with the name" + name + " Not able to interact", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The link element with the name " + name + "not stable in the application");
			reportStep("The link element with the name " + name + " not stable in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The link element with the name " + name + "Not able to click due to unknown error");
			reportStep("The link element with the name " + name + "Not able to click due to unknown error", "fail");
		}

	}

	public void clickByXpath(String xpathVal) {
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with the xpath " + xpathVal + " clicked successfully");
			reportStep("The element with the xpath " + xpathVal + " clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("Not able to click on element with the xpath " + xpathVal + " due to it is not found in DOM");
			reportStep("Not able to click on element with the xpath " + xpathVal + " due to it is not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("Not able to click on element with the xpath " + xpathVal + "due to it s not visisble");
			reportStep("Not able to click on element with the xpath " + xpathVal + " due to it s not visisble", "fail");
		} catch (ElementClickInterceptedException e) {
			//System.err.println("Not able to click on element with the xpath " + xpathVal + " due to click intercepted");
			reportStep("Not able to click on element with the xpath " + xpathVal + " due to click intercepted", "fail");
		} catch (ElementNotInteractableException e) {
			System.err.println("Not able to click on element with the xpath " + xpathVal + " due to it is not interactable");
			reportStep("Not able to click on element with the xpath " + xpathVal + " due to it is not interactable", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("Not able to click on element with the xpath " + xpathVal+ " due to it is not stable in the application");
			reportStep("Not able to click on element with the xpath " + xpathVal+ " due to it is not stable in the application", "fail");
		} catch (WebDriverException e2) {
			//System.err.println("Not able click on element with the xpath " + xpathVal + " due to unknown error");
			reportStep("Not able click on element with the xpath " + xpathVal + " due to unknown error", "fail");
		} 

	}

	public void clickByXpathNoSnap(String xpathVal) {
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with the xpath " + xpathVal + " clicked successfully");
			reportStep("The element with the xpath " + xpathVal + " clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("Not able to click on element with xpath " + xpathVal + " due to it is not found in DOM");
			reportStep("Not able to click on element with xpath " + xpathVal + " due to it is not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("Not able to click on element with xpath " + xpathVal + "due to it s not visisble");
			reportStep("Not able to click on element with xpath " + xpathVal + " due to it s not visisble", "fail");
		} catch (ElementClickInterceptedException e) {
			//System.err.println("Not able to click on element with xpath" + xpathVal + "due to click intercepted");
			reportStep("Not able to click on element with xpath" + xpathVal + " due to click intercepted", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("Not able to click on element with xpath " + xpathVal + " due to it is not interactable");
			reportStep("Not able to click on element with xpath " + xpathVal + " due to it is not interactable", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("Not able to click on element with xpath " + xpathVal+ " due to it is not stable in the application");
			reportStep("Not able to click on element with xpath " + xpathVal+ " due to it is not stable in the application", "fail");
		} catch (WebDriverException e2) {
			System.err.println("Not able click on element with xpath " + xpathVal + " due to unknown error");
			reportStep("Not able click on element with xpath " + xpathVal + " due to unknown error", "fail");
		}

	}

	public String getTextById(String idVal) {
		String actualText = "NULL";
		try {
			actualText = driver.findElementById(idVal).getText();
			//System.out.println("The text in the element using id  " + idVal + " is " + actualText);
			reportStep("The text in the element using id  " + idVal + " is " + actualText , "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("Not able to found text by using id " + idVal + " due to it is not found in DOM");
			reportStep("Not able to found text by using id " + idVal + " due to it is not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("Not able to found text by using id " + idVal + " due to it is not visisble");
			reportStep("Not able to found text by using id " + idVal + " due to it is not visisble", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("Not able to found text by using id " + idVal + " due to it is not interactable");
			reportStep("Not able to found text by using id " + idVal + " due to it is not interactable", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("Not able to found text by using id " + idVal + " due to it is not stable in the application");
			reportStep("Not able to found text by using id " + idVal + " due to it is not stable in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("Not able to find text " + idVal + " due to unknown error");
			reportStep("Not able to find text " + idVal + " due to unknown error", "fail");
		} 
		return actualText;
	}

	public String getTextByXpath(String xpathVal) {
		String actualText = "NULL";
		try {
			actualText = driver.findElementByXPath(xpathVal).getText();
			//System.out.println("the text in the element using xpath " + xpathVal + " is " + actualText);
			reportStep("the text in the element using xpath " + xpathVal + " is " + actualText , "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("Not able to found the text with xpath " + xpathVal + " due to element not found in DOM");
			reportStep("Not able to found the text with xpath " + xpathVal + " due to element not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("Not able to found the text with xpath " + xpathVal + " due to element not visible");
			reportStep("Not able to found the text with xpath " + xpathVal + " due to element not visible", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("Not able to found the text with xpath " + xpathVal + " due to element not interactable");
			reportStep("Not able to found the text with xpath " + xpathVal + " due to element not interactable", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("Not able to found the text with xpath " + xpathVal + " due to element not stable in application");
			reportStep("Not able to found the text with xpath " + xpathVal + " due to element not stable in application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("Not able to found the text with xpath " + xpathVal + " due to unknown error");
			reportStep("Not able to found the text with xpath " + xpathVal + " due to unknown error", "fail");
		} 

		return actualText;
	}

	public void selectVisibileTextById(String id, String value) {
		try {
			WebElement ele = driver.findElementById(id);
			
			Select sel = new Select(ele);
			sel.selectByVisibleText(value);
			//System.out.println("The drop dwon located successfully with the element id " + id+ " and able to select by visible text " + value);
			reportStep("The drop dwon located successfully with the element id " + id+ " and able to select by visible text " + value, "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("Not able to select drop down with id " + id + " due to element not found in DOM");
			reportStep("Not able to select drop down with id " + id + " due to element not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("Not able to select drop down with id " + id + " due to element not visible in DOM");
			reportStep("Not able to select drop down with id " + id + " due to element not visible in DOM", "fail");
		} catch (ElementNotSelectableException e) {
			//System.err.println("Not able to select drop down with id " + id + " due to drop down is in disable mode");
			reportStep("Not able to select drop down with id " + id + " due to drop down is in disable mode", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("Not able to select drop down with id " + id + " due to it is not stable in application");
			reportStep("Not able to select drop down with id " + id + " due to it is not stable in application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("Not able to select drop down with id " + id + " due to unknown error");
			reportStep("Not able to select drop down with id " + id + " due to unknown error", "fail");
		} 
	}

	public void selectIndexById(String id, int value) {
		try {
			WebElement ele = driver.findElementById(id);
			Select sel = new Select(ele);
			sel.selectByIndex(value);
			//System.out.println("The drop dwon located successfully with the element id  " + id+ "and able to selctvalue by using " + value);
			reportStep("The drop dwon located successfully with the element id  " + id+ "and able to selctvalue by using " + value, "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("Not able to locate drop down with id " + id + " due to it is not found in DOM");
			reportStep("Not able to locate drop down with id " + id + " due to it is not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("Not able to locate drop down with id " + id + " due to it is not visible");
			reportStep("Not able to locate drop down with id " + id + " due to it is not visible", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("Not able to locate drop down with id " + id + " due to not able to interact");
			reportStep("Not able to locate drop down with id " + id + " due to not able to interact", "fail");
		} catch (ElementNotSelectableException e) {
			//System.err.println("Not able to select drp down with id " + id + " due it is in disable mode");
			reportStep("Not able to select drp down with id " + id + " due it is in disable mode\"", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("Not able to select drop down with id " + id + " beacuse it is not stable");
			reportStep("Not able to select drop down with id " + id + " beacuse it is not stable", "fail");
		} catch (WebDriverException e) {
			System.err.println("Not able to select drop down with id " + id + " due to unknown error");
			reportStep("Not able to select drop down with id " + id + " due to unknown error", "fail");
		} 

	}

	public void switchToParentWindow() {
		try {
			Set<String> parentWinId = driver.getWindowHandles();
			for (String eachId : parentWinId) {
				driver.switchTo().window(eachId);
				break;
			}
			//System.out.println("Switched to parent window");
			reportStep("Switched to parent window", "pass");
		} catch (NoSuchWindowException e) {
			//System.err.println("Window is not available");
			reportStep("Window is not available", "fail");
		} catch (WebDriverException e) {
			//System.err.println("Not able to switch to window beacuse of unknown error");
			reportStep("Not able to switch to window beacuse of unknown error", "fail");
		}

	}

	public void switchToLastWindow() {
		try {
			Set<String> allWinId = driver.getWindowHandles();
			for (String eachId : allWinId) {
				driver.switchTo().window(eachId);
			}
			//System.out.println("Switched to last window");
			reportStep("Switched to last window", "pass");
		} catch (NoSuchWindowException e) {
			//System.err.println("Window is not available");
			reportStep("Window is not available", "fail");
		} catch (SessionNotCreatedException e) {
			//System.err.println("Session id not created");
			reportStep("Session id not created", "fail");
		} catch (WebDriverException e) {
			//System.err.println("Not able to move last window due to unknown error");
			reportStep("Not able to move last window due to unknown error", "fail");
		} 
	}

	public void acceptAlert() {
		try {
			driver.switchTo().alert().accept();
			//System.out.println("Alert accepted");
			reportStep("Alert accepted", "pass");
		} catch (NoAlertPresentException e) {
			//System.err.println("Alert is not present ");
			reportStep("Alert is not present ", "fail");
		} catch (WebDriverException e) {
			System.err.println("Not able to move to last window due to unknown error");
			reportStep("Not able to move to last window due to unknown error", "fail");
		} 

	}

	public void dismissAlert() {
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("Alert dismissed");
			reportStep("Alert dismissed", "pass");
		} catch (NoAlertPresentException e) {
			//System.err.println("Not able to dismiss the alert becuase it is not present in application");
			reportStep("Not able to dismiss the alert becuase it is not present in application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("Not able to dismiss the alert due to unknown error");
			reportStep("Not able to dismiss the alert due to unknown error", "fail");
		} 

	}

	public String getAlertText() {
		try {
			String alertText = driver.switchTo().alert().getText();
			//System.out.println("Text in ALert=" + alertText);
			reportStep("Text in ALert=" + alertText, "pass");
		} catch (NoAlertPresentException e) {
			//System.err.println("Not able to find the alert");
			reportStep("Not able to find the alert", "fail");
		} catch (WebDriverException e) {
		//	System.err.println("Not able to find the text in alert due to unknown error");
			reportStep("Not able to find the text in alert due to unknown error", "fail");
		} 
		return null;
	}

	public long takeSnap() {

	long number = 0;
		
		try {
			
			number = (long) (Math.floor(Math.random()*100000000)+100000);
			
			File tmp = driver.getScreenshotAs(OutputType.FILE);
			File dst = new File("./Reports_latest/scrrenshots/"+number+".jpg");
			FileUtils.copyFile(tmp, dst);
			
		} catch (IOException e) {
			//System.err.println("Not able to take snap because of io exception");
			reportStep("Not able to take snap because of io exception", "pass");
		} catch (WebDriverException e) {
			//System.err.println("Not able to take snap because of unknown error");
			reportStep("Not able to take snap because of unknown error", "pass");
		}

		return number;
	}

	public void closeBrowser() {
		try {
			driver.close();
			//System.out.println("current browser closed");
			reportStep("current browser closed", "pass", false);
		} catch (WebDriverException e) {
			//System.err.println("Not able to close the browser due to unknown error");
			reportStep("Not able to close the browser due to unknown error", "fail");
		}

	}

	public void closeAllBrowsers() {
		try {
			driver.quit();
			//System.out.println("All the browsers are closed");
			reportStep("All the browsers are closed", "pass", false);
		} catch (WebDriverException e) {
			//System.err.println("Not able to close the all browsers due to unknown error");
			reportStep("Not able to close the all browsers due to unknown error", "fail");
		}

	}

	public void threadSleep(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			//System.err.println("Not able to sleep beacause of interrupeted exception");
			reportStep("Not able to sleep beacause of interrupeted exception", "pass");
		} catch (WebDriverException e) {
			//System.err.println("Not able to sleep because of unknown error");
			reportStep("Not able to sleep because of unknown error", "fail");
		}

	}

	public void selectVisibleTextByXpath(String xpath, String value) {
		try {
			WebElement ele = driver.findElementByXPath(xpath);
			//explicitWaitEelementToBeSelectable(xpath, 10);
			Select sel = new Select(ele);
			sel.selectByVisibleText(value);
			//System.out.println("The drop down with xpath " + xpath + "able to select with the visible text " + value);
			reportStep("The drop down with xpath " + xpath + " able to select with the visible text " + value, "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("Not able to select drop down with the xpath " + xpath + " due to it is not available in DOM ");
			reportStep("Not able to select drop down with the xpath " + xpath + " due to it is not available in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("Not able to select drop down with the xpath " + xpath + " due to it is not visisble");
			reportStep("Not able to select drop down with the xpath " + xpath + " due to it is not visisble", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("Not able to select drop down with xpath" + xpath + " due to it is not interactable");
			reportStep("Not able to select drop down with xpath" + xpath + " due to it is not interactable", "fail");
		} catch (ElementNotSelectableException e) {
			//System.err.println("Not able to select drop down with xpath " + xpath + " due to it is not selectable");
			reportStep("Not able to select drop down with xpath " + xpath + " due to it is not selectable", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("Not able to select drop down with xpath " + xpath + " due to it is not stable in the application");
			reportStep("Not able to select drop down with xpath " + xpath + " due to it is not stable in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("Not able to select drp down with the xpath " + xpath + " due to unknown error");
			reportStep("Not able to select drp down with the xpath " + xpath + " due to unknown error", "fail");
		}

	}

	public void enterByNameTab(String name, String text) {
		// TODO Auto-generated method stub

		try {
			driver.findElementByName(name).sendKeys(text);
			//System.out.println("The element  with the name " + name + " eneterd with the data " + text + " and tab key pressed");
			reportStep("The element  with the name " + name + " eneterd with the data " + text + " and tab key pressed", "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with name  " + name + " not found in DOM");
			reportStep("The element with name  " + name + " not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with the name " + name + " not visible in DOM");
			reportStep("The element with the name " + name + " not visible in DOM", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with the name " + name + " not interactable");
			reportStep("The element with the name " + name + " not interactable", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with the name " + name + " not stable in the application");
			reportStep("The element with the name " + name + " not stable in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with the name " + name + " not found due to unknown error");
			reportStep("The element with the name " + name + " not found due to unknown error", "fail");
		}

	}

	public void pageDown() {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
			//System.out.println("Page down action performed successfully");
			reportStep("Page down action performed successfully", "pass");
		} catch (WebDriverException e) {
			//System.err.println("Not able to do action page down");
			reportStep("Not able to do action page down", "fail");
		}
	}

	public void selectVisibleTextByName(String name, String text) {

		try {
			WebElement ele = driver.findElementByName("requestFor");
			Select sel = new Select(ele);
			sel.selectByVisibleText(text);
			//System.out.println("the drop down with the name " + name + " able to select with the visible text" + text);
			reportStep("the drop down with the name " + name + " able to select with the visible text" + text, "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The drop down with the name " + name + " not found in DOM");
			reportStep("The drop down with the name " + name + " not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The drop down with the name " + name + " not visible in DOM");
			reportStep("The drop down with the name " + name + " not visible in DOM", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The drop down with the name " + name + " not interactable in DOM");
			reportStep("The drop down with the name " + name + " not interactable in DOM", "fail");
		} catch (ElementNotSelectableException e) {
			//System.err.println("The drop down with the name " + name + " not able select due to ElemnentNotSelectableExcepation");
			reportStep("The drop down with the name " + name + " not able select due to ElemnentNotSelectableExcepation", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The drop down with the name " + name + " not able to select beacuse it is not stable in DOM");
			reportStep("The drop down with the name " + name + " not able to select beacuse it is not stable in DOM", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The drop down with the name " + name + " not able to select due to unknown error");
			reportStep("The drop down with the name " + name + " not able to select due to unknown error", "fail");
		}

	}

	public void selectValueByName(String name, String value) {
		try {
			WebElement ele = driver.findElementByName(name);
			Select sel = new Select(ele);
			sel.selectByValue(value);
			//System.out.println("The drop down with the name " + name + " with the value " + value);
			reportStep("The drop down with the name " + name + " with the value " + value, "pass");
		} catch (NoSuchElementException e) {
			System.err.println("The drop down not able to select with the name " + name + " with the value " + value+ " due to element not found in DOM");
			reportStep("The drop down not able to select with the name " + name + " with the value " + value+ " due to element not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The drop down with the name " + name + " not able to select with the value " + value+ " due to element not found in DOM");
			reportStep("The drop down with the name " + name + " not able to select with the value \" + value+ \" due to element not found in DOM", "fail");
		} catch (ElementNotSelectableException e) {
			//System.err.println("The drop down with the name " + name + " not able to select due to not selctable exception");
			reportStep("The drop down with the name " + name + " not able to select due to not selctable exception", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The drop down with the nsame " + name + " not able to select due to  it is not instractable");
			reportStep("The drop down with the nsame " + name + " not able to select due to  it is not instractable", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The drop down with the name " + name + " not satble in the application");
			reportStep("The drop down with the name " + name + " not satble in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The drop down with the name " + name + " not able to select due to unknown error");
			reportStep("The drop down with the name " + name + " not able to select due to unknown error", "fail");
		}

	}

	public void compareValues(String name1, String name2) {
		if (name1.equalsIgnoreCase(name2)) {
            System.out.println(name1 +" is equal to "+ name2);
		}else {
			System.err.println(name1 +" is not equal to "+ name2);
		}
	}

	public void mouseHoverByXpath(String Xpath) {
		// TODO Auto-generated method stub
		
		try {
			Actions act= new Actions(driver);
			WebElement ele=driver.findElementByXPath(Xpath);
			act.moveToElement(ele).perform();
			//System.out.println("Able to mouse hover on the element "+Xpath);
			reportStep("Able to mouse hover on the element with the Xpath "+Xpath, "pass");
		} catch (NoSuchElementException e) {
			System.err.println("Not able to mouse hover on the element "+Xpath+" because not able to find in DOM");
			reportStep("Not able to mouse hover on the element with the Xpath "+Xpath+" because not able to find in DOM", "fail");
		} catch(ElementNotVisibleException e) {
			reportStep("Not able to mouse hover on element with the Xpath "+Xpath+" beacause element was not not stable in DOM", "fail");
		} catch(ElementNotInteractableException e) {
			reportStep("Not able to mouse on the element with the Xpath "+Xpath+" because element was not interactable", "fail");
		} catch(StaleElementReferenceException e) {
			reportStep("Not able to mouse hover on the element with the Xpath "+Xpath+" becuase element was not stable in the DOM", "fail");
		} catch(WebDriverException e) {
			reportStep("Not able to mouse hover on the element with the Xpath "+Xpath+ " because of unknown error", "fail");
		}
		
	}

	public void clickOnEscapeKey() {
		try {
			Actions act = new Actions(driver);
			act.sendKeys(Keys.ESCAPE);
			System.out.println("Escape key pressed successfully");
		} catch (WebDriverException e) {
			System.err.println("Not able to click on escape key due to unkown error");
		}
		
		
	}

	
	public void explicitWaitEelementToBeClickable(String xpath, int time) {
		// TODO Auto-generated method stub
		try {
			WebElement ele = driver.findElementByXPath(xpath);
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.visibilityOf(ele));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	public void explicitWaitEelementToBeSelectable(String xpath, int time, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement ele = driver.findElementByXPath(xpath);
			WebDriverWait wait = new WebDriverWait(driver, time);
			if(wait.until(ExpectedConditions.elementToBeSelected(ele))) {
				selectVisibleTextByXpath(xpath, value);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public void doubleClickByXpath(String xpath) {
		try {
			Actions act = new Actions(driver);
			WebElement ele = driver.findElementByXPath(xpath);
			act.doubleClick(ele).perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	public void selectMonthByXpath(String xpath1, String xpath2, String expected) {
		try {
			boolean flag = true;
			while(flag) {
			WebElement month = driver.findElementByXPath(xpath1);	
			String mon = month.getText().substring(0,3);
			System.out.println(mon);
			if(mon.equalsIgnoreCase(expected)) {
				flag = false;
				
			}else {
				WebElement ele=driver.findElementByXPath(xpath2);
				ele.click();			}
			reportStep("month with the xpath "+expected+"  selected successfully" , "pass");
			}
		}catch(WebDriverException e) {
			reportStep("not able to select month with "+expected+" due to unknown error", "fail");
		}
		
		
		
	}

}

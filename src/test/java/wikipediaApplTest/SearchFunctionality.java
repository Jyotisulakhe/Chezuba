package wikipediaApplTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchFunctionality {
	
	WebDriver driver; // global webdriver variable
	@BeforeTest
	public void wikipediaTest() {
		
		driver=new ChromeDriver();//using this line able to open chrome browser
		driver.get("https://www.wikipedia.org/");// is used to navigate to a specified URL in the browser
		driver.manage().window().maximize();// is used in Selenium to maximize the browser window.
	}
	
	@Test
	public void searchFunctionalities(){
		driver.findElement(By.id("searchInput")).sendKeys("Selenium");//using this line find an input field with ID 'searchInput' and types or enter 'Selenium' into it.
		driver.findElement(By.className("svg-search-icon")).click();//using this line find the first element with the class name 'svg-search-icon' and click on it.
		 
		// verifying that the results area contains the expected result or not using Assertion while checking title of page
		String actualtitle = driver.getTitle();//this line retrives the title of the current web page and stores it in the variable'actualtitle'
		String expectedtitle = "Selenium - Wikipedia";// this line initializes the variable'expectedtitle' with the values 'Selenium - Wikipedia'
		Assert.assertEquals(actualtitle, expectedtitle);// using this line able to check if the 'actualtitle' matches the 'expectedtitle'. 
	}
	
	@AfterTest
	public void closeApplication() {
		driver.close();//using this line able to close the current window of browser
	}

}

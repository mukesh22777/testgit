package AdvancedWebdriver;

import org.testng.annotations.Test;

import net.sourceforge.htmlunit.corejs.javascript.JavaScriptException;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.ExecuteScript;
import org.testng.annotations.AfterTest;

public class PageScroll {
	public WebDriver driver;
	
  @Test
  public void f() {
	  
	  //Vertical scroll
	  
	  ((JavascriptExecutor)driver).executeScript("window.scrollBy (0, 100)");	
	  
	//Horizontal scroll
	  
	  //((JavascriptExecutor)driver).executeScript("window.scrollBy (150, 0)");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "F:\\selenium\\Lib\\diver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.fb.com");
  }

  @AfterTest
  public void afterTest() {
	  //driver.close();
  }

}

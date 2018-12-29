package AdvancedWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AjaxControl {
	
	WebDriver driver;
	
  @Test
  public void f() throws Exception{
	  
	  driver.findElement(By.id("gs_htif0")).sendKeys("robotics");
	  
	  Thread.sleep(2000);
	  
	  WebElement e1 = driver.findElement(By.xpath("//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul"));
	  
	  List<WebElement> e2 = e1.findElements(By.xpath("//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul/li"));
	  
	  for (int i = 0; i < e2.size(); i++) {
		  
		  String str = e2.get(i).getText();
		  System.out.println(str);
		
	}
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.gecko.driver", "F:\\selenium\\Lib\\diver\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("https://www.google.com");
  }

  @AfterTest
  public void afterTest() {
  }

}


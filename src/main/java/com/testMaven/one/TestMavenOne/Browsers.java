package com.testMaven.one.TestMavenOne;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers {
	private WebDriver driver = null;
	private String projectPath = "D:\\Users\\Administrator\\workspace\\TestMavenOne";
	
	public Browsers(BrowsersType browersType){
		switch(browersType){
			case firefox:
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				break;
			case ie:
				System.setProperty("webdriver.id.driver", projectPath+"/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
				break;
			case chrome:
				System.setProperty("webdriver.id.driver", projectPath+"/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				break;
		}
	}
}

import java.sql.Driver

import org.openqa.selenium.chrome.ChromeDriver

System.setProperty("webdriver.chrome.driver","C:\\Browser drivers\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.demoblaze.com/");
driver.findElementByXPath("//a[@id='login2']").click();
driver.findElementByXPath("//input[@id='loginusername']").sendKeys("kamali06");
driver.findElementByXPath("//input[@id='loginpassword']").sendKeys("mouli@09");
driver.findElementByXPath("//button[normalize-space()='Log in']").click();
driver.quit();
import org.openqa.selenium.chrome.ChromeDriver

System.setProperty("webdriver.chrome.driver","C:\\Browser drivers\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.demoblaze.com/");
driver.findElementByXPath("//a[@id='signin2']").click();
driver.findElementByXPath("//input[@id='sign-username']").sendKeys("kamali06");
driver.findElementByXPath("//input[@id='sign-password']").sendKeys("mouli@09");
driver.findElementByXPath("//button[normalize-space()='Sign up']").click();
driver.quit();
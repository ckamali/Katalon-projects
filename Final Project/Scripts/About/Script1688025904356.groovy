import org.openqa.selenium.chrome.ChromeDriver

System.setProperty("webdriver.chrome.driver","C:\\Browser drivers\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.demoblaze.com/");
driver.findElementByXPath("//a[normalize-space()='About us']").click();
driver.findElementByXPath("//div[@id='videoModal']//button[@type='button'][normalize-space()='Close']").click();
driver.quit();
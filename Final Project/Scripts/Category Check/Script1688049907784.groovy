import org.openqa.selenium.chrome.ChromeDriver


System.setProperty("webdriver.chrome.driver","C:\\Browser drivers\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.demoblaze.com/");
driver.findElementByXPath("//div[@id='contcont']//a[2]").click();
driver.findElementByXPath("//div[@id='contcont']//a[2]").click();
driver.findElementByXPath("//div[@id='contcont']//a[2]").click();
driver.quit();
import org.openqa.selenium.chrome.ChromeDriver

System.setProperty("webdriver.chrome.driver","C:\\Browser drivers\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.demoblaze.com/");
driver.manage().window().maximize();
driver.findElementByXPath("//button[@id='next2']").click();
driver.findElementByXPath("//button[@id='prev2']").click();
driver.quit();
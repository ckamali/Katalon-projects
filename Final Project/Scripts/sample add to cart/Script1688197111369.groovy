import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

System.setProperty("webdriver.chrome.driver","C:\\Browser drivers\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.demoblaze.com/")

driver.manage().window().maximize();

try {
            // Wait for the "Samsung galaxy s6" link to be clickable
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//a[normalize-space()='Samsung galaxy s6']")));
            
            // Add to cart
            driver.findElementByXPath("//a[normalize-space()='Samsung galaxy s6']").click();
            driver.findElementByXPath("//a[normalize-space()='Add to cart']").click();
        } catch (StaleElementReferenceException e) {
            // Handle the exception
            System.out.println("StaleElementReferenceException occurred. Retrying...");
            
            // Retry the action or handle the exception appropriately
            // ...
        }
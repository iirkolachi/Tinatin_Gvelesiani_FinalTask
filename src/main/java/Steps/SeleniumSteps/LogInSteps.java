package Steps.SeleniumSteps;

import Elements.SeleniumElements.ChangePassElements;
import Elements.SeleniumElements.LogInElements;
import Elements.SeleniumElements.OrderElements;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.UUID;

public class LogInSteps extends LogInElements {

    public static String uniqueEmail;

    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    public LogInSteps(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.actions = new Actions(driver);
    }

    public LogInSteps openWebsite() {
        driver.get("https://practice.automationtesting.in/my-account/");
        return this;
    }
    public LogInSteps setEmail() {
        WebElement email = driver.findElement(LogInElements.email);
        String uniqueId = UUID.randomUUID().toString().substring(0,10);
        uniqueEmail = uniqueId + "@credo.ge";
        email.sendKeys(uniqueEmail);
        return this;
    }
    public LogInSteps setPass() {
        boolean successfulSignup = false;
        while (!successfulSignup) {
            try {
                WebElement pass = driver.findElement(LogInElements.pass);
                pass.click();
                actions.moveToElement(pass)
                        .click()
                        .keyDown(Keys.CONTROL)
                        .sendKeys("a")
                        .sendKeys(Keys.BACK_SPACE)
                        .keyUp(Keys.CONTROL)
                        .perform();
                pass.sendKeys("Selenium123!");

                WebElement register = driver.findElement(LogInElements.register);
                wait.until(ExpectedConditions.elementToBeClickable(register));
                register.click();

                WebElement Orders = driver.findElement(OrderElements.orders);
                WebElement Logout = driver.findElement(ChangePassElements.logout);

                if (Orders.isDisplayed() && Logout.isDisplayed()) {
                    successfulSignup = true;
                    System.out.println("You are registered!");
                }

            }   catch (Exception e) {
                System.out.println("Register failed!");
            }
        }
        return this;
    }
}

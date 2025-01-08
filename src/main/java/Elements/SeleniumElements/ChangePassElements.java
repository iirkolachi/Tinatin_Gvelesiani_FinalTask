package Elements.SeleniumElements;

import org.openqa.selenium.By;

public class ChangePassElements {

    public static By accountDetails = By.xpath("//*[@id='page-36']/div/div[1]/nav/ul/li/a[@href='https://practice.automationtesting.in/my-account/edit-account/']");
    public static By firstname = By.id("account_first_name");
    public static By lastname = By.id("account_last_name");
    public static By currentPass = By.id("password_current");
    public static By newPass = By.id("password_1");
    public static By confirmNewPass = By.id("password_2");
    public static By saveChanges = By.xpath("//*[@id='page-36']/div/div[1]/div/form/p[4]/input[@class='woocommerce-Button button' and @name='save_account_details' and @value='Save changes']");
    public static By logout = By.xpath("//*[@id='page-36']/div/div[1]/nav/ul/li/a[@href='https://practice.automationtesting.in/my-account/customer-logout/']");
    public static By username = By.id("username");
    public static By pass = By.id("password");
    public static By loginButton = By.xpath("//*[@id='customer_login']/div[1]/form/p[3]/input[3]");
}

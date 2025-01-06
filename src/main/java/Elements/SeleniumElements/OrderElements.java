package Elements.SeleniumElements;

import org.openqa.selenium.By;

public class OrderElements {

    public static By firstnameInput = By.id("billing_first_name");
    public static By lastnameInput = By.id("billing_last_name");
    public static By emailInput = By.id("billing_email");
    public static By phoneInput = By.id("billing_phone");
    public static By addressInput = By.id("billing_address_1");
    public static By cityInput = By.id("billing_city");
    public static By zipcodeInput = By.id("billing_postcode");
    public static By radioButton = By.xpath("//*[@for='payment_method_cod']");
    public static By orderButton = By.id("place_order");
    public static By paymentMethod = By.xpath("//th[text()='Payment Method:']/following-sibling::td[text()='Cash on Delivery']");
    public static By book1 = By.xpath("//*[@id='page-35']/div/div[1]/table[1]/tbody//tr[contains(@class, 'order_item')]//td[contains(@class, 'product-name')]//a[contains(text(), 'HTML5 Forms')]");
    public static By book2 = By.xpath("//*[@id='page-35']/div/div[1]/table[1]/tbody//tr[2][contains(@class, 'order_item')]//td[contains(@class, 'product-name')]//a[contains(text(), 'Selenium Ruby')]");
    public static By myAccount = By.xpath("//*[@id='menu-item-50']/a");
    public static By orders = By.xpath("//*[@id='page-36']/div/div[1]/nav/ul/li/a[@href='https://practice.automationtesting.in/my-account/orders/']");
    public static By checkOrder = By.xpath("//*[@class='woocommerce-MyAccount-orders shop_table shop_table_responsive my_account_orders account-orders-table']");
    public static By username = By.id("username");
    public static By pass = By.id("password");
    public static By loginButton = By.xpath("//*[@id='customer_login']/div[1]/form/p[3]/input[3]");
}

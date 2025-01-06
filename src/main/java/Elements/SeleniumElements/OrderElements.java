package Elements.SeleniumElements;

import org.openqa.selenium.By;

public class OrderElements {

    public static By checkoutButton = By.xpath("//*[@href='https://practice.automationtesting.in/checkout/']");
    public static By firstnameInput = By.id("billing_first_name");
    public static By lastnameInput = By.id("billing_last_name");
    public static By phoneInput = By.id("billing_phone");
    public static By addressInput = By.id("billing_address_1");
    public static By cityInput = By.id("billing_city");
    public static By zipcodeInput = By.id("billing_postcode");
    public static By radioButton = By.id("payment_method_cod");
    public static By orderButton = By.id("place_order");
}

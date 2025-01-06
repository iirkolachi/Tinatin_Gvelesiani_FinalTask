package Elements.SeleniumElements;

import Utils.SeleniumSetUp;
import org.openqa.selenium.By;

public class JavaScriptElements extends SeleniumSetUp {

    public static By javaScript = By.xpath("//*[@id='woocommerce_product_categories-2']/ul/li/a[@href='https://practice.automationtesting.in/product-category/javascript/']");
    public static By count = By.xpath("//*[@id='woocommerce_product_categories-2']/ul/li/a[@href='https://practice.automationtesting.in/product-category/javascript/']/following-sibling::span");
    public By liElements = By.xpath("//*//ul[@class='products masonry-done']//li");
    public By h3Elements = By.xpath("//*//ul[@class='products masonry-done']//li//h3");

}

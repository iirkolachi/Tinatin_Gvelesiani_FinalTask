package Elements.SeleniumElements;

import Utils.SeleniumSetUp;
import org.openqa.selenium.By;

public class JavaScriptElements extends SeleniumSetUp {

    public static By javaScript = By.xpath("//*[@id=\"woocommerce_product_categories-2\"]/ul/li[3]/a");

    public static By count = By.xpath("//*[@id=\"woocommerce_product_categories-2\"]/ul/li[3]/span");

    public By liElements = By.xpath("//*//ul[@class='products masonry-done']//li");

    public By h3Elements = By.xpath("//*//ul[@class='products masonry-done']//li//h3");

}

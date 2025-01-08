package Elements.SeleniumElements;

import org.openqa.selenium.By;

public class ShoppingCartElements {

    public static By button = By.xpath("//*[@id='content']/ul/li[1]/a[@href='/product-category/javascript/?add-to-cart=170']");
    public static By basketBefore = By.xpath("//*[@id='wpmenucartli']/a/span[1]");
    public static By basketAfter = By.xpath("//*[@id='wpmenucartli']/a//span[@class='amount']");
    public static By productInBasket = By.xpath("//table[@class='shop_table shop_table_responsive cart']");
    public static By remove = By.xpath("//a[@class='remove']");
    public static By emptyBasket = By.xpath("//p[@class='cart-empty']");
}

package Elements.SeleniumElements;

import org.openqa.selenium.By;

public class ShopElements {

    public static By shop = By.id("menu-item-40");
    public static By sortingButton = By.xpath("//select[@class='orderby']");
    public static By lowToHigh = By.xpath("//*[@id='content']/form/select/option[@value='price']");
    public By pricesElement = By.xpath("//*//ul[@class='products masonry-done']//li//a//span//span");

}

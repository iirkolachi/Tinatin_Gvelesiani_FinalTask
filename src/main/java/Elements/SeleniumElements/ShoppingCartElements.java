package Elements.SeleniumElements;

import org.openqa.selenium.By;

public class ShoppingCartElements {

    public static By button = By.xpath("//*[@id=\"content\"]/ul/li[1]/a[2]");

    public static By basketBefore = By.xpath("//*[@id=\"wpmenucartli\"]/a/span[1]");

    public static By basketAfter = By.xpath("//*[@id=\"wpmenucartli\"]/a/i");

    public static By basket = By.xpath("//*[@id=\"wpmenucartli\"]/a");

    public static By productInBasket = By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[1]/td[3]/a");

    public static By remove = By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[1]/td[1]/a");

    public static By emptyBasket = By.xpath("//*[@id=\"page-34\"]/div/div[2]/p[1]");
}

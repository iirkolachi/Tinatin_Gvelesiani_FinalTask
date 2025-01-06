package Elements.SeleniumElements;

import org.openqa.selenium.By;

public class CouponElements {

    public static By returnButton = By.xpath("//*[@class='button wc-backward']");
    public static By html5forms = By.xpath("//*[@href='/shop/?add-to-cart=181']");
    public static By seleniumRuby = By.xpath("//*[@href='/shop/?add-to-cart=160']");
    public static By basket = By.xpath("//*[@class='cartcontents']");
    public static By couponInput = By.id("coupon_code");
    public static By applyButton = By.xpath("//*[@value='Apply Coupon']");
    public static By checkCoupon = By.xpath("//*[@class='cart-discount coupon-krishnasakinala']");
    public static By removeCoupon = By.xpath("//*[@class='woocommerce-remove-coupon']");
    public static By afterRemove = By.xpath("//*[@class='cart_totals']");
    public static By checkoutButton = By.xpath("//*[@href='https://practice.automationtesting.in/checkout/']");
}

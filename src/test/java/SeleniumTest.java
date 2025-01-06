import SeleniumSteps.*;
import Utils.SeleniumSetUp;
import org.testng.annotations.Test;

public class SeleniumTest extends SeleniumSetUp {

    @Test (priority = 1)
    public void logInTest() {
        LogInSteps loginsteps = new LogInSteps(driver);

        loginsteps.openWebsite()
                .setEmail()
                .setPass()
                .clickRegister();
    }
    @Test (priority = 2)
    public void shopTest() throws InterruptedException {
        ShopSteps shopsteps = new ShopSteps(driver);

        shopsteps.clickShop()
                .orderBy()
                .lowToHigh()
                .checkOrder();
        Thread.sleep(2000);
    }
    @Test (priority = 3)
    public void javaScriptTest() {
        JavaScriptSteps javascriptsteps = new JavaScriptSteps(driver);

        javascriptsteps.clickJavaScript()
                .checkCount()
                .checkBooks();
    }
    @Test (priority = 4)
    public void addToCartTest() throws InterruptedException {
        ShoppingCartSteps cartsteps = new ShoppingCartSteps(driver);

        cartsteps.clickAdd()
                .checkBasket()
                .openBasket()
                .checkProduct()
                .removeProduct()
                .checkBasketAfterRemove();
    }
    @Test (priority = 5)
    public void couponTest() throws InterruptedException {
        CouponSteps couponsteps = new CouponSteps(driver);

        couponsteps.returnToShop()
                .chooseNewBooks()
                .openCart()
                .addCoupon()
                .checkCoupon()
                .removeCoupon()
                .checkAfterRemove()
                .addCouponAgain()
                .checkCouponAgain()
                .clickCheckout();
    }
    @Test (priority = 6)
    public void orderTest() {
        OrderSteps ordersteps = new OrderSteps(driver);
        driver.get("https://practice.automationtesting.in/checkout/");

        ordersteps.billingDetails();
    }
}

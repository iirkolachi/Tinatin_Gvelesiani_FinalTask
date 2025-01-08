import Steps.SeleniumSteps.*;
import Utils.SeleniumSetUp;
import org.testng.annotations.Test;

public class SeleniumTest extends SeleniumSetUp {

    @Test (priority = 1)
    public void logInTest() {
        LogInSteps loginsteps = new LogInSteps(driver);

        loginsteps.openWebsite()
                .setEmail()
                .setPass();
    }
    @Test (priority = 2)
    public void shopTest() {
        ShopSteps shopsteps = new ShopSteps(driver);

        shopsteps.clickShop()
                .orderBy()
                .lowToHigh()
                .checkOrder();
    }
    @Test (priority = 3)
    public void javaScriptTest() {
        JavaScriptSteps javascriptsteps = new JavaScriptSteps(driver);

        javascriptsteps.clickJavaScript()
                .checkCount()
                .checkBooks();
    }
    @Test (priority = 4)
    public void addToCartTest() {
        ShoppingCartSteps cartsteps = new ShoppingCartSteps(driver);

        cartsteps.clickAdd()
                .checkBasket()
                .checkProduct()
                .removeProduct()
                .checkBasketAfterRemove();
    }
    @Test (priority = 5)
    public void couponTest() {
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

        ordersteps.billingDetails()
                .checkOrderInfo()
                .clickMyAccount()
                .clickOrders()
                .checkOrder();
    }
    @Test (priority = 7)
    public void changePassTest() {
        ChangePassSteps changepasssteps = new ChangePassSteps(driver);

        changepasssteps.clickAccountDetails()
                .changeData()
                .logout()
                .loginWithNewData()
                .checkLogin();
    }
}
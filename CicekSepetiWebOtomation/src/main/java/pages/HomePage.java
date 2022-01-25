package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class HomePage extends BasePage {
    SearchBox searchBox ;
    By cartCountLocator = By.xpath("//span[@button='btn btn-lg btn-primary cart__checkout-button js-submit-basket']");
    By cartContainerLocator = By.xpath("//span[@class='user-menu__icon user-menu__icon--cart icon-cart-2 js-product-id-list']");
    By acceptCookiesLocator = By.xpath("//span[@class='icon-close']");

    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox(){
        return this.searchBox;
    }

    public boolean isProductCountUp() {
        return getCartCount() > 0 ;
    }

    public void goToCart()  {

        click(cartContainerLocator);
    }

    private int getCartCount(){
        String count = find(cartCountLocator).getText();
        return Integer.parseInt(count);
    }

    public void acceptCookies() throws InterruptedException {
  Thread.sleep(5000);
            click(acceptCookiesLocator);

    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.List;

public class CartPage extends BasePage {
    By productNameLocator = By.xpath("//span[@class='product__action-button-text']");
    By cartsLocator = By.xpath("//span[@class='icon-cart-2 cart__title-icon']");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnCartsPage() {
        return isDisplayed(cartsLocator);
    }
    private List<WebElement> getProducts(){
        return (List<WebElement>) findAll(productNameLocator);
    }
}

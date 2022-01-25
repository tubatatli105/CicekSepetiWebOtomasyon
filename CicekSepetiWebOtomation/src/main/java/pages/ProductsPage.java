package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage {

    By shippingOptionLocator = By.xpath("//div[@class='category-order__text js-order-text']");
    By productNameLocator = By.xpath("//div[@class='products__item-img-container ratio-container']");


    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return isDisplayed(shippingOptionLocator);
    }



    public void selectProduct() {

        click(productNameLocator);
    }


}
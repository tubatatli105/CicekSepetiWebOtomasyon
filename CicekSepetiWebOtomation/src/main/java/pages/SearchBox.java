package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage{

    By searchBoxLocator = By.xpath("//input[@placeHolder='Search for a gift to send to Mexico.']");
    By submitButtonLocator = By.xpath("//span[@class='live-search__text-find']");


    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        type(searchBoxLocator , text);
        click(submitButtonLocator);
    }

    public void homePageclick() {
        click(searchBoxLocator);
    }
}
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    By signInLocator = By.xpath("//li[@class='user-menu__item js-toggle-process-link']");
    By signIn = By.xpath("//a[@class='users-process-list__btn']");
    By emailLocator = By.xpath("//input[@id='EmailLogin']");
    By passwordLocator = By.xpath("//input[@id='Password']");
    By signInButton = By.xpath("//button[@class='btn btn-primary btn-lg pull-right login__btn js-login-button']");
    By loginComfirm = By.xpath("//span[@class='user-menu__title']");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void signIn() {
        click(signInLocator);
        click(signIn);
        type(emailLocator,"tubatatli106@gmail.com");
        type(passwordLocator,"Bjk1903*");
        click(signInButton);
    }

    public boolean isOnLoginPage() {
        return isDisplayed(loginComfirm);
    }

}

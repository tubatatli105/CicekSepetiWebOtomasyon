import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import pages.*;

public class Test_Add_Product_To_Cart extends BaseTest{

    HomePage homePage ;
    ProductsPage productsPage ;
    ProductDetailPage productDetailPage ;
    CartPage cartPage ;
    LoginPage loginPage;

    @Test
    @Order(1)

    public void login() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.acceptCookies();
        loginPage = new LoginPage(driver);
        Thread.sleep(4000);
        loginPage.signIn();
        Thread.sleep(5000);
        Assertions.assertTrue(loginPage.isOnLoginPage() ,
                "Not on products page!");
    }

    @Test
    @Order(2)

    public void search_a_product() throws InterruptedException {
        homePage.searchBox().search("birthday");
        Thread.sleep(5000);
        Assertions.assertTrue(productsPage.isOnProductPage() ,
                "Not on products page!");
    }

    @Test
    @Order(3)
    public void select_a_product(){
        productDetailPage = new ProductDetailPage(driver);
        productsPage.selectProduct();
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),
                "Not on product detail page!");
    }

    @Test
    @Order(4)
    public void add_product_to_cart(){
        productDetailPage.addToCart();
        Assertions.assertTrue(homePage.isProductCountUp(),
                "Product count did not increase!");
    }

    @Test
    @Order(5)
    public void go_to_cart(){
        cartPage = new CartPage(driver);
        homePage.goToCart();
        Assertions.assertTrue(cartPage.isOnCartsPage() ,
                "Product was not added to cart!");
    }

}

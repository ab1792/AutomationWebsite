package stepDefinitions;

import configs.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.EcommercePages;

import static utils.Constants.AUTOMATION_EXERCISE;

public class Ecommerce {

    WebDriver driver =DriverFactory.getDriver();
    EcommercePages ecommercePages = new EcommercePages(driver);

    @Given("I am on the landing page")
    public void i_am_on_the_landing_page() {
        Assert.assertTrue(driver.getTitle().contains(AUTOMATION_EXERCISE));


    }

    @Then("User clicks on login button")
    public void user_clicks_on_login_button() {

        ecommercePages.clickLoginButton();
    }

    @Then("User enters Email and Password")
    public void user_enters_email_and_password() {
    ecommercePages.enterEmail("aqib179@gmail.com");
    ecommercePages.enterPassword("123456");
    }

    @Then("User clicks login")
    public void user_clicks_login() {
    ecommercePages.clickLoginInLoginPage();


    }

    @Then("User validates if login success")
    public void user_validates_if_login_success() {
    Assert.assertTrue(ecommercePages.setLoginSuccess());

    }

    @Then("User performs validation in the home page")
    public void user_performs_validation_in_the_home_page() {
        ecommercePages.validationSuccess();


    }

    @When("User click on Products")
    public void user_click_on_products() {
     ecommercePages.ProductClickValidation();

    }

    @Then("User performs the validation on the product listing page")
    public void user_performs_the_validation_on_the_product_listing_page() {
    ecommercePages.ProductClickValidation();

    }

    @Then("User clicks on View product")
    public void user_clicks_on_view_product() {
        ecommercePages.clickViewProduct();

    }

    @Then("User performs validation on production description page")
    public void user_performs_validation_on_production_description_page() {
        ecommercePages.descriptionValidationPage();

    }

    @Then("User clicks on Add to cart")
    public void user_clicks_on_add_to_cart() {
        ecommercePages.clicksOnAddToCart();

    }

    @Then("User validates the pop up")
    public void user_validates_the_pop_up() {
        ecommercePages.popUpTextIsDisplayed();

    }

    @When("User clicks on view cart")
    public void user_clicks_on_view_cart() {
        ecommercePages.clickOnViewCartPopUp();


    }

    @Then("User performs validation on the cart page")
    public void user_performs_validation_on_the_cart_page() {
        ecommercePages.crossButtonIsDisplayed();

    }

    @When("User clicks on Proceed to checkout")
    public void user_clicks_on_proceed_to_checkout() {
        ecommercePages.clickProceedToCheckoutButton();

    }

    @Then("User performs validation on checkout page")
    public void user_performs_validation_on_checkout_page() {
        ecommercePages.checkoutCTA();

    }

    @When("User clicks clicks on Place order button")
    public void user_clicks_clicks_on_place_order_button() {
        ecommercePages.placeOrderFinal();


    }

    @Then("User enters the payment details")
    public void user_enters_the_payment_details() {
        ecommercePages.paymentPage();


    }

    @Then("User clicks on Pay and Confirm button")
    public void user_clicks_on_pay_and_confirm_button() {
        ecommercePages.confirmPay();


    }

    @Then("User performs validation on the Congratulations page")
    public void user_performs_validation_on_the_congratulations_page() {
        ecommercePages.congratulationPage();

    }


}

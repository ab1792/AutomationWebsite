package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.ElementUtil;

public class EcommercePages {

    private WebDriver driver;
    private ElementUtil elementUtil;

    public EcommercePages(WebDriver driver) {

        this.driver = driver;
        elementUtil = new ElementUtil(driver);


    }

    private By loginLink = By.xpath("//a[normalize-space()='Signup / Login']");
    private By emaiTextBox = By.xpath("//input[@data-qa='login-email']");
    private By passwordTextBox = By.xpath("//input[@placeholder='Password']");
    private By loginButton = By.xpath("//button[normalize-space()='Login']");
    private By deleteAccount = By.xpath("//a[normalize-space()='Delete Account']");
    private By validationPage = By.xpath("//div[@class='item active']//h1[1]");
    private By validationPage1 = By.xpath("//div[@class='item active']//button[@type='button'][normalize-space()='Test Cases']");
    private By validationPage2 = By.xpath("//div[@class='item active']//button[@type='button'][normalize-space()='APIs list for practice']");
    private By productClick = By.xpath("//a[@href='/products']");
    private By productValidation = By.xpath("//h2[normalize-space()='All Products']");
    private By productValidation1 = By.xpath("//img[@id='sale_image']");
    private By viewProduct = By.xpath("//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]");
    private By addToCartProductDescriptionValidation = By.xpath("//button[normalize-space()='Add to cart']");
    private By amountProductDescriptionValidation = By.xpath("//span[normalize-space()='Rs. 500']");
    private By input = By.xpath("//input[@id='quantity']");
    private By addToCart = By.xpath("//button[normalize-space()='Add to cart']");
    private By popUpValidation = By.xpath("//p[normalize-space()='Your product has been added to cart.']");
    private By viewCartButton = By.xpath("//u[normalize-space()='View Cart']");
    private By crossButton = By.xpath("//i[@class='fa fa-times']");
    private By proceedToCheckoutButton = By.xpath("//a[normalize-space()='Proceed To Checkout']");
    private By checkout = By.xpath("//li[@class='active']");
    private By billingAddress = By.xpath("//h3[normalize-space()='Your billing address']");
    private By orderPlaced = By.xpath("//a[normalize-space()='Place Order']");
    private By nameOnTheCard = By.xpath("//input[@name='name_on_card']");
    private By cardNumber = By.xpath("//input[@name='card_number']");
    private By cvc = By.xpath("//input[@placeholder='ex. 311']");
    private By month = By.xpath("//input[@placeholder='MM']");
    private By year = By.xpath("//input[@placeholder='YYYY']");
    private By cofirmOrder = By.xpath("//button[@id='submit']");
    private By orderPlacedText = By.xpath("//b[normalize-space()='Order Placed!']");
    private By invoice = By.xpath("//a[normalize-space()='Download Invoice']");





    public void clickLoginButton() {
        elementUtil.click(loginLink);

    }

    public void enterEmail(String email) {
        elementUtil.type(emaiTextBox, email);


    }

    public void enterPassword(String password) {
        elementUtil.type(passwordTextBox, password);

    }

    public void clickLoginInLoginPage() {

        elementUtil.click(loginButton);
    }


    public boolean setLoginSuccess() {
        return elementUtil.isDisplayed(deleteAccount);

    }

    public void validationSuccess() {
        Assert.assertTrue(elementUtil.isDisplayed(validationPage));
        Assert.assertTrue(elementUtil.isDisplayed(validationPage1));
        Assert.assertTrue(elementUtil.isDisplayed(validationPage2));
    }

    public void ProductClickValidation() {
        elementUtil.click(productClick);
    }

    public void validationProductSuccess() {
        Assert.assertTrue(elementUtil.isDisplayed(productValidation));
        Assert.assertTrue(elementUtil.isDisplayed(productValidation1));

    }

    public void clickViewProduct() {
        elementUtil.click(viewProduct);
    }

    public void descriptionValidationPage() {
        Assert.assertTrue(elementUtil.isDisplayed(addToCartProductDescriptionValidation));
        Assert.assertTrue(elementUtil.isDisplayed(amountProductDescriptionValidation));
        elementUtil.type(input, "4");

    }

    public void clicksOnAddToCart() {
        elementUtil.click(addToCart);
    }

    public void popUpTextIsDisplayed() {
        Assert.assertTrue(elementUtil.isDisplayed(popUpValidation));
    }

    public void clickOnViewCartPopUp() {
        elementUtil.click(viewCartButton);

    }

    public void crossButtonIsDisplayed() {
        Assert.assertTrue(elementUtil.isDisplayed(crossButton));
    }

    public void clickProceedToCheckoutButton() {
        elementUtil.click(proceedToCheckoutButton);
    }

    public void checkoutCTA() {
        Assert.assertTrue(elementUtil.isDisplayed(checkout));
        Assert.assertTrue(elementUtil.isDisplayed(billingAddress));


    }

    public void placeOrderFinal(){
        elementUtil.click(orderPlaced);
    }
    public void paymentPage(){
        elementUtil.type(nameOnTheCard ,"Aaqib");
        elementUtil.type(cardNumber, "1234567890");
        elementUtil.type(cvc,"311");
        elementUtil.type(month,"12");
        elementUtil.type(year,"1999");


    }
    public void confirmPay() {
        elementUtil.click(cofirmOrder);
    }

    public void congratulationPage(){
        Assert.assertTrue(elementUtil.isDisplayed(orderPlacedText));
        elementUtil.click(invoice);
    }
}
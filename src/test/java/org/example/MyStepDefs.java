package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs // create mystepdef class
{
    HomePage homePage=new HomePage();
    RegistrationPage registrationPage=new RegistrationPage();
    RegistrationResultPage registrationResultPage=new RegistrationResultPage();


    Computers computers=new Computers();
    Desktops desktops=new Desktops();
    BuildYourOwnComputer buildYourOwnComputer=new BuildYourOwnComputer();
    ProductMailFriend productMailFriend=new ProductMailFriend();
    ReferProductResult referProductResult=new ReferProductResult();
    NavigateToDesktopResultPage navigateToDesktopResultPage=new NavigateToDesktopResultPage();
    NewReleaseDetails newReleaseDetails=new NewReleaseDetails();
    NewReleaseCommentResult newReleaseCommentResult=new NewReleaseCommentResult();
    CategoryNavigatePage categoryNavigatePage =new CategoryNavigatePage();
    Utils utils=new Utils();
    FbWindowHandle fbWindowHandle=new FbWindowHandle();
    NewOnlineStoreDetails newOnlineStoreDetails=new NewOnlineStoreDetails();
    Cart cart=new Cart();
    BillingAddress billingAddress= new BillingAddress();
    ShippingMethod shippingMethod=new ShippingMethod();
    PaymentMethod paymentMethod=new PaymentMethod();
    OrderConfirm orderConfirm=new OrderConfirm();




//------------------------new user register ----------------------------------------------
    @Given("user is on registration page")
    public void user_is_on_registration_page()
    {
        homePage.clickOnRegisterButton();
    }

    @When("user enters required registration details")
    public void user_enters_required_registration_details()
    {
        registrationPage.registrationDetails();
    }

    @When("click on register submit button")
    public void click_on_register_submit_button()
    {
        registrationPage.clickOnRegisterSubmitButton();

    }

    @Then("user should able to register successfully")
    public void user_should_able_to_register_successfully()
    {

        registrationResultPage.verifyUserHAsSuccessFullyRegistered();
    }

    //-------------------registered user can refer product to a friend-------------------------------------------------------

    @Then("click on desktop page")
    public void click_on_desktop_page()
    {
        computers.clickOnComputersMenu();
        computers.clickOnDeskTop();

    }

    @Then("click build computer")
    public void click_build_computer() {
        desktops.clickOnBuildYourOwnButton();
    }
    @Then("click on email Friend button")
    public void click_on_email_friend_button()
    {
        buildYourOwnComputer.clickOnMailFriendButton();
    }
    @When("user enter required details")
    public void user_enter_required_details()
    {
        productMailFriend.ReferProductToFriend();
    }
    @Then("user should be able to send mail successfully")
    public void user_should_be_able_to_send_mail_successfully()
    {
        referProductResult.verifyUserHAsSuccessFullySendEmail();


    }
//--------------------------------navigate desktop page ------------------------------------------------

    @Given("USer Is On Home Page")
    public void u_ser_is_on_home_page()
    {

    }
    @When("user click on computer Menu")
    public void user_click_on_computer_menu()
    {
        homePage.clickOnComputerMenu();
    }
    @When("Select Desktop Option")
    public void select_desktop_option()
    {
        computers.clickOnDeskTop();

    }
    @Then("user should able to Navigate Desktop Page")
    public void user_should_able_to_navigate_desktop_page()
    {
          navigateToDesktopResultPage.verifyUserHAsSuccessFullyNavigateDesktopPage();
    }

//---------------------------leave comment on new release---------------------------------------------------------------
    @When("USer Click on News Details Button")
    public void u_ser_click_on_news_details_button()
    {
       homePage.clickOnNewsDetails();
    }
    @When("User Add News Comment Details")
    public void user_add_news_comment_details()
    {
        newReleaseDetails.newsCommentAdd();
    }
    @Then("User should be Add Comment Successfully")
    public void user_should_be_add_comment_successfully()
    {
             newReleaseCommentResult.verifyUserHAsSuccessFullyCommentAdded();
    }


//---------------------------------scenario out line navigate category--------------------------------------

    @Given("I am on home page")
    public void i_am_on_home_page() {

    }
    @When("I click on {string} Button")
    public void i_click_on_button(String string) {
          homePage.ClickOnCategory(string);
    }
    @Then("I should able To Verify The {string} accordingly")
    public void i_should_able_to_verify_the_accordingly(String string) {
          categoryNavigatePage.verifyPageUrl(string);
    }
    @Then("I should Able To Verify the Page Title As {string} Accordingly")
    public void i_should_able_to_verify_the_page_title_as_accordingly(String string) {
        categoryNavigatePage.verifyPageTitle(string);
    }




//............................navigate sub category mouse hover.......

    @When("I take mouse  on {string} Button")
    public void i_take_mouse_on_button(String string)
    {
       categoryNavigatePage.navigateCategoryByHover(string);
    }



    @And("I select sub category{string}")
    public void iSelectSubCategory(String subcategory) {
        categoryNavigatePage.navigateSubCategory(subcategory);
    }

    @Then("I should able to navigate sub category page successfully")
    public void iShouldAbleToNavigateSubCategoryPageSuccessfully() {
    }

    //----------------Fb window handle----------------------------------------


    @Given("user is on home page")
    public void user_is_on_home_page() {

    }
    @When("user click on fb button")
    public void user_click_on_fb_button() {
        fbWindowHandle.multipleWindowHandle();
    }
    @Then("open fb in new tab successfully")
    public void open_fb_in_new_tab_successfully() {
        fbWindowHandle.iswindowsuccessfully();

    }
    //------------------------------vote------------

    @When("user click on vote Button")
    public void user_click_on_vote_button() {
      homePage.clickOnVote();
    }
    @When("accept apper alert")
    public void accept_apper_alert() {

    }
    @Then("verify text message of alert")
    public void verify_text_message_of_alert() {
       homePage.voteAssert();
    }

//----------------------------------------new store comment-------------------

    @Given("User is alredy register")
    public void user_is_alredy_register()
    {
        homePage.clickOnRegisterButton();
        registrationPage.registrationDetails();
        registrationPage.clickOnRegisterSubmitButton();

    }
    @When("user click on new online store details button")
    public void user_click_on_new_online_store_details_button()
    {
       homePage.clickOnNewOnlineStore();
    }
    @When("verify title or Subtitle of page")
    public void verify_title_or_subtitle_of_page()
    {
        newOnlineStoreDetails.verifyTitleOfPage();

    }
    @When("user enters title and comment")
    public void user_enters_title_and_comment()
    {
        newOnlineStoreDetails.addCommentDetails();
    }
    @When("user click on NewComment Button")
    public void user_click_on_new_comment_button()
    {

    }
    @When("verify comment add successfully")
    public void verify_comment_add_successfully() {
            newOnlineStoreDetails.commentSuccessfullyAdded();
    }
    @Then("user can see added comment at end of list successfully")
    public void user_can_see_added_comment_at_end_of_list_successfully()
    {
        newOnlineStoreDetails.verifyISCommentAddedAtLast();

    }

    //-------------------------add to cart-----------------------
    @When("Select on computer Menu")
    public void selectOnComputerMenu() {
        homePage.clickOnComputerMenu();
        computers.clickOnDeskTop();

    }

    @And("click on build computer")
    public void clickOnBuildComputer() {
       desktops.clickOnBuildYourOwnButton();
    }
    @When("Select Required Feilds")
    public void select_required_feilds()
    {
          buildYourOwnComputer.productDetails();
    }

    @When("click on Add to Cart")
    public void click_on_add_to_cart()
    {
            buildYourOwnComputer.addCart();
    }

    @When("click on CheckOut")
    public void click_on_check_out()
    {
        cart.checkOut();
    }

    @When("Enter Address Detail and conitue")
    public void enter_address_detail_and_conitue()
    {
        billingAddress.billingAddressDetails();

    }

    @And("Choose Shipping Method")
    public void chooseShippingMethod()
    {
        shippingMethod.chooseShippingMethod();
    }

    @When("Choose Payment Credit card Method and Contiue")
    public void choose_payment_credit_card_method_and_contiue()
    {
        paymentMethod.choosePaymentMethod();

    }

    @When("Enter Card Details and continue")
    public void enter_card_details_and_continue()
    {
        paymentMethod.paymentInfo();

    }

    @When("Click On Confirm")
    public void click_on_confirm()
    {
        orderConfirm.clickOnConfirm();

    }

    @Then("verify You order has been successfully")
    public void verify_you_order_has_been_successfully()
    {
        orderConfirm.VerifySuccessfullyOrdered();

    }


}

package org.example;

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







}

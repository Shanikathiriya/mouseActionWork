package org.example;

import org.openqa.selenium.By;

public class BuildYourOwnComputer extends Utils //create class and inherit utills
{
    By emailFriendButton=By.xpath("//button[@class='button-2 email-a-friend-button']");


    public void clickOnMailFriendButton() //create the method
    {

        clickOnElement(emailFriendButton);// click on  email a friend
    }
}

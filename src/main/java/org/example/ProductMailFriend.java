package org.example;

import org.openqa.selenium.By;

public class ProductMailFriend extends Utils //create class and inherit utils class
{
    String emailText1="sunny.m.kathiriya+"+currentTimeStamp()+"@gmail.com";
    By emailFriend=By.xpath("//input[@id='FriendEmail']");


    By comment=By.xpath("//textarea[@id='PersonalMessage']");
    By sendEmailButton=By.xpath("//button[@name='send-email']");
    LoadProp loadProp=new LoadProp();

    public void  ReferProductToFriend() //create a method for refer product to friend
    {

        typeText(emailFriend,loadProp.getProperty("friendmail"));   //type a friend email



        typeText(comment, loadProp.getProperty("commentmessage"));//type comment in comment box

        clickOnElement(sendEmailButton);//click on send email button




    }
}

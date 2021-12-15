package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils //create class and inherit utils class
{

        By registerButton= By.xpath("//a[@href='/register?returnUrl=%2F']");
        By newReleaseCommentButton= By.xpath("//div[@class='buttons']/a[@href='/nopcommerce-new-release']");
        By computerMenu= By.xpath("//a[@href='/computers']");

        public void clickOnRegisterButton() //create method for click on register button
        {

            clickOnElement(registerButton);
        }
        public void clickOnNewsDetails()//create method for click on news details
        {
            clickOnElement(newReleaseCommentButton);
        }
        public void clickOnComputerMenu() //create method for click on computer
        {
            clickOnElement(computerMenu); //click on computers category

        }
}

package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Utils //create class and inherit utils class
{

        By registerButton= By.xpath("//a[@href='/register?returnUrl=%2F']");
        By newReleaseCommentButton= By.xpath("//div[@class='buttons']/a[@href='/nopcommerce-new-release']");
        By computerMenu= By.xpath("//a[@href='/computers']");
        By voteButton=By.id("vote-poll-1");
        String alertTxt;
        By newOnlineStoreButton=By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[5]/div[2]/div[1]/div[3]/a");




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
        public void ClickOnCategory(String name)
        {
                clickOnElement(By.linkText(name));
        }

        public void clickOnVote()
        {
            clickOnElement(voteButton);
            alertTxt= driver.switchTo().alert().getText();
            driver.switchTo().alert().accept();
        }
        public void voteAssert()
        {
                Assert.assertTrue(alertTxt.equals(loadProp.getProperty("votemsg")));
        }

        public void clickOnNewOnlineStore()
        {
                clickOnElement(newOnlineStoreButton);

        }

}

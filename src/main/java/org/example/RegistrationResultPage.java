package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationResultPage extends Utils //create class and inherit utils class
{

   public void verifyUserHAsSuccessFullyRegistered() // create method for verify user successfully registered or not
   {
       String actualRegisterSuccessMessage=getTextFromElement(By.xpath("//div[@class='page registration-result-page']/div[2]/div[1]"));
       String expectedRegisterSuccessMessage="Your registration completed";

       Assert.assertTrue(actualRegisterSuccessMessage.equals(expectedRegisterSuccessMessage),"Register success message is incorrect");


   }

}

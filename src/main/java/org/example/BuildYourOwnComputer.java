
package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class BuildYourOwnComputer extends Utils //create class and inherit utills
{

    By emailFriendButton=By.xpath("//button[@class='button-2 email-a-friend-button']");
    //By processor=By.xpath("//*[@id='product_attribute_1']");
    By processor=By.id("product_attribute_1");
    By ram=By.xpath("//select[@name='product_attribute_2']");
    By hddRadio=By.xpath("//*[@id='product_attribute_3_6']");
    By osRadio=By.xpath("//*[@id='product_attribute_4_9']");
   // By microsoft=By.xpath("//*[@id='product_attribute_input_5']/ul/li[1]/label");
    By acrobat=By.xpath("//*[@id='product_attribute_input_5']/ul/li[2]/label");
    By totalCommander=By.xpath("//*[@id='product_attribute_input_5']/ul/li[3]/label");
    By addToCartButton=By.id("add-to-cart-button-1");
    By shoppingButton=By.xpath("//*[@id=\"topcartlink\"]/a/span[1]");

    public void productDetails() {


        selectByValue(processor, loadProp.getProperty("proccessor"));
        selectByValue(ram, loadProp.getProperty("ram"));


        clickOnElement(hddRadio);
        clickOnElement(osRadio);
        // clickOnElement(microsoft);
        clickOnElement(acrobat);
        clickOnElement(totalCommander);

    }
    public void addCart()
    {
         clickOnElement(addToCartButton);
         clickOnElement(shoppingButton);

    }
    public void clickOnMailFriendButton() //create the method
    {

        clickOnElement(emailFriendButton);// click on  email a friend
    }
}

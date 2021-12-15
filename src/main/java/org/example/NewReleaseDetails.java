package org.example;

import org.openqa.selenium.By;

public class NewReleaseDetails extends Utils // create class and inherit utils class
{
    //By newReleaseCommentButton= By.xpath("//div[@class='buttons']/a[@href='/nopcommerce-new-release']");
    By commenter=By.xpath("//input[@class='enter-comment-title']");
    By commentText=By.xpath("//div[@class='form-fields']/div[2]/textarea");
    By addCommentButton=By.xpath("//div[@class='buttons']/button");

   LoadProp loadProp=new LoadProp();
    public void newsCommentAdd() //create method for add new release product comment
    {
     //   clickOnElement(newReleaseCommentButton);     //click on news details

        typeText(commenter, loadProp.getProperty("releasecommentr"));  //type name of user who add comment

        typeText(commentText, loadProp.getProperty("newreleasecommentmessage")); //type comment in comment box

        clickOnElement(addCommentButton);//click on new comment button for add comment





    }

}

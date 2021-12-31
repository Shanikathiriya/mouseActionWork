package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NewOnlineStoreDetails extends Utils
{
    By title= By.xpath("//input[@id='AddNewComment_CommentTitle']");
    By Comment=By.xpath("//textarea[@id='AddNewComment_CommentText']");
    By newCommentButton=By.xpath("//button[@class='button-1 news-item-add-comment-button']");
    By commentList=By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[4]");
    By commentmsg=By.xpath("//*[@id=\"comments\"]/div[2]/div");
    By pageTitle=By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[1]/h1");


    public void addCommentDetails()
    {
        typeText(title, loadProp.getProperty("tilte1"));
        typeText(Comment, loadProp.getProperty("NewOnlineComment"));
        clickOnElement(newCommentButton);





    }
    public void verifyTitleOfPage()
    {
        Assert.assertTrue(driver.findElement(pageTitle).getText().equals(loadProp.getProperty("newStorePageTitle")));

    }
    public void commentSuccessfullyAdded()
    {
        Assert.assertTrue(driver.findElement(commentmsg).getText().equals(loadProp.getProperty("newStoreComment")));
    }
    public void verifyISCommentAddedAtLast()
    {

        WebElement select=driver.findElement(commentList);
        List<WebElement> mathes=select.findElements(By.xpath("//div[@class=\"comment news-comment\"]"));
        WebElement lastComment=mathes.get(mathes.size()-1);
        Assert.assertTrue(lastComment.getText().contains("Nice Store"));
        System.out.println("----------Last Comment From List----------");
        System.out.println(lastComment.getText());
    }
}

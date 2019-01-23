package lekcija7.pages.java.MDELFI.Pages;

import lekcija7.pages.java.MDELFI.Pages.ArticlePage;
import lekcija7.pages.java.TestTVNet.Pages.BaseFuncTVNet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
       BaseFunc baseFunc;

       private final By ARTICLE = By.xpath(".//div[contains(@class, 'md-mosaic-title')]");
       private final By COMMENT_COUNT = By.xpath(".//a[(@rel ='nofollow')]");

       public HomePage(BaseFunc baseFunc) {
           this.baseFunc = baseFunc;
       }

       public WebElement getArticleById(int id) {
           return baseFunc.getElements(ARTICLE).get(id);
       }

       public Integer getCommentCountById(int id) {
           String commentCount = getArticleById(id).findElement(COMMENT_COUNT).getText();
           commentCount = commentCount.substring(1, commentCount.length() - 1);
           return Integer.valueOf(commentCount);
       }

       public ArticlePage goToArticle(int id) {
           getArticleById(id).click();
           return new ArticlePage(baseFunc);
       }
   }




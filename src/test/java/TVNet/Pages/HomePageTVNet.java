package lekcija7.pages.java.TestTVNet.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePageTVNet {
    BaseFuncTVNet baseFuncTVNet;

    private final By ARTICLE = By.xpath(".//*[@itemprop = 'url']");
    private final By COMMENT_COUNT = By.xpath(".//span[contains(@class, 'list-article__comment')]");

    public HomePageTVNet(BaseFuncTVNet baseFuncTVNet) {
        this.baseFuncTVNet = baseFuncTVNet;
    }

    public WebElement getArticleById(int id) {
        return baseFuncTVNet.getElements(ARTICLE).get(id);
    }

    public Integer getCommentCountById(int id) {
        String commentCount = getArticleById(id).findElement(COMMENT_COUNT).getText();
        return Integer.valueOf(commentCount);
    }

    public ArticlePageTVNet goToArticle(int id) {
        getArticleById(id).click();
        return new ArticlePageTVNet(baseFuncTVNet);
    }
}


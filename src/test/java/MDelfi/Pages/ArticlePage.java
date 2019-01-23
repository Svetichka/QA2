package lekcija7.pages.java.MDELFI.Pages;

import cucumber.api.java.bs.A;
import lekcija7.pages.java.barbora.pages.LoginPopup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import sun.plugin.dom.exception.BrowserNotSupportedException;

public class ArticlePage {
    BaseFunc baseFunc;
    private final By ARTICLE_PAGE_COMMENT_COUNT = By.xpath(".//a[(@class = 'commentCount')]");
    public ArticlePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public Integer getComments() {
        String comments = baseFunc.getElement(ARTICLE_PAGE_COMMENT_COUNT).getText();
        comments = comments.substring(1, comments.length()-1);
        return Integer.valueOf(comments);
    }

    public PageOfComments goToPageOfComments(int id) {
        baseFunc.getElements(ARTICLE_PAGE_COMMENT_COUNT).get(id).click();
        return new PageOfComments(baseFunc);
    }
}





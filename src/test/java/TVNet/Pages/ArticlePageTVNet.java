package lekcija7.pages.java.TestTVNet.Pages;

import lekcija7.pages.java.TestTVNet.Pages.BaseFuncTVNet;
import lekcija7.pages.java.TestTVNet.Pages.PageOfCommentsTVNet;
import org.openqa.selenium.By;

public class ArticlePageTVNet {

    BaseFuncTVNet baseFuncTVNet;
    private final By ARTICLE_PAGE_COMMENT_COUNT = By.xpath(".//a [(@class = 'article-share__item article-share__item--comments button section-bg-color-after')]");
    public ArticlePageTVNet(BaseFuncTVNet baseFuncTVNet) {
        this.baseFuncTVNet = baseFuncTVNet;
    }

    public Integer getComments() {
       String comments = baseFuncTVNet.getElement(ARTICLE_PAGE_COMMENT_COUNT).getText();
        return Integer.valueOf(comments);
    }


    public PageOfCommentsTVNet goToPageOfComments(int id) {
        baseFuncTVNet.getElements(ARTICLE_PAGE_COMMENT_COUNT).get(id).click();
        return new PageOfCommentsTVNet(baseFuncTVNet);
    }
}

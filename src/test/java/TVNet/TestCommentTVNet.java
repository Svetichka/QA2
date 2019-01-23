package lekcija7.pages.java.TestTVNet.Pages;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCommentTVNet {
    BaseFuncTVNet baseFuncTVNet = new BaseFuncTVNet();
    private final String HOME_PAGE = "http://www.tvnet.lv";

    @Test
    public void commentCheck() {
        baseFuncTVNet.goToURL(HOME_PAGE);
        HomePageTVNet homePageTVNet = new HomePageTVNet(baseFuncTVNet);

        Integer commentCount = homePageTVNet.getCommentCountById(5);
        ArticlePageTVNet articlePageTVNet = homePageTVNet.goToArticle(5);

        ArticlePageTVNet articlePageCommentTVNet = new ArticlePageTVNet(baseFuncTVNet);
        Integer articlePageCommentsTVNet = articlePageCommentTVNet.getComments();



        Assertions.assertTrue(commentCount == articlePageCommentsTVNet, "Wrong Article page Comment Count");

        articlePageTVNet.goToPageOfComments(0);

        PageOfCommentsTVNet pageOfCommentsTVNet = new PageOfCommentsTVNet(baseFuncTVNet);
        Integer finalCommentsTVNet = pageOfCommentsTVNet.getCommentsFinal();

        Assertions.assertTrue(commentCount == finalCommentsTVNet, "Wrong Article page Comment Count");

        baseFuncTVNet.close();
    }
}

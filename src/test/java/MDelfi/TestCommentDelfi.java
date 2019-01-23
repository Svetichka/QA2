package lekcija7.pages.java.MDELFI.Pages;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestCommentDelfi {
    BaseFunc baseFunc = new BaseFunc();
    private final String HOME_PAGE = "http://m.rus.delfi.lv";

    @Test
    public void commentCheck() {
        baseFunc.goToURL(HOME_PAGE);
        HomePage homePage = new HomePage(baseFunc);

        Integer commentCount = homePage.getCommentCountById(3);
        ArticlePage articlePage = homePage.goToArticle(3);

        ArticlePage articlePageComment = new ArticlePage(baseFunc);
        Integer articlePageComments = articlePageComment.getComments();

        Assertions.assertEquals(commentCount, articlePageComments, "Wrong comment count on article page!");//baseFunc.goToPageOfComments(HOME_PAGE);
        Assertions.assertTrue(commentCount == articlePageComments, "Wrong Article page Comment Count");

        articlePage.goToPageOfComments(0);
        PageOfComments pageOfComments = new PageOfComments(baseFunc);

        Integer sumOfComments = pageOfComments.getCommentsRegistreted() + pageOfComments.getCommentsAnonymous();
        System.out.println("sumOfComments = " + sumOfComments);

        Assertions.assertTrue(commentCount == (pageOfComments.getCommentsRegistreted() + pageOfComments.getCommentsAnonymous()), "Wrong Article page Comment Count");

        baseFunc.close();
    }
}





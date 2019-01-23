package lekcija7.pages.java.MDELFI.Pages;

import lekcija7.pages.java.MDELFI.Pages.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageOfComments {
    private static BaseFunc baseFunc;

    private static final By COMMENT_REGISTERED =By.xpath(".//a[contains(@class, 'comment-thread-switcher-list-a comment-thread-switcher-list-a-reg')]/span");
    private final By COMMENT_ANONYMOUS = By.xpath(".//a[contains(@class, 'comment-thread-switcher-list-a comment-thread-switcher-list-a-anon')]/span");

    public PageOfComments(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public static Integer getCommentsRegistreted() {
        String comments = baseFunc.getElement(COMMENT_REGISTERED).getText();
        comments = comments.substring(1, comments.length()-1);
        return Integer.valueOf(comments);
    }

    public Integer getCommentsAnonymous() {
        String comments = baseFunc.getElement(COMMENT_ANONYMOUS).getText();
        comments = comments.substring(1, comments.length()-1);
        return Integer.valueOf(comments);
    }
}



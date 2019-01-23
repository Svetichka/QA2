package lekcija7.pages.java.TestTVNet.Pages;

import lekcija7.pages.java.TestTVNet.Pages.BaseFuncTVNet;
import org.openqa.selenium.By;

public class PageOfCommentsTVNet {
    private static BaseFuncTVNet baseFuncTVNet;
    private static final By COMMENTS_BTN = By.xpath(".//span[contains(@class, 'heading__count')]");

    public PageOfCommentsTVNet(BaseFuncTVNet baseFuncTVNet) {
        this.baseFuncTVNet = baseFuncTVNet;
    }



    public static Integer getCommentsFinal() {
        String commentsFinal = baseFuncTVNet.getElement(COMMENTS_BTN).getText();
        return Integer.valueOf(commentsFinal);
    }
}

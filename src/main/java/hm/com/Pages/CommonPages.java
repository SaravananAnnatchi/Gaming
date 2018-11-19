package hm.com.Pages;

import hm.com.WebDriverProvider.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonPages extends BaseClass {

    public void slider(WebElement element) {
        Actions action = new Actions(driver);
        action.dragAndDropBy(element, 0, 25).build().perform();
    }

    public void explicitWaitTextToBePresent(WebElement element, String text) {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.textToBePresentInElement(element, text));
    }


}

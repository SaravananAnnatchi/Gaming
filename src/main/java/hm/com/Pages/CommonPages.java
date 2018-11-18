package hm.com.Pages;

import hm.com.WebDriverProvider.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class CommonPages extends BaseClass {

    public String timestamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }

    public void takeScreenshot() {
        try {
            File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sourceFile, new File("C:\\Screenshot" + UUID.randomUUID() + "_" + timestamp() + ".png"));

        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public void slider(WebElement element) {
        Actions action = new Actions(driver);
        action.dragAndDropBy(element, 0, 25).build().perform();
    }


}

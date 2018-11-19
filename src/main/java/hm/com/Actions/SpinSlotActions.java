package hm.com.Actions;

import hm.com.WebDriverProvider.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpinSlotActions extends BaseClass {

    public static int totalCredits;

    @FindBy(xpath = "//div[@id='trPrize_32']//span[@class='tdPayout']")
    WebElement bigWinPrice;
    @FindBy(xpath = "//div[@id='trPrize_33']//span[@class='tdPayout']")
    WebElement barPrice;
    @FindBy(xpath = "//div[@id='trPrize_37']//span[@class='tdPayout']")
    WebElement sevenPrice;
    @FindBy(xpath = "//div[@id='trPrize_40']//span[@class='tdPayout']")
    WebElement twoMixPrice;
    @FindBy(xpath = "//div[@id='trPrize_34']//span[@class='tdPayout']")
    WebElement plumPrice;
    @FindBy(xpath = "//div[@id='trPrize_38']//span[@class='tdPayout']")
    WebElement bananaPrice;
    @FindBy(xpath = "//div[@id='trPrize_35']//span[@class='tdPayout']")
    WebElement watermelonPrice;
    @FindBy(xpath = "//div[@id='trPrize_41']//span[@class='tdPayout']")
    WebElement threeMixPrice;
    @FindBy(xpath = "//div[@id='trPrize_45']//span[@class='tdPayout']")
    WebElement blankPrice;

    @FindBy(xpath = "//div[@id='trPrize_32']")
    WebElement bigWinWon;
    @FindBy(xpath = "//div[@id='trPrize_33']")
    WebElement barbarWon;
    @FindBy(xpath = "//div[@id='trPrize_37']")
    WebElement sevenWon;
    @FindBy(xpath = "//div[@id='trPrize_40']")
    WebElement twoMixWon;
    @FindBy(xpath = "//div[@id='trPrize_34']")
    WebElement plumWon;
    @FindBy(xpath = "//div[@id='trPrize_38']")
    WebElement bananaWon;
    @FindBy(xpath = "//div[@id='trPrize_35']")
    WebElement watermelonWon;
    @FindBy(xpath = "//div[@id='trPrize_41']")
    WebElement threeMixWon;
    @FindBy(xpath = "//div[@id='trPrize_45']")
    WebElement blankWon;

    @FindBy(xpath = "//span[@id='lastWin']")
    WebElement lastWin;
    @FindBy(xpath = "//span[@id='credits']")
    WebElement credits;

    public SpinSlotActions() {
        PageFactory.initElements(driver, this);
    }

    public void actualMatch(String reel1Match, String reel2Match, String reel3Match, int betting, int beforeSpinCredit) {
        // Thread.sleep(10000);
        //  int afterSpinCredit = Integer.parseInt(credits.getText());
        int afterSpinCredit = beforeSpinCredit - betting;
        if (reel1Match.equals("Seven") && reel2Match.equals("Seven") && reel3Match.equals("Seven")) {
            sevenWon(afterSpinCredit);
        } else if (reel1Match.equals("Watermelon") && reel2Match.equals("Watermelon") && reel3Match.equals("Watermelon")) {
            waterMelonWon(afterSpinCredit);

        } else if (reel1Match.equals("Plum") && reel2Match.equals("Plum") && reel3Match.equals("Plum")) {
            plumWon(afterSpinCredit);

        } else if (reel1Match.equals("Bar") && reel2Match.equals("Bar") && reel3Match.equals("Bar")) {
            barWon(afterSpinCredit);

        } else if (reel1Match.equals("BigWin") && reel2Match.equals("BigWin") && reel3Match.equals("BigWin")) {
            bigWinWon(afterSpinCredit);

        } else if (reel1Match.equals("Banana") && reel2Match.equals("Banana") && reel3Match.equals("Banana")) {
            bananaWon(afterSpinCredit);

        } else if (reel1Match.equals("Blank") && reel2Match.equals("Blank") && reel3Match.equals("Blank")) {
            blankWon(afterSpinCredit);

        } else if (((reel1Match.equals("Watermelon")) || (reel1Match.equals("Banana")))
                && ((reel2Match.equals("Plum")) || (reel2Match.equals("Seven")))
                && ((reel3Match.equals("Bar")) || (reel3Match.equals("BigWin")))) {
            mixOfTwoWon(afterSpinCredit);

        } else if (((reel1Match.equals("Watermelon")) || (reel1Match.equals("Banana")) || (reel1Match.equals("Plum")))
                && ((reel2Match.equals("Watermelon")) || (reel2Match.equals("Banana")) || (reel2Match.equals("Plum")))
                && ((reel3Match.equals("Watermelon")) || (reel3Match.equals("Banana")) || (reel3Match.equals("Plum")))) {
            mixOfThreeWon(afterSpinCredit);

        } else {
            noWin(afterSpinCredit);
        }

    }

    public void sevenWon(int afterSpinCredit) {
        int winAmount = Integer.parseInt(sevenPrice.getText());
        explicitWaitTextToBePresent(lastWin, sevenPrice.getText());
        int lastWinAmount = Integer.parseInt(lastWin.getText());
        Assert.assertEquals(winAmount, lastWinAmount);
        totalCredits = afterSpinCredit + winAmount;
        explicitWaitTextToBePresent(credits, Integer.toString(totalCredits));
        int currentCredit = Integer.parseInt(credits.getText());
        Assert.assertEquals(totalCredits, currentCredit);
        boolean wonMessage = sevenWon.getAttribute("class").contains("won");
        Assert.assertTrue(wonMessage);
    }

    public void waterMelonWon(int afterSpinCredit) {
        int winAmount = Integer.parseInt(watermelonPrice.getText());
        explicitWaitTextToBePresent(lastWin, watermelonPrice.getText());
        int lastWinAmount = Integer.parseInt(lastWin.getText());
        Assert.assertEquals(winAmount, lastWinAmount);
        totalCredits = afterSpinCredit + winAmount;
        explicitWaitTextToBePresent(credits, Integer.toString(totalCredits));
        int currentCredit = Integer.parseInt(credits.getText());
        Assert.assertEquals(totalCredits, currentCredit);
        boolean wonMessage = watermelonWon.getAttribute("class").contains("won");
        Assert.assertTrue(wonMessage);
    }

    public void plumWon(int afterSpinCredit) {
        int winAmount = Integer.parseInt(plumPrice.getText());
        explicitWaitTextToBePresent(lastWin, plumPrice.getText());
        int lastWinAmount = Integer.parseInt(lastWin.getText());
        Assert.assertEquals(winAmount, lastWinAmount);
        totalCredits = afterSpinCredit + winAmount;
        explicitWaitTextToBePresent(credits, Integer.toString(totalCredits));
        int currentCredit = Integer.parseInt(credits.getText());
        Assert.assertEquals(totalCredits, currentCredit);
        boolean wonMessage = plumWon.getAttribute("class").contains("won");
        Assert.assertTrue(wonMessage);
    }

    public void barWon(int afterSpinCredit) {
        int winAmount = Integer.parseInt(barPrice.getText());
        explicitWaitTextToBePresent(lastWin, barPrice.getText());
        int lastWinAmount = Integer.parseInt(lastWin.getText());
        Assert.assertEquals(winAmount, lastWinAmount);
        totalCredits = afterSpinCredit + winAmount;
        explicitWaitTextToBePresent(credits, Integer.toString(totalCredits));
        int currentCredit = Integer.parseInt(credits.getText());
        Assert.assertEquals(totalCredits, currentCredit);
        boolean wonMessage = barbarWon.getAttribute("class").contains("won");
        Assert.assertTrue(wonMessage);
    }

    public void bigWinWon(int afterSpinCredit) {
        int winAmount = Integer.parseInt(bigWinPrice.getText());
        explicitWaitTextToBePresent(lastWin, bigWinPrice.getText());
        int lastWinAmount = Integer.parseInt(lastWin.getText());
        Assert.assertEquals(winAmount, lastWinAmount);
        totalCredits = afterSpinCredit + winAmount;
        explicitWaitTextToBePresent(credits, Integer.toString(totalCredits));
        int currentCredit = Integer.parseInt(credits.getText());
        Assert.assertEquals(totalCredits, currentCredit);
        boolean wonMessage = bigWinWon.getAttribute("class").contains("won");
        Assert.assertTrue(wonMessage);
    }

    public void bananaWon(int afterSpinCredit) {
        int winAmount = Integer.parseInt(bananaPrice.getText());
        explicitWaitTextToBePresent(lastWin, bananaPrice.getText());
        int lastWinAmount = Integer.parseInt(lastWin.getText());
        Assert.assertEquals(winAmount, lastWinAmount);
        totalCredits = afterSpinCredit + winAmount;
        explicitWaitTextToBePresent(credits, Integer.toString(totalCredits));
        int currentCredit = Integer.parseInt(credits.getText());
        Assert.assertEquals(totalCredits, currentCredit);
        boolean wonMessage = bananaWon.getAttribute("class").contains("won");
        Assert.assertTrue(wonMessage);
    }

    public void blankWon(int afterSpinCredit) {
        int winAmount = Integer.parseInt(blankPrice.getText());
        explicitWaitTextToBePresent(lastWin, blankPrice.getText());
        int lastWinAmount = Integer.parseInt(lastWin.getText());
        Assert.assertEquals(winAmount, lastWinAmount);
        totalCredits = afterSpinCredit + winAmount;
        explicitWaitTextToBePresent(credits, Integer.toString(totalCredits));
        int currentCredit = Integer.parseInt(credits.getText());
        Assert.assertEquals(totalCredits, currentCredit);
        boolean wonMessage = blankWon.getAttribute("class").contains("won");
        Assert.assertTrue(wonMessage);
    }

    public void mixOfTwoWon(int afterSpinCredit) {
        int winAmount = Integer.parseInt(twoMixPrice.getText());
        explicitWaitTextToBePresent(lastWin, twoMixPrice.getText());
        int lastWinAmount = Integer.parseInt(lastWin.getText());
        Assert.assertEquals(winAmount, lastWinAmount);
        totalCredits = afterSpinCredit + winAmount;
        explicitWaitTextToBePresent(credits, Integer.toString(totalCredits));
        int currentCredit = Integer.parseInt(credits.getText());
        Assert.assertEquals(totalCredits, currentCredit);
        boolean wonMessage = twoMixWon.getAttribute("class").contains("won");
        Assert.assertTrue(wonMessage);
    }

    public void mixOfThreeWon(int afterSpinCredit) {
        int winAmount = Integer.parseInt(threeMixPrice.getText());
        explicitWaitTextToBePresent(lastWin, threeMixPrice.getText());
        int lastWinAmount = Integer.parseInt(lastWin.getText());
        Assert.assertEquals(winAmount, lastWinAmount);
        totalCredits = afterSpinCredit + winAmount;
        explicitWaitTextToBePresent(credits, Integer.toString(totalCredits));
        int currentCredit = Integer.parseInt(credits.getText());
        Assert.assertEquals(totalCredits, currentCredit);
        boolean wonMessage = threeMixWon.getAttribute("class").contains("won");
        Assert.assertTrue(wonMessage);
    }

    public void noWin(int afterSpinCredit) {
        String lastWinMessage = lastWin.getText();
        Assert.assertEquals("", lastWinMessage);
        int currentCredit = Integer.parseInt(credits.getText());
        Assert.assertEquals(afterSpinCredit, currentCredit);
    }
}

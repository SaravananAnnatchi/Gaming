package hm.com.Pages;

import hm.com.WebDriverProvider.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class SpinSlotMachine extends BaseClass {

    CommonPages commonPages = new CommonPages();

    public String found1 = "none";
    public static String returnValue = "Success";

    @FindBy(xpath = "//div[@id='ReelContainer']//div[contains(@class,'reel')]")
    List<WebElement> reelContainer;
    @FindBy(xpath = "//div[@id='betContainer']")
    WebElement betContainer;
    @FindBy(xpath = "//div[@id='spinButton']")
    WebElement spinButton;
    @FindBy(xpath = "//div[@id='prizes_list_slotMachine1']")
    WebElement prizeListSlotMachine;
    @FindBy(xpath = "//div[@id='prizes_list_slotMachine1']//span")
    List<WebElement> prizeList;
    @FindBy(xpath = "//div[@id='prizes_list_slotMachine1']//div[contains(@class,'tdReels')]")
    WebElement priceListImageRow;
    @FindBy(xpath = "//div[@id='prizes_list_slotMachine1']//div[contains(@class,'reelIcon')]")
    WebElement priceListImages;
    @FindBy(xpath = "//span[@id='lastWin']")
    WebElement lastWin;
    @FindBy(xpath = "//span[@id='credits']")
    WebElement credits;
    @FindBy(xpath = "//span[@id='bet']")
    WebElement bet;
    @FindBy(xpath = "//div[@id='betSpinUp']")
    WebElement betSpinUp;
    @FindBy(xpath = "//div[@id='betSpinDown']")
    WebElement betSpinDown;
    @FindBy(xpath = "//div[@id='reel1']")
    WebElement reel1;
    @FindBy(xpath = "//div[@id='reel2']")
    WebElement reel2;
    @FindBy(xpath = "//div[@id='reel3']")
    WebElement reel3;


    //div[@id='failedRequestMessage']
    //div[@id='prizes_list_slotMachine1']


    public SpinSlotMachine() {
        PageFactory.initElements(driver, this);
    }

    public String isAt() {
        String title = driver.getTitle();
        commonPages.slider(bet);
        return title;
    }

    public int getBet() {
        bet.isDisplayed();
        int betting = Integer.parseInt(bet.getText());
        return betting;
    }

    public int getTotalSpins() {
        credits.isDisplayed();
        int creditsPoint = Integer.parseInt(credits.getText());
        return creditsPoint;
    }

    public String spinButton() {
        if (getTotalSpins() > getBet()) {
            boolean enabled = spinButton.isEnabled();
            if (enabled) {
                spinButton.click();
            } else {
                returnValue = "Failed";
            }
        } else {
            returnValue = "Failed";
        }
        return returnValue;
    }

    public String getReel1Result() throws InterruptedException {
        Thread.sleep(5000);
        String attributeValue = reel1.getAttribute("style");
        String reel1Result = resultsFoundOnReels(attributeValue);
        return reel1Result;
    }

    public String getReel2Result() {
        String attributeValue = reel2.getAttribute("style");
        String reel2Result = resultsFoundOnReels(attributeValue);
        return reel2Result;
    }

    public String getReel3Result() {
        String attributeValue = reel3.getAttribute("style");
        String reel3Result = resultsFoundOnReels(attributeValue);
        return reel3Result;
    }

    public String resultsFoundOnReels(String attributeValue) {
        switch (attributeValue) {
            case "top: -754px;":
                found1 = "Seven";
                break;
            case "top: -874px;":
                found1 = "Watermelon";
                break;
            case "top: -1114px;":
                found1 = "Plum";
                break;
            case "top: -994px;":
                found1 = "Bar";
                break;
            case "top: -1234px;":
                found1 = "BigWin";
                break;
            case "top: -634px;":
                found1 = "Banana";
                break;
            case "top: -0000px;":
                found1 = "Blank";
                break;
        }
        return found1;
    }

    public String lastWinDefaultValue() {
        lastWin.isDisplayed();
        String lastWinDefault = lastWin.getText();
        return lastWinDefault;
    }

    public int betDefaultValue() {
        bet.isDisplayed();
        int betDefault = Integer.parseInt(bet.getText());
        return betDefault;
    }

    public ArrayList<Integer> getPriceListValues() {
        ArrayList<Integer> prices = new ArrayList<Integer>();
        prizeListSlotMachine.isDisplayed();
        for (int i = 0; i < prizeList.size(); i++) {
            int value = Integer.parseInt(prizeList.get(i).getText());
            prices.add(i, value);
        }
        return prices;
    }

    public int getNoOfReels() {
        int totalReels = reelContainer.size();
        return totalReels;
    }

    public boolean creditIsPresent() {
        boolean displayed = credits.isDisplayed();
        if (displayed) {
            return true;
        }
        return false;
    }

    public boolean betUpArrowIsPresent() {
        boolean enabled = betSpinUp.isEnabled();
        if (enabled) {
            return true;
        }
        return false;
    }

    public boolean betDownArrowIsPresent() {
        boolean enabled = betSpinDown.isEnabled();
        if (enabled) {
            return true;
        }
        return false;
    }

    public boolean spinButtonIsPresent() {
        boolean displayed = spinButton.isDisplayed();
        if (displayed) {
            return true;
        }
        return false;
    }

    public boolean increaseBet(int newBet) {
        if (betUpArrowIsPresent()) {
            for (int i = 2; i <= newBet; i++) {
                betSpinUp.click();
            }
            return true;
        }
        return false;
    }

    public ArrayList<Integer> spinUpAndDownButtonValidation(ArrayList<Integer> defaultPrices, int newBet) {
        ArrayList<Integer> newPrices = new ArrayList<Integer>();
        for (int i = 0; i < defaultPrices.size(); i++) {
            int value = defaultPrices.get(i);
            newPrices.add(i, value * newBet);
        }
        return newPrices;
    }

    public boolean maxBetIncreased() {
        if (betSpinUp.isDisplayed()) {
            betSpinUp.click();
            return true;
        }
        return false;
    }

    public boolean decreaseBet(int newBet) {
        int currentBet = getBet();
        if (betDownArrowIsPresent()) {
            for (int i = currentBet; i > newBet; i--) {
                betSpinDown.click();
            }
            return true;
        }
        return false;
    }

    public boolean minBetDecreased() {
        if (betSpinDown.isDisplayed()) {
            betSpinDown.click();
            return true;
        }
        return false;
    }
}

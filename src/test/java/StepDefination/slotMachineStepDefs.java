package StepDefination;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hm.com.Actions.SpinSlotActions;
import hm.com.Pages.SpinSlotMachine;
import hm.com.WebDriverProvider.BaseClass;
import hm.com.WebDriverProvider.WebDriverClose;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class slotMachineStepDefs extends BaseClass {

    SpinSlotMachine spinSlotMachine;
    SpinSlotActions spinSlotActions;
    public int defaultBet;
    public int beforeSpinCredit;
    public ArrayList<Integer> prices;
    public List<String> defaultPrices;
    public ArrayList<Integer> defaultPrices1;

    @Before
    public void initialization() {
        getWebDriver();
        pageLoadTimeout();
        implicitWaitTimeout();
        getURL();
        spinSlotMachine = new SpinSlotMachine();
        spinSlotActions = new SpinSlotActions();
    }

    @After
    public void closeDriver() {
        WebDriverClose.quitDriver();
    }

    @Given("^I am on slot machine site$")
    public void launchTheSlotMachineSite() {
        String title = spinSlotMachine.isAt();
        Assert.assertEquals("you are not in slot machine page", "Add a HTML5 Slot Machine to your Site", title);
    }

    @Then("^I collect the bet and totalSpin values before click on spin button$")
    public void CollectTheBetAndTotalSpinValues() {
        defaultBet = spinSlotMachine.getBet();
        beforeSpinCredit = spinSlotMachine.getTotalSpins();
    }

    @When("^I click on spin button$")
    public void ClickOnSpinButtonAndVerifyTheResult() throws Throwable {
        String Spin = spinSlotMachine.spinButton();
        Assert.assertNotEquals("Failed", Spin);
    }


    @And("^Verify the result for bet (\\d+)$")
    public void verifyTheResult(int defaultBetValue) throws InterruptedException {
        String reel1Match = spinSlotMachine.getReel1Result();
        String reel2Match = spinSlotMachine.getReel2Result();
        String reel3Match = spinSlotMachine.getReel3Result();
        System.out.println(reel1Match + " " + reel2Match + " " + reel3Match);
        spinSlotActions.actualMatch(reel1Match, reel2Match, reel3Match, defaultBetValue, beforeSpinCredit);
    }


    @And("^Verify the last win is by default blank$")
    public void verifyTheLastWinIsByDefaultBlank() {
        String lastWinDefault = spinSlotMachine.lastWinDefaultValue();
        Assert.assertEquals("", lastWinDefault);
    }


    @And("^Verity the bet is by default select as (\\d+)$")
    public void verityTheBetIsByDefaultSelectAs(int defaultBetValue) {
        int betDefault = spinSlotMachine.betDefaultValue();
        Assert.assertEquals(defaultBetValue, betDefault);
    }

    @Then("^Verify the default price values of Win Chart$")
    public void verifyTheDefaultValuesOfWinChart(DataTable allPrices) {
        defaultPrices = allPrices.topCells();
        defaultPrices1 = new ArrayList<Integer>();
        for (int i = 0; i < defaultPrices.size(); i++) {
            int value = Integer.parseInt(defaultPrices.get(i));
            defaultPrices1.add(i, value);
        }
        prices = spinSlotMachine.getPriceListValues();
        int totalPriceColumns = prices.size();
        Assert.assertEquals(9, totalPriceColumns);
        Assert.assertEquals(defaultPrices1, prices);
    }

    @And("^Verify the slot machine contains (\\d+) reels$")
    public void verifyTheSlotMachineContainsReels(int noOfReels) {
        int totalNoOfReelsFound = spinSlotMachine.getNoOfReels();
        Assert.assertEquals(noOfReels, totalNoOfReelsFound);
    }

    @And("^Verify the total win is present$")
    public void verifyTheCreditsPresent() {
        boolean creditsDisplayed = spinSlotMachine.creditIsPresent();
        Assert.assertTrue(creditsDisplayed);

    }

    @And("^Verify the bet up and down button is present$")
    public void verifyTheBetUpAndDownButton() {
        boolean upArrow = spinSlotMachine.betUpArrowIsPresent();
        Assert.assertTrue(upArrow);
        boolean downArrow = spinSlotMachine.betDownArrowIsPresent();
        Assert.assertTrue(downArrow);
    }

    @And("^verify the spin button is present$")
    public void verifyTheSpinButtonIsPresent() {
        boolean spinButton = spinSlotMachine.spinButtonIsPresent();
        Assert.assertTrue(spinButton);
    }

    @When("^I increase the bet to (\\d+)$")
    public void iIncreaseTheBetTo(int newBet) {
        boolean betIncreased = spinSlotMachine.increaseBet(newBet);
        Assert.assertTrue(betIncreased);
        int maxBet = spinSlotMachine.getBet();
        Assert.assertEquals(newBet, maxBet);
    }

    @Then("^Verify the prices for bet (\\d+)$")
    public void verifyThePricesForBet(int newBet) {
        ArrayList<Integer> newPrices = spinSlotMachine.spinUpAndDownButtonValidation(prices, newBet);
        ArrayList<Integer> pricesWithBet = new ArrayList<Integer>();
        int totalPriceColumns = newPrices.size();
        Assert.assertEquals(9, totalPriceColumns);
        for (int i = 0; i < prices.size(); i++) {
            int value = prices.get(i) * newBet;
            pricesWithBet.add(i, value);
        }

        Assert.assertEquals(pricesWithBet, newPrices);
     /*   int price1 = newPrices.get(0);
        Assert.assertEquals(prices.get(0) * newBet, price1);
        int price2 = newPrices.get(1);
        Assert.assertEquals(prices.get(1) * newBet, price2);
        int price3 = newPrices.get(2);
        Assert.assertEquals(prices.get(2) * newBet, price3);
        int price4 = newPrices.get(3);
        Assert.assertEquals(prices.get(3) * newBet, price4);
        int price5 = newPrices.get(4);
        Assert.assertEquals(prices.get(4) * newBet, price5);
        int price6 = newPrices.get(5);
        Assert.assertEquals(prices.get(5) * newBet, price6);
        int price7 = newPrices.get(6);
        Assert.assertEquals(prices.get(6) * newBet, price7);
        int price8 = newPrices.get(7);
        Assert.assertEquals(prices.get(7) * newBet, price8);
        int price9 = newPrices.get(8);
        Assert.assertEquals(prices.get(8) * newBet, price9);*/
    }

    @And("^verify the bet can't be increased anymore$")
    public void verifyTheBetCanTBeIncreasedAnymore() {
        boolean betMaxIncreased = spinSlotMachine.maxBetIncreased();
        Assert.assertTrue(betMaxIncreased);
        int maxBet = spinSlotMachine.getBet();
        Assert.assertEquals(10, maxBet);
    }

    @And("^I decrease the bet to (\\d+)$")
    public void iDecreaseTheBetTo(int newBet) throws Throwable {
        boolean betDecreased = spinSlotMachine.decreaseBet(newBet);
        Assert.assertTrue(betDecreased);
        int minBet = spinSlotMachine.getBet();
        Assert.assertEquals(newBet, minBet);
    }


    @And("^verify the bet can't be decreased anymore$")
    public void verifyTheBetCanTBeDecreasedAnymore() {
        boolean betDecreasedToMin = spinSlotMachine.minBetDecreased();
        Assert.assertTrue(betDecreasedToMin);
        int minBet = spinSlotMachine.getBet();
        Assert.assertEquals(1, minBet);
    }
}

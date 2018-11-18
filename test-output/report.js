$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/NetEnt/src/test/java/Features/defaultSlotMachine.feature");
formatter.feature({
  "line": 1,
  "name": "Default Slot machine automation",
  "description": "",
  "id": "default-slot-machine-automation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10903546904,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify the default values",
  "description": "",
  "id": "default-slot-machine-automation;verify-the-default-values",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on slot machine site",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Verify the default price values of Win Chart",
  "rows": [
    {
      "cells": [
        "200",
        "50",
        "20",
        "16",
        "15",
        "14",
        "12",
        "7",
        "4"
      ],
      "line": 6
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Verify the slot machine contains 3 reels",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Verify the last win is by default blank",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Verify the total win is present",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verity the bet is by default select as 1",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Verify the bet up and down button is present",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "verify the spin button is present",
  "keyword": "And "
});
formatter.match({
  "location": "slotMachineStepDefs.launchTheSlotMachineSite()"
});
formatter.result({
  "duration": 809260777,
  "status": "passed"
});
formatter.match({
  "location": "slotMachineStepDefs.verifyTheDefaultValuesOfWinChart(DataTable)"
});
formatter.result({
  "duration": 571836952,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 33
    }
  ],
  "location": "slotMachineStepDefs.verifyTheSlotMachineContainsReels(int)"
});
formatter.result({
  "duration": 26907421,
  "status": "passed"
});
formatter.match({
  "location": "slotMachineStepDefs.verifyTheLastWinIsByDefaultBlank()"
});
formatter.result({
  "duration": 81342569,
  "status": "passed"
});
formatter.match({
  "location": "slotMachineStepDefs.verifyTheCreditsPresent()"
});
formatter.result({
  "duration": 38100009,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 39
    }
  ],
  "location": "slotMachineStepDefs.verityTheBetIsByDefaultSelectAs(int)"
});
formatter.result({
  "duration": 69019728,
  "status": "passed"
});
formatter.match({
  "location": "slotMachineStepDefs.verifyTheBetUpAndDownButton()"
});
formatter.result({
  "duration": 73094794,
  "status": "passed"
});
formatter.match({
  "location": "slotMachineStepDefs.verifyTheSpinButtonIsPresent()"
});
formatter.result({
  "duration": 45689323,
  "status": "passed"
});
formatter.after({
  "duration": 825803505,
  "status": "passed"
});
formatter.before({
  "duration": 9433218626,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Verify the increase in bet, increases the prices in the list",
  "description": "",
  "id": "default-slot-machine-automation;verify-the-increase-in-bet,-increases-the-prices-in-the-list",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "I am on slot machine site",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Verify the default price values of Win Chart",
  "rows": [
    {
      "cells": [
        "200",
        "50",
        "20",
        "16",
        "15",
        "14",
        "12",
        "7",
        "4"
      ],
      "line": 18
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I increase the bet to 3",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Verify the prices for bet 3",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I increase the bet to 10",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Verify the prices for bet 10",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "verify the bet can\u0027t be increased anymore",
  "keyword": "And "
});
formatter.match({
  "location": "slotMachineStepDefs.launchTheSlotMachineSite()"
});
formatter.result({
  "duration": 203647909,
  "status": "passed"
});
formatter.match({
  "location": "slotMachineStepDefs.verifyTheDefaultValuesOfWinChart(DataTable)"
});
formatter.result({
  "duration": 1035685246,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 22
    }
  ],
  "location": "slotMachineStepDefs.iIncreaseTheBetTo(int)"
});
formatter.result({
  "duration": 260218026,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 26
    }
  ],
  "location": "slotMachineStepDefs.verifyThePricesForBet(int)"
});
formatter.result({
  "duration": 163692,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 22
    }
  ],
  "location": "slotMachineStepDefs.iIncreaseTheBetTo(int)"
});
formatter.result({
  "duration": 538720725,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 26
    }
  ],
  "location": "slotMachineStepDefs.verifyThePricesForBet(int)"
});
formatter.result({
  "duration": 91487,
  "status": "passed"
});
formatter.match({
  "location": "slotMachineStepDefs.verifyTheBetCanTBeIncreasedAnymore()"
});
formatter.result({
  "duration": 136217100,
  "status": "passed"
});
formatter.after({
  "duration": 784019814,
  "status": "passed"
});
formatter.before({
  "duration": 9718982025,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Verify the decrease in bet, decreases the prices in the list",
  "description": "",
  "id": "default-slot-machine-automation;verify-the-decrease-in-bet,-decreases-the-prices-in-the-list",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "I am on slot machine site",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "Verify the default price values of Win Chart",
  "rows": [
    {
      "cells": [
        "200",
        "50",
        "20",
        "16",
        "15",
        "14",
        "12",
        "7",
        "4"
      ],
      "line": 28
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "I increase the bet to 10",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "I decrease the bet to 5",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Verify the prices for bet 5",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "I decrease the bet to 1",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Verify the prices for bet 1",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "verify the bet can\u0027t be decreased anymore",
  "keyword": "And "
});
formatter.match({
  "location": "slotMachineStepDefs.launchTheSlotMachineSite()"
});
formatter.result({
  "duration": 188452869,
  "status": "passed"
});
formatter.match({
  "location": "slotMachineStepDefs.verifyTheDefaultValuesOfWinChart(DataTable)"
});
formatter.result({
  "duration": 937527128,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 22
    }
  ],
  "location": "slotMachineStepDefs.iIncreaseTheBetTo(int)"
});
formatter.result({
  "duration": 685382108,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 22
    }
  ],
  "location": "slotMachineStepDefs.iDecreaseTheBetTo(int)"
});
formatter.result({
  "duration": 382536904,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    }
  ],
  "location": "slotMachineStepDefs.verifyThePricesForBet(int)"
});
formatter.result({
  "duration": 108718,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 22
    }
  ],
  "location": "slotMachineStepDefs.iDecreaseTheBetTo(int)"
});
formatter.result({
  "duration": 344854946,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 26
    }
  ],
  "location": "slotMachineStepDefs.verifyThePricesForBet(int)"
});
formatter.result({
  "duration": 87384,
  "status": "passed"
});
formatter.match({
  "location": "slotMachineStepDefs.verifyTheBetCanTBeDecreasedAnymore()"
});
formatter.result({
  "duration": 137923763,
  "status": "passed"
});
formatter.after({
  "duration": 773454917,
  "status": "passed"
});
formatter.before({
  "duration": 10286202372,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Slot Machine Spin and Verify for default bet",
  "description": "",
  "id": "default-slot-machine-automation;slot-machine-spin-and-verify-for-default-bet",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 37,
  "name": "I am on slot machine site",
  "keyword": "Given "
});
formatter.step({
  "line": 38,
  "name": "I collect the bet and totalSpin values before click on spin button",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "I click on spin button",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "Verify the result for bet 1",
  "keyword": "And "
});
formatter.match({
  "location": "slotMachineStepDefs.launchTheSlotMachineSite()"
});
formatter.result({
  "duration": 220520893,
  "status": "passed"
});
formatter.match({
  "location": "slotMachineStepDefs.CollectTheBetAndTotalSpinValues()"
});
formatter.result({
  "duration": 585088201,
  "status": "passed"
});
formatter.match({
  "location": "slotMachineStepDefs.ClickOnSpinButtonAndVerifyTheResult()"
});
formatter.result({
  "duration": 208193128,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 26
    }
  ],
  "location": "slotMachineStepDefs.verifyTheResult(int)"
});
formatter.result({
  "duration": 5224518012,
  "status": "passed"
});
formatter.after({
  "duration": 812010719,
  "status": "passed"
});
formatter.before({
  "duration": 9929414738,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "Slot Machine Spin and Verify for maximum bet",
  "description": "",
  "id": "default-slot-machine-automation;slot-machine-spin-and-verify-for-maximum-bet",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 43,
  "name": "I am on slot machine site",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "I increase the bet to 10",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "I collect the bet and totalSpin values before click on spin button",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "I click on spin button",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "Verify the result for bet 10",
  "keyword": "And "
});
formatter.match({
  "location": "slotMachineStepDefs.launchTheSlotMachineSite()"
});
formatter.result({
  "duration": 177343974,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 22
    }
  ],
  "location": "slotMachineStepDefs.iIncreaseTheBetTo(int)"
});
formatter.result({
  "duration": 1208231282,
  "status": "passed"
});
formatter.match({
  "location": "slotMachineStepDefs.CollectTheBetAndTotalSpinValues()"
});
formatter.result({
  "duration": 108994193,
  "status": "passed"
});
formatter.match({
  "location": "slotMachineStepDefs.ClickOnSpinButtonAndVerifyTheResult()"
});
formatter.result({
  "duration": 197647923,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 26
    }
  ],
  "location": "slotMachineStepDefs.verifyTheResult(int)"
});
formatter.result({
  "duration": 5151585678,
  "error_message": "java.lang.AssertionError: expected:\u003c564\u003e but was:\u003c507\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\r\n\tat org.junit.Assert.assertEquals(Assert.java:645)\r\n\tat org.junit.Assert.assertEquals(Assert.java:631)\r\n\tat hm.com.Actions.SpinSlotActions.mixOfThreeWon(SpinSlotActions.java:189)\r\n\tat hm.com.Actions.SpinSlotActions.actualMatch(SpinSlotActions.java:90)\r\n\tat StepDefination.slotMachineStepDefs.verifyTheResult(slotMachineStepDefs.java:69)\r\n\tat ✽.And Verify the result for bet 10(C:/NetEnt/src/test/java/Features/defaultSlotMachine.feature:47)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 807469602,
  "status": "passed"
});
});
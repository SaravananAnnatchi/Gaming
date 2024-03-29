$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("defaultSlotMachine.feature");
formatter.feature({
  "line": 1,
  "name": "Default Slot machine automation",
  "description": "",
  "id": "default-slot-machine-automation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11221218327,
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
  "duration": 879121939,
  "status": "passed"
});
formatter.match({
  "location": "slotMachineStepDefs.verifyTheDefaultValuesOfWinChart(DataTable)"
});
formatter.result({
  "duration": 587073837,
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
  "duration": 20671950,
  "status": "passed"
});
formatter.match({
  "location": "slotMachineStepDefs.verifyTheLastWinIsByDefaultBlank()"
});
formatter.result({
  "duration": 74227100,
  "status": "passed"
});
formatter.match({
  "location": "slotMachineStepDefs.verifyTheCreditsPresent()"
});
formatter.result({
  "duration": 43964610,
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
  "duration": 68279216,
  "status": "passed"
});
formatter.match({
  "location": "slotMachineStepDefs.verifyTheBetUpAndDownButton()"
});
formatter.result({
  "duration": 69138291,
  "status": "passed"
});
formatter.match({
  "location": "slotMachineStepDefs.verifyTheSpinButtonIsPresent()"
});
formatter.result({
  "duration": 42931997,
  "status": "passed"
});
formatter.after({
  "duration": 794819377,
  "status": "passed"
});
formatter.before({
  "duration": 9818656447,
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
  "duration": 195098186,
  "status": "passed"
});
formatter.match({
  "location": "slotMachineStepDefs.verifyTheDefaultValuesOfWinChart(DataTable)"
});
formatter.result({
  "duration": 1036778576,
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
  "duration": 236314085,
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
  "duration": 239999,
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
  "duration": 595732277,
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
  "duration": 106257,
  "status": "passed"
});
formatter.match({
  "location": "slotMachineStepDefs.verifyTheBetCanTBeIncreasedAnymore()"
});
formatter.result({
  "duration": 167957330,
  "status": "passed"
});
formatter.after({
  "duration": 804513301,
  "status": "passed"
});
formatter.before({
  "duration": 9641999240,
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
  "duration": 183263959,
  "status": "passed"
});
formatter.match({
  "location": "slotMachineStepDefs.verifyTheDefaultValuesOfWinChart(DataTable)"
});
formatter.result({
  "duration": 1095809816,
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
  "duration": 631305934,
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
  "duration": 480930509,
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
  "duration": 104205,
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
  "duration": 333652512,
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
  "duration": 304409,
  "status": "passed"
});
formatter.match({
  "location": "slotMachineStepDefs.verifyTheBetCanTBeDecreasedAnymore()"
});
formatter.result({
  "duration": 131984085,
  "status": "passed"
});
formatter.after({
  "duration": 804730327,
  "status": "passed"
});
formatter.before({
  "duration": 10088306655,
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
  "duration": 228490925,
  "status": "passed"
});
formatter.match({
  "location": "slotMachineStepDefs.CollectTheBetAndTotalSpinValues()"
});
formatter.result({
  "duration": 596116687,
  "status": "passed"
});
formatter.match({
  "location": "slotMachineStepDefs.ClickOnSpinButtonAndVerifyTheResult()"
});
formatter.result({
  "duration": 211477634,
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
  "duration": 5181697604,
  "status": "passed"
});
formatter.after({
  "duration": 841613518,
  "status": "passed"
});
formatter.before({
  "duration": 9697326284,
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
  "duration": 247085340,
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
  "duration": 1134358233,
  "status": "passed"
});
formatter.match({
  "location": "slotMachineStepDefs.CollectTheBetAndTotalSpinValues()"
});
formatter.result({
  "duration": 131468394,
  "status": "passed"
});
formatter.match({
  "location": "slotMachineStepDefs.ClickOnSpinButtonAndVerifyTheResult()"
});
formatter.result({
  "duration": 220515150,
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
  "duration": 16888544275,
  "status": "passed"
});
formatter.after({
  "duration": 775985372,
  "status": "passed"
});
});
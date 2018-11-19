Feature: Default Slot machine automation

  Scenario: Verify the default values
    Given I am on slot machine site
    Then Verify the default price values of Win Chart
      | 200 | 50 | 20 | 16 | 15 | 14 | 12 | 7 | 4 |
    And Verify the slot machine contains 3 reels
    And Verify the last win is by default blank
    And Verify the total win is present
    And Verity the bet is by default select as 1
    And Verify the bet up and down button is present
    And verify the spin button is present


  Scenario: Verify the increase in bet, increases the prices in the list
    Given I am on slot machine site
    Then Verify the default price values of Win Chart
      | 200 | 50 | 20 | 16 | 15 | 14 | 12 | 7 | 4 |
    When I increase the bet to 3
    Then Verify the prices for bet 3
    And I increase the bet to 10
    Then Verify the prices for bet 10
    And verify the bet can't be increased anymore

  Scenario: Verify the decrease in bet, decreases the prices in the list
    Given I am on slot machine site
    Then Verify the default price values of Win Chart
      | 200 | 50 | 20 | 16 | 15 | 14 | 12 | 7 | 4 |
    When I increase the bet to 10
    And I decrease the bet to 5
    Then Verify the prices for bet 5
    And I decrease the bet to 1
    Then Verify the prices for bet 1
    And verify the bet can't be decreased anymore

  Scenario: Slot Machine Spin and Verify for default bet
    Given I am on slot machine site
    Then I collect the bet and totalSpin values before click on spin button
    When I click on spin button
    And Verify the result for bet 1

  Scenario: Slot Machine Spin and Verify for maximum bet
    Given I am on slot machine site
    When I increase the bet to 10
    Then I collect the bet and totalSpin values before click on spin button
    When I click on spin button
    And Verify the result for bet 10

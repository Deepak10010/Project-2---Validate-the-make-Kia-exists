@kia-exists
Feature: Acceptance testing to validate the make 'Kia' exists

  @kia-exists-Positive
  Scenario: To validate the make 'Kia' exists
    Given I am on the Home Page "https://www.tmsandbox.co.nz/"  of TradeMe website
    When I move to Motors tab
      | Marketplace |
      | Jobs        |
      | Motors      |
      | Property    |
    And click on "Motors" tab
    And The Page Title should be "TRADEME SANDBOX - Buy online and sell with NZ's #1 auction & classifieds site | Trade Me SANDBOX"
    And click on "Used cars" link
    Then I should see that the make "Kia" exists
    

Feature: It should be possible to search in https://weather.com/

  Scenario: Locate Stockholm

    Given I want to know the weather forecast for coming days
    When I search for Stockholm
    Then I should be able to get a weather forecast for Stockholm
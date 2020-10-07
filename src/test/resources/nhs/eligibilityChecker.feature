Feature: Check for help paying the NHS costs

  Scenario: Check what help you could get to pay for NHS costs using eligibility checker when a person is from wales
    Given I am a person from Wales
    When I put my circumstances in the Checker tool
    Then I should get a result of whether I will get help or not

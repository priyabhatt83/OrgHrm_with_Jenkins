@login
  Feature: user should be login successfully

    Scenario: user should able to login with valid credential
      Given user is on homepage
      When user enter all details
      Then user should login successfully


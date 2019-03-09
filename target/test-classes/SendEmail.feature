Feature: Send Email Feature
  Verify if user is able to send an email to various recipients with an attached image of choice

  Scenario: UserA logs in as an authenticated user and sends an email with an attached image then logs out
    Given userA is on homepage
    When userA navigates to login page
    And userA enters username and password
    Then userA is logged into email homepage
    When userA clicks on New message
    And userA enters a desired recipient
    And userA clicks on attach
    Then userA is able to send an email with an attached image by clicking on Send
    When userA clicks on log out
    Then userA is logged out of his email account

  Scenario: UserB logs in as an authenticated user and sends an email with an attached image then logs out
    Given userB is on homepage
    When userB navigates to login page
    And userB enters username and password
    Then userB is logged into email homepage
    When userB clicks on New message
    And userB enters a desired recipient
    And userB clicks on attach
    Then userB is able to send an email with an attached image by clicking on Send
    When userB clicks on log out
    Then userB is logged out of his email account

  Scenario: UserC logs in as an authenticated user and sends an email with an attached image then logs out
    Given userC is on homepage
    When userC navigates to login page
    And userC enters username and password
    When userC clicks on New message
    And userC enters a desired recipient
    And userC clicks on attach
    Then userC is able to send an email with an attached image by clicking on Send
    When userC clicks on log out
    Then userC is logged out of his email account

  Scenario: UserD logs in as an authenticated user and sends an email with an attached image then logs out
    Given userD is on homepage
    When userD navigates to login page
    And userD enters username and password
    Then userD is logged into email homepage
    When userD clicks on New message
    And userD enters a desired recipient
    And userD clicks on attach
    Then userD is able to send an email with an attached image by clicking on Send
    When userD clicks on log out
    Then userD is logged out of his email account

  Scenario: UserE logs in as an authenticated user and sends an email with an attached image then logs out
    Given userE is on homepage
    When userE navigates to login page
    And userE enters username and password
    Then userE is logged into email homepage
    When userE clicks on New message
    And userE enters a desired recipient
    And userE clicks on attach
    Then userE is able to send an email with an attached image by clicking on Send
    When userE clicks on log out
    Then userE is logged out of his email account


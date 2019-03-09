

Feature: Send Email Feature
  Verify if user is able to send an email to various recipients with an attached image of choice

  Scenario: UserA logs in as an authenticated user and sends multiple emails with
            attached images to different recipients then logs out

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





Feature: Send Email Feature
  Verify if user is able to send an email to various recipients with an attached image of choice

  Scenario Outline: An authenticated user logs in to send multiple emails with
  attached images to different recipients then logs out

    Given I am on the loginpage
    And I enter username and password
    When I click on New message
    And I enter a desired “<email>” recipient address
    And I enter a desired “<attachment>” in body text
    Then I am able to send an email with an attached image by clicking on Send
    When I click on log out
    Then I am logged out of my email account

    Examples:
      | email                    | attachment |
      | jochampion17@gmail.com   | 1.jpg      |
      | jingxujaster@hotmail.com | 2.jpg      |
      | jackjingxu@yahoo.com     | 3.jpg      |
      | abc@gmail.com            | 4.jpg      |
      | bbc@gmail.com            | 5.jpg      |
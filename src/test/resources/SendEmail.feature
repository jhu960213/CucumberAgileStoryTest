

Feature: Send Email Feature
  Verify if user is able to send an email to various recipients with an attached image of choice

  Scenario Outline: An authenticated user logs in to send multiple emails with
  attached images to different recipients then logs out

    Given I am logged into an email account
    When I click on New message
    And I enter "<email>" as recipient address
    And I enter "<attachment>" as the file in body text
    And I click on send
    Then I have sent an email with an attachment to the proper recipient

    Examples:
      | email                    | attachment |
      | jochampion17@gmail.com   | 1.jpg      |
      | jingxujaster@hotmail.com | 2.jpg      |
      | jackjingxu@yahoo.com     | 3.jpg      |
      | abc@gmail.com            | 4.jpg      |
      | bbc@gmail.com            | 5.jpg      |
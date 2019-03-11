Feature: Send email with an image attachment

  #Normal Scenario
  Scenario Outline: Send email with an image attachment

    Given I am logged into a Gmail account
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


   #Alternate FLow
  Scenario Outline: An authenticated user logs in to send an email with
  attached image to 2 different recipients then logs out

    Given I am logged into a Gmail account
    When I click on New message
    And I enter "<email>" as recipient address
    And I enter "<ccemail>" as recipient CC
    And I enter "<attachment>" as the file in body text
    And I click on send
    Then I have sent an email with an attachment to the proper recipient


    Examples:
      | email                    |               ccemail           | attachment |
      | jochampion17@gmail.com   |     jingxujaster@hotmail.com    |  1.jpg     |
      | jingxujaster@hotmail.com |        jochampion17@gmail.com   |  2.jpg     |
      | jackjingxu@yahoo.com     |        jingxujaster@hotmail.com | 3.jpg      |
      | abc@gmail.com            |      jingxujaster@hotmail.com   |  4.jpg     |
      | bbc@gmail.com            |       jingxujaster@hotmail.com  | 5.jpg      |



    #Error Flow
  Scenario Outline: An authenticated user logs in to send an email with
  attached image to 2 different recipients then logs out

    Given I am logged into a Gmail account
    When I click on New message
    And I enter "<email>" as invalid recipient address
    And I enter "<attachment>" as the file in body text
    And I click on send
    Then I have sent an email with an attachment to the proper recipient

    Examples:
      | email                   | attachment |
      | jlkds                   | 1.jpg      |
      | jingter sdsf            | 2.jpg      |
      | jakjixu                 | 3.jpg      |
      | bc                      | 4.jpg      |
      | bb@g                    | 5.jpg      |
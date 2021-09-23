Feature: Test login feature

  Scenario Outline: Try to login with different credentials

    #Pozitif Senaryo#
    Given User is on homepage
    Then User navigates to login page
    Then User enters <email> and <password>
    Then Click on "Giriş Yap " button
    Then User navigates to home page
    Then Click on "Hesabım" button
    Then Click on "Cikis Yap" button

    Examples:
      | email                      | password      |
      #email dogru password dogru#
      | dummyfortesting7@gmail.com | dummyTestAcc7 |


    #Negatif Senaryolar#
    Given User is on homepage
    Then User navigates to login page
    Then User enters <email> and <password>
    Then Click on "Giriş Yap " button
    Then User should see the error message

    Examples:
      | email                      | password      |
       #email dogru password yanlis#
      | dummyfortesting7@gmail.com | dummyTestAcc8 |
      #email yanlis password dogru#
      | dummyfortesting8@gmail.com | dummyTestAcc7 |
      #email yanlis password yanlis#
      | test123@mail.com           | 1234567       |
      #email gecersiz password dogru#
      | test123                    | dummyTestAcc7 |
      #email gecersiz password yanlis#
      | test123                    | dummyTestAcc8 |
      #email null password dogru#
      |                            | dummyTestAcc7 |
      #email dogru password null#
      | dummyfortesting7@gmail.com |               |
      #email null password null#
      |                            |               |

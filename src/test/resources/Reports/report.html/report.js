$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/FeatureFile/SauceDemo.feature");
formatter.feature({
  "name": "Verifying SauceDemo Details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verifying Correct Product is ordered",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on SauceDemo Login Page",
  "keyword": "Given "
});
formatter.step({
  "name": "User should enter \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should add Product to the Cart",
  "keyword": "And "
});
formatter.step({
  "name": "User should checkout and enter \"\u003cfirstName\u003e\",\"\u003clastName\u003e\" and \"\u003cpostalCode\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Validate whether ordered the correct product",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password",
        "firstName",
        "lastName",
        "postalCode"
      ]
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce",
        "Kamaleshwar",
        "Murthy",
        "600100"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying Correct Product is ordered",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on SauceDemo Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "OrderProducts.user_is_on_SauceDemo_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter \"standard_user\" and \"secret_sauce\"",
  "keyword": "And "
});
formatter.match({
  "location": "OrderProducts.user_should_enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should add Product to the Cart",
  "keyword": "And "
});
formatter.match({
  "location": "OrderProducts.user_should_add_Product_to_the_Cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should checkout and enter \"Kamaleshwar\",\"Murthy\" and \"600100\"",
  "keyword": "And "
});
formatter.match({
  "location": "OrderProducts.user_should_checkout_and_enter_and(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate whether ordered the correct product",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderProducts.validate_whether_ordered_the_correct_product()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verifying Particular product is available",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on SauceDemo Login Page",
  "keyword": "Given "
});
formatter.step({
  "name": "User should enter \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Should get all the product list",
  "keyword": "And "
});
formatter.step({
  "name": "Validate whether Sauce Labs Bolt T-Shirt product is available",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ]
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying Particular product is available",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on SauceDemo Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "OrderProducts.user_is_on_SauceDemo_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter \"standard_user\" and \"secret_sauce\"",
  "keyword": "And "
});
formatter.match({
  "location": "OrderProducts.user_should_enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Should get all the product list",
  "keyword": "And "
});
formatter.match({
  "location": "OrderProducts.should_get_all_the_product_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate whether Sauce Labs Bolt T-Shirt product is available",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderProducts.validate_whether_Sauce_Labs_Bolt_T_Shirt_product_is_available()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verifying price with product listing with product individual page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on SauceDemo Login Page",
  "keyword": "Given "
});
formatter.step({
  "name": "User should enter \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Getting the price of all Product and removing the dollar symbol",
  "keyword": "And "
});
formatter.step({
  "name": "Validate the price with product listing with product individual page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ]
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying price with product listing with product individual page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on SauceDemo Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "OrderProducts.user_is_on_SauceDemo_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter \"standard_user\" and \"secret_sauce\"",
  "keyword": "And "
});
formatter.match({
  "location": "OrderProducts.user_should_enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Getting the price of all Product and removing the dollar symbol",
  "keyword": "And "
});
formatter.match({
  "location": "OrderProducts.getting_the_price_of_all_Product_and_removing_the_dollar_symbol()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the price with product listing with product individual page",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderProducts.validate_the_price_with_product_listing_with_product_individual_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verifying LoginPage with invalid Credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Reg"
    }
  ]
});
formatter.step({
  "name": "User is on SauceDemo Login Page",
  "keyword": "Given "
});
formatter.step({
  "name": "User should enter invalid \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Validate the error message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ]
    },
    {
      "cells": [
        "standard_us1r",
        "secret_sau7e"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying LoginPage with invalid Credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Reg"
    }
  ]
});
formatter.step({
  "name": "User is on SauceDemo Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "OrderProducts.user_is_on_SauceDemo_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter invalid \"standard_us1r\" and \"secret_sau7e\"",
  "keyword": "And "
});
formatter.match({
  "location": "OrderProducts.user_should_enter_invalid_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the error message",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderProducts.validate_the_error_message()"
});
formatter.result({
  "status": "passed"
});
});
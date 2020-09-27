$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("kia_exists.feature");
formatter.feature({
  "line": 2,
  "name": "Acceptance testing to validate the make \u0027Kia\u0027 exists",
  "description": "",
  "id": "acceptance-testing-to-validate-the-make-\u0027kia\u0027-exists",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@kia-exists"
    }
  ]
});
formatter.before({
  "duration": 5789240100,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "To validate the make \u0027Kia\u0027 exists",
  "description": "",
  "id": "acceptance-testing-to-validate-the-make-\u0027kia\u0027-exists;to-validate-the-make-\u0027kia\u0027-exists",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@kia-exists-Positive"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on the Home Page \"https://www.tmsandbox.co.nz/\"  of TradeMe website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I move to Motors tab",
  "rows": [
    {
      "cells": [
        "Marketplace"
      ],
      "line": 8
    },
    {
      "cells": [
        "Jobs"
      ],
      "line": 9
    },
    {
      "cells": [
        "Motors"
      ],
      "line": 10
    },
    {
      "cells": [
        "Property"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "click on \"Motors\" tab",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "The Page Title should be \"TRADEME SANDBOX - Buy online and sell with NZ\u0027s #1 auction \u0026 classifieds site | Trade Me SANDBOX\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click on \"Used cars\" link",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should see that the make \"Kia\" exists",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.tmsandbox.co.nz/",
      "offset": 23
    }
  ],
  "location": "TestCase2_Steps.i_am_on_the_Home_Page_of_TradeMe_website(String)"
});
formatter.result({
  "duration": 4344686700,
  "status": "passed"
});
formatter.match({
  "location": "TestCase2_Steps.i_move_to_Motors_tab(DataTable)"
});
formatter.result({
  "duration": 2447100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Motors",
      "offset": 10
    }
  ],
  "location": "TestCase2_Steps.click_on_tab(String)"
});
formatter.result({
  "duration": 129535300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TRADEME SANDBOX - Buy online and sell with NZ\u0027s #1 auction \u0026 classifieds site | Trade Me SANDBOX",
      "offset": 26
    }
  ],
  "location": "TestCase2_Steps.the_Page_Title_should_be(String)"
});
formatter.result({
  "duration": 12198600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Used cars",
      "offset": 10
    }
  ],
  "location": "TestCase2_Steps.click_on_link(String)"
});
formatter.result({
  "duration": 2246752700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Kia",
      "offset": 28
    }
  ],
  "location": "TestCase2_Steps.i_should_see_that_the_make_exists(String)"
});
formatter.result({
  "duration": 2496311400,
  "status": "passed"
});
formatter.after({
  "duration": 4997081300,
  "status": "passed"
});
});
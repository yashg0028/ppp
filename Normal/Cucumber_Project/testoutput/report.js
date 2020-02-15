$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("G:/Workspace/Cucumber_Project/src/main/java/features/map.feature");
formatter.feature({
  "name": "deal data creation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "create a new data deal sceanrio",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Login page title is facebook",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "yash",
        "yash@494"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User moves to details page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enters details",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "surname"
      ]
    },
    {
      "cells": [
        "Raj",
        "kumar",
        "pop"
      ]
    },
    {
      "cells": [
        "Raj1",
        "kumar1",
        "pop1"
      ]
    },
    {
      "cells": [
        "Raj 2",
        "kumar2",
        "pop2"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});
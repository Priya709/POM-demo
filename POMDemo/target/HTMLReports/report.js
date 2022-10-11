$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/LoginDemo.feature");
formatter.feature({
  "line": 1,
  "name": "Test Login Functionality",
  "description": "",
  "id": "test-login-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Check login is successful with valid credentials",
  "description": "",
  "id": "test-login-functionality;check-login-is-successful-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Browser is open",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user enters \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user is navigated to the home page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "test-login-functionality;check-login-is-successful-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "test-login-functionality;check-login-is-successful-with-valid-credentials;;1"
    },
    {
      "cells": [
        "Priya",
        "12345"
      ],
      "line": 12,
      "id": "test-login-functionality;check-login-is-successful-with-valid-credentials;;2"
    },
    {
      "cells": [
        "Chintu",
        "12345"
      ],
      "line": 13,
      "id": "test-login-functionality;check-login-is-successful-with-valid-credentials;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Check login is successful with valid credentials",
  "description": "",
  "id": "test-login-functionality;check-login-is-successful-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Browser is open",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user enters Priya and 12345",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user is navigated to the home page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 13,
  "name": "Check login is successful with valid credentials",
  "description": "",
  "id": "test-login-functionality;check-login-is-successful-with-valid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Browser is open",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user enters Chintu and 12345",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user is navigated to the home page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});
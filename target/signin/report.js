$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/srinimarva/overstock/features/customer/ForgotPassword.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Srinivasan Ramu"
    },
    {
      "line": 2,
      "value": "#Email: srinimarva@gmail.com"
    }
  ],
  "line": 4,
  "name": "To test the Forgot Password functionality",
  "description": "",
  "id": "to-test-the-forgot-password-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@ForgotPassword"
    }
  ]
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I open \"Chrome\" browser to execute \"ForgotPassword\" test",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I connect to \"http://www.overstock.com\" website",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 8
    },
    {
      "val": "ForgotPassword",
      "offset": 36
    }
  ],
  "location": "CommonStepDefs.i_Open_Browser(String,String)"
});
formatter.result({
  "duration": 3398704303,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.overstock.com",
      "offset": 14
    }
  ],
  "location": "CommonStepDefs.i_Connect_URL(String)"
});
formatter.result({
  "duration": 5094828777,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Retrieve forgotten password with valid email address",
  "description": "",
  "id": "to-test-the-forgot-password-functionality;retrieve-forgotten-password-with-valid-email-address",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I am on Password Assistance page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I enter a Email Address and hit Reset Password button",
  "rows": [
    {
      "cells": [
        "Field",
        "Value"
      ],
      "line": 13
    },
    {
      "cells": [
        "Email",
        "srinimarva@gmail.com"
      ],
      "line": 14
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I should see a message saying including \"srinimarva@gmail.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ForgotPassword.navigateToPasswordAssistancePage()"
});
formatter.result({
  "duration": 3454185999,
  "status": "passed"
});
formatter.match({
  "location": "ForgotPassword.attemptPasswordReset(DataTable)"
});
formatter.result({
  "duration": 1387736596,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "srinimarva@gmail.com",
      "offset": 41
    }
  ],
  "location": "ForgotPassword.successfulPasswordReset(String)"
});
formatter.result({
  "duration": 220134015,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I open \"Chrome\" browser to execute \"ForgotPassword\" test",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I connect to \"http://www.overstock.com\" website",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 8
    },
    {
      "val": "ForgotPassword",
      "offset": 36
    }
  ],
  "location": "CommonStepDefs.i_Open_Browser(String,String)"
});
formatter.result({
  "duration": 4188844,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.overstock.com",
      "offset": 14
    }
  ],
  "location": "CommonStepDefs.i_Connect_URL(String)"
});
formatter.result({
  "duration": 4450074261,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Retrieve forgotten password with invalid email address",
  "description": "",
  "id": "to-test-the-forgot-password-functionality;retrieve-forgotten-password-with-invalid-email-address",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "I am on Password Assistance page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I enter a Email Address and hit Reset Password button",
  "rows": [
    {
      "cells": [
        "Field",
        "Value"
      ],
      "line": 20
    },
    {
      "cells": [
        "Email",
        ""
      ],
      "line": 21
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I should see a message saying \"Your e-mail address is not in our system.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "ForgotPassword.navigateToPasswordAssistancePage()"
});
formatter.result({
  "duration": 1678943572,
  "status": "passed"
});
formatter.match({
  "location": "ForgotPassword.attemptPasswordReset(DataTable)"
});
formatter.result({
  "duration": 997656126,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your e-mail address is not in our system.",
      "offset": 31
    }
  ],
  "location": "ForgotPassword.failurePasswordReset(String)"
});
formatter.result({
  "duration": 64748859,
  "status": "passed"
});
formatter.match({
  "location": "SignIn.i_close_the_browser()"
});
formatter.result({
  "duration": 1289180,
  "error_message": "java.lang.NullPointerException\n\tat com.srinimarva.overstock.stepdefs.customer.SignIn.i_close_the_browser(SignIn.java:67)\n\tat ✽.And I close the browser(com/srinimarva/overstock/features/customer/ForgotPassword.feature:23)\n",
  "status": "failed"
});
});
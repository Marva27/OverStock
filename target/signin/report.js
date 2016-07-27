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
  "line": 3,
  "name": "To test the Forgot Password functionality",
  "description": "",
  "id": "to-test-the-forgot-password-functionality",
  "keyword": "Feature"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I open \"Chrome\" browser to execute \"ForgotPassword\" test",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
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
  "duration": 980518629,
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
  "duration": 675839,
  "error_message": "java.lang.NullPointerException\n\tat com.srinimarva.overstock.stepdefs.common.CommonStepDefs.i_Connect_URL(CommonStepDefs.java:32)\n\tat ✽.And I connect to \"http://www.overstock.com\" website(com/srinimarva/overstock/features/customer/ForgotPassword.feature:7)\n",
  "status": "failed"
});
formatter.scenario({
  "line": 9,
  "name": "Retrieve forgotten password with valid email address",
  "description": "",
  "id": "to-test-the-forgot-password-functionality;retrieve-forgotten-password-with-valid-email-address",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I navigate to Sign In page to execute \"ForgotPassword\" test",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I click the Forgot your password? link",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I should see Password Assistance page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I enter a valid",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "ForgotPassword",
      "offset": 39
    }
  ],
  "location": "SignIn.navigateToSignInPage(String)"
});
formatter.result({
  "status": "skipped"
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
formatter.uri("com/srinimarva/overstock/features/customer/SignIn.feature");
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
  "line": 3,
  "name": "To test the Sign In functionality",
  "description": "",
  "id": "to-test-the-sign-in-functionality",
  "keyword": "Feature"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I open \"Mozilla\" browser to execute \"SignIn\" test",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I connect to \"http://www.overstock.com\" website",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Mozilla",
      "offset": 8
    },
    {
      "val": "SignIn",
      "offset": 37
    }
  ],
  "location": "CommonStepDefs.i_Open_Browser(String,String)"
});
formatter.result({
  "duration": 7590023244,
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
  "duration": 8708878728,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Attemp sign in with valid credentials",
  "description": "",
  "id": "to-test-the-sign-in-functionality;attemp-sign-in-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I navigate to Sign In page to execute \"SignIn\" test",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I enter credentials and hit Sign In button",
  "rows": [
    {
      "cells": [
        "Field",
        "Value"
      ],
      "line": 12
    },
    {
      "cells": [
        "Email",
        "srinimarva@gmail.com"
      ],
      "line": 13
    },
    {
      "cells": [
        "Password",
        "Orange@7"
      ],
      "line": 14
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I should see Hi Customer Name",
  "rows": [
    {
      "cells": [
        "Field",
        "Value"
      ],
      "line": 16
    },
    {
      "cells": [
        "CustomerName",
        "Srinivasan"
      ],
      "line": 17
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "SignIn",
      "offset": 39
    }
  ],
  "location": "SignIn.navigateToSignInPage(String)"
});
formatter.result({
  "duration": 1769817346,
  "status": "passed"
});
formatter.match({
  "location": "SignIn.attemptLogin(DataTable)"
});
formatter.result({
  "duration": 2161701765,
  "status": "passed"
});
formatter.match({
  "location": "SignIn.greetCustomer(DataTable)"
});
formatter.result({
  "duration": 78639876,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I open \"Mozilla\" browser to execute \"SignIn\" test",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I connect to \"http://www.overstock.com\" website",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Mozilla",
      "offset": 8
    },
    {
      "val": "SignIn",
      "offset": 37
    }
  ],
  "location": "CommonStepDefs.i_Open_Browser(String,String)"
});
formatter.result({
  "duration": 170395,
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
  "duration": 3997338167,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Attemp sign in without valid Email Address",
  "description": "",
  "id": "to-test-the-sign-in-functionality;attemp-sign-in-without-valid-email-address",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "I navigate to Sign In page to execute \"SignIn\" test",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I enter credentials and hit Sign In button",
  "rows": [
    {
      "cells": [
        "Field",
        "Value"
      ],
      "line": 22
    },
    {
      "cells": [
        "Email",
        ""
      ],
      "line": 23
    },
    {
      "cells": [
        "Password",
        "Orange@7"
      ],
      "line": 24
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I should see an alert message saying \"This email address is invalid.\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "SignIn",
      "offset": 39
    }
  ],
  "location": "SignIn.navigateToSignInPage(String)"
});
formatter.result({
  "duration": 1808373944,
  "status": "passed"
});
formatter.match({
  "location": "SignIn.attemptLogin(DataTable)"
});
formatter.result({
  "duration": 451174368,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This email address is invalid.",
      "offset": 38
    }
  ],
  "location": "SignIn.seeAlertMsg(String)"
});

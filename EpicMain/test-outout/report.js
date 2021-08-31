$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/EpicMain/src/main/java/Feature/FeatureFile.feature");
formatter.feature({
  "line": 1,
  "name": "MainSpring - Epics Module",
  "description": "",
  "id": "mainspring---epics-module",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6227038100,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify Epics with valid data",
  "description": "",
  "id": "mainspring---epics-module;verify-epics-with-valid-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on MainSpring",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Navigate to Epics",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user Add Epics with valid data",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user close the driver",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_is_on_MainSpring()"
});
formatter.result({
  "duration": 56359931400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_Navigate_to_Epics()"
});
formatter.result({
  "duration": 18429395300,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_Add_Epics()"
});
formatter.result({
  "duration": 9219271300,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_close_the_driver()"
});
formatter.result({
  "duration": 4454423500,
  "status": "passed"
});
formatter.before({
  "duration": 3268308200,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify Epics with invalid data",
  "description": "",
  "id": "mainspring---epics-module;verify-epics-with-invalid-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "user is on MainSpring",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user Navigate to Epics",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user fill Epics with invalid data",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "capture Error Message",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user close the driver",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_is_on_MainSpring()"
});
formatter.result({
  "duration": 52368133000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_Navigate_to_Epics()"
});
formatter.result({
  "duration": 16451897000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_fill_Epics_with_invalid_data()"
});
formatter.result({
  "duration": 3359218600,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.capture_Error_Message()"
});
formatter.result({
  "duration": 61496200,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_close_the_driver()"
});
formatter.result({
  "duration": 646132500,
  "status": "passed"
});
});
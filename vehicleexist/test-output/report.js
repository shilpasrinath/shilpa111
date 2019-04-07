$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/srinath/eclipse-workspace/vehicleexist/src/main/java/Features/vehicle.feature");
formatter.feature({
  "name": "verifying vehicle exist",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "cover check in insurance portal",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "vehiclestepdefinition.user_is_on_login_page()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat base.Testbase.intialization(Testbase.java:35)\r\n\tat Stepdefinitions.vehiclestepdefinition.user_is_on_login_page(vehiclestepdefinition.java:18)\r\n\tat ✽.user is on login page(C:/Users/srinath/eclipse-workspace/vehicleexist/src/main/java/Features/vehicle.feature:3)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user enters vehicle registration number",
  "keyword": "When "
});
formatter.match({
  "location": "vehiclestepdefinition.user_enters_vehicle_registration_number()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on find vehicle",
  "keyword": "When "
});
formatter.match({
  "location": "vehiclestepdefinition.user_clicks_on_find_vehicle()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user get results for that vehicle",
  "keyword": "Then "
});
formatter.match({
  "location": "vehiclestepdefinition.user_get_results_for_that_vehicle()"
});
formatter.result({
  "status": "skipped"
});
});
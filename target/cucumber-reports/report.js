$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/features.feature");
formatter.feature({
  "line": 3,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3461009722,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "Get the details from colour column of bear table",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Assert that all colour column values are \u0027black\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.get_the_details_from_colour_column_of_bear_table()"
});
formatter.result({
  "duration": 145847122,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.assert_that_all_colour_column_values_are_black()"
});
formatter.result({
  "duration": 38822620,
  "status": "passed"
});
formatter.after({
  "duration": 92434230,
  "status": "passed"
});
formatter.before({
  "duration": 2525340127,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "Get the details from weight column of cat table",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Assert that all  weight column values are  greater than \u002715lb\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.get_the_details_from_weight_column_of_cat_table()"
});
formatter.result({
  "duration": 20043439,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "15",
      "offset": 57
    }
  ],
  "location": "StepDefinition.assert_that_all_weight_column_values_are_greater_than_lb(int)"
});
formatter.result({
  "duration": 37678672,
  "status": "passed"
});
formatter.after({
  "duration": 93058516,
  "status": "passed"
});
formatter.before({
  "duration": 2537530247,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "Get the number of rows in starwars table",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Assert that number of rows is equals to 2",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.get_the_number_of_rows_in_starwars_table()"
});
formatter.result({
  "duration": 39109478,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 40
    }
  ],
  "location": "StepDefinition.assert_that_number_of_rows_is_equals_to(int)"
});
formatter.result({
  "duration": 270327,
  "status": "passed"
});
formatter.after({
  "duration": 93498052,
  "status": "passed"
});
formatter.before({
  "duration": 2435626181,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "Get the description details from starwars table",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "Assert that number of charaters in description of each rows is less than 350 characters",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.get_the_description_details_from_starwars_table()"
});
formatter.result({
  "duration": 20165471,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "350",
      "offset": 73
    }
  ],
  "location": "StepDefinition.assert_that_number_of_charaters_in_description_of_each_rows_is_less_than_characters(int)"
});
formatter.result({
  "duration": 32742206,
  "status": "passed"
});
formatter.after({
  "duration": 90009431,
  "status": "passed"
});
});
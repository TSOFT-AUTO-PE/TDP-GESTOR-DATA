$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("web_DCODE.feature");
formatter.feature({
  "line": 1,
  "name": "Mercury Tours",
  "description": "",
  "id": "mercury-tours",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Extraer Data WEB DCODE",
  "description": "",
  "id": "mercury-tours;extraer-data-web-dcode",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@GESDATA_Extraer_Data_WEB_DCODE"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Se realiza el flujo DCODE extrae cien \"\u003ccaso_prueba\u003e\"",
  "keyword": "Given "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "mercury-tours;extraer-data-web-dcode;",
  "rows": [
    {
      "cells": [
        "caso_prueba"
      ],
      "line": 9,
      "id": "mercury-tours;extraer-data-web-dcode;;1"
    },
    {
      "cells": [
        "1"
      ],
      "line": 10,
      "id": "mercury-tours;extraer-data-web-dcode;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6665559500,
  "status": "passed"
});
formatter.before({
  "duration": 77414500,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Extraer Data WEB DCODE",
  "description": "",
  "id": "mercury-tours;extraer-data-web-dcode;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@GESDATA_Extraer_Data_WEB_DCODE"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Se realiza el flujo DCODE extrae cien \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 39
    }
  ],
  "location": "web_DCODE.seRealizaElFlujoDCODEExtraeCien(String)"
});
formatter.result({
  "duration": 27715799100,
  "status": "passed"
});
formatter.after({
  "duration": 1155888100,
  "status": "passed"
});
});
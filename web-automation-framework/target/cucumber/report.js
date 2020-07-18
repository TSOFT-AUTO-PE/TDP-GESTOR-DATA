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
      "name": "@DCODE"
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
    },
    {
      "cells": [
        "2"
      ],
      "line": 11,
      "id": "mercury-tours;extraer-data-web-dcode;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 156070100,
  "status": "passed"
});
formatter.before({
  "duration": 7483132800,
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
      "name": "@DCODE"
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
  "duration": 26632507000,
  "status": "passed"
});
formatter.after({
  "duration": 1198069700,
  "status": "passed"
});
formatter.before({
  "duration": 391500,
  "status": "passed"
});
formatter.before({
  "duration": 5428919100,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Extraer Data WEB DCODE",
  "description": "",
  "id": "mercury-tours;extraer-data-web-dcode;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@DCODE"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Se realiza el flujo DCODE extrae cien \"2\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 39
    }
  ],
  "location": "web_DCODE.seRealizaElFlujoDCODEExtraeCien(String)"
});
formatter.result({
  "duration": 24302201700,
  "status": "passed"
});
formatter.after({
  "duration": 737725800,
  "status": "passed"
});
});
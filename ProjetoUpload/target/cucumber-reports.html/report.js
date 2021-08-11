$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TesteDeUpload.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 2,
      "value": "#enconding: UTF-8"
    },
    {
      "line": 3,
      "value": "#author: MarcusVinicius"
    },
    {
      "line": 4,
      "value": "#date: 27/05/2021"
    },
    {
      "line": 5,
      "value": "#version: 1.0"
    }
  ],
  "line": 7,
  "name": "Upload de um documentos para o site Automacao com Batista",
  "description": "",
  "id": "upload-de-um-documentos-para-o-site-automacao-com-batista",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 6,
      "name": "@Upload"
    }
  ]
});
formatter.before({
  "duration": 3611252700,
  "status": "passed"
});
formatter.background({
  "line": 9,
  "name": "Acessar a Pagina de Treinamento Automacao Web",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 10,
  "name": "que acesso Automacao com Batista",
  "keyword": "Dado "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 13,
  "name": "Realizar o Upload de um arquivo presente no Desktop",
  "description": "",
  "id": "upload-de-um-documentos-para-o-site-automacao-com-batista;realizar-o-upload-de-um-arquivo-presente-no-desktop",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 12,
      "name": "@web"
    },
    {
      "line": 12,
      "name": "@RealizarUpload"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "navego ate \"Outros\" e clico em \"Upload de arquivos\"",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "clico em \"File\"",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "devo fazer o Upload do arquivo \"LEIAME.txt\" que esta na pasta \"ParaUpload\"",
  "keyword": "Entao "
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
formatter.after({
  "duration": 90038000,
  "status": "passed"
});
});
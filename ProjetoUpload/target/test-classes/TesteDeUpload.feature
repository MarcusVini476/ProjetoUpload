#language: pt
#enconding: UTF-8
#author: MarcusVinicius
#date: 27/05/2021
#version: 1.0
@Upload
Funcionalidade: Upload de um documentos para o site Automacao com Batista

  Contexto: Acessar a Pagina de Treinamento Automacao Web
    Dado que acesso Automacao com Batista

  @web @RealizarUpload
  Cenario: Realizar o Upload de um arquivo presente no Desktop
    E navego ate "Outros" e clico em "Upload de arquivos"
    E clico em "File"
    Entao devo fazer o Upload do arquivo "LEIAME.txt" que esta na pasta "ParaUpload"



# Parking Control API
The Parking Control API is a system developed to manage and organize parking spots.

## Features and Validations
The API offers the following features and validations:

Addition of parking spots. It allows you to add a new parking spot, specifying the spot number and the corresponding apartment.
Validation for duplicate spots. It does not allow adding multiple spots with the same identification number.
Validation for one spot per apartment: Only one spot is allowed per apartment, considering both the apartment number and block.
Registration of one car per spot: It does not allow registering more than one car in a single spot.

    :brazil:   🇧🇷
A API Parking Control é um sistema desenvolvido para gerenciar o controle de
vagas de estacionamento. Ela foi criada com o objetivo de facilitar a gestão 
e organização de estacionamentos.

## Funcionalidades e Validações
A API oferece as seguintes funcionalidades e validações:
Adição de vagas de estacionamento: É possível adicionar uma nova vaga, especificando o número da vaga e  apartamento.
Validação de duplicidade de vaga: Não é permitido adicionar mais de uma vaga com o mesmo número de identificação.
Validação de vaga por apartamento: Apenas uma vaga é permitida por apartamento, sendo verificado tanto o número do apartamento quanto o bloco.
Registro de um carro por vaga: Não é permitido registrar mais de um carro em uma mesma vaga.

![Alt Text](/images/sequenceDiagram.drawio.png)

### 🛰️ Built With


- Spring Framework
- Spring Web
- Spring JPA
- Validation
- MySQL (used as the database)

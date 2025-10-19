# Age Calculator API

Este é um projeto de API REST desenvolvido em Spring Boot que calcula a idade exata (em anos, meses e dias) de uma pessoa a partir de sua data de nascimento.

## Tecnologias Utilizadas

* **Java 17**
* **Spring Boot** (com a dependência `spring-boot-starter-web`)
* **Maven** (utilizando o Maven Wrapper)

## Como Rodar o Projeto

Para executar este projeto, você precisará apenas do **JDK (Java Development Kit)** instalado (versão 17 ou superior). Não é necessário ter o Maven instalado globalmente.

1.  **Clone este repositório** (ou baixe os arquivos ZIP).

2.  **Abra um terminal** (PowerShell, CMD, Git Bash, etc.).

3.  **Navegue até a pasta raiz do projeto** (a pasta onde se encontra o arquivo `pom.xml` e `mvnw`):
    ```bash
    cd caminho/para/o/projeto/agecalculator
    ```

4.  **Execute o seguinte comando** para iniciar o servidor Spring Boot:

    * No Windows (PowerShell/CMD):
        ```bash
        .\mvnw spring-boot:run
        ```
    * No macOS ou Linux:
        ```bash
        ./mvnw spring-boot:run
        ```

5.  Aguarde o terminal exibir a mensagem `Tomcat started on port 8080 (http)`. Isso indica que o servidor está no ar e pronto para receber requisições.

6.  Para parar o servidor, pressione `Ctrl + C` no terminal.

## Endpoint da API

O servidor estará rodando em `http://localhost:8080`.

### Calcular Idade

Calcula a idade de uma pessoa (anos, meses e dias) e retorna seu nome completo.

* **Endpoint:** `/api/age/calculate`
* **Método:** `GET`
* **Parâmetros:**
    * `firstName` (String, obrigatório): O primeiro nome da pessoa.
    * `lastName` (String, opcional): O sobrenome da pessoa.
    * `dob` (String, obrigatório): A data de nascimento no formato **`yyyy-MM-dd`** (padrão ISO).

#### Exemplos de Uso

Você pode testar os links diretamente no seu navegador.

* **Exemplo 1 (Com nome e sobrenome):**
    ```
    http://localhost:8080/api/age/calculate?firstName=Joao&lastName=Silva&dob=1990-05-15
    ```
    * **Resposta (JSON):**
    *(O resultado exato de meses e dias dependerá da data atual)*
    ```json
    {
      "fullName": "Joao Silva",
      "years": 35,
      "months": 5,
      "days": 3
    }
    ```

* **Exemplo 2 (Apenas com primeiro nome):**
    ```
    http://localhost:8080/api/age/calculate?firstName=Maria&dob=2001-10-30
    ```
    * **Resposta (JSON):**
    ```json
    {
      "fullName": "Maria",
      "years": 23,
      "months": 11,
      "days": 18
    }
    ```

* **Exemplo 3 (Tratamento de Erro - Data Futura):**
    ```
    http://localhost:8080/api/age/calculate?firstName=Ana&dob=2030-01-01
    ```
    * **Resposta (Texto):**
    ```
    A data de nascimento não pode ser no futuro.
    ```
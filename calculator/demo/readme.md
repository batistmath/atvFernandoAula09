# calculadora-spring-boot

Este é um projeto de uma API REST de calculadora desenvolvido em Spring Boot, como parte de uma atividade acadêmica. A API expõe 10 endpoints para realizar diferentes operações matemáticas.

## Tecnologias Utilizadas

* **Java 17** (ou superior)
* **Spring Boot** (com a dependência `spring-boot-starter-web`)
* **Maven** (utilizando o Maven Wrapper)

## Como Rodar o Projeto

Para executar este projeto, você não precisa ter o Maven instalado globalmente no seu sistema, pois ele utiliza o Maven Wrapper (`mvnw`). Você precisará apenas do **JDK (Java Development Kit)**.

1.  **Clone este repositório** (ou baixe os arquivos ZIP) para a sua máquina local.

2.  **Abra um terminal** (como o PowerShell, Git Bash ou CMD).

3.  **Navegue até a pasta raiz do projeto** (a pasta onde se encontra o arquivo `pom.xml` e `mvnw`):
    ```bash
    cd caminho/para/o/projeto/demo
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

6.  Para parar o servidor, simplesmente pressione `Ctrl + C` no terminal.

## Endpoints da API

O servidor estará rodando em `http://localhost:8080`. Todos os endpoints da calculadora estão sob o prefixo `/api/calculator`.

### 1. Subtração
Realiza a subtração de `num1` - `num2`.
* **Endpoint:** `/api/calculator/subtract`
* **Parâmetros:** `num1` (double), `num2` (double)
* **Exemplo:** `http://localhost:8080/api/calculator/subtract?num1=100&num2=40`

### 2. Multiplicação
Realiza a multiplicação de `num1` * `num2`.
* **Endpoint:** `/api/calculator/multiply`
* **Parâmetros:** `num1` (double), `num2` (double)
* **Exemplo:** `http://localhost:8080/api/calculator/multiply?num1=10&num2=5`

### 3. Divisão
Realiza a divisão de `num1` / `num2`.
* **Endpoint:** `/api/calculator/divide`
* **Parâmetros:** `num1` (double), `num2` (double)
* **Exemplo:** `http://localhost:8080/api/calculator/divide?num1=10&num2=2`
* **Obs:** Tentar dividir por 0 (zero) retornará um erro `400 Bad Request` com a mensagem "Divisão por zero não é permitida.".

### 4. Raiz Quadrada
Calcula a raiz quadrada de um número.
* **Endpoint:** `/api/calculator/sqrt`
* **Parâmetros:** `num` (double)
* **Exemplo:** `http://localhost:8080/api/calculator/sqrt?num=81`

### 5. Raiz Cúbica
Calcula a raiz cúbica de um número.
* **Endpoint:** `/api/calculator/cbrt`
* **Parâmetros:** `num` (double)
* **Exemplo:** `http://localhost:8080/api/calculator/cbrt?num=27`

### 6. Potência
Calcula um número `base` elevado a um `expoente`.
* **Endpoint:** `/api/calculator/power`
* **Parâmetros:** `base` (double), `exponent` (double)
* **Exemplo:** `http://localhost:8080/api/calculator/power?base=2&exponent=3` (Resultado: 8)

### 7. Converter para Binário
Converte um número inteiro decimal para sua representação em binário.
* **Endpoint:** `/api/calculator/binary`
* **Parâmetros:** `num` (int)
* **Exemplo:** `http://localhost:8080/api/calculator/binary?num=13` (Resultado: "1101")

### 8. Potência de 10
Calcula 10 elevado a um `expoente`.
* **Endpoint:** `/api/calculator/pow10`
* **Parâmetros:** `exponent` (double)
* **Exemplo:** `http://localhost:8080/api/calculator/pow10?exponent=3` (Resultado: 1000)

### 9. Fatorial
Calcula o fatorial de um número inteiro não-negativo.
* **Endpoint:** `/api/calculator/factorial`
* **Parâmetros:** `num` (int)
* **Exemplo:** `http://localhost:8080/api/calculator/factorial?num=5` (Resultado: 120)

### 10. Valor de Pi
Retorna o valor constante de Pi ($\pi$).
* **Endpoint:** `/api/calculator/pi`
* **Parâmetros:** Nenhum
* **Exemplo:** `http://localhost:8080/api/calculator/pi` (Resultado: 3.141592653...)
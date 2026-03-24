#  Microsserviços com Spring Boot e Docker

##  Descrição

Este projeto implementa dois microsserviços utilizando **Spring Boot** que se comunicam via **REST (HTTP)**.

*  **Produto Service** → fornece dados simulados de produtos
*  **Pedido Service** → consome o Produto Service e retorna pedidos com os dados do produto

Ambos os serviços são executados utilizando **Docker Compose**.

---

##  Tecnologias utilizadas

* Java 21
* Spring Boot
* Maven
* Docker
* Docker Compose

---

##  Estrutura do projeto

```
serviceprodutopedido/
│
├── produto-service/
│   └── API de produtos
│
├── servicepedido/
│   └── API de pedidos
│
└── docker-compose.yml
```

---

## Como executar o projeto

### 1. Gerar os builds

Dentro de cada serviço:

```bash
cd produto-service
mvn clean package

cd ../servicepedido
mvn clean package
```

---

### 2. Subir os containers

Na pasta raiz:

```bash
docker-compose up --build
```

---

##  Endpoints

###  Produto Service

```http
GET http://localhost:8081/produto/{id}
```

#### Exemplos:

* `/produto/1` → Notebook
* `/produto/2` → Mouse
* `/produto/3` → Teclado


##  Testes realizados


<img width="934" height="897" alt="Captura de tela 2026-03-24 193357" src="https://github.com/user-attachments/assets/40fccb79-57bd-44fc-a4cc-50eed38233db" />




<img width="952" height="647" alt="Captura de tela 2026-03-24 193428" src="https://github.com/user-attachments/assets/a135d118-dd0a-45f8-8b84-f2c2e86351c2" />



<img width="1852" height="437" alt="Captura de tela 2026-03-24 195054" src="https://github.com/user-attachments/assets/781a6be0-ee1f-4866-bab3-1609fcb343d9" />



<img width="1861" height="548" alt="Captura de tela 2026-03-24 195112" src="https://github.com/user-attachments/assets/e8300524-3f3c-468d-a08c-f0146aa7e846" />


##  Problemas dessa arquitetura

Este tipo de arquitetura baseada em microsserviços pode apresentar alguns problemas:

*  Dependência entre serviços
*  Falhas em cascata
*  Latência de rede
*  Timeout em requisições
*  Necessidade de tratamento de erros
*  Maior complexidade de monitoramento

---

##  Conclusão

O projeto demonstra como microsserviços podem se comunicar via HTTP, além de evidenciar problemas comuns como falhas e latência, reforçando a importância de boas práticas em sistemas distribuídos.

---

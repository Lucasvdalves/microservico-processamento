# Microserviço de Processamento

Este microserviço é responsável por processar mensagens recebidas de uma fila RabbitMQ. Ele atua como **consumer**, recebendo pedidos enviados por outros serviços e executando o processamento necessário.

## Funcionalidades
- Consome mensagens da fila RabbitMQ.
- Processa os pedidos recebidos.
- Utiliza DTOs para transporte estruturado de dados.

## Tecnologias utilizadas
- Java 17+
- Spring Boot
- Spring AMQP (RabbitMQ)
- Maven
- Docker (opcional, para executar o RabbitMQ localmente)

## Requisitos
- JDK 17 ou superior
- Maven 3.9+
- RabbitMQ em execução (local ou CloudAMQP)
- Acesso ao repositório do projeto

## Como rodar localmente
1. Clone este repositório:
   ```bash
   git clone https://github.com/Lucasvdalves/microservico-processamento.git
   cd microservico-processamento

 2. Configure as credenciais do RabbitMQ no arquivo application.properties:  
spring.rabbitmq.host=SEU_HOST
spring.rabbitmq.port=5671
spring.rabbitmq.username=SEU_USUARIO
spring.rabbitmq.password=SUA_SENHA
spring.rabbitmq.virtual-host=SEU_VHOST
spring.rabbitmq.ssl.enabled=true

3. Compile e rode o projeto:
mvn spring-boot:run

## Arquitetura geral
Este projeto faz parte de uma arquitetura de microserviços, onde:
microservico-consumer atua como produtor de mensagens (envia pedidos para a fila).
microservico-processamento atua como consumidor (lê e processa os pedidos).
Os serviços se comunicam de forma assíncrona via RabbitMQ.

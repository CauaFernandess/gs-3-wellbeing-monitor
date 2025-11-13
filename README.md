# gs-3-wellbeing-monitor

## Membros do grupo
- Caua Fernandes (RM551765)
- Felipe Pereira Meschiatti (RM551978)

## Tema
Nome do Tema

## Descrição
Uma explicação textual sobre o tema.

## Finalidade da API
API REST para consulta de informações do tema do grupo, sem banco de dados, utilizando Java + Spring Boot.

## Como rodar o projeto localmente
1. Certifique-se de ter o Java 17 instalado.
2. Execute o comando:
   ```cmd
   mvnw clean package
   java -jar target/*.jar
   ```
3. Acesse: http://localhost:8081/info

## Documentação Swagger
Acesse:
- http://localhost:8081/swagger-ui.html
- http://localhost:8081/swagger-ui/index.html

## Docker
Para gerar e rodar a imagem Docker:
```cmd
docker build -t gs-3-wellbeing-monitor .
docker run -p 8081:8081 gs-3-wellbeing-monitor
```

## Docker Hub
URL da imagem: [INSIRA AQUI]

## Workflows CI/CD
- Versionamento automático por push na main
- CI: build, testes e build da imagem Docker por push nas branches feature/**, release, hotfix
- CD: envio automático da imagem ao Docker Hub por pull request na develop

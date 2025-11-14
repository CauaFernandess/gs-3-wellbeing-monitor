# gs-3-wellbeing-monitor

## Membros do grupo
- Caua Fernandes (RM551765)
- Felipe Pereira Meschiatti (RM551978)

## Tema
Ferramentas de monitoramento de bem-estar e saúde mental

## Descrição
API REST desenvolvida em Java com Spring Boot para monitoramento de indicadores de bem-estar e saúde mental, sem uso de banco de dados. Disponibiliza informações do grupo e do tema via endpoint público.

## Finalidade da API
Prover um endpoint para consulta dos dados do tema e dos membros do grupo, facilitando integração e documentação via Swagger.

## Como rodar o projeto localmente
1. Certifique-se de ter o Java 17 instalado.
2. Execute o comando:
   ```cmd
   mvnw clean package
   java -jar target/gs-3-wellbeing-monitor-0.0.1-SNAPSHOT.jar
   ```
3. Acesse: http://localhost:8081/info

## Documentação Swagger
Acesse:
- http://localhost:8081/swagger-ui.html
- http://localhost:8081/swagger-ui/index.html

## Docker
Para gerar e rodar a imagem Docker:
```cmd
docker build -t cauafernandess/gs-3-wellbeing-monitor:latest .
docker run -p 8081:8081 cauafernandess/gs-3-wellbeing-monitor:latest
```

## Docker Compose
Para subir o serviço com Docker Compose:
```cmd
docker compose up
```

## Docker Hub
URL da imagem: [https://hub.docker.com/r/cauafernandess/gs-3-wellbeing-monitor]

## Workflows CI/CD
- **Versionamento automático:** via Release Please Action por push na main
- **CI:** build, testes e build da imagem Docker por push nas branches feature/**, release, hotfix
- **CD:** envio automático da imagem ao Docker Hub por pull request na develop


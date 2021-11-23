# customer-service

## instrcucciones para correr imagen de docker en local 

1. clonar repo
2. hacer mvn clean
3. hacer mvn install
4. moverse hasta el directorio raiz del proyecto(donde se encuentra el Dockerfile)
5. correr por terminal el comando: docker build -t customer-service .
6. correr docker run -p 8085:8085/tcp customer-service

La aplicacion estara disponible en el puerto 8085 de localhost

# Ejercicio Práctico

Objetivo: CRUD empleando Spring MVC / Spring Data JPA / MySQL

Para compilar se debe ejecutar el siguiente comando de maven

```
mvn clean install
```
Una vez compilado y generado el jar *`* se lo pude ejecutar
empleando el siguiente comando

```
java -jar practicalExercise-1.0-SNAPSHOT.jar
```

Por defecto la aplicación se levanta sobre el puerto 8088, si es necesario se puede cambiar
modificando el archivo *application.properties*


Para la BDD se creo un archivo docker compose, el cual se lo puede ejecutar empleando el comando
```
docker-compose up
```
Por defecto se creará una BDD con las siguientes propiedades

```
 MYSQL_DATABASE: 'exerciseDB'
 MYSQL_USER: 'exercise'
 MYSQL_PASSWORD: 'exercise'
 MYSQL_ROOT_PASSWORD: 'exercise'
```
En caso de cambiar los nombres de la base, usuario o password, se debe modificar el archivo
*application.properties*

Dentro de la BDD ejecutar el script *exercise.sql*, para crear los elementos de BDD

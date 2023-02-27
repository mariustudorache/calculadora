# Calculadora
Microservicio de una calculadora realizado con Spring Boot.
 
La calculadora traza todos los resultados usando la libreria tracer-1.0.0.jar.

#### Tecnologas

Apache Maven 

Java openjdk 11

#### Libreras necesarias
<!-- librera de tracer -->
		<dependency>
              <groupId>io.corp.calculator</groupId>
              <artifactId>tracer</artifactId>
              <version>1.0</version>
              <scope>system</scope>
              <systemPath>${basedir}/lib/tracer-1.0.0.jar</systemPath>
            </dependency>
---

#### Como compilar el microservicio en local

Para construir el proyecto se utilizaron los siguientes comandos:

> mvn clean install

Este comando ejecuta:
 1. Limpiar el target del proyecto.
 2. Recogera las librerias necesarias para el microservicio.
 3. Compilara el proyecto con las propiedades de la carpeta `src/main/resources/application.properties`

---

#### Como ejecutar el microservicio en local
Siguiendo los pasos anteriores, bastaria con ejecutar el comando en la carpeta raiz del proyecto:

> mvn spring-boot:run

---

#### Servicios disponibles
Una vez lanzado el microservicio se podra acceder al API accediendo a la siguiente URL:
> **local**: http://localhost:8080/swagger-ui/index.html

---



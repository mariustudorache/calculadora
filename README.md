# Calculadora
Microservicio de una calculadora realizado con Spring Boot, Swagger 2 y Spring Fox.
 
La calculadora traza todos los resultados usando la librer�a tracer-1.0.0.jar.

#### Tecnolog�as

Apache Maven 3.6.0

Java openjdk 8

#### Librer�as necesarias
<!-- librer�a de tracer -->
		<dependency>
              <groupId>io.corp.calculator</groupId>
              <artifactId>tracer</artifactId>
              <version>1.0</version>
              <scope>system</scope>
              <systemPath>${basedir}/lib/tracer-1.0.0.jar</systemPath>
            </dependency>
---

#### C�mo compilar el microservicio en local

Para construir el proyecto se utilizar�n los siguientes comandos:

> mvn clean install

Este comando ejecuta:
 1. Limpiar el target del proyecto.
 2. Recoger� las librer�as necesarias para el microservicio.
 3. Compilar� el proyecto con las propiedades de la carpeta `src/main/resources/application.properties`

---

#### C�mo ejecutar el microservicio en local
Siguiendo los pasos anteriores, bastar�a con ejecutar el comando en la carpeta ra�z del proyecto:

> mvn spring-boot:run

---

#### Servicios disponibles
Una vez lanzado el microservicio se podr� acceder al API accediendo a la siguiente URL:
> **local**: http://localhost:8080/swagger-ui/index.html

---



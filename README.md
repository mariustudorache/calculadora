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
> **local**: http://localhost:8081/swagger-ui.html

---

#### Buenas pr�cticas

Siempre se realizar� el contrato del API antes de implementar nada y deber� ser validado por el equipo.
Para el contrato se tendr�n en cuenta las siguientes consideraciones:
- Recursos: Ser�n las entidades sobre las que actuamos. Las acciones sobre estas entidades se realizar�n con los
m�todos HTTP. En ingl�s, min�sculas y spinal-case. Siempre nombres y nunca acciones ni verbos. URIs cortas para mejorar posicionamiento.

- Path parameters: Siempre seguidos de la entidad a la que hacen referencia. Nunca usar varios seguidos.

- Query parameters: S�lo se usar�n para los m�todos GET que devuelvan una lista. Su prop�sito s�lo puede ser filtrar, paginar, expandir o similares.

Para la salida de los servicios se usar� JSON, camelCase, y se incluir� siempre un objeto data que envolver� la salida de cualquier petici�n.

Cualquier implementaci�n se realizar� con TDD. Primero se crear� el test que cubra el requisito, se lanzar� el test, y se implementar� lo
necesario para que pase el test (y nada m�s). Este proceso se repetir� hasta cubrir todos los requisitos.

Se deben respetar los objetos de las diferentes capas y nunca salt�rselos ni pasar el mismo objeto por varias capas.

Se debe mapear el objeto de salida y de entrada a trav�s de los "mappers".

Todo lo que se dise�e debe tener responsabilidad �nica, estar lo m�s desacoplado posible y estar lo m�s preparado para ser reutilizable.

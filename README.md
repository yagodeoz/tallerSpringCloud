# Talleres De spring Boot

Talleres uso de spring starters, aplicando el principio KISS

## Comenzando 🚀

_Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas._

Instala el JDK 11
Instala el Eclipse



### Pre-requisitos 📋

_Hay tres proyectos: eureka-server-impl (Contiene la configuracion para el servidor de Eureka para centralizar los microservicios, configuracion-git: contiene la configuracion para establecer un repositorio git poara los archivos de confg, backend:hace el papel de cliente, consume las configuraciones del git por medio de los dos componentes anteriores ) _

### Instalación 🔧

_Luego de importar el proyecto maven, ejecutar mvn clean -U_

## Ejecutando las pruebas ⚙️

_Busca Ejecuta el proyecto Eureka, ejecuta el proyecto configuracion y luego el backend, abre un navegador y verifica lo siguiente:

1.- Servidor de Eureka: http://localhost:8761/
2.- Servidor de configuracion: http://localhost:8888/actuator/info; http://localhost:8888/actuator/info, http://localhost:8888/backend/default; http://localhost:8888/backend/dev
3.- Ejecuta el rest: http://localhost:8080/prueba/obtener_parametro
4.- puedes revisar los parámetros en el repositorio GIT: https://github.com/yagodeoz/configuraciones puedes cambiarlos con confianza o incluir código
_

## Construido con 🛠️

_herramientas_

* [Maven](https://maven.apache.org/) - Manejador de dependencias
* [Spring Boot](https://spring.io/projects/spring-boot) - Framework

## Autores ✒️

* **Byron Segovvia** - *Trabajo Inicial*
* Comenta a otros sobre este proyecto 📢
* Invitame una cerveza 🍺 o un café ☕

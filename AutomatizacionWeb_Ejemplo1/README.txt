Realizado por: Jorge Nacipucha García

# Ejercicio
Realizar una prueba funcional automatizada (Prueba E2E) de un flujo de compra
en la página  "https://www.demoblaze.com/" que incluya:
- Agregar dos productos al carrito
- Visualizar el carrito
- Completar el formulario de compra
- Finalizar la compra

## Requisitos

Para ejecutar el proyecto es necesario tener instalado lo siguiente:

  - Maquina local con el sistema operativo Windows 10
  - JDK versión 1.8
  - Intellij-Idea Comunity o Ultimate version 2023.1.2
  - Gradle 8.0

## Ejecucion
- Para ejecutar el proyecto
        1. Ejecutar el IDE IntelliJ
        2. Ir a File -> Open y abrir el proyecto
        3. Esperar hasta que se descargen las despendencias de gradle (tomará unos pocos minutos)
        4. Ubicarse en el directorio src/test/java/co.com.ejercicio.software/runners/ y ejecutar buyRunner.java
            - Se ejecutará el proceso de compra en el google chrome de forma ordenada según lo solicitado para el ejercicio
        5. Finalizada la ejecución de la prueba el Reporte de Serenity se creará en la ruta target/serenity/index.html



## Información adicional

Repositorio Git: https://github.com/jnacipucha/AutomatizacionWeb_Ejercicio1.git

# Changelog

Todos los cambios notables en este proyecto serán documentados en este archivo.

El formato está basado en [Keep a Changelog](https://keepachangelog.com/es-ES/1.0.0/), y este proyecto se adhiere de manera informal al versionado semántico.

---

## [1.1.0] - 2020-10-05

### Added
- Recursos gráficos para la documentación (`img/dudas.jpg`, `img/imperativePlusReactive.png`, `img/quarkus_logo.jpg`, `img/sdk_man.jpg`, `img/graalvm_architecture.png`).

### Changed
- Mejoras de legibilidad, corrección de enlaces y maquetación de secciones de GraalVM y frameworks en `README.md`.
- Optimización y simplificación del endpoint `/customer` en `CustomerResource.java`.

### Fixed
- Corrección de puertos expuestos y variables de entorno del contenedor MySQL en `quarkus/src/main/docker/database/docker-compose.yml`.
- Configuración de logging de consola, logs persistentes (`quarkus-info.log`) y categoría para el paquete principal en `quarkus/src/main/resources/application.properties`.
- Actualización de pruebas unitarias (`CustomerResourceTest.java`) para ajustarse al mapeo de paths `/customer`.

---

## [1.0.0] - 2019-12-10

### Added
- Implementación del recurso REST `/customer` (`CustomerResource.java`) en Quarkus que soporta peticiones HTTP GET, POST y DELETE.
- Entidad de persistencia `CustomerEntity.java` heredada de PanacheEntity de Quarkus.
- Implementación de patrón repositorio `CustomerRepository.java` extendiendo PanacheRepository y agregando método de búsqueda `findByEmail`.
- Integración de dependencias de OpenAPI y Swagger-UI en el `pom.xml` de Quarkus.
- Script de inicialización SQL (`00-customer.sql`) para la tabla `customer` en el contenedor MySQL.

### Changed
- Refactorización de paquetes y renombrado del namespace principal de `com.graal.poc` a `com.graal.poc.customer.*` para el modelo de datos, repositorio y recursos HTTP de Quarkus.

### Removed
- Eliminación de archivos temporales `README.md` redundantes en subdirectorios de Docker Database.
- Eliminación de `import.sql` de Quarkus en favor de la inicialización de MySQL vía contenedor Docker.
- Eliminación del endpoint por defecto `ExampleResource.java` y su test asociado `ExampleResourceTest.java` en Quarkus.

---

## [0.1.0] - 2019-11-29

### Added
- Estructura base inicial del proyecto **Micronaut** (`Application.java`, logs, wrappers Maven).
- Estructura base inicial del proyecto **Quarkus** (`pom.xml`, wrappers Maven, Dockerfile para JVM y nativo).
- Configuración de Docker Compose para la base de datos MySQL de desarrollo en Micronaut y Quarkus.
- Documentación inicial sobre el compilador AOT y JIT de GraalVM.

### Removed
- Archivo de metadatos `.project` generado por IDE Eclipse en el raíz del repositorio.

# Literalura - Gestor de Biblioteca Digital

## Descripción
**Literalura** es una aplicación de consola desarrollada con **Spring Boot** que permite gestionar una biblioteca digital. Esta herramienta facilita la búsqueda, registro y visualización de libros, permitiendo a los usuarios mantener un registro organizado y eficiente de su colección literaria. El sistema incluye funcionalidades como la búsqueda por título, listado de libros, filtrado por idioma y más, todo integrado con una base de datos PostgreSQL.

## Características
- **Búsqueda de libros por título**: Permite buscar libros a través del nombre o parte de él.
- **Listado completo de libros registrados**: Muestra todos los libros almacenados en la base de datos.
- **Visualización de autores registrados**: Permite listar todos los autores disponibles en la biblioteca.
- **Filtrado de libros por idioma**: Posibilita la búsqueda de libros según el idioma de publicación.
- **Integración con base de datos PostgreSQL**: Utiliza PostgreSQL para almacenar y recuperar datos de manera eficiente.
- **Interfaz de consola interactiva**: Proporciona una interfaz simple y fácil de usar para interactuar con la aplicación.

## Tecnologías Utilizadas
- **Java 17**
- **Spring Boot 3.2.x**
- **Spring Data JPA**
- **PostgreSQL**
- **Maven**

## Requisitos Previos
Antes de ejecutar la aplicación, asegúrate de tener los siguientes componentes instalados:

- **Java JDK 17 o superior**
- **PostgreSQL**
- **Maven**
- **IDE** (recomendado: IntelliJ IDEA)

## Configuración de la Base de Datos
1. **Crear la base de datos**: Crea una base de datos en PostgreSQL llamada `literalura`.
2. **Configurar las credenciales**: Actualiza las credenciales de acceso en el archivo `application.properties`:
    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/literalura
    spring.datasource.username=tu_usuario
    spring.datasource.password=tu_contraseña
    ```

## Instalación y Ejecución
1. **Clonar el repositorio**:
    ```bash
    git clone [URL_DEL_REPOSITORIO]
    ```

2. **Navegar al directorio del proyecto**:
    ```bash
    cd literalura
    ```

3. **Compilar el proyecto**:
    ```bash
    mvn clean install
    ```

4. **Ejecutar la aplicación**:
    ```bash
    mvn spring-boot:run
    ```

## Uso
Una vez que la aplicación esté en ejecución, se presentará un menú interactivo con las siguientes opciones:

1. **Buscar libro por título**: Ingresa el título o parte del título para encontrar un libro específico.
2. **Listar libros registrados**: Muestra una lista completa de todos los libros almacenados.
3. **Listar autores registrados**: Muestra todos los autores presentes en la base de datos.
4. **Listar libros por idioma**: Permite filtrar los libros según el idioma de publicación.
5. **Salir**: Termina la ejecución de la aplicación.

## Estructura del Proyecto
El proyecto sigue la siguiente estructura de directorios:
```
literalura/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── alura/
│   │   │           └── literalura/
│   │   │               ├── controller/
│   │   │               ├── model/
│   │   │               ├── repository/
│   │   │               ├── service/
│   │   │               └── LiteraturaApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
└── pom.xml
n.properties 
```

## Contribuir
¡Contribuye al proyecto! Si deseas agregar nuevas características o mejorar la aplicación, sigue estos pasos:

1. Haz un Fork del repositorio.
2. Crea una rama para tu nueva funcionalidad:
    ```bash
    git checkout -b feature/AmazingFeature
    ```
3. Realiza tus cambios y haz un commit con un mensaje descriptivo:
    ```bash
    git commit -m 'Add some AmazingFeature'
    ```
4. Sube la rama con los cambios a tu repositorio:
    ```bash
    git push origin feature/AmazingFeature
    ```
5. Abre un Pull Request desde tu rama hacia el repositorio principal.


## Contacto
**CalciferD**    
Link del proyecto: [https://github.com/CalciferD/Literalura]

---

¡Gracias por utilizar **Literalura**!

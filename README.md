# Reto 1 Back-end utilizando Spring Boot (Java), Maven y MySQL

API Rest local con el uso de SpringBoot (Java), Maven y My SQL.

Desarrollado en el IDE IntelliJ IDEA y la base de datos fue gestionada con MySQL Workbench.

Desarrollador: Felipe Castillo

## Cómo utilizar

- Clone el repositorio en el directorio de su preferencia
- Código desarrollado en Intellij IDEA se recomienda este entorno más no es obligatorio.
- Teniendo el proyecto en un directorio buscar en la ruta "src/main/resources/data.sql" el archivo .sql para levantar la base de datos utilizada.
- Levantar la base de datos desde su ntorno de MySQL preferido (Puerto 3306)
- Usuario: root
- Contraseña:
- Ejecutar proyecto y probarlo (se recomienda utilizar Postman)




## Ejemplos de prueba
Los ejemplos que se veran a continuación fueron hechos con Postman, en algunos se necesitaran agregar información en formato JSON. los datos necesarios son mostrados en las imagenes de ejemplo.

- Respuesta GET -- http://localhost:8080/api/v1/accounts
![](https://github.com/Felipe0408/Imagenes/blob/main/Ejemplo%20Get.png)
  
- Respuesta GET con un Id como parametro -- http://localhost:8080/api/v1/accounts/{id}
![](https://github.com/Felipe0408/Imagenes/blob/main/Ejemplo%20Get%20Id1.png)
  
- Respuesta POST -- http://localhost:8080/api/v1/accounts (Necesita datos en formato JSON para: saldo, nomnbre, numerocuenta, estado)
![](https://github.com/Felipe0408/Imagenes/blob/main/Ejemplo%20POST.png)

- Respuesta PUT con un Id como parametro -- http://localhost:8080/api/v1/accounts/{id} (Necesita datos en formato JSON para: saldo, nomnbre, numerocuenta, estado)
![](https://github.com/Felipe0408/Imagenes/blob/main/Ejemplo%20PUT.png)

-  Respuesta DELETE con un Id como parametro -- http://localhost:8080/api/v1/accounts/{id}
![](https://github.com/Felipe0408/Imagenes/blob/main/Ejemplo%20DELETE.png)

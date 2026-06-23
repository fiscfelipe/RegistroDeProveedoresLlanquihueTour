# Sumativa 2 POO: LlanquihueTour - Registro de Proveedores

## Descripción

Registro de Proveedores es una aplicación desarrollada en Java para gestionar proveedores de servicios turísticos de transporte y alojamiento para la empresa Llanquihue Tour.

El sistema permite cargar registros desde un archivo de texto, realizar consultas, filtrar proveedores según su categoría y agregar nuevos registros, manteniendo la información almacenada de forma permanente.

El proyecto fue desarrollado aplicando conceptos de Programación Orientada a Objetos (POO), manejo de excepciones, colecciones y persistencia de datos mediante archivos.

---

## Funcionalidades

* Carga automática de proveedores desde archivo.
* Visualización de todos los proveedores registrados.
* Filtrado de proveedores de transporte.
* Filtrado de proveedores de alojamiento.
* Búsqueda de proveedores por nombre.
* Búsqueda de proveedores por RUT.
* Registro de nuevos proveedores desde consola.
* Almacenamiento permanente de nuevos registros en archivo.
* Validación de datos ingresados.
* Prevención de registros duplicados mediante RUT.

---

## Estructura del Proyecto

### app

Contiene la clase principal del sistema.

* Main

### model

Contiene las clases correspondientes al modelo diseñado.

* Persona
* ProveedorTransporte
* ProveedorAlojamiento
* Vehiculo
* Alojamiento
* Direccion
* Rut
* Correo
* Patente

### service

Contiene la lógica y gestión de los registros.

* RegistroService

### util

Contiene excepciones personalizadas para validación.

* RutInvalidoException
* CorreoInvalidoException
* PatenteInvalidaException

### resources

Contiene el archivo de persistencia.

* registro.txt

---

## Conceptos de Programación Orientada a Objetos Aplicados

### Encapsulamiento

Los atributos de las clases fueron declarados como privados y se accede a ellos mediante métodos getters y setters.

### Herencia

Las clases:

* ProveedorTransporte
* ProveedorAlojamiento

heredan de la clase Persona.

### Composición

* Persona posee un Rut.
* Persona posee un Correo.
* Persona posee una Direccion.
* Vehiculo posee una Patente.
* Alojamiento posee una Direccion.
* ProveedorTransporte posee un Vehiculo.
* ProveedorAlojamiento administra un Alojamiento.

### Polimorfismo

Los proveedores son almacenados en una colección de tipo:

```java
ArrayList<Persona>
```

permitiendo tratar proveedores de transporte y alojamiento de forma uniforme.

### Manejo de Excepciones

Se implementaron excepciones personalizadas para validar:

* Formato de RUT.
* Formato de correo electrónico.
* Formato de patente.

También se utilizan bloques try-catch para controlar errores de entrada de datos y operaciones de lectura/escritura de archivos.

---

## Validaciones Implementadas

### Rut

Formato válido:

```text
12345678-9
12345678-K
```

### Correo

Formato válido:

```text
correo@dominio.cl
```

### Patente

Formatos válidos:

```text
ABCD12
AB1234
```

### Persona

* Nombre obligatorio.

### Direccion

* Calle obligatoria.
* Ciudad obligatoria.
* Región obligatoria.
* Número mayor a cero.

### Vehiculo

* Tipo obligatorio.
* Patente obligatoria.
* Asientos disponibles mayores o iguales a cero.

### Alojamiento

* Nombre obligatorio.
* Habitaciones disponibles mayores o iguales a cero.
* Dirección obligatoria.

### Duplicidad de registros

El sistema impide registrar proveedores con un RUT ya existente.

---

## Archivo de Datos

Los proveedores se almacenan en el archivo:

```text
src/resources/registro.txt
```

Tipos de registro soportados:

### Transporte

```text
TRANSPORTE;Nombre;Rut;Correo;Calle;Numero;Ciudad;Region;TipoVehiculo;Patente;Asientos
```

### Alojamiento

```text
ALOJAMIENTO;Nombre;Rut;Correo;Calle;Numero;Ciudad;Region;NombreAlojamiento;Habitaciones;CalleAlojamiento;NumeroAlojamiento;CiudadAlojamiento;RegionAlojamiento
```

---

## Ejecución

1. Ejecutar la clase `Main`.
2. Seleccionar una opción del menú.
3. Consultar registros, buscar proveedores o agregar nuevos registros.
4. Los nuevos proveedores serán almacenados automáticamente en el archivo de datos.

---

## Autor

Felipe Saldías

Estudiante de la carrera de Analista Programador Computacional en DuocUC

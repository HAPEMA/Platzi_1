# 🍿 Platzi Play

Bienvenido a **Platzi Play**, una aplicación de consola en Java para gestionar tu catálogo de películas favorito. Este proyecto permite administrar una lista de contenidos multimedia de manera sencilla y eficiente.

## 🚀 Características

El sistema cuenta con un menú interactivo que permite realizar las siguientes operaciones:

*   **Agregar Contenido:** Ingresa nuevas películas con su título, género, duración y calificación.
*   **Mostrar Todo:** Visualiza el listado completo de películas disponibles en la plataforma.
*   **Buscar por Título:** Encuentra rápidamente una película específica y ver su ficha técnica.
*   **Eliminar Contenido:** Remueve películas del catálogo por su título.
*   **Carga Inicial:** El sistema inicia con un conjunto de películas populares precargadas (Shrek, Inception, John Wick, etc.) para facilitar las pruebas.

## 🛠️ Tecnologías Utilizadas

*   **Lenguaje:** Java
*   **Entrada de Datos:** `Scanner` (a través de la utilidad `ScannerUtils`)
*   **Estructura del Proyecto:**
    *   `platzi.play`: Paquete principal.
    *   `platzi.play.contenido`: Clases del modelo de datos (ej. `Pelicula`).
    *   `platzi.play.plataforma`: Lógica de negocio y gestión de la colección.
    *   `platzi.play.util`: Utilidades auxiliares.

## 📋 Cómo Usar

1.  **Clonar el repositorio:**
    ```bash
    git clone <https://github.com/HAPEMA/Platzi_1.git>
    ```
2.  **Compilar el proyecto:**
    Asegúrate de tener el JDK instalado. Navega a la carpeta `src` y compila los archivos.
3.  **Ejecutar:**
    Corre la clase `Main` para iniciar la aplicación.
    ```bash
    java platzi.play.Main
    ```

## 📝 Ejemplo de Uso

Al iniciar la aplicación, verás un menú como este:

```text
Bienvenido a Platzi Play 🍿 v1.0.0
Ingrese una de las siguientes Opciones:
1. Agregar contenido
2. Mostrar Todo
3. Buscar por titulo
4. Eliminar
5. Salir
```

Simplemente ingresa el número de la opción deseada y sigue las instrucciones en pantalla.
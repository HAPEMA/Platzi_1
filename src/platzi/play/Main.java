package platzi.play;

import platzi.play.contenido.Pelicula;
import platzi.play.plataforma.Plataforma;
import platzi.play.util.ScannerUtils;

public class Main {
    public static final String VERSION = "1.0.0";
    public static final String NOMBRE_PLATAFORMA = "Bienvenido a Platzi Play 🍿";
    public static final int SALIR = 5;
    public static final int AGREGAR_CONTENIDO = 1;
    public static final int MOSTRAR_CONTENIDO = 2;
    public static final int BUSCAR_CONTENIDO = 3;
    public static final int ELIMINAR_CONTENIDO = 4;

    public static void main(String[] args) {
        Plataforma pla = new Plataforma(NOMBRE_PLATAFORMA);
        System.out.println(NOMBRE_PLATAFORMA + " v" + VERSION);

        // 4. Eliminar
        cargarPeliculas(pla);

        while (true){
            int opcionElegida = ScannerUtils.capturarEntero("""
                             Ingrese una de las siguientes Opciones:
                             1. Agregar contenido
                             2. Mostrar Todo
                             3. Buscar por titulo
                             4. Eliminar
                             5. Salir
                    """);

            switch (opcionElegida) {
                case AGREGAR_CONTENIDO:
                    //Datos entregados por el usuario usando la class ScannerUtils.
                    String nombre = ScannerUtils.capturartexto("¿Cual es el Nombre del contenido: ");
                    String genero = ScannerUtils.capturartexto("¿Cual es el genero del contenido");
                    int duracion = ScannerUtils.capturarEntero("¿Cual es la duracion del contenido?");
                    double calificacion = ScannerUtils.capturarDecimal("¿Cual es la calificacion del contenido?");

                    pla.agregarPelicula(new Pelicula(nombre, genero, duracion, calificacion));
                    break;
                case MOSTRAR_CONTENIDO:
                    pla.listarPelicula();
                    break;
                case BUSCAR_CONTENIDO:
                    String peliculaPorTitulo = ScannerUtils.capturartexto("Titulo de la pelicula que desea buscar: ");
                    //Duda aca. Se supone que declaro una pelicula con los datos de una que ya existe y luego se muestra esa nueva.
                    Pelicula p = pla.bucarPorTitulo(peliculaPorTitulo);

                    if (p != null){
                        System.out.println(p.obtenerFichaTecnica());
                    }
                    else {
                        System.out.println("No se encontro la pelicula" + peliculaPorTitulo + " en " + pla.getNombre());
                    }
                    break;
                case ELIMINAR_CONTENIDO:
                    String peliculaEliminar = ScannerUtils.capturartexto("Titulo de la pelicula que desea eliminar: ");
                    pla.eliminarPelicula(peliculaEliminar);
                    break;
                case SALIR:
                    System.exit(0);
                    break;
            }
        }
    }
    private static void cargarPeliculas(Plataforma p) {
        p.agregarPelicula(new Pelicula("Shrek","Animada",90,4.5));
        p.agregarPelicula(new Pelicula("Inception","Ciencia Ficción",148,3.5));
        p.agregarPelicula(new Pelicula("Titanic","Drama",195,4.6));
        p.agregarPelicula(new Pelicula("John Wick","Acción",101,5));
        p.agregarPelicula(new Pelicula("El Conjuro","Terror",112,3.0));
        p.agregarPelicula(new Pelicula("Coco","Animada",105,4.7));
        p.agregarPelicula(new Pelicula("Interstellar","Ciencia Ficción",169,5));
        p.agregarPelicula(new Pelicula("Joker","Drama",122,2.1));
        p.agregarPelicula(new Pelicula("Toy Story","Animada",81, 4.5));
        p.agregarPelicula(new Pelicula("Avengers: Endgame","Acción",181,3.9));
    }
}




        /*
            Estamos instanciando (Crearlo) el objeto Pelicula que en resumidas le damos un valor que seria aresignar luego lo usarmos (Explicar mejopr eso)
            cuando usamos New para crear el objeto esto seguarda en un lugar de la memoria llamado heap.
        */


package platzi.play;

import platzi.play.contenido.Pelicula;

public class MainStackHeap {
    public static void main(String[] args) {
        Pelicula ReyLeon = new Pelicula("Rey León", "Animada", 135, 3.9);
        Pelicula Matrix = new Pelicula("Matrix", "Fantasía",  120, 4.8);


        ReyLeon = Matrix;

        ReyLeon.setTitulo("Minecraft");

        System.out.println("Pelicula ReyLeon muestra: " + ReyLeon.getTitulo());
        System.out.println("Pelicla Matrix Muestra: " + Matrix.getTitulo());
    }
}
        /*
            Java tiene dos tipos de memoria el Stack y el Heap.

              STACK:
                Es donde se almacena los tipo de datos primitivos y las referencia a los objectos.
                Su tamaño se fija al inicio de la ejecuccion y no se puede cambiar. si se llegara a llenar arrojaria el error (StackOverflowError).

               HEAP:
                 Unicamente se almacenan los objetos.
                 Su tamaño puede cambiar es dinamico pero se fija al inicio de la ejecuccion. Cuando se llena ocurre el error (OutOfMemoryError).

                 Conclucion: entre el STACK y el HEAP existe una gran relacion las variables de tipo objeto que estan en el HEAP son refrencidas popr variables en el STACK.
                 El esta STACK guarda unicmanete la direccion o refrencia pero no el objeto y el HEAP el objeto
        */
        /*
            Los tipo de datos PRIMITIVOS:
              Se copía directamnete el valor al asignarlo a otra bvariable se crea una copia taltalmente nueva e independiente.
            En los objectos se copia es la referencia de este o el apuntador, diferenctes variables puede moficarlo y las dema slo verian.
        */
        /*
            En esta asignacion estoy dicienod que el objecto "Reyleon" apunte a donde esta "Matrix" en el heap entonces al modificar
            "Reyleon" tambien  lo hace el objecto "Matrix".
        */
        /*
             Garbage Collector:
                Cuando un objecto no es alcansable por ninguna variable del stack Java lo considera inaccesible (sobra)
                El GC lo elimina, este proceso es automatico java lo hace para librar la memoria en el heap (No se recomienda usar el GC)
                dejar ese trabajo a la JVM que el sabe bien cuando debe eliminar que cosa.
        */
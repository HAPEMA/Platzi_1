package platzi.play.contenido;

import java.time.LocalDate;
import java.time.LocalDateTime;
import static java.lang.Long.*;

public class Pelicula {
    /*
    Atributos:
        Por defecto tienen ciertos criterios.
        Los boolean = False.
        Los Int = 0.
        Los Strings = null.
        Los doubles = 0.0.
        Ademas por defecto estan con la etiqueta Private (eso es lo que dice las buenas practicas para modicarlos y leer estan los settes y los gettes.
    */
    String titulo;
    String descripcion;
    int duracion;
    String genero;
    LocalDate fechaEstreno;
    double calificacion;
    String numeroPremios = "2000000000000";
    boolean disponible;
    /*
    Constructor:
        Es para uniciarlizar los atributos de una clase, esto hace que si o si  deben estar incluidos al memento de instancia.
        Un Construtor puede o no estar sin parametros(Atribustos) al estar con parametros se deben colocar al momento de instancial el objeto
        usamos el "this" para decir que es el atributo de la clase y no solo el nombre de la clase.
        Puedo tener mas atributos a pesar que no esten entrando por marametros y estos no te lo exige a la hora de instanciar el objeto.
        Puedo tener mas de un contructor.
        Dentro de un contructor puedo tener otro.
        Dentro del constructor puedo llamar metodos.
    */

    public Pelicula(String titulo, String genero, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }
    public Pelicula(String titulo, String genero, int duracion, double calificacion) {
        this(titulo, genero, duracion);
        this.fechaEstreno = LocalDateTime.now().toLocalDate();
        this.calificar(calificacion);
        this.disponible = true;
        this.getNumeroPremios();
    }
    public String obtenerFichaTecnica() {
        return titulo +
                " (" + fechaEstreno + ")\n" +
                "Genero: " + genero + "\n" +
                "Calificación: " + calificacion + "/5";
    }
    public void calificar(double calificacion) {
        if (calificacion >= 0 && calificacion <= 5) {
            this.calificacion = calificacion;
        }
    }
    /*
        Getters:
            Lo usamos para poder acceder a la informacion de los atributos desde otro lado (puede ser clase)
    */
    public String getTitulo() {
        return titulo;
    }
    /*
        Casting (ver el nombre luego):
            Es la convercion de un dato a otro tipo.
            Ciertos datos se puede hacer inplicito que te lo hace java solo ejm de int a double y no se pierde informacion pero
            otros debes hacerlos tu y si se puede como ejemplo de decimal (double) a entero (int) en ese caso si se puede llegar a perder informacion.
            en el ejmplo uso (long) por que soporta mas que int y digo entre () que se lo que ghago y que quiero pásar de string a long uso la funcion
             ´´parseUnsignedLong´´ y le paso por parametro el numero y eso me lo transforma en long.p
    */
    public double getNumeroPremios() {
        return (long) parseUnsignedLong(numeroPremios);
    }
    /*
        Setters.
            No son lo mas recomendado en lo que es POO no son buenas practicas debe a ver logica de atras y pensarlo bien.
    */
    public String setTitulo(String titulo) {
        return  this.titulo = titulo;
    }
}

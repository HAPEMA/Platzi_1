package platzi.play.plataforma;

import platzi.play.contenido.Pelicula;
import java.util.ArrayList;
import java.util.List;

public class Plataforma {
    String nombre;
    List<Pelicula> contenido; //Agregacion (Luego definir) (Asociacion, aregacion, composicion)

    public Plataforma(String nombre) {
        this.nombre = nombre;
        this.contenido = new ArrayList<>();
    }

    public void agregarPelicula(Pelicula p){
        this.contenido.add(p);
    }

    public void eliminarPelicula(String titulo){
        for (Pelicula p : contenido){
            if (p.getTitulo().equalsIgnoreCase(titulo)){
                contenido.remove(p);
                System.out.println("Pelicula " + titulo + " Eliminada con exito 🚯");
                return;
            }
        }
        System.out.println("No se encontro la pelicula " + titulo + " en " + nombre);
    }

    public Pelicula bucarPorTitulo(String titulo){
        for (Pelicula p : contenido){
            if (p.getTitulo().equalsIgnoreCase(titulo)){
                return  p;
            }
        }
        return null;
    }
    public void listarPelicula(){
        for (Pelicula p : contenido) {
            System.out.println("Pelicula: " + p.obtenerFichaTecnica());
        }
    }
    public List<Pelicula> getContenido() {
        return contenido;
    }

    public String getNombre() {
        return nombre;
    }
}

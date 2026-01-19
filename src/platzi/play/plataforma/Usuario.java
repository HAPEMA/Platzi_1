package platzi.play.plataforma;

import platzi.play.contenido.Pelicula;
import java.time.LocalDateTime;
import java.util.Objects;

public class Usuario {
    String nombre;
    String genero;
    LocalDateTime fechaRegistro;


    public Usuario(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public String mirando(Pelicula pelicula){
        String D;
        String W;
        if (Objects.equals(genero, "M")){
            W = "El";
            D = "SR";
        }
        else {
            W = "La";
            D = "SRA";
        }
        return W + " " + D + " " + nombre +" Esta mirando la pelicula " + pelicula.getTitulo();
    }
    public LocalDateTime getFechaRegistro(){
        return fechaRegistro = LocalDateTime.now();
    }
}

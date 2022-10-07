package entidad;


public class Pelicula {
    private String nombre;
    private int anio;
    private String genero;
    
    //Constructores

    public Pelicula() {
    }

    public Pelicula(String nombre, int anio, String genero) {
        this.nombre = nombre;
        this.anio = anio;
        this.genero = genero;
    }
    
    //Getter and Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    //to String
    /*
    @Override
    public String toString() {
        return nombre + "\t" + edad + "\t" + altura + "\t" + peso + "\t" + nacionalidad;
    }
    */

    @Override
    public String toString() {
        return  nombre + "\t" + anio + "\t" + genero ;
    }
    
}

package Gestion_Animales;

public class Animales {
    private int edad;
    private String tamaño;
    private String origen;
    private String nombre;
    private boolean reproduccion;

    public Animales(int edad, String tamaño, String origen, String nombre, boolean reproduccion) {
        this.edad = edad;
        this.tamaño = tamaño;
        this.origen = origen;
        this.nombre = nombre;
        this.reproduccion=reproduccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isReproduccion(){
        return reproduccion;
    }

    public void setReproduccion(boolean reproduccion){
        this.reproduccion=reproduccion;
    }
}

    
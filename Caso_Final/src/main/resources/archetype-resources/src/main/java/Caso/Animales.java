package Caso;

public class Animales {
    private int edad;
    private String tamaño;
    private String origen;
    private String nombre;

    public Animales(int edad, String tamaño, String origen, String nombre) {
        this.edad = edad;
        this.tamaño = tamaño;
        this.origen = origen;
        this.nombre = nombre;
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
}

    
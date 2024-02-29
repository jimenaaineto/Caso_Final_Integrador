package Gestion_Animales;

public class Animales {
    boolean alimentacion;
    boolean salud;
    boolean comportamiento;
    private int edad;
    private String tamaño;
    private String origen;
    private String nombre;
    private boolean reproduccion;

    public Animales(boolean alimentacion, boolean salud, boolean comportamiento, /*faltan getters y setters*/int edad, String tamaño, String origen, String nombre, boolean reproduccion) {
        this.alimentacion=alimentacion;
        this.salud=salud;
        this.comportamiento=comportamiento;
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
    @Override
    public String toString() {
        return "Animales []";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }
}

    
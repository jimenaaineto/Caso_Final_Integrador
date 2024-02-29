package Gestion_Animales;

public class Animales {
    String alimentacion;
    boolean salud;//añadir en los constructores y super de als clases hijas 
    boolean comportamiento;//esto tienen que ser funciones, borrarlo de aqui y de las clases hijas 
    private int edad;
    private String tamaño;
    private String origen;
    private String nombre;
    private boolean reproduccion;
    //cada uno hay que hacer la funcion

    public Animales(boolean alimentacion, boolean salud, boolean comportamiento, /*faltan getters y setters*/int edad, String tamaño, String origen, String nombre, boolean reproduccion) {
        this.alimentacion=alimentacion;
        this.salud=salud;
        this.comportamiento=comportamiento;
        this.edad = edad;
        this.tamaño = tamaño;
        this.origen = origen;
        this.nombre = nombre;
        this.reproduccion=reproduccion;//faltan sus getters y setters de los 3 
        
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

    public void buenaSalud (boolean salud){
        if (salud==true){
            System.out.println("el anomal se encuentra en buen estado de salud");
        }else 
        System.out.println("el animal se encuentra en mal estado de salud");
    
    }//hacerlo con los otros dos


//hacer metodos con los atributos
    //metodo para registrar la alimentacion y asi con comportamiento y salud  
    public void regirtrarAlimentacion(String alimento){
        System.out.println("el animal ha sido ha sido aliemntado con "+alimento);
    }
    public void registrarComportamento(boolean comportamiento){
        System.out.println("el animal ha sido ha sido aliemntado con "+comportamiento);
    }
    public void registrarSalud( boolean salud){
        
        System.out.println(buenaSalud(salud));
    }
}

    
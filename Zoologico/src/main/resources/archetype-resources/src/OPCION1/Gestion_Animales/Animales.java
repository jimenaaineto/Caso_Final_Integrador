package Gestion_Animales;

public class Animales {
    String nombre;
    String alimentacion;
    boolean salud;
    boolean comportamiento;
    int edad;
    float peso;
    String especie;
    int id;

    public Animales(String nombre, String alimentacion, boolean salud, boolean comportamiento, int edad, float peso, String especie, int id) {
        this.nombre = nombre;
        this.alimentacion=alimentacion;
        this.salud=salud;
        this.comportamiento=comportamiento;
        this.edad = edad;
        this.peso = peso;
        this.especie = especie;
        this.id=id;//falta getter y setter
        
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public boolean howSalud() {
        return salud;
    }

    public void setSalud(boolean salud) {
        this.salud = salud;
    }

    public boolean howComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(boolean comportamiento) {
        this.comportamiento = comportamiento;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
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

    public void registrarNombre (String nombre){
        System.out.println("su nombre es: "+nombre);
    }

    public void buenaSalud (boolean salud){
        if (salud==true){
            System.out.println("el animal: "+nombre+"  se encuentra en buen estado de salud");
        }else 
        System.out.println("el animal: "+nombre+"  se encuentra en mal estado de salud");
    }

    public void buenComportamiento(boolean comportamiento){
        if(comportamiento==true){
            System.out.println("el comportamiento de: "+nombre+" es bueno");
        }else 
        System.out.println("el comportamiento de: "+nombre+" no es bueno");
    } 

    public void regirtrarAlimentacion(String alimento){
        System.out.println("el animal: "+nombre+" ha sido ha sido alimentado con "+alimento);
    }

    public void registrarComportamento(boolean comportamiento){
        System.out.println(buenComportamiento(comportamiento));
    }

    public void registrarSalud( boolean salud){
        System.out.println(buenaSalud(salud));
    }

    public void registrarEdad (int edad){
        System.out.println("la edad del animal: "+nombre+" es: "+edad);
    }

    public void registrarPeso(float peso){
        System.out.println("el peso de: "+nombre+" es de: "+peso);
    }

    public void registrarEspecie(String especie){
        System.out.println("la especie de: "+nombre+" es: "+especie);
    }

    public void registrarID(int id){
        System.out.println("el id de tu animal: "+nombre+" es: "+id);
    }

}

    
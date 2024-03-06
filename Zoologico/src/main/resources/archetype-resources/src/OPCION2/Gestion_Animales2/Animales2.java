package Gestion_Animales2;

import java.util.Random;
import java.util.Scanner;

public class Animales2 {
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

   

    public static Animal crearAnimalMinimos(Animal minimoAnimal){
            Scanner nombre=new Scanner(System.in);
            System.out.println("Introduzca el nombre del animal: ");
            String nombreA=nombre.nextLine();

            Random random = new Random();
            int ID = random.nextInt(1000);
            System.out.println("El ID de su animal es: " + ID);

            //el ID tiene que ser distinto apra cada uno como hacerlo 

            Scanner especie=new Scanner(System.in);
            System.out.println("¿A qué especie pertenece el animal?: ");
            String especieA=especie.nextLine();

            Scanner edad=new Scanner(System.in);
            System.out.println("Edad del animal: ");
            int edadA=edad.nextInt();

            Scanner peso=new Scanner(System.in);
            System.out.println("¿Cuánto pesa el animal? (en kg)");
            float pesoA=peso.nextFloat();

            Scanner alimentacion=new Scanner(System.in);
            System.out.println("Introduzca el alimento del animal: ");
            String alimentacionA=alimentacion.nextLine();

            Scanner salud=new Scanner(System.in);
            System.out.println("¿Cómo es la salud del animal?\n1 es buena salud\n0 es mala salud");
            boolean saludA=salud.hasNext();

            Scanner comportamiento=new Scanner(System.in);
            System.out.println("¿Cómo es el comportamiento del animal?\n-1 es buen comportamiento\n-0 es mal comportamiento");
            boolean comportamientoA=comportamiento.hasNext();

            minimoAnimal=new Animal(nombre, alimentacion, salud, comportamiento, edad, peso, especie, id);
            return minimoAnimal;
    }

    public static Animal[][] crearAnimal(){
        seleccionarHabitatAnimal();
        System.out.println("A continuación deberá introducir los datos requeridos: ");
        crearAnimalMinimos();
        switch (eleccion) {
            case 1:
            caracteristicasTerrestres();
        
            break;
            case 2: 
            caracteristicasAcuaticos();
            break;

            case 3: 
            caracteristicasAviarios();
            break;

            default:
                break;
        }
        
        Animal [][]nuevoAnimal = new Animal[crearAnimalMinimos(nombre, alimentacion, salud, comportamiento, edad, peso, especie, id)][];
        return nuevoAnimal;
        
    }


    public void mostarPlantillaAnimal(String nombre, int id, String especie, int edad, float peso, String alimentacion, boolean salud, boolean comportamiento){
        System.out.println("su nombre es: "+nombre);

        System.out.println("el id de tu animal: "+nombre+" es: "+id);

        System.out.println("la edad del animal: "+nombre+" es: "+edad);

        System.out.println("el peso de: "+nombre+" es de: "+peso);

        System.out.println("la especie de: "+nombre+" es: "+especie);

        if (salud==true){
            System.out.println("el animal: "+nombre+"  se encuentra en buen estado de salud");
        }else 
        System.out.println("el animal: "+nombre+"  se encuentra en mal estado de salud");

        if(comportamiento==true){
            System.out.println("el comportamiento de: "+nombre+" es bueno");
        }else 
        System.out.println("el comportamiento de: "+nombre+" no es bueno");

        System.out.println("el animal: "+nombre+" ha sido ha sido alimentado con "+alimentacion);

        
    }

}
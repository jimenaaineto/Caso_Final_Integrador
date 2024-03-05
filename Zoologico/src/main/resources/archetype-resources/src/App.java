import java.security.spec.EncodedKeySpec;
import java.util.Scanner;
import java.util.Random;

import Gestion_Animales.*;
import Gestion_habitats.*;

public class App {
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int llamarSeleccionHabitatAnimal=seleccionarHabitatAnimal();
        Animal minimos=crearAnimalMinimos();
        Animal animalFinal=crearAnimal(llamarSeleccionHabitatAnimal, minimos, animalFinal);
        

    }

    public static int seleccionarHabitatAnimal(){
        System.out.println("Elija el habitat del animal que desea crear: ");
        System.out.println("1. Terrestre \n2. Acuatico \n3.Aviario");
        Scanner habitatAnimal=new Scanner(System.in);
        int eleccion=habitatAnimal.nextInt();
        return eleccion;
    }

    public static Animal crearAnimal(int seleccionarHabitatAnimal, Animal crearAnimalMinimos, Animal nuevoAnimal){
        System.out.println("A continuación deberá introducir los datos requeridos: ");
        crearAnimalMinimos();
        switch (eleccion) {
            case 1:
            Scanner patas=new Scanner(System.in);
            System.out.println("Introduzca el numero de patas: ");
            int numeroPatas=patas.nextInt();
            
            Scanner pelaje=new Scanner(System.in);
            System.out.println("¿Tiene pelaje?\n-1. si\n-0.no");
            boolean tienePelaje=pelaje.hasNext();
        
            Scanner caminar=new Scanner(System.in);
            System.out.println("¿Camina?: \n-1. si\n-0.no");
            boolean puedeCaminar=caminar.hasNext();
        
            break;
            case 2: 
            Scanner tipoAgua=new Scanner(System.in);
            System.out.println("¿Qué tipo de agua le corresponde?: ");
            String cualTipoAgua=tipoAgua.nextLine();
            
            Scanner venenoso=new Scanner(System.in);
            System.out.println("¿Es venenoso?: \n-1. si\n-0.no");
            boolean esVenenoso=venenoso.hasNext();
        
            Scanner aletas=new Scanner(System.in);
            System.out.println("¿Tiene aletas?: \n-1. si\n-0.no");
            boolean tieneAletas=aletas.hasNext();
            break;

            case 3: 
            Scanner plumaje=new Scanner(System.in);
            System.out.println("¿Tiene plumaje?: \n-1. si\n-0.no");
            boolean tienePlumaje=plumaje.hasNext();
            
            Scanner diurno=new Scanner(System.in);
            System.out.println("¿Es diurno?: \n-1. si\n-0.no");
            boolean esDiurno=diurno.hasNext();
        
            Scanner vuela=new Scanner(System.in);
            System.out.println("Vuela?: \n-1. si\n-0.no");
            boolean puedeVolar=caminar.hasNext();
            break;

            default:
                break;
        }
        nuevoAnimal=new Animal(crearAnimalMinimos());
        return nuevoAnimal;
        
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
    
}

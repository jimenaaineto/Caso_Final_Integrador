import java.security.spec.EncodedKeySpec;
import java.util.Scanner;
import java.util.Random;

import Gestion_Animales.*;
import Gestion_habitats.*;
import Gestion_Visitantes.*;

public class App {
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int llamarSeleccionHabitatAnimal=seleccionarHabitatAnimal();
        
        

    }

    public static int seleccionarMenu(){
        System.out.println("Elija la opcion que desee realizar: ");
        Scanner opcion=new Scanner(System.in);
        System.out.println("1.Añadir animal al sistema\n2.Gestion habitats\n3.Interaccion visitantes\n5.Administracion de recursos\n6.Mantenimiento y seguridad");
        int elegirMenu=opcion.nextInt();
        return elegirMenu;
        switch (elegirMenu) {
            case 1:
                System.out.println("¿A qué habitat pertenece su animal?: ");
                crearAnimal();

            case 2:
                gestionarHabitatMinimos();
                
                break;
        
            default:
                break;
        }
        }
    

    
    public static int seleccionarHabitatAnimal(){
        Scanner habitatAnimal=new Scanner(System.in);
        System.out.println("1. Terrestre \n2. Acuatico \n3.Aviario");
        int eleccion=habitatAnimal.nextInt();
        return eleccion;
    }

    public static Habitat gestionarHabitatMinimos (){
        System.out.println("Elija el habitat desea gestionar: ");
        seleccionarHabitatAnimal();
        System.out.println("¿Como son las condiciones del habitat seleccionado?");

        Scanner gestionLimpieza=new Scanner(System.in);
        System.out.println("Limpieza: \n1.Está limpio\n2.No está limpio");
        boolean leergestionLimpieza=gestionLimpieza.hasNext();

        Scanner gestionTemp=new Scanner(System.in);
        System.out.println("Temperatura: ");
        float leergestionTemp=gestionTemp.nextFloat();

        Scanner gestionHumedad=new Scanner(System.in);
        System.out.println("Humedad: ");
        float leergestionHumedad=gestionHumedad.nextFloat();

        Habitat habitatGestionado=new Habitat(leergestionTemp, leergestionHumedad, leergestionLimpieza);
        return habitatGestionado;
    }

    public static int interaccionVisitantes(){
        System.out.println("¿Qué desea?: ");
        Scanner interaccion=new Scanner(System.in);
        System.out.println("1.Tours personalizados\n2.Quiosco virtual");
        int leerinteraccion=interaccion.nextInt();
        switch (leerinteraccion) {
            case 1:
                
                break;
        
            default:
                break;
        }
    }

    public static int administracionRecursos(){
        System.out.println("Seleccione la opcion que desea realizar: ");
        Scanner admin=new Scanner(System.in);
        System.out.println("1. Ver inventario\n2. Ver pedidos\n3. Control recursos");
        int leeradmin=admin.nextInt();
        switch (leeradmin) {
            case 1:
                //mostrar clase
                break;

            case 2: 
                //mostrar clase???
                break;

            case 3:
            //mostrar
            break;
        
            default:
                break;
        }
    }
   
    public static Animal[][] crearAnimal(){
        seleccionarHabitatAnimal();
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
        
        Animal [][]nuevoAnimal = new Animal[crearAnimalMinimos(nombre, alimentacion, salud, comportamiento, edad, peso, especie, id)][];
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

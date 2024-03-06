import java.security.spec.EncodedKeySpec;
import java.util.Scanner;
import java.util.Random;

import Gestion_Animales.*;
import Gestion_habitats.*;
import Gestion_Visitantes.*;

public class main {
    public static void main( String[] args )
    {

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

            case 3: 
                interaccionVisitantes();
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

    

    

    
    }
   

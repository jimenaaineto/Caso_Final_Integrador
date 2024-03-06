import java.util.Scanner;

public class Tours_personalizados2 extends Visitantes2{
    boolean quiereterrestres;
   boolean quiereacuaticos;
   boolean quiereaviarios;

   public Tours_personalizados(boolean adulto,boolean quiereterrestres, boolean quiereacuaticos, boolean quiereaviarios ){
    super(adulto);
    this.quiereacuaticos=quiereacuaticos;
    this.quiereaviarios=quiereaviarios;
    this.quiereterrestres=quiereterrestres;
   }

   public boolean isquiereAcuaticos() {
    return quiereacuaticos;
    }

    public void setquiereAcuaticos(boolean quiereacuaticos) {
    this.quiereacuaticos = quiereacuaticos;
    }

    public boolean isquiereTerrestres() {
    return quiereterrestres;
    }

    public void setquiereTerrestres(boolean quiereterrestres) {
    this.quiereterrestres = quiereterrestres;
    }
    public boolean isquiereAviarios() {
    return quiereaviarios;
    }

    public void setquiereAviarios(boolean quiereaviarios) {
    this.quiereaviarios = quiereaviarios;
    }




public static void toursPersonalizados(){

    Scanner tour=new Scanner(System.in);
    System.out.println("Estos son los tours que ofrece el zoologico: ");
    System.out.println("1. Para amantes de los mamiferos\n2. Para amantes de los animales acuaticos\n3. Para amantes de las aves\n4. Tour familiar completo");
    int leerTour=tour.nextInt();
    switch (leerTour) {
        case 1:
            System.out.println("Venga a disfrutar de nuestros mamiferos con el tour de MAMIFEROS." );
            
            System.out.println("En primer lugar, debera acceder por la puerta......y hacer...");
            break;

        case 2:
            System.out.println("Venga a disfrutar de nuestros animales acuaticos con el tour MARINO." );
            System.out.println("En primer lugar, debera acceder por la puerta......y hacer...");
    
        case 3: 
            System.out.println("Venga a disfrutar de nuestras aves con el tour AVIARIO." );
            System.out.println("En primer lugar, debera acceder por la puerta......y hacer...");

        case 4: 
            System.out.println("Venga a disfrutar de nuestros parque con el tour de dia completo ." );
            System.out.println("En primer lugar, debera acceder por la puerta......y hacer...");
        default:
            break;
    }
    

}
}
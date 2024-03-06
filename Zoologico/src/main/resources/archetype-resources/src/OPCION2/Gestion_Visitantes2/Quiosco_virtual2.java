import java.util.Scanner;

import Gestion_Visitantes.Visitantes;
import OPCION2.Gestion_Visitantes2.Visitantes2;

public class Quiosco_virtual2 extends Visitantes2{
    int intereses;
    String info;
    boolean gustar;

    public Quiosco_Virtual(boolean adulto, int intereses, String info, boolean gustar){
        super(adulto);//sale error pq se llamaria a la de visitantes1
        this.intereses=intereses;
        this.info=info;
        this.gustar=gustar;
    }

    public int isIntereses() {
        return intereses;
    }

    public void setIntereses(int intereses) {
        this.intereses = intereses;
    }
    public String info() {
        return info;
    }

    public void setInfo(String info ) {
        this.info = info;
    }

    public boolean isGustar() {
        return gustar;
    }

    public void setGustar(boolean gustar) {
        this.gustar = gustar;
    }

    public static void quioscoVirtual(){

    Scanner quiosco=new Scanner(System.in);
    System.out.println("¿Sobre qué desea informacion? ");
    System.out.println("1. Animales terrestres\n2. Animales acuaticos\n3. Animales aereos\n4. Curiosidades del zoo");
    int leerQuiosco=quiosco.nextInt();
    switch (leerQuiosco) {
        case 1:
            System.out.println("los animales mamiferos........." );
            
            break;

        case 2:
            System.out.println("los acuaticos....");
    
        case 3: 
            System.out.println("los aereos....");

        case 4: 
            System.out.println("el zoo fue construido...");
        default:
            break;
    }
    

}
}
    

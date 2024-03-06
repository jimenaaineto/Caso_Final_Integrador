import java.util.Scanner;

public class Visitantes2 {

        private boolean adulto;
    
        public Visitantes(boolean adulto){
            this.adulto = adulto;
        }
    
        public boolean isAdulto() {
            return adulto;
        }
    
        public void setAdulto(boolean adulto) {
            this.adulto = adulto;
        }

        public static int interaccionVisitantes(){
            System.out.println("¿Qué desea?: ");
            Scanner interaccion=new Scanner(System.in);
            System.out.println("1.Tours personalizados\n2.Quiosco virtual");
            int leerinteraccion=interaccion.nextInt();
            switch (leerinteraccion) {
                case 1:
                    toursPersonalizados();
                    break;
                case 2: 
                default:
                    break;
            }
        }
}

import java.util.Scanner;

public class Habitats2 {

    float temperatura;
    float humedad;
    boolean limpieza;

        public Habitat(int temperatura, int humedad, boolean limpieza){
            this.temperatura=temperatura;
            this.humedad=humedad;
            this.limpieza=limpieza;
        }
public int getHumedad() {
    return humedad;
}
public void setHumedad(float humedad) {
    this.humedad = humedad;
}
public boolean isLimpieza() {
    return limpieza;
}
public void setLimpieza(boolean limpieza) {
    this.limpieza = limpieza;
}
public int getTemperatura() {
    return temperatura;
}
public void setTemperatura(float temperatura) {
    this.temperatura = temperatura;
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

    
    
}

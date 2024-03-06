import java.util.Scanner;

import Gestion_Animales.Animales;

public class AnimalesAviarios2 extends Animales {
    boolean plumaje;
    boolean diurnos; //cambiar todos
    boolean vuela;//cambiar

    public AnimalesAviarios(String nombre, String alimentacion, boolean salud, boolean comportamiento, int edad, float peso, String especie, int id, boolean plumaje, boolean diurnos, boolean vuela){
        super(nombre, alimentacion, salud, comportamiento, edad, peso, especie, id);
        this.plumaje=plumaje;
        this.diurnos=diurnos;
        this.vuela=vuela;
    }

    
    public String getPlumaje() {
        return plumaje;
    }
    
    public void setPlumaje(String plumaje) {
        this.plumaje = plumaje;
    }
    
    public boolean isDiurnos() {
        return diurnos;
    }
    
    public void setDiurnos(boolean diurnos) {
        this.diurnos = diurnos;
    }
    
    public boolean doVuela() {
        return vuela;
    }
    
    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }


    public static Animales2 caracteristicasAviarios(){
        Scanner plumaje=new Scanner(System.in);
        System.out.println("¿Tiene plumaje?: \n-1. si\n-0.no");
        boolean tienePlumaje=plumaje.hasNext();
        
        Scanner diurno=new Scanner(System.in);
        System.out.println("¿Es diurno?: \n-1. si\n-0.no");
        boolean esDiurno=diurno.hasNext();
    
        Scanner vuela=new Scanner(System.in);
        System.out.println("Vuela?: \n-1. si\n-0.no");
        boolean puedeVolar=caminar.hasNext();

            Animales2 nuevoAAviario=new AnimalesAviarios2();
            return nuevoAAviario;
    
}
}
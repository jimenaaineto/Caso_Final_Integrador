import java.util.Scanner;

import Gestion_Animales2.Animales2;

public class AnimalesAcuaticos2 extends Animales2{
    String tipoAgua;//cambiar en el archivo entero lo que era alimentacion
    boolean venenoso;//cambiar
    boolean aletas;

    public AnimalesAcuaticos(String nombre, String alimentacion, boolean salud, boolean comportamiento, int edad, float peso, String especie, int id, String tipoAgua, boolean venenoso, boolean aletas){
        super(nombre, alimentacion, salud, comportamiento, edad, peso, especie, id);  
        this.tipoAgua=tipoAgua;
        this.venenoso=venenoso;
        this.aletas=aletas;
    }


    public String getTipoAgua() {
        return tipoAgua;
        
    }
    
    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }
    
    public boolean isVenenoso() {
        return venenoso;
    }
    
    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }
    
    public boolean hasAletas() {
        return aletas;
    }
    
    public void setAletas(boolean aletas) {
        this.aletas = aletas;
    }


    public static Animales2 caracteristicasAcuaticos(){
        Scanner tipoAgua=new Scanner(System.in);
        System.out.println("¿Qué tipo de agua le corresponde?: ");
        String cualTipoAgua=tipoAgua.nextLine();
        
        Scanner venenoso=new Scanner(System.in);
        System.out.println("¿Es venenoso?: \n-1. si\n-0.no");
        boolean esVenenoso=venenoso.hasNext();
    
        Scanner aletas=new Scanner(System.in);
        System.out.println("¿Tiene aletas?: \n-1. si\n-0.no");
        boolean tieneAletas=aletas.hasNext();

            Animales2 nuevoAAcuatico=new AnimalesAcuaticos2();
            return nuevoAAcuatico;
}
}

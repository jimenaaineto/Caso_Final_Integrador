import java.util.Scanner;

import Gestion_Animales2.Animales2;

public class AnimalesTerrestres2 extends Animales2 {

        int numeroPatas;
        boolean pelaje;
        boolean caminar;

        public AnimalesTerrestres(String nombre, String alimentacion, boolean salud, boolean comportamiento, int edad, float peso, String especie, int id,boolean pelaje, boolean caminar, boolean diurnos, int numeroPatas){
            super(nombre, alimentacion, salud, comportamiento, edad, peso, especie, id);
            this.numeroPatas=numeroPatas;
            this.pelaje=pelaje;
            this.caminar=caminar;
        }

        public int getNumeroPatas(){
            return numeroPatas;
        }

        public void setNumeroPatas(int numeroPatas){
            this.numeroPatas=numeroPatas;
        }

        public boolean howPelaje(){
            return pelaje;
        }

        public void setPelaje(boolean pelaje){
            this.pelaje=pelaje;
        }

        public boolean iscaminar(){
            return caminar;
        }

        public void setNadarT(boolean caminar){
            this.caminar=caminar;
        }

    
    public static Animales2 caracteristicasTerrestres(){
            Scanner patas=new Scanner(System.in);
            System.out.println("Introduzca el numero de patas: ");
            int numeroPatas=patas.nextInt();
            
            Scanner pelaje=new Scanner(System.in);
            System.out.println("¿Tiene pelaje?\n-1. si\n-0.no");
            boolean tienePelaje=pelaje.hasNext();
        
            Scanner caminar=new Scanner(System.in);
            System.out.println("¿Camina?: \n-1. si\n-0.no");
            boolean puedeCaminar=caminar.hasNext();

            Animales2 nuevoATerrestre=new AnimalesTerrestres2();
            return nuevoATerrestre;
    }
}

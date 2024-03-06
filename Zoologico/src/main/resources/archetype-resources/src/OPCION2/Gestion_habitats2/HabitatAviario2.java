public class HabitatAviario2 extends Habitats2 {
    boolean puedeVolar;

     public HabitatAviario(boolean puedeVolar, float temperatura, float humedad, boolean limpieza){
        super(temperatura, humedad, limpieza);
        this.puedeVolar=puedeVolar;
    }
    
    public boolean howPuedeVolar(){
        return puedeVolar;
    }
    public void setPuedeVolar(int puedeVolar){
        this.puedeVolar=puedeVolar;
    }

    public void comprobarPuedeVolar (boolean puedeVolar){
        if (puedeVolar==true){
            system.out.println("el animal: " +nombre+ " pertenece al habitat aviario ");
        }else 
            system.out.println("el animal: "+nombre+ " no pertenece al habitat aviario ");
    }
    
}

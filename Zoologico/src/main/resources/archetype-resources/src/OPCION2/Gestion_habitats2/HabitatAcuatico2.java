import OPCION2.Gestion_habitats2.Habitats2;

public class HabitatAcuatico2 extends Habitats2{
    boolean puedeNadar;

    public HabitatAcuatico(boolean puedeNadar, float temperatura, float humedad, boolean limpieza){
        super(temperatura,humedad,limpieza);
        this.puedeNadar=puedeNadar;
    }
    
    public boolean howPuedeNadar(){
        return puedeNadar;
    }
    public void setPuedeNadar(boolean puedeNadar){
        this.puedeNadar=puedeNadar;
    }
    

    public void comprobarPuedeNadar (boolean puedeNadar){
        if (puedeNadar==true){
            system.out.println("el animal: " +nombre+ " pertenece al habitat acuatico");
        }else 
            system.out.println("el animal: "+nombre+ " no pertenece al habitat acuatico");
    }
    
}

public class HabitatTerrestre2 extends Habitats2 {
    boolean puedeCaminar;

    public HabitatTerrestre(boolean puedeCaminar,float temperatura, float humedad, boolean limpieza){
        super(temperatura, humedad, limpieza);
        this.puedeCaminar=puedeCaminar;

    }

    public boolean howPuedeCaminar(){
        return puedeCaminar;
    }
    public void setPuedeCaminar(boolean puedeCaminar){
        this.puedeCaminar=puedeCaminar;
    }
    
    
    public void comprobarPuedeCaminar (boolean puedeCaminar){
        if (puedeCaminar==true){
            system.out.println("el animal: " +nombre+ " pertenece al habitat terrestte");
        }else 
            system.out.println("el animal: "+nombre+ " no pertenece al habitat terrestre");
    }
    
}

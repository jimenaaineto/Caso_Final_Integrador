package Gestion_habitats;
private class HabitatTerrestre extends Habitat{

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
    
    @Override
    public String toString() {
        return "HabitatTerrestre []";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }
    
    public void comprobarPuedeCaminar (boolean puedeCaminar){
        if (puedeCaminar==true){
            system.out.println("el animal: " +nombre+ " pertenece al habitat terrestte");
        }else 
            system.out.println("el animal: "+nombre+ " no pertenece al habitat terrestre");
    }
       
        }



    
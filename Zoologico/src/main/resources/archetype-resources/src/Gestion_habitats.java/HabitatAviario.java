package Gestion_habitats;
private class HabitatAviario extends Habitat{

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
    @Override
    public String toString() {
        return "HabitatAviario []";
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
}

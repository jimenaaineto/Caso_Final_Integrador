package Gestion_habitats;
private class HabitatAcuatico extends Habitat {
    
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
    @Override
    public String toString() {
        return "HabitatAcuatico []";
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

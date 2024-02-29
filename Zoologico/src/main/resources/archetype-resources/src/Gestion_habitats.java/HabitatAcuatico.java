package Gestion_habitats;
private class HabitatAcuatico extends Habitat {
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

    private int cantidadEspeciesA;
    private int cantidadAcuarios;
    private String naturalezaMarina;
    private int aforoA;
    boolean puedeNadar;

    public HabitatAcuatico(boolean puedeNadar/*faltan getter setter*/ */, float temperatura, float humedad, boolean limpieza, int aforoA, int cantidadAcuarios, int cantidadEspeciesA, String naturalezaMarina){
        super(temperatura, humedad, limpieza);
        this.cantidadAcuarios=cantidadAcuarios;
        this.cantidadEspeciesA=cantidadEspeciesA;
        this.naturalezaMarina=naturalezaMarina;
        this.aforoA=aforoA;
        this.puedeNadar=puedeNadar;
    }
    public int getCantidadEspeciesA() {
        return cantidadEspeciesA;
    }

    public void setCantidadEspeciesA(int cantidadEspeciesA) {
        this.cantidadEspeciesA = cantidadEspeciesA;
    }

    public int getCantidadAcuarios() {
        return cantidadAcuarios;
    }

    public void setCantidadAcuarios(int cantidadAcuarios) {
        this.cantidadAcuarios = cantidadAcuarios;
    }

    public String getNaturalezaMarina() {
        return naturalezaMarina;
    }

    public void setNaturalezaMarina(String naturalezaMarina) {
        this.naturalezaMarina = naturalezaMarina;
    }
    public int getaforoA(){
        return aforoA;
    }
    public void setaforoA(int aforoA){
        this.aforoA=aforoA;
    }
 
}

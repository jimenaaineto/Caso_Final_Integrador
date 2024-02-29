package Caso_Final;
private class HabitatAcuatico extends Habitat{

    private int cantidadEspeciesA;
    private int cantidadAcuarios;
    private String naturalezaMarina;
    private int aforoA;

    public HabitatAcuatico(int temperatura, int humedad, String limpieza, int aforoA, int cantidadAcuarios, int cantidadEspeciesA, String naturalezaMarina){
        super(temperatura, humedad, limpieza);
        this.cantidadAcuarios=cantidadAcuarios;
        this.cantidadEspeciesA=cantidadEspeciesA;
        this.naturalezaMarina=naturalezaMarina;
        this.aforoA=aforoA;
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
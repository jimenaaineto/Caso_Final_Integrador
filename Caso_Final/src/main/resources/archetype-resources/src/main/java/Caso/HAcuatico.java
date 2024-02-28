private class HAcuatico extends Habitat{

    private int cantidadEspeciesA;
    private int cantidadAcuarios;
    private String naturalezaMarina;

    public HAcuatico(int temperatura, int humedad, String limpieza, int cantidadAcuarios, int cantidadEspeciesA, String naturalezaMarina){
        super(temperatura, humedad, limpieza);
        this.cantidadAcuarios=cantidadAcuarios;
        this.cantidadEspeciesA=cantidadEspeciesA;
        this.naturalezaMarina=naturalezaMarina;
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
       
        }
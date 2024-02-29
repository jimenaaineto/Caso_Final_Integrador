package Gestion_habitats;
private class HabitatTerrestre extends Habitat{
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

    private int cantidadEspeciesT;
    int aforoT;
    private int cantidadCharcas;
    private String naturalezaTerrestre;

    public HabitatTerrestre(float temperatura, float humedad, boolean limpieza,int aforoT, int cantidadCharcas, int cantidadEspeciesT, String naturalezaTerrestre){
        super(temperatura, humedad, limpieza);
        this.cantidadCharcas=cantidadCharcas;
        this.cantidadEspeciesT=cantidadEspeciesT;
        this.naturalezaTerrestre=naturalezaTerrestre;
        this.aforo=aforoT;
    }

    public int getCantidadEspeciesT() {
        return cantidadEspeciesT;
    }

    public void setCantidadEspeciesT(int cantidadEspeciesT) {
        this.cantidadEspeciesT = cantidadEspeciesT;
    }

    public int getCantidadCharcas() {
        return cantidadCharcas;
    }

    public void setCantidadCharcas(int cantidadCharcas) {
        this.cantidadCharcas = cantidadCharcas;
    }

    public String getNaturalezaTerrestre() {
        return naturalezaTerrestre;
    }

    public void setNaturalezaTerrestre(String naturalezaTerrestre) {
        this.naturalezaTerrestre = naturalezaTerrestre;
    }

    public int getaforoT(){
        return aforoT;
    }
    public void setaforoT(int aforoT){
        this.aforoT=aforoT;
    }

    
       
        }



    
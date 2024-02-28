
private class HabitatTerrestre extends Habitat{

    private int cantidadEspeciesT;
    int aforoT;
    private int cantidadCharcas;
    private String naturalezaTerrestre;

    public HabitatTerrestre(int temperatura, int humedad, String limpieza,int aforoT, int cantidadCharcas, int cantidadEspeciesT, String naturalezaTerrestre){
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



    

private class HTerrestre extends Habitat{

    private int cantidadEspeciesT;
    private int cantidadCharcas;
    private String naturalezaTerrestre;

    public HTerrestre(int cantidadCharcas, int cantidadEspeciesT, String naturalezaTerrestre){
        super(int temperatura, int humedad, String limpieza);
        this.cantidadCharcas=cantidadCharcas;
        this.cantidadEspeciesT=cantidadEspeciesT;
        this.naturalezaTerrestre=naturalezaTerrestre;
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

    
       
        }



    
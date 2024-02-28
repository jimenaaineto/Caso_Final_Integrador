private class HAviario extends Habitat{

    private int cantidadEspeciesAves;
    private int cantidadNidos;
    private String naturalezaAviaria;

    public int getCantidadEspeciesAves() {
        return cantidadEspeciesAves;
    }

    public void setCantidadEspeciesAves(int cantidadEspeciesAves) {
        this.cantidadEspeciesAves = cantidadEspeciesAves;
    }

    public int getCantidadNidos() {
        return cantidadNidos;
    }

    public void setCantidadNidos(int cantidadNidos) {
        this.cantidadNidos = cantidadNidos;
    }

    public String getNaturalezaAviaria() {
        return naturalezaAviaria;
    }

    public void setNaturalezaAviaria(String naturalezaAviaria) {
        this.naturalezaAviaria = naturalezaAviaria;
    }
}

    public HAcuatico(int cantidadNidos, int cantidadEspeciesAves, String naturalezaAviaria){
        super(int temperatura, int humedad, String limpieza);
        this.cantidadNidos=cantidadNidos;
        this.cantidadEspeciesAves=cantidadEspeciesAves;
        this.naturalezaAviaria=naturalezaAviaria;
    }

    
       
        }
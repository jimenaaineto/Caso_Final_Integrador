private class HabitatAviario extends Habitat{

    private int cantidadEspeciesAves;
    private int cantidadNidos;
    int aforoAves;
    private String naturalezaAviaria;

     public HabitatAviario(int temperatura, int humedad, String limpieza, int aforoAves, int cantidadNidos, int cantidadEspeciesAves, String naturalezaAviaria){
        super(temperatura, humedad, limpieza);
        this.cantidadNidos=cantidadNidos;
        this.cantidadEspeciesAves=cantidadEspeciesAves;
        this.naturalezaAviaria=naturalezaAviaria;
        this.aforoAves=aforoAves;
    }
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
    public int getaforoAves(){
        return aforoAves;
    }
    public void setaforoAves(int aforoAves){
        this.aforoAves=aforoAves;
    }
}

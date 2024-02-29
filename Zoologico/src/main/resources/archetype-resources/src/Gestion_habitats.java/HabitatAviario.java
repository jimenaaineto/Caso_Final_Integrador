package Gestion_habitats;
private class HabitatAviario extends Habitat{
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

    private int cantidadEspeciesAves;
    private int cantidadNidos;
    int aforoAves;
    private String naturalezaAviaria;

     public HabitatAviario(float temperatura, float humedad, boolean limpieza, int aforoAves, int cantidadNidos, int cantidadEspeciesAves, String naturalezaAviaria){
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

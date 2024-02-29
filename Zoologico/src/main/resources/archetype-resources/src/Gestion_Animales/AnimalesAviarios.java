package Gestion_Animales;
private class AnimalesAviarios extends Animales{
    boolean pico;
    boolean plumaje;
    boolean nocturnos //cambiar todos
    private boolean vuela;//cambiar

    public AnimalesAviarios(boolean alimentacion, boolean salud, boolean comportamiento, /*faltan getters y setters*/int edad, String tamaño, String origen, String nombre, boolean reproduccion, int edad, String tamaño, String origen, String nombre, boolean reproduccion, String alimentacionAves, String ecosistemaAves, boolean nadarAves){
        super(alimentacion, salud, comportamiento, edad, tamaño, origen, nombre, reproduccion);
        this.alimentacionAves=alimentacionAves;
        this.ecosistemaAves=ecosistemaAves;
        this.nadarAves=nadarAves;
    }

    public String getAlimentacionAves() {
        return alimentacionAves;
    }

    public void setAlimentacionAves(String alimentacionAves) {
        this.alimentacionAves = alimentacionAves;
    }

    public String getEcosistemaAves() {
        return ecosistemaAves;
    }

    public void setEcosistemaAves(String ecosistemaAves) {
        this.ecosistemaAves = ecosistemaAves;
    }

    public boolean isNadarAves() {
        return nadarAves;
    }

    public void setNadarAves(boolean nadarAves) {
        this.nadarAves = nadarAves;
    }
    @Override
    public String toString() {
        return "AnimalesAviarios []";
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
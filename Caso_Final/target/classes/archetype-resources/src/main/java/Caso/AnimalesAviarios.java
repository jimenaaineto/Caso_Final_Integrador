private class AnimalesAviarios extends Animales{
    private String alimentacionAves;
    private String ecosistemaAves;
    private boolean nadarAves;

    public AnimalesAviaris(int edad, String tamaño, String origen, String nombre, boolean reproduccion, String alimentacionAves, String ecosistemaAves, boolean nadarAves){
        super(edad, tamaño, origen, nombre, reproduccion);
        this.alimentacionAves=alimentacionAves;
        this.ecosistemaAves=ecosistemaAves;
        this.nadarAves=nadarAves;
    }

    public String getAlimentacionAves() {
        return alimentacionAves;
    }

    public void setAlimentacionAves(String alimentacionA) {
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

}
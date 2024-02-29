package Gestion_Animales;
private class AnimalesAcuaticos extends Animales{
    private String alimentacionA;
    private String ecosistemaA;
    private boolean muchosColores;

    public AnimalesAcuaticos(int alimentacionA, String ecosistemaA, boolean muchosColores, int edad, String tamaño, String origen, String nombre, boolean reproduccion){
        super(edad, tamaño, origen, nombre, reproduccion);
        this.alimentacionA=alimentacionA;
        this.ecosistemA=ecosistemaA;
        this.muchosColores=muchosColores;
    }

    public String getAlimentacionA() {
        return alimentacionA;
    }

    public void setAlimentacionA(String alimentacionA) {
        this.alimentacionA = alimentacionA;
    }

    public String getEcosistemaA() {
        return ecosistemaA;
    }

    public void setEcosistemaA(String ecosistemaA) {
        this.ecosistemaA = ecosistemaA;
    }

    public boolean isMuchosColores() {
        return muchosColores;
    }

    public void setMuchosColores(boolean muchosColores) {
        this.muchosColores = muchosColores;
    }

}
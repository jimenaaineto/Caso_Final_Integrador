package Gestion_Animales;
private class AnimalesAcuaticos extends Animales{
    private String tipoAgua;//cambiar en el archivo entero lo que era alimentacion
    private boolean venenoso;//cambiar
    private boolean muchosColores;

    public AnimalesAcuaticos(boolean alimentacion, boolean salud, boolean comportamiento, /*faltan getters y setters*/int edad, String tamaño, String origen, String nombre, boolean reproduccion, String tipoAgua, String ecosistemaA, boolean muchosColores, int edad, String tamaño, String origen, String nombre, boolean reproduccion){
        super(alimentacion, salud, comportamiento, edad, tamaño, origen, nombre, reproduccion);
        this.tipoAgua=tipoAgua;
        this.ecosistemA=ecosistemaA;
        this.muchosColores=muchosColores;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
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

    @Override
    public String toString() {
        return "AnimalesAcuaticos []";
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
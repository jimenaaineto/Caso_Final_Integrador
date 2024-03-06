package Gestion_Animales;
private class AnimalesAcuaticos extends Animales{
    String tipoAgua;//cambiar en el archivo entero lo que era alimentacion
    boolean venenoso;//cambiar
    boolean aletas;

    public AnimalesAcuaticos(String nombre, String alimentacion, boolean salud, boolean comportamiento, int edad, float peso, String especie, int id, String tipoAgua, boolean venenoso, boolean aletas){
        super(nombre, alimentacion, salud, comportamiento, edad, peso, especie, id);  
        this.tipoAgua=tipoAgua;
        this.venenoso=venenoso;
        this.aletas=aletas;
    }


    public String getTipoAgua() {
        return tipoAgua;
        
    }
    
    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }
    
    public boolean isVenenoso() {
        return venenoso;
    }
    
    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }
    
    public boolean hasAletas() {
        return aletas;
    }
    
    public void setAletas(boolean aletas) {
        this.aletas = aletas;
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
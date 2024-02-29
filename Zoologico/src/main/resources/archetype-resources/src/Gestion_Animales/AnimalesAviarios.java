package Gestion_Animales;
private class AnimalesAviarios extends Animales{
    boolean pico;
    boolean plumaje;
    boolean diurnos; //cambiar todos
    boolean vuela;//cambiar

    public AnimalesAviarios(String nombre, String alimentacion, boolean salud, boolean comportamiento, int edad, float peso, String especie, int id,boolean pico, boolean plumaje, boolean diurnos, boolean vuela){
        super(nombre, alimentacion, salud, comportamiento, edad, peso, especie, id);
        this.pico=pico;
        this.plumaje=plumaje;
        this.diurnos=diurnos;
        this.vuela=vuela;
    }

    public String getPico() {
        return pico;
    }
    
    public void setPico(String pico) {
        this.pico = pico;
    }
    
    public String getPlumaje() {
        return plumaje;
    }
    
    public void setPlumaje(String plumaje) {
        this.plumaje = plumaje;
    }
    
    public boolean isDiurnos() {
        return diurnos;
    }
    
    public void setDiurnos(boolean diurnos) {
        this.diurnos = diurnos;
    }
    
    public boolean doVuela() {
        return vuela;
    }
    
    public void setVuela(boolean vuela) {
        this.vuela = vuela;
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
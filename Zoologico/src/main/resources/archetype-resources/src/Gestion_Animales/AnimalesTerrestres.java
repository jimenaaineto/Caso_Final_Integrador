package Gestion_Animales;
private class AnimalesTerrestres extends Animales{
    private int numeroPatas;
    private String alimentacionT;
    private boolean nadarT;

    public AnimalesTerrestres(int edad, String tamaño, String origen, String nombre, boolean reproduccion, int numeroPatas, String alimentacionT, boolean nadarT){
        super(edad, tamaño, origen, nombre, reproduccion);
        this.numeroPatas=numeroPatas;
        this.alimentacionT=alimentacionT;
        this.nadarT=nadarT;
    }

    public int getNumeroPatas(){
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas){
        this.numeroPatas=numeroPatas;
    }

    public String getAlimentacionT(){
        return alimentacionT;
    }

    public void setAlimentacionT(String alimentacionT){
        this.alimentacionT=alimentacionT;
    }

    public boolean isNadarT(){
        return nadarT;
    }

    public void setNadarT(boolean nadarT){
        this.nadarT=nadarT;
    }

}
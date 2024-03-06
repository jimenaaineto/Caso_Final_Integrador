package Gestion_Visitantes;

public class Visitantes {
    private boolean adulto;

    public Visitantes(boolean adulto){
        this.adulto = adulto;
    }

    public boolean isAdulto() {
        return adulto;
    }

    public void setAdulto(boolean adulto) {
        this.adulto = adulto;
    }
}

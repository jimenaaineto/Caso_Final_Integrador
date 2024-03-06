
import Gestion_Visitantes.Visitantes;

public class Quiosco_Virtual extends Visitantes{
    int intereses;
    String info;
    boolean gustar;

    public Quiosco_Virtual(boolean adulto, int intereses, String info, boolean gustar){
        super(adulto);
        this.intereses=intereses;
        this.info=info;
        this.gustar=gustar;
    }

    public int isIntereses() {
        return intereses;
    }

    public void setIntereses(int intereses) {
        this.intereses = intereses;
    }
    public String info() {
        return info;
    }

    public void setInfo(String info ) {
        this.info = info;
    }

    public boolean isGustar() {
        return gustar;
    }

    public void setGustar(boolean gustar) {
        this.gustar = gustar;
    }
}
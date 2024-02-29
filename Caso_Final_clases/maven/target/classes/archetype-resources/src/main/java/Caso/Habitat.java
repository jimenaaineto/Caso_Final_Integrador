package Caso_Final;

public class Habitat {
        private int temperatura;
        private int humedad;
        private String limpieza;

        public Habitat(int temperatura, int humedad, String limpieza){
            this.temperatura=temperatura;
            this.humedad=humedad;
            this.limpieza=limpieza;
        }
public int getHumedad() {
    return humedad;
}
public void setHumedad(int humedad) {
    this.humedad = humedad;
}
public String getLimpieza() {
    return limpieza;
}
public void setLimpieza(String limpieza) {
    this.limpieza = limpieza;
}
public int getTemperatura() {
    return temperatura;
}
public void setTemperatura(int temperatura) {
    this.temperatura = temperatura;
}
    }



    
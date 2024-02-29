package Gestion_Animales;
private class AnimalesTerrestres extends Animales{
    
    private class AnimalesTerrestres extends Animales{
        private int numeroPatas;
        private String alimentacionT;
        private boolean nadarT;

        public AnimalesTerrestres(boolean alimentacion, boolean salud, boolean comportamiento, /*faltan getters y setters*/int edad, String tamaño, String origen, String nombre, boolean reproduccion, int edad, String tamaño, String origen, String nombre, boolean reproduccion, int numeroPatas, String alimentacionT, boolean nadarT){
            super(alimentacion, salud, comportamiento, edad, tamaño, origen, nombre, reproduccion);
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

        @Override
    public String toString() {
        return "AnimalesTerrestres []";
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

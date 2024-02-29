package Gestion_Animales;
private class AnimalesTerrestres extends Animales{
    
    private class AnimalesTerrestres extends Animales{
        int numeroPatas;
        boolean pelaje;
        boolean caminar;

        public AnimalesTerrestres(String nombre, String alimentacion, boolean salud, boolean comportamiento, int edad, float peso, String especie, int id,boolean pico, boolean plumaje, boolean diurnos, boolean vuela){
            super(nombre, alimentacion, salud, comportamiento, edad, peso, especie, id);
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

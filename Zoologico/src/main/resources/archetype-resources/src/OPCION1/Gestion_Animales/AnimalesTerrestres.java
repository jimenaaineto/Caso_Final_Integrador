package Gestion_Animales;
    
    private class AnimalesTerrestres extends Animales{
        int numeroPatas;
        boolean pelaje;
        boolean caminar;

        public AnimalesTerrestres(String nombre, String alimentacion, boolean salud, boolean comportamiento, int edad, float peso, String especie, int id,boolean pelaje, boolean caminar, boolean diurnos, int numeroPatas){
            super(nombre, alimentacion, salud, comportamiento, edad, peso, especie, id);
            this.numeroPatas=numeroPatas;
            this.pelaje=pelaje;
            this.caminar=caminar;
        }

        public int getNumeroPatas(){
            return numeroPatas;
        }

        public void setNumeroPatas(int numeroPatas){
            this.numeroPatas=numeroPatas;
        }

        public boolean howPelaje(){
            return pelaje;
        }

        public void setPelaje(boolean pelaje){
            this.pelaje=pelaje;
        }

        public boolean iscaminar(){
            return caminar;
        }

        public void setNadarT(boolean caminar){
            this.caminar=caminar;
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


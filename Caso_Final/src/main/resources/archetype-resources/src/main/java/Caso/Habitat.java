package Caso;

public class Habitat{

        private int temperatura;
        private int humedad;
        private String limpieza;

    
    } 

    public class HTerrestre extends Habitat{
        public HTerrestre(int Ttemperatura, int Thumedad, String Tlimpieza){
            this.temperatura=Ttemperatura;
            this.humedad=Thumedad;
            this.limpieza=Tlimpieza;
        }

    }

    public class HAcuatico extends Habitat{
        public HAcuatico(int Atemperatura, int Ahumedad, String Alimpieza){
            this.temperatura=Atemperatura;
            this.humedad=Ahumedad;
            this.limpieza=Alimpieza;

    }
}

    public class Haviario extends Habitat{
        public HAviario(int Atemperatura, int Ahumedad, String Alimpieza){
            this.temperatura=Atemperatura;
            this.humedad=Ahumedad;
            this.limpieza=Alimpieza;

    }
}
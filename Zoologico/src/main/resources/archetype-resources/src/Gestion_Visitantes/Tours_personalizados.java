package Gestion_Visitantes;
import Gestion_Visitantes.Visitantes;

public class Tours_personalizados extends Visitantes {
   boolean quiereterrestres;
   boolean quiereacuaticos;
   boolean quiereaviarios;

   public Tours_personalizados(boolean adulto,boolean quiereterrestres, boolean quiereacuaticos, boolean quiereaviarios ){
    super(adulto);
    this.quiereacuaticos=quiereacuaticos;
    this.quiereaviarios=quiereaviarios;
    this.quiereterrestres=quiereterrestres;
   }

   public boolean isquiereAcuaticos() {
    return quiereacuaticos;
    }

    public void setquiereAcuaticos(boolean quiereacuaticos) {
    this.quiereacuaticos = quiereacuaticos;
    }

    public boolean isquiereTerrestres() {
    return quiereterrestres;
    }

    public void setquiereTerrestres(boolean quiereterrestres) {
    this.quiereterrestres = quiereterrestres;
    }
    public boolean isquiereAviarios() {
    return quiereaviarios;
    }

    public void setquiereAviarios(boolean quiereaviarios) {
    this.quiereaviarios = quiereaviarios;
    }
}

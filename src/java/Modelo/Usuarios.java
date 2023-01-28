/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Usuarios {
    int id_usuario;
   
    String usuario;
    String clave;
    
    public Usuarios(){
        
    }
    public Usuarios(int id_usuario, String usuario, String clave){
        this.id_usuario=id_usuario;
        this.usuario=usuario;
        this.clave=clave;
        
    }

    public int getId_usuario() {
        return id_usuario;
    }

  

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

  

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
}

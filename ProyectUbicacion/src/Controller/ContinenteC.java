/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Entity.Continente;

/**
 *
 * @author juan
 */
public class ContinenteC {
     public void GuardarRegistro(String codigo_postal, String descripcion){
        Continente continente = new Continente();
        continente.setCodigo_postal(codigo_postal);
        continente.setDescripcion(descripcion);
        continente.Agregar();
     }
     public void EliminarRegistro(int id){
        Continente continente = new Continente(); 
        continente.setId(id);
        continente.EliminarFisico();
     }
     public void ModificarRegistro(int id, String codigo_postal, String descripcion){
        Continente continente = new Continente();
        continente.setId(id);
        continente.setCodigo_postal(codigo_postal);
        continente.setDescripcion(descripcion);
        continente.Modificar();
     }
     public void ConsultarRegistro(){

     }
     
}
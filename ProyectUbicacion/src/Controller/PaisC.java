/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Entity.Pais;

/**
 *
 * @author juan
 */
public class PaisC {
         public void GuardarRegistro(String codigo_postal, String descripcion, int continente_id){
        Pais pais = new Pais();
        pais.setCodigo_postal(codigo_postal);
        pais.setDescripcion(descripcion);
        pais.setId_continente(continente_id);
        pais.Agregar();
     }
     public void EliminarRegistro(int id){
        Pais pais = new Pais();
        pais.setId(id);
        pais.EliminarFisico();
     }
     public void ModificarRegistro(int id, String codigo_postal, String descripcion, int continente_id){
        Pais pais = new Pais();
        pais.setId(id);
        pais.setCodigo_postal(codigo_postal);
        pais.setDescripcion(descripcion);
        pais.setId_continente(continente_id);
        pais.Modificar();
     }
     public void ConsultarRegistro(){

     }
}

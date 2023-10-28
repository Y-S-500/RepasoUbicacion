/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import  Model.Entity.Ciudad;
/**
 *
 * @author bonil
 */
public class Ubicacion {
    
    public void agreagar(String codigo_postal , String descripcion ){
    Ciudad agCiudad=new  Ciudad();
    agCiudad.setCodigo_postal(codigo_postal);
    agCiudad.setDescripcion(descripcion);
    
    
    }
    
}

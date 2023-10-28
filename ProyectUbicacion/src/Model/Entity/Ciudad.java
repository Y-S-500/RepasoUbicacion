/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Entity;

import Conexion.Conexion;
import Model.Interface.Accion;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author srhad
 */
public class Ciudad implements Accion{
    
    private int id;
    private String codigo_postal;
    private String descripcion;
    private int id_estado;
    public Conexion conn = new Conexion();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId_estado() {
        return id_estado;
    }

    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }


    @Override
    public void Agregar() {
        String sql;

        sql = "INSERT INTO ciudad ("
                + "codigo_postal, "
                + "descripcion, "
                + "estado_id, "
                + ") VALUES ("
                + "' " + this.getCodigo_postal() + "', "
                + "' " + this.getDescripcion() + "', "
                + "' " + this.getId_estado() + "', "
                + ");";
        conn.ejecutarSQL(sql);
        conn.cerrarConexion();
    }

    @Override
    public void Modificar() {
        String sql;

        sql = "UPDATE ciudad SET "
                + "codigo_postal = '" + this.getCodigo_postal() + "', "
                + "descripcion = '" + this.getDescripcion() + "', "
                + "estado_id = '" + this.getId_estado() + "', "
                + "WHERE id = " + this.getId() + ";";
        conn.ejecutarSQL(sql);
        conn.cerrarConexion();
    }

    @Override
    public void EliminarFisico() {
        String sql;
        sql = "DELETE FROM ciudad\n"
                + "WHERE \n"
                + "	id= " + this.getId() + ";";

        conn.ejecutarSQL(sql);
        conn.cerrarConexion();
    }

    @Override
    public Object Consultar() {
        ArrayList<Ciudad> listaDeObjetos = new ArrayList<>();
        String sql = "SELECT * FROM ciudad";
        ResultSet resultSet = conn.consultarSQL(sql);

        try {
            while (resultSet.next()) {
                Ciudad ciudad = new Ciudad();
                ciudad.setId(resultSet.getInt("id"));
                ciudad.setCodigo_postal(resultSet.getString("codigo_postal"));
                ciudad.setDescripcion(resultSet.getString("descripcion"));
                ciudad.setId_estado(resultSet.getInt("estado_id"));
                
                listaDeObjetos.add(ciudad);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaDeObjetos;

    }

    @Override
    public String ConsultarWhereAnd() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

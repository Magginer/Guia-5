/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.univers.accesoADatos;

import gestion.univers.entidades.Alumno;
import gestion.univers.entidades.Materia;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class MateriaData {
    
    //coneccion a la base de datos 
    
    private Connection con = null;
    
    public MateriaData(){
    
            con = Conexion.getConexion();
    }
    
    public void guardarMateria(Materia materia) {

        String sql = "INSERT INTO materia(nombre, año, estado)"
                + "VALUES (?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia guardada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
        }
    }
    
     public void modificarMateria(Materia materia) {

        String sql = "UPDATE materia SET nombre =? , año=?, estado=? WHERE idmateria=?";

            //// UPDATE `materia` SET `idmateria`='[value-1]',`nombre`='[value-2]',`año`='[value-3]',`estado`='[value-4]' WHERE 1
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            ps.setInt(4, materia.getIdMateria());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia Modificado");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
        }
    }
    
    
    
    
    
}

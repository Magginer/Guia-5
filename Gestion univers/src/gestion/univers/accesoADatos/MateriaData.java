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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class MateriaData {
    
    //coneccion a la base de datos 
    
    private Connection con = null;
    
    public MateriaData(){
    
            con = Conexion.getConexion();
    }
    
    public void guardarMateria(Materia materia) {

        String sql = "INSERT INTO materia(idmateria, nombre, año, estado)"
                + "VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, materia.getIdMateria());
            ps.setString(2, materia.getNombre());
            ps.setInt(3, materia.getAnio());
            ps.setBoolean(4, materia.isEstado());
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
    
     public void eliminarMateria(int id) {
        String sql = "UPDATE materia SET estado = 0 WHERE idmateria=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia Inactiva");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");

        }
    }
    
      public void reactivarMateria(int id) {
        String sql = "UPDATE materia SET estado = 1 WHERE idmateria=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia reactivada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");

        }
    }
    
      public void botonestado(int id) {
        String sql = "UPDATE alumno SET estado = 1 WHERE idmateria=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
            
         }   
    } 
    
    public void botonestadoinactivo(int id) {
     String sql = "UPDATE alumno SET estado = 0 WHERE idmateria=?";   
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
            
         }   
        //lala
        
    }
      
      
     public Materia buscarMateria(int id) {

        String sql = "SELECT  nombre,año,estado FROM materia WHERE idmateria=?";
        Materia materia = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                materia = new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("año"));
                materia.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "No existe una Materia con ese ID");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia"+ex);
        }
        return materia;
    }
     
     public List<Materia> ListarMateria() {

        String sql = "SELECT  idmateria, nombre, año FROM materia WHERE estado=1 "; //SELECT `idmateria`, `nombre`, `año`, `estado` FROM `materia` WHERE 1
        ArrayList<Materia> materias = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while(rs.next()){

                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idmateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("año"));
                materia.setEstado(true);
                
                materias.add(materia);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        return materias;
    }
     
     
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.univers.accesoADatos;

import gestion.univers.entidades.Alumno;
import gestion.univers.entidades.Inscripcion;
import gestion.univers.entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

/**
 *
 * @author javie
 */
public class InscripcionData {
    
    private Connection con=null;

    private final MateriaData md=new MateriaData();
    private final AlumnoData ad=new AlumnoData();
    
    public InscripcionData (){
        
        this.con=Conexion.getConexion();
    }
    
    public void guardarInscripcion(Inscripcion insc){
    
        String sql= "INSERT INTO inscripcion (idalumno, idmateria, nota)"
                + "VALUES (?,?,?)"; 
        
        try {
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1,insc.getAlumno().getIdAlumno());
            ps.setInt(2,insc.getMateria().getIdMateria());
            ps.setDouble(3,insc.getNota());
            
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()) {
                insc.setidInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Inscripcion Guardada");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al entrar a la tabla Inscripcion");
        }

    }
    
    public void actualizarNota(int idalumno, int idmateria, double nota){
    
    String sql= "UPDATE inscripcion SET nota=? WHERE idalumno=? and idmateria=?"; 
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setDouble(1, nota);
            ps.setInt(2, idalumno);
            ps.setInt(3, idmateria);
            
            int filas=ps.executeUpdate();
            if (filas>0) {
                
                JOptionPane.showMessageDialog(null,"se ah actualizado la nota ");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al entrar a la tabla Inscripcion");
        }
    }
    
    public void deletearMateria(int idalumno, int idmateria){
    
        String sql= "DELETE FROM inscripcion WHERE idalumno=? and idmateria=?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idalumno);
            ps.setInt(2, idmateria);
            
            int filas=ps.executeUpdate();
            if (filas>0) {
                
                JOptionPane.showMessageDialog(null,"Inscripcion Borrada");
            }
            ps.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error al entrar a la tabla Inscripcion");
        }
    
    }
    
    public List<Inscripcion> ObtenerInscripciones(){
    
    ArrayList<Inscripcion> cursadas=new ArrayList<>();
    
    String sql = "SELECT * FROM inscripcion";
    
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
            
                Inscripcion insc=new Inscripcion();
                insc.setidInscripcion(rs.getInt("idinscripto"));
                Alumno alu=ad.buscarAlumno(rs.getInt("idalumno"));
                Materia mat=md.buscarMateria(rs.getInt("idmateria"));  // soy un pendejo abismal , habia puesto "ad" en vez de "md"....
                insc.setAlumno(alu);
                insc.setMateria(mat);
                insc.setNota(rs.getDouble("nota"));
                
                cursadas.add(insc);
            
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al entrar a la tabla Inscripcion");
        }
        
        return cursadas;
    }
    
}

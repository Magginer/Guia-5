/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.univers.accesoADatos;

import gestion.univers.entidades.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author marti
 */
public class AlumnoData {

    private Connection con = null;

    public AlumnoData() {

        con = Conexion.getConexion();

    }

    public void guardarAlumno(Alumno alumno) {

        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechanacimiento, estado)"
                + "VALUES (?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechadenacimiento()));
            ps.setBoolean(5, alumno.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno guardado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno");
        }

    }

    public void modificarAlumno(Alumno alumno) {

        String sql = "UPDATE alumno SET dni=?, apellido=?, nombre=?, fechanacimiento=?"
                + "WHERE idAlumno=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechadenacimiento()));
            ps.setInt(5, alumno.getIdAlumno());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alumno Modificado");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
    }

    public void eliminarAlumno(int id) {
        String sql = "UPDATE alumno SET estado = 0 WHERE idAlumno=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alumno borrado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");

        }
    }

    public void reactivarAlumno(int id) {
        String sql = "UPDATE alumno SET estado = 1 WHERE idAlumno=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alumno reactivado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");

        }
    }

    public Alumno buscarAlumno(int id) {

        String sql = "SELECT  dni, apellido, nombre, fechanacimiento FROM alumno WHERE idAlumno=? AND estado=1";
        Alumno alumno = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                alumno = new Alumno();
                alumno.setIdAlumno(id);
                alumno.setApellido(rs.getString("apellido"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechadenacimiento(rs.getDate("fechanacimiento").toLocalDate());
                alumno.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "No existe un alumno con ese ID");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        return alumno;
    }

    public Alumno buscarAlumnoPorDni(int dni) {

        String sql = "SELECT  idalumno,dni, apellido, nombre, fechanacimiento, estado FROM alumno WHERE dni=?";
        Alumno alumno = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idalumno"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechadenacimiento(rs.getDate("fechanacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe un alumno con ese DNI");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        return alumno;
    }

    public List<Alumno> ListarAlumnos() {

        String sql = "SELECT  idalumno ,dni, apellido, nombre, fechanacimiento FROM alumno WHERE estado=1 ";
        ArrayList<Alumno> alumnos = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while(rs.next()){

                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idalumno"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechadenacimiento(rs.getDate("fechanacimiento").toLocalDate());
                alumno.setEstado(true);
                
                alumnos.add(alumno);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        return alumnos;
    }

}

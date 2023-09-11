/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.univers;

import gestion.univers.accesoADatos.AlumnoData;
import gestion.univers.accesoADatos.Conexion;
import gestion.univers.entidades.Alumno;
import java.sql.Connection;
import java.time.LocalDate;

/**
 *
 * @author marti
 */
public class GestionUnivers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Connection con=Conexion.getConexion();
      
        Alumno juan = new Alumno(LocalDate.of(1980,04,25),"juan pablo", "Perez",1, 28356951, true);
        AlumnoData alu=new AlumnoData();
        //alu.guardarAlumno(juan);
        //alu.modificarAlumno(juan);
        alu.eliminarAlumno(1);
  
    }
    
    
    
    
}

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
      /*
        //Alumno juan = new Alumno(LocalDate.of(1980,04,25),"Margo", "Garcia",1, 28356952, true);
        AlumnoData alu=new AlumnoData();
        //alu.guardarAlumno(juan);
        //alu.modificarAlumno(juan);
        //alu.eliminarAlumno(1);
        //alu.reactivarAlumno(1);
        Alumno alumnoEncontrado=alu.buscarAlumno(1); // buscarAlumnPorDni()
        if(alumnoEncontrado!=null){
        
        System.out.println("dni "+alumnoEncontrado.getDni()); 
        System.out.println("apellido "+alumnoEncontrado.getApellido());
        
        
              
    }*/
    
      AlumnoData alu=new AlumnoData();  
      for(Alumno alumno:alu.ListarAlumnos()){
          
          System.out.println("-------------------------------");
          System.out.println("DNI "+alumno.getDni());
          System.out.println("APELLIDO "+alumno.getApellido());
          System.out.println("NOMBRE "+alumno.getNombre());
          System.out.println("FECHA DE NACIMIENTO "+alumno.getFechadenacimiento());
   
      
      }
    
    
    
}
}
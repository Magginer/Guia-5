/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.univers;

import gestion.univers.accesoADatos.*;
import gestion.univers.entidades.Alumno;
import gestion.univers.entidades.Inscripcion;
import gestion.univers.entidades.Materia;
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

        Connection con = Conexion.getConexion();
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
       
    }
    
      AlumnoData alu=new AlumnoData();  
      for(Alumno alumno:alu.ListarAlumnos()){
          
          System.out.println("-------------------------------");
          System.out.println("DNI "+alumno.getDni());
          System.out.println("APELLIDO "+alumno.getApellido());
          System.out.println("NOMBRE "+alumno.getNombre());
          System.out.println("FECHA DE NACIMIENTO "+alumno.getFechadenacimiento());
   
      
      }*/

        //  ------------------------------------------------------------------------------------------- 
        /*Materia q=new Materia(4 ,"Quimica3", 3, true);
      MateriaData mate=new MateriaData();
      //mate.guardarMateria(q);
      //mate.modificarMateria(q);  // al modificar el dato acordarse de colocarl el ID
      //mate.eliminarMateria(1);
      //mate.reactivarMateria(1);
      Materia materiaEncontrada=mate.buscarMateria(3);
      if(materiaEncontrada!=null){
      
          System.out.println("Nombre "+materiaEncontrada.getNombre());
          System.out.println("Año "+materiaEncontrada.getAnio());
          
      }*/
    /*MateriaData mate=new MateriaData();
          for(Materia materia:mate.ListarMateria()){
             System.out.println("-------------------------------");
          System.out.println("NOMBRE "+materia.getNombre());
          System.out.println("AÑO "+materia.getAnio());
          }*/
 
          AlumnoData ad= new AlumnoData();
          MateriaData md=new MateriaData();
          InscripcionData id=new InscripcionData();
          
          Alumno alf= ad.buscarAlumno(2);
          Materia fla=md.buscarMateria(4);
          Inscripcion insc=new Inscripcion(alf,fla,7);    //inscripcion del (alumno, materia y nota)
          
          //id.guardarInscripcion(insc); 
          id.actualizarNota(2, 4, 8);
    }
    
    
    
}

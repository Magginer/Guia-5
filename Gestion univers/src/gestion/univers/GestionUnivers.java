/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.univers;

import gestion.univers.accesoADatos.Conexion;
import java.sql.Connection;

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
        
    }
    
}


package gestion.univers.vistas;

import gestion.univers.accesoADatos.AlumnoData;
import gestion.univers.accesoADatos.Conexion;
import gestion.univers.entidades.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;

/**
 *
 * @author javie
 */
public class VistaFormularioAlumno extends javax.swing.JInternalFrame {

    Connection con = Conexion.getConexion();

    public VistaFormularioAlumno() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        documentotext = new javax.swing.JTextField();
        apellidotext = new javax.swing.JTextField();
        nombretext = new javax.swing.JTextField();
        botondeestado = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        Buscardocumentoboton = new javax.swing.JButton();
        Eliminaralumnoboton = new javax.swing.JButton();
        Nuevoalumnoboton = new javax.swing.JButton();
        Saliralumnoboton = new javax.swing.JButton();
        Guardaralumnoboton = new javax.swing.JButton();
        FechaAlumno = new com.toedter.calendar.JDateChooser();
        limpiarboton = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Documento");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Alumno");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Apellido");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Fecha de nacimiento");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nombre");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Estado");

        documentotext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentotextActionPerformed(evt);
            }
        });

        apellidotext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidotextActionPerformed(evt);
            }
        });

        nombretext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombretextActionPerformed(evt);
            }
        });

        botondeestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botondeestadoActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        Buscardocumentoboton.setText("Buscar");
        Buscardocumentoboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscardocumentobotonActionPerformed(evt);
            }
        });

        Eliminaralumnoboton.setText("Eliminar");
        Eliminaralumnoboton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminaralumnobotonMouseClicked(evt);
            }
        });

        Nuevoalumnoboton.setText("Nuevo Alumno");
        Nuevoalumnoboton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NuevoalumnobotonMouseClicked(evt);
            }
        });
        Nuevoalumnoboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoalumnobotonActionPerformed(evt);
            }
        });

        Saliralumnoboton.setText("Salir");
        Saliralumnoboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaliralumnobotonActionPerformed(evt);
            }
        });

        Guardaralumnoboton.setText("Guardar Cambios");
        Guardaralumnoboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardaralumnobotonActionPerformed(evt);
            }
        });

        limpiarboton.setText("Limpiar");
        limpiarboton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limpiarbotonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(nombretext, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(botondeestado))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Nuevoalumnoboton)
                                .addGap(18, 18, 18)
                                .addComponent(Eliminaralumnoboton)
                                .addGap(18, 18, 18)
                                .addComponent(Guardaralumnoboton)
                                .addGap(18, 18, 18)
                                .addComponent(Saliralumnoboton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(32, 32, 32)
                                .addComponent(FechaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(documentotext, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(apellidotext, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(limpiarboton)
                            .addComponent(Buscardocumentoboton))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(documentotext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buscardocumentoboton))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(apellidotext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombretext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botondeestado)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(limpiarboton)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FechaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nuevoalumnoboton)
                    .addComponent(Eliminaralumnoboton)
                    .addComponent(Guardaralumnoboton)
                    .addComponent(Saliralumnoboton))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private int idalumno;
    
    
    
    private void documentotextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentotextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documentotextActionPerformed

    private void BuscardocumentobotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscardocumentobotonActionPerformed
        /*BOTON DE BUSQUEDA POR DNI DEL FORMULARIO*/
        // TODO add your handling code here:
         
            int dni = Integer.parseInt(documentotext.getText());   
          
                                    
            AlumnoData alu = new AlumnoData();
            Alumno alumno = alu.buscarAlumnoPorDni(dni);
            
            if (alumno != null) {
                idalumno= alumno.getIdAlumno();
                apellidotext.setText(alumno.getApellido());
                nombretext.setText(alumno.getNombre());
                FechaAlumno.setDate(Date.valueOf(alumno.getFechadenacimiento()));
                
                if (alumno.isEstado() == true) {
                    botondeestado.setSelected(true);
                } else {
                    botondeestado.setSelected(false);
                }
                
            }  
    }//GEN-LAST:event_BuscardocumentobotonActionPerformed

    private void apellidotextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidotextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidotextActionPerformed

    private void nombretextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombretextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombretextActionPerformed

    private void botondeestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botondeestadoActionPerformed
        // TODO add your handling code here:
        int dni = Integer.parseInt(documentotext.getText());

        AlumnoData bot = new AlumnoData();
        boolean boton;
        boton = false;

        if (boton == true) {

            bot.botonestado(dni);

        } else {
            bot.botonestadoinactivo(dni);

    }//GEN-LAST:event_botondeestadoActionPerformed
    }

    private void NuevoalumnobotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoalumnobotonActionPerformed

       
    }//GEN-LAST:event_NuevoalumnobotonActionPerformed

    private void GuardaralumnobotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardaralumnobotonActionPerformed

        int dni = Integer.parseInt(documentotext.getText());
        String apellido= apellidotext.getText();
        String nombre= nombretext.getText();
        boolean estado= botondeestado.isSelected();
        LocalDate fecha= FechaAlumno.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();  
        Date fech = Date.valueOf(fecha);
        Alumno alumno= new Alumno(fecha,nombre,apellido,idalumno,dni,estado);
      
        AlumnoData alu = new AlumnoData();
        
     
        alu.modificarAlumno(alumno);
        
        

    }//GEN-LAST:event_GuardaralumnobotonActionPerformed

    private void SaliralumnobotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaliralumnobotonActionPerformed
    
        this.dispose();  // cierra la ventana pero no el programa
        
        
    }//GEN-LAST:event_SaliralumnobotonActionPerformed

    private void limpiarbotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarbotonMouseClicked
      
        // BOTON LIMPIAR , limpia todo el formulario 
        
         AlumnoData alu = new AlumnoData();

        documentotext.setText("");
        apellidotext.setText("");
        nombretext.setText("");
        botondeestado.setSelected(false);
        FechaAlumno.setCalendar(null); // <--- OJO QUE TE JODE ESTA!!!!
        
    }//GEN-LAST:event_limpiarbotonMouseClicked

    private void NuevoalumnobotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevoalumnobotonMouseClicked
        
        int dni = Integer.parseInt(documentotext.getText());
        String apellido= apellidotext.getText();
        String nombre= nombretext.getText();
        boolean estado= botondeestado.isEnabled();
        LocalDate fecha= FechaAlumno.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();  // error aqui al guardar alumno
        Date fech = Date.valueOf(fecha);
        Alumno alumno= new Alumno();
        
        alumno.setDni(dni);
        alumno.setApellido(apellido);
        alumno.setNombre(nombre);
        alumno.setEstado(estado);
        alumno.setFechadenacimiento(fecha);    // tengo dudas aqui 
        
        AlumnoData alu = new AlumnoData();
        
        alu.guardarAlumno(alumno);
    }//GEN-LAST:event_NuevoalumnobotonMouseClicked

    private void EliminaralumnobotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminaralumnobotonMouseClicked
        
        int dni = Integer.parseInt(documentotext.getText());
        
        AlumnoData alu= new AlumnoData();
        
        alu.deleteaAlumno(dni);
       
        
        
    }//GEN-LAST:event_EliminaralumnobotonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscardocumentoboton;
    private javax.swing.JButton Eliminaralumnoboton;
    private com.toedter.calendar.JDateChooser FechaAlumno;
    private javax.swing.JButton Guardaralumnoboton;
    private javax.swing.JButton Nuevoalumnoboton;
    private javax.swing.JButton Saliralumnoboton;
    private javax.swing.JTextField apellidotext;
    private javax.swing.JRadioButton botondeestado;
    private javax.swing.JTextField documentotext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton limpiarboton;
    private javax.swing.JTextField nombretext;
    // End of variables declaration//GEN-END:variables
}

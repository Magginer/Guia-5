/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.univers.vistas;

import gestion.univers.accesoADatos.MateriaData;
import gestion.univers.entidades.Materia;
import javax.swing.JOptionPane;

/**
 *
 * @author javie
 */
public class VistaFormularioMateria extends javax.swing.JInternalFrame {

    private int IdMateria;

    /**
     * Creates new form VistaFormularioMateria
     */
    public VistaFormularioMateria() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Estadomateriaboton = new javax.swing.JRadioButton();
        codigotext = new javax.swing.JTextField();
        nombrematetext = new javax.swing.JTextField();
        aniotext = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Guardarmateriaboton = new javax.swing.JButton();
        Buscarcodigoboton = new javax.swing.JButton();
        Salirmateriaboton = new javax.swing.JButton();
        Eliminarmateriaboton = new javax.swing.JButton();
        Nuevamateriaboton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Materia");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Estado");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Año");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nombre");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Codigo");

        Estadomateriaboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadomateriabotonActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        Guardarmateriaboton.setText("Guardar Cambios");
        Guardarmateriaboton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GuardarmateriabotonMouseClicked(evt);
            }
        });

        Buscarcodigoboton.setText("Buscar");
        Buscarcodigoboton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarcodigobotonMouseClicked(evt);
            }
        });

        Salirmateriaboton.setText("Salir");
        Salirmateriaboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirmateriabotonActionPerformed(evt);
            }
        });

        Eliminarmateriaboton.setText("Eliminar");
        Eliminarmateriaboton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarmateriabotonMouseClicked(evt);
            }
        });

        Nuevamateriaboton.setText("Nueva Materia");
        Nuevamateriaboton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NuevamateriabotonMouseClicked(evt);
            }
        });

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombrematetext, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(codigotext, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Buscarcodigoboton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Estadomateriaboton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Nuevamateriaboton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Eliminarmateriaboton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Guardarmateriaboton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Salirmateriaboton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aniotext, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 18, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codigotext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Buscarcodigoboton))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombrematetext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aniotext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Estadomateriaboton))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Eliminarmateriaboton)
                    .addComponent(Nuevamateriaboton)
                    .addComponent(Guardarmateriaboton)
                    .addComponent(Salirmateriaboton)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private int idmateria;


    private void SalirmateriabotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirmateriabotonActionPerformed

        this.dispose();

    }//GEN-LAST:event_SalirmateriabotonActionPerformed

    private void BuscarcodigobotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarcodigobotonMouseClicked

        int id = Integer.parseInt(codigotext.getText());

        MateriaData materia = new MateriaData();
        Materia mate = materia.buscarMateria(id);

        if (mate != null) {
            IdMateria = mate.getIdMateria();
            nombrematetext.setText(mate.getNombre());
            aniotext.setText(String.valueOf(mate.getAnio()));
            Estadomateriaboton.setSelected(mate.isEstado());

            //lalala
        }

    }//GEN-LAST:event_BuscarcodigobotonMouseClicked

    private void EstadomateriabotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadomateriabotonActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(codigotext.getText());

        MateriaData bot = new MateriaData();
        boolean boton;
        boton = false;

        if (boton == true) {

            bot.botonestado(id);

        } else {
            bot.botonestadoinactivo(id);
    }//GEN-LAST:event_EstadomateriabotonActionPerformed
    }    
    private void NuevamateriabotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevamateriabotonMouseClicked
        
        int id = Integer.parseInt(codigotext.getText());
        
        String nombre= nombrematetext.getText();
        int anio= Integer.parseInt(aniotext.getText());
        boolean estado = Estadomateriaboton.isEnabled();
        
        Materia mate = new Materia();
        
        mate.setIdMateria(id);
        mate.setNombre(nombre);
        mate.setAnio(anio);
        mate.setEstado(estado); 
        MateriaData mated= new MateriaData();
        mated.guardarMateria(mate);
        
     
    }//GEN-LAST:event_NuevamateriabotonMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        codigotext.setText("");
        nombrematetext.setText("");
        aniotext.setText("");
        Estadomateriaboton.setSelected(false);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void GuardarmateriabotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarmateriabotonMouseClicked
    
        int id = Integer.parseInt(codigotext.getText());
        
        
        String nombre= nombrematetext.getText();
        int anio= Integer.parseInt(aniotext.getText());
        boolean estado= Estadomateriaboton.isEnabled();
      
        Materia materia = new Materia(id,nombre ,anio ,estado);
        
        MateriaData mate =new MateriaData();
        
        mate.modificarMateria(materia);
        
    }//GEN-LAST:event_GuardarmateriabotonMouseClicked

    private void EliminarmateriabotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarmateriabotonMouseClicked
       
        int id = Integer.parseInt(codigotext.getText());
        
        MateriaData mate= new MateriaData();
        
        mate.deleteMateria(IdMateria);
        
    }//GEN-LAST:event_EliminarmateriabotonMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscarcodigoboton;
    private javax.swing.JButton Eliminarmateriaboton;
    private javax.swing.JRadioButton Estadomateriaboton;
    private javax.swing.JButton Guardarmateriaboton;
    private javax.swing.JButton Nuevamateriaboton;
    private javax.swing.JButton Salirmateriaboton;
    private javax.swing.JTextField aniotext;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField codigotext;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nombrematetext;
    // End of variables declaration//GEN-END:variables
}

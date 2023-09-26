/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.univers.vistas;

import gestion.univers.accesoADatos.AlumnoData;
import gestion.univers.accesoADatos.Conexion;
import gestion.univers.accesoADatos.InscripcionData;
import gestion.univers.accesoADatos.MateriaData;
import gestion.univers.entidades.Alumno;
import gestion.univers.entidades.Inscripcion;
import gestion.univers.entidades.Materia;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author javie
 */
public class ManejoInscripciones extends javax.swing.JInternalFrame {

    /**
     * Creates new form ManejoInscripciones
     */
    
    Connection con = null;
    ArrayList Alista;
    ArrayList<Materia> Mlista;
    AlumnoData alumno = new AlumnoData();
    MateriaData materia = new MateriaData();
    DefaultTableModel modelo;
   
    public ManejoInscripciones() {
        initComponents();
        
        modelo = new DefaultTableModel();
        con = Conexion.getConexion();
        Alista = new ArrayList();
        llenarcombo();
        armaCabeceraTabla();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Materiainscriptaboton = new javax.swing.JRadioButton();
        MateriaNoinscriptaboton = new javax.swing.JRadioButton();
        Comboalumno = new javax.swing.JComboBox<>();
        Inscribirboton = new javax.swing.JButton();
        Salirinscboton = new javax.swing.JButton();
        Anularinscboton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabladematerias2 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de inscripcion");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Seleccion de alumnos");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Listado de materias");

        Materiainscriptaboton.setText("Materia inscripta");
        Materiainscriptaboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MateriainscriptabotonActionPerformed(evt);
            }
        });

        MateriaNoinscriptaboton.setText("Materia no inscripta");
        MateriaNoinscriptaboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MateriaNoinscriptabotonActionPerformed(evt);
            }
        });

        Comboalumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboalumnoActionPerformed(evt);
            }
        });

        Inscribirboton.setText("Inscribir");
        Inscribirboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InscribirbotonActionPerformed(evt);
            }
        });

        Salirinscboton.setText("Salir");
        Salirinscboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirinscbotonActionPerformed(evt);
            }
        });

        Anularinscboton.setText("Anular inscripcion");

        Tabladematerias2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabladematerias2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabladematerias2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Tabladematerias2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(Materiainscriptaboton)
                        .addGap(49, 49, 49)
                        .addComponent(MateriaNoinscriptaboton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(Comboalumno, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Inscribirboton)
                .addGap(42, 42, 42)
                .addComponent(Anularinscboton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Salirinscboton)
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2))
                    .addComponent(Comboalumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Materiainscriptaboton)
                    .addComponent(MateriaNoinscriptaboton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Inscribirboton)
                    .addComponent(Anularinscboton)
                    .addComponent(Salirinscboton))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void llenarcombo () {
        
       Comboalumno.removeAllItems();
       Alista = (ArrayList) alumno.ListarAlumnos();
       Iterator iterador = Alista.iterator();
       while(iterador.hasNext()){
           Alumno alu = (Alumno) iterador.next();
           Comboalumno.addItem(alu);   
       }
        
    }
      public void armaCabeceraTabla() {

        //Titulos de Columnas
        ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.add("ID");
        columnas.add("Nombre");
        columnas.add("Año");

        for (Object it : columnas) {

            modelo.addColumn(it);
        }
        Tabladematerias2.setModel(modelo);

    }
    public void llenartabla() {
        InscripcionData inscripcion = new InscripcionData();

        Alumno alu = (Alumno) Comboalumno.getSelectedItem();
        Mlista = (ArrayList) inscripcion.ObtenerInscripcionesPorAlumno(alu.getIdAlumno());
        for (Materia mate : Mlista) {
            modelo.addRow(new Object[]{mate.getIdMateria(), mate.getNombre(), mate.getAnio()});
           
        }
    }

    public void noinscripto() {

        InscripcionData inscripcion = new InscripcionData();

        Alumno alu = (Alumno) Comboalumno.getSelectedItem();
        Mlista = (ArrayList) inscripcion.ObtenerMateriasNoCursadas(alu.getIdAlumno());
        for (Materia mate : Mlista) {
            modelo.addRow(new Object[]{mate.getIdMateria(), mate.getNombre(), mate.getAnio()});

        }

    }
    
     public void inscripto(){
         
        InscripcionData inscripcion = new InscripcionData();

        Alumno alu = (Alumno) Comboalumno.getSelectedItem();
        Mlista = (ArrayList) inscripcion.ObtenerMateriasCursadas(alu.getIdAlumno());
        for (Materia mate : Mlista) {
            modelo.addRow(new Object[]{mate.getIdMateria(), mate.getNombre(), mate.getAnio()});
         
        }
         
     }
    public void crearinscripcion(){
        InscripcionData inscripcion = new InscripcionData();
        MateriaData mate2 = new MateriaData();
       
       Alumno alu = (Alumno) Comboalumno.getSelectedItem();
       int ida = alu.getIdAlumno();
       
      
  

        
        
    }
    
public void borraFilasTabla() {

        int a = modelo.getRowCount() - 1;

        for (int i = a; i >= 0; i--) {

            modelo.removeRow(i);
        }
    }
    
    
    private void ComboalumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboalumnoActionPerformed
        // TODO add your handling code here:
               
    }//GEN-LAST:event_ComboalumnoActionPerformed

    private void SalirinscbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirinscbotonActionPerformed
     
         this.dispose();
        
    }//GEN-LAST:event_SalirinscbotonActionPerformed

    private void MateriaNoinscriptabotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MateriaNoinscriptabotonActionPerformed
        // TODO add your handling code here:
        borraFilasTabla();
        noinscripto();
      
    }//GEN-LAST:event_MateriaNoinscriptabotonActionPerformed

    private void MateriainscriptabotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MateriainscriptabotonActionPerformed
        // TODO add your handling code here:
       borraFilasTabla();
       inscripto();
    }//GEN-LAST:event_MateriainscriptabotonActionPerformed

    private void InscribirbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InscribirbotonActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_InscribirbotonActionPerformed

    private void Tabladematerias2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabladematerias2MouseClicked
        // TODO add your handling code here:
        int seleccionar=Tabladematerias2.rowAtPoint(evt.getPoint());
        Materia id = new Materia();
       
                
     
         
        
    }//GEN-LAST:event_Tabladematerias2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anularinscboton;
    private javax.swing.JComboBox<Alumno> Comboalumno;
    private javax.swing.JButton Inscribirboton;
    private javax.swing.JRadioButton MateriaNoinscriptaboton;
    private javax.swing.JRadioButton Materiainscriptaboton;
    private javax.swing.JButton Salirinscboton;
    private javax.swing.JTable Tabladematerias2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

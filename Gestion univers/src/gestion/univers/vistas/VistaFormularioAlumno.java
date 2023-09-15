/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.univers.vistas;

/**
 *
 * @author javie
 */
public class VistaFormularioAlumno extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaFormularioAlumno
     */
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
        fechadenacimiento = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        Buscardocumentoboton = new javax.swing.JButton();
        Eliminaralumnoboton = new javax.swing.JButton();
        Nuevoalumnoboton = new javax.swing.JButton();
        Saliralumnoboton = new javax.swing.JButton();
        Guardaralumnoboton = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Documento");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 107, 94, 37));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Alumno");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 18, 94, 37));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Apellido");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 162, 94, 37));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Fecha de nacimiento");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 346, 94, 37));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nombre");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 217, 94, 37));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Estado");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 272, 94, 37));

        documentotext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentotextActionPerformed(evt);
            }
        });
        getContentPane().add(documentotext, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 113, 132, -1));
        getContentPane().add(apellidotext, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 168, 132, -1));
        getContentPane().add(nombretext, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 230, 132, -1));
        getContentPane().add(botondeestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 272, -1, -1));
        getContentPane().add(fechadenacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 354, 157, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 61, 244, 10));

        Buscardocumentoboton.setText("Buscar");
        getContentPane().add(Buscardocumentoboton, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 109, -1, -1));

        Eliminaralumnoboton.setText("Eliminar");
        getContentPane().add(Eliminaralumnoboton, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 423, -1, -1));

        Nuevoalumnoboton.setText("Nuevo");
        getContentPane().add(Nuevoalumnoboton, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 423, -1, -1));

        Saliralumnoboton.setText("Salir");
        getContentPane().add(Saliralumnoboton, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 423, -1, -1));

        Guardaralumnoboton.setText("Guardar");
        getContentPane().add(Guardaralumnoboton, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 423, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void documentotextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentotextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documentotextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscardocumentoboton;
    private javax.swing.JButton Eliminaralumnoboton;
    private javax.swing.JButton Guardaralumnoboton;
    private javax.swing.JButton Nuevoalumnoboton;
    private javax.swing.JButton Saliralumnoboton;
    private javax.swing.JTextField apellidotext;
    private javax.swing.JRadioButton botondeestado;
    private javax.swing.JTextField documentotext;
    private com.toedter.calendar.JDateChooser fechadenacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nombretext;
    // End of variables declaration//GEN-END:variables
}

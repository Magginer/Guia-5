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
public class VistaFormularioMateria extends javax.swing.JInternalFrame {

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

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Materia");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 6, 84, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Estado");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 215, 84, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Año");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 167, 84, 30));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 119, 84, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Codigo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 70, 84, 30));
        getContentPane().add(Estadomateriaboton, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 215, -1, -1));
        getContentPane().add(codigotext, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 73, 84, -1));
        getContentPane().add(nombrematetext, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 122, 156, -1));
        getContentPane().add(aniotext, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 167, 92, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 41, 215, 10));

        Guardarmateriaboton.setText("Guardar");
        getContentPane().add(Guardarmateriaboton, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 295, -1, -1));

        Buscarcodigoboton.setText("Buscar");
        getContentPane().add(Buscarcodigoboton, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 69, -1, -1));

        Salirmateriaboton.setText("Salir");
        getContentPane().add(Salirmateriaboton, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 295, -1, -1));

        Eliminarmateriaboton.setText("Eliminar");
        getContentPane().add(Eliminarmateriaboton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 295, -1, -1));

        Nuevamateriaboton.setText("Nuevo");
        getContentPane().add(Nuevamateriaboton, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 295, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nombrematetext;
    // End of variables declaration//GEN-END:variables
}

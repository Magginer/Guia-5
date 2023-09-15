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
public class ManejoInscripciones extends javax.swing.JInternalFrame {

    /**
     * Creates new form ManejoInscripciones
     */
    public ManejoInscripciones() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabladematerias = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Materiainscriptaboton = new javax.swing.JRadioButton();
        MateriaNoinscriptaboton = new javax.swing.JRadioButton();
        Comboalumno = new javax.swing.JComboBox<>();
        Inscribirboton = new javax.swing.JButton();
        Salirinscboton = new javax.swing.JButton();
        Anularinscboton = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabladematerias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Año"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabladematerias);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 352, 165));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de inscripcion");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 6, 162, 28));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Seleccion de alumnos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 61, 130, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Listado de materias");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 116, 144, -1));

        Materiainscriptaboton.setText("Materia inscripta");
        getContentPane().add(Materiainscriptaboton, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 150, -1, -1));

        MateriaNoinscriptaboton.setText("Materia no inscripta");
        getContentPane().add(MateriaNoinscriptaboton, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 150, -1, -1));

        Comboalumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboalumnoActionPerformed(evt);
            }
        });
        getContentPane().add(Comboalumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 56, 175, -1));

        Inscribirboton.setText("Inscribir");
        getContentPane().add(Inscribirboton, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 393, -1, -1));

        Salirinscboton.setText("Salir");
        getContentPane().add(Salirinscboton, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 393, -1, -1));

        Anularinscboton.setText("Anular inscripcion");
        getContentPane().add(Anularinscboton, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 393, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboalumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboalumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboalumnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anularinscboton;
    private javax.swing.JComboBox<String> Comboalumno;
    private javax.swing.JButton Inscribirboton;
    private javax.swing.JRadioButton MateriaNoinscriptaboton;
    private javax.swing.JRadioButton Materiainscriptaboton;
    private javax.swing.JButton Salirinscboton;
    private javax.swing.JTable Tabladematerias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

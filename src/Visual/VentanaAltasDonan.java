/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import donpos.ABMDonantes;

import donpos.ObjetosTablas.Donante;
/**
 *
 * @author notebook cps
 */
public class VentanaAltasDonan extends javax.swing.JFrame {
    
    Donante don = new Donante();
    ABMDonantes abmd = new ABMDonantes();
    
    public VentanaAltasDonan() {
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

        jTextFieldDoc = new javax.swing.JTextField();
        jTextFieldNom = new javax.swing.JTextField();
        jTextFieldTel = new javax.swing.JTextField();
        jTextFieldLoc = new javax.swing.JTextField();
        jTextFieldTar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldGs = new javax.swing.JTextField();
        BotonGuardar = new javax.swing.JButton();
        BotonAgregarDonacion = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana altas");
        setBounds(new java.awt.Rectangle(500, 500, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(80, 500));
        setName("Ventana altas"); // NOI18N

        jTextFieldDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDocActionPerformed(evt);
            }
        });

        jTextFieldLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLocActionPerformed(evt);
            }
        });

        jLabel1.setText("Numero de documento");

        jLabel2.setText("Apellido y nombre");

        jLabel3.setText("Tel??fono");

        jLabel4.setText("Localidad");

        jLabel5.setText("Tarjeta (S/N)");

        jLabel6.setText("Grupo Sanguineo");

        BotonGuardar.setText("Solo Guardar");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        BotonAgregarDonacion.setText("Guardar y Agregar Donaci??n");
        BotonAgregarDonacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarDonacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonAgregarDonacion)
                        .addGap(34, 34, 34)
                        .addComponent(BotonGuardar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFieldDoc)
                        .addComponent(jTextFieldNom)
                        .addComponent(jTextFieldTel)
                        .addComponent(jTextFieldLoc)
                        .addComponent(jTextFieldTar)
                        .addComponent(jTextFieldGs, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldGs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonGuardar)
                    .addComponent(BotonAgregarDonacion))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLocActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        // Guardar valores ingresados en un objeto tipo Donante.

            don.setnDoc(Integer.parseInt(jTextFieldDoc.getText()));
            don.setApeNom(jTextFieldNom.getText());
            don.setTelefono(jTextFieldTel.getText());
            don.setLocalidad(jTextFieldLoc.getText());
            if(jTextFieldTar.getText().equals('S') | jTextFieldTar.getText().equals('s'))
            don.setTarjeta(true);
            else don.setTarjeta(false);
            don.setGrupoSang(jTextFieldGs.getText());
        //Invoca al metodo registrar de la clase ABMDonante.    
            abmd.registrarDonantes(don);
            jTextFieldDoc.setText("");
            jTextFieldNom.setText("");
            jTextFieldLoc.setText("");
            jTextFieldTel.setText("");
            jTextFieldTar.setText("");
            jTextFieldGs.setText("");
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void jTextFieldDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDocActionPerformed

    private void BotonAgregarDonacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarDonacionActionPerformed
        // TODO add your handling code here:
            don.setnDoc(Integer.parseInt(jTextFieldDoc.getText()));
            don.setApeNom(jTextFieldNom.getText());
            don.setTelefono(jTextFieldTel.getText());
            don.setLocalidad(jTextFieldLoc.getText());
            if(jTextFieldTar.getText().equals('S') | jTextFieldTar.getText().equals('s'))
            don.setTarjeta(true);
            else don.setTarjeta(false);
            don.setGrupoSang(jTextFieldGs.getText());
        //Invoca al metodo registrar de la clase ABMDonante.    
            abmd.registrarDonantes(don);
            new VentanaAltasDonacDD(don).setVisible(true);
            jTextFieldDoc.setText("");
            jTextFieldNom.setText("");
            jTextFieldLoc.setText("");
            jTextFieldTel.setText("");
            jTextFieldTar.setText("");
            jTextFieldGs.setText("");
    }//GEN-LAST:event_BotonAgregarDonacionActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BotonAgregarDonacion;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextFieldDoc;
    private javax.swing.JTextField jTextFieldGs;
    private javax.swing.JTextField jTextFieldLoc;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldTar;
    private javax.swing.JTextField jTextFieldTel;
    // End of variables declaration//GEN-END:variables
}


package estudiantes;

import javax.swing.JOptionPane;

/**
 *
 * Pablo Gomez
 */
public class Interfaz_estudiantes extends javax.swing.JInternalFrame {

    
    public Interfaz_estudiantes() {
        initComponents();
        limpiar();
        bloquear_cajas();
    }

    /**
     * Este método es llamado desde dentro del constructor para inicializar el formulario.
     * El contenido de este método es siempre
     * Regenerados por el editor de formularios .
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_nuevoreg = new javax.swing.JButton();
        jButton_registrar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField_carnet = new javax.swing.JTextField();
        jTextField_documento = new javax.swing.JTextField();
        jTextField_nombres = new javax.swing.JTextField();
        jTextField_apellidos = new javax.swing.JTextField();
        jComboBox_sexo = new javax.swing.JComboBox();
        jComboBox_tipodoc = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 51, 51));
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jButton_nuevoreg.setForeground(new java.awt.Color(153, 0, 0));
        jButton_nuevoreg.setText("Nuevo registro");
        jButton_nuevoreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_nuevoregActionPerformed(evt);
            }
        });

        jButton_registrar.setForeground(new java.awt.Color(153, 0, 0));
        jButton_registrar.setText("Registrar");
        jButton_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrarActionPerformed(evt);
            }
        });

        jButton3.setForeground(new java.awt.Color(153, 0, 0));
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField_carnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_carnetActionPerformed(evt);
            }
        });

        jTextField_documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_documentoActionPerformed(evt);
            }
        });

        jTextField_nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nombresActionPerformed(evt);
            }
        });

        jTextField_apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_apellidosActionPerformed(evt);
            }
        });

        jComboBox_sexo.setForeground(new java.awt.Color(153, 0, 0));
        jComboBox_sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));
        jComboBox_sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_sexoActionPerformed(evt);
            }
        });

        jComboBox_tipodoc.setForeground(new java.awt.Color(153, 0, 0));
        jComboBox_tipodoc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CC", "TI", "RC", "PASAPORTE", "CE" }));
        jComboBox_tipodoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_tipodocActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("No carnet");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Documento");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Nombres");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("Apellidos");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Sexo");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Tipo doc");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jTextField_carnet, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox_tipodoc, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(52, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField_documento, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_registrar)
                    .addComponent(jButton_nuevoreg))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField_carnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox_tipodoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jButton_nuevoreg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_registrar)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void limpiar()
    {
       jTextField_carnet.setText("");
       jTextField_documento.setText("");
       jTextField_nombres.setText("");
       jTextField_apellidos.setText("");
       
        
    }
    
    public void  bloquear_cajas()
    {
       jTextField_carnet.setEnabled(false);
       jTextField_documento.setEnabled(false);
       jTextField_nombres.setEnabled(false);
       jTextField_apellidos.setEnabled(false);            
       jComboBox_sexo.setEnabled(false); 
       jButton_nuevoreg.setEnabled(true);
       jButton_registrar.setEnabled(false);
       jComboBox_tipodoc.setEnabled(false);
      
       
    }
    public void  desbloquear()
    {
       jTextField_carnet.setEnabled(true);
       jTextField_documento.setEnabled(true);
       jTextField_nombres.setEnabled(true);
       jTextField_apellidos.setEnabled(true);
       jComboBox_sexo.setEnabled(true);       
       jComboBox_tipodoc.setEnabled(true);        
       jButton_registrar.setEnabled(true);
       jButton_nuevoreg.setEnabled(false);
       
       
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrarActionPerformed
    String carnet,nom,ape,doc,sex,tipo; 
      
        carnet = jTextField_carnet.getText();
        tipo= jComboBox_tipodoc.getSelectedItem().toString();                
        nom = jTextField_nombres.getText();
        ape = jTextField_apellidos.getText();              
        sex = jComboBox_sexo.getSelectedItem().toString();
        doc = jTextField_documento.getText();
        control_estudiantes est = new control_estudiantes();
        if(!doc.equals("") && !tipo.equals("") && !nom.equals("") && !ape.equals("")  && !sex.equals("")&& !carnet.equals(""))
        {
        if(est.ingresar_estudiante(carnet,doc,tipo,nom,ape,sex))
        {
        JOptionPane.showMessageDialog(null,"El registro del estudiante fue exitoso","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        limpiar();
        bloquear_cajas();
        }
        else
        {
        JOptionPane.showMessageDialog(this, "Error");
        }
        }
        else
        {
          JOptionPane.showMessageDialog(this, "Digite los campos obligatorios");  
        }
        
       
          
                    
    }//GEN-LAST:event_jButton_registrarActionPerformed

    private void jButton_nuevoregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_nuevoregActionPerformed
    desbloquear();
    jTextField_carnet.requestFocus();
    }//GEN-LAST:event_jButton_nuevoregActionPerformed

    private void jTextField_carnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_carnetActionPerformed
    jTextField_carnet.transferFocus();        // TODO añadir su código de manejo aquí:
    }//GEN-LAST:event_jTextField_carnetActionPerformed

    private void jTextField_documentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_documentoActionPerformed
    jTextField_documento.transferFocus();        // TODO añadir su código de manejo aquí:
    }//GEN-LAST:event_jTextField_documentoActionPerformed

    private void jComboBox_tipodocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_tipodocActionPerformed
    jComboBox_tipodoc.transferFocus();        // TODO añadir su código de manejo aquí:
    }//GEN-LAST:event_jComboBox_tipodocActionPerformed

    private void jTextField_nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nombresActionPerformed
    jTextField_nombres.transferFocus();        // TODO añadir su código de manejo aquí:
    }//GEN-LAST:event_jTextField_nombresActionPerformed

    private void jTextField_apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_apellidosActionPerformed
    jTextField_apellidos.transferFocus();        // TODO añadir su código de manejo aquí:
    }//GEN-LAST:event_jTextField_apellidosActionPerformed

    private void jComboBox_sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_sexoActionPerformed
    jComboBox_sexo.transferFocus();        // TODO añadir su código de manejo aquí:
    }//GEN-LAST:event_jComboBox_sexoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton_nuevoreg;
    private javax.swing.JButton jButton_registrar;
    private javax.swing.JComboBox jComboBox_sexo;
    private javax.swing.JComboBox jComboBox_tipodoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField_apellidos;
    private javax.swing.JTextField jTextField_carnet;
    private javax.swing.JTextField jTextField_documento;
    private javax.swing.JTextField jTextField_nombres;
    // End of variables declaration//GEN-END:variables
}

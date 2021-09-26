
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;


public class vtn extends javax.swing.JFrame {

  
    DefaultTableModel m;
    public vtn() {
        initComponents();

        setExtendedState(MAXIMIZED_BOTH);
        pnlAlergias.setVisible(false);
        pnlSinto.setVisible(false);
        m = (DefaultTableModel) tblPersonas.getModel();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg1 = new javax.swing.ButtonGroup();
        bg2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tbAlergias = new javax.swing.JToggleButton();
        pnlAlergias = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlergias = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtFechaNacimiento = new javax.swing.JTextField();
        txtLugarNacimiento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        rbM = new javax.swing.JRadioButton();
        rbF = new javax.swing.JRadioButton();
        cbCasado = new javax.swing.JCheckBox();
        cbSoltero = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPersonas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        tbSinto = new javax.swing.JToggleButton();
        pnlSinto = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtSinto = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRO");
        setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 14, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("Apellidos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 55, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("Fecha de nacimiento");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 160, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setText("Edad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 51));
        jLabel6.setText("Lugar de nacimiento");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 208, -1, -1));

        tbAlergias.setText("Alergias");
        tbAlergias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbAlergiasActionPerformed(evt);
            }
        });
        getContentPane().add(tbAlergias, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));

        txtAlergias.setColumns(20);
        txtAlergias.setRows(5);
        jScrollPane1.setViewportView(txtAlergias);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Especifique");

        javax.swing.GroupLayout pnlAlergiasLayout = new javax.swing.GroupLayout(pnlAlergias);
        pnlAlergias.setLayout(pnlAlergiasLayout);
        pnlAlergiasLayout.setHorizontalGroup(
            pnlAlergiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlergiasLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlAlergiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAlergiasLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                    .addGroup(pnlAlergiasLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 183, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlAlergiasLayout.setVerticalGroup(
            pnlAlergiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAlergiasLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        getContentPane().add(pnlAlergias, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, -1, -1));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 11, 117, -1));

        txtApellidos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 52, 117, -1));

        txtEdad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 97, 117, -1));

        txtFechaNacimiento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFechaNacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFechaNacimientoKeyReleased(evt);
            }
        });
        getContentPane().add(txtFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 138, 117, -1));

        txtLugarNacimiento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtLugarNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 205, 134, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 51));
        jLabel8.setText("Estado");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 179, -1, -1));

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona Estado:", "Aguascalientes", "Baja California", "Baja California Sur", "Campeche", "Chiapas", "Chihuahua", "Coahuila", "Colima", "Distrito Federal", "Durango", "Estado de México", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "Michoacán", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatán", "Zacatecas" }));
        getContentPane().add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 177, -1, -1));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 150, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 51));
        jLabel9.setText("Sexo:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 262, -1, -1));

        bg1.add(rbM);
        rbM.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        rbM.setForeground(new java.awt.Color(255, 255, 51));
        rbM.setText("Masculino");
        getContentPane().add(rbM, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        bg1.add(rbF);
        rbF.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        rbF.setForeground(new java.awt.Color(255, 255, 51));
        rbF.setText("Femenino");
        getContentPane().add(rbF, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        bg2.add(cbCasado);
        cbCasado.setForeground(new java.awt.Color(255, 255, 51));
        cbCasado.setText("Casado");
        getContentPane().add(cbCasado, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, -1, -1));

        bg2.add(cbSoltero);
        cbSoltero.setForeground(new java.awt.Color(255, 255, 51));
        cbSoltero.setText("Soltero");
        getContentPane().add(cbSoltero, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, -1, -1));

        tblPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellidos", "Edad", "Fecha Nacimiento", "Estado", "Sexo", "Estado Civil", "Alergias", "Sintomatología"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblPersonas);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 700, 530));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("<html>REGISTRO COMUN QUE SE REALIZA A UN PACIENTE</html>");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 190, 90));

        tbSinto.setText("Sintomatología");
        tbSinto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbSintoActionPerformed(evt);
            }
        });
        getContentPane().add(tbSinto, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, -1, -1));

        jScrollPane3.setEnabled(false);

        txtSinto.setColumns(20);
        txtSinto.setRows(5);
        txtSinto.setTabSize(9);
        jScrollPane3.setViewportView(txtSinto);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Epecifique");

        javax.swing.GroupLayout pnlSintoLayout = new javax.swing.GroupLayout(pnlSinto);
        pnlSinto.setLayout(pnlSintoLayout);
        pnlSintoLayout.setHorizontalGroup(
            pnlSintoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSintoLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(pnlSintoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlSintoLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlSintoLayout.setVerticalGroup(
            pnlSintoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSintoLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        getContentPane().add(pnlSinto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, -1, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Este Programa Registra Temporalmente Pacientes De Covid, El Registro Se Elimina Cuando El Programa Se Cierra");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 630, -1, -1));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 51));
        jLabel12.setText("Estado Civil");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/conjunto-de-capas-caja-herramientas-construcción-hospitales-médicos-y-registro-clínico-en-un-patrón-impecable-vector-205816425.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 670));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/conjunto-de-capas-caja-herramientas-construcción-hospitales-médicos-y-registro-clínico-en-un-patrón-impecable-vector-205816425.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 680, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbAlergiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbAlergiasActionPerformed
       if(tbAlergias.isSelected()){
           pnlAlergias.setVisible(true);
       }else{
           txtAlergias.setText("");
           pnlAlergias.setVisible(false);
       }
    }//GEN-LAST:event_tbAlergiasActionPerformed

    private void valida() throws Exception{
       
        if(txtNombre.getText().length()==0){
            showMessageDialog(null, "NOMBRE VACIO");
            txtNombre.requestFocus();
            throw new Exception();
        }
        if(txtApellidos.getText().length()==0){
            showMessageDialog(null, "APELLIDOS VACIO");
            txtApellidos.requestFocus();
            throw new Exception();
        }
        if(!txtEdad.getText().matches("\\d*")){
            showMessageDialog(null, "SOLO NUMEROS");
            txtEdad.requestFocus();
            txtEdad.setText("");
            throw new Exception();
        }
        if(txtEdad.getText().length()==0){
            showMessageDialog(null, "EDAD VACIA");
            txtEdad.requestFocus();
            throw new Exception();
        }
        if(txtFechaNacimiento.getText().length()==0){
            showMessageDialog(null, "FECHA DE NACIMIENTO VACIA");
            txtFechaNacimiento.requestFocus();
            throw new Exception();
        }
         if(!txtFechaNacimiento.getText().matches("^\\d{2}/\\d{2}/\\d{4}$")) {
            showMessageDialog(null, "Formato de fecha incorrecto");
            txtFechaNacimiento.setText("");
            txtFechaNacimiento.requestFocus();
            throw new Exception();
        }
        if(txtLugarNacimiento.getText().length()==0){
            showMessageDialog(null, "LUGAR DE NACIMIENTO VACIO");
            txtLugarNacimiento.requestFocus();
            throw new Exception();
        }
      
        
    }
    Persona persona[] = new Persona[100];
    int cont = 0;
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            valida();
            String cad = " ",cad2=" ";
            if(rbM.isSelected())
                cad = "Masculino";
            if(rbF.isSelected())
                cad = "Femenino";
            if(cbCasado.isSelected())
                cad2 = "Casado";
            if(cbSoltero.isSelected())
                cad2 = "Soltero";
            persona[cont++] = new Persona(txtNombre.getText(), txtApellidos.getText(), txtEdad.getText(), txtFechaNacimiento.getText(), cmbEstado.getSelectedItem().toString(),
                    txtLugarNacimiento.getText(), txtAlergias.getText(), txtSinto.getText(), cad,cad2);
            m.setRowCount(0);
            for (int i = 0; i < cont; i++) {
                m.addRow(new Object[]{persona[i].getNombre(),persona[i].getApellidos(),persona[i].getEdad(),persona[i].getFecha_nac()
                        ,persona[i].getEstado(),persona[i].getSexo(),persona[i].getEstadocivil(),persona[i].getAlergias(),persona[i].getSinto()});
                txtNombre.setText(" ");
                txtApellidos.setText(" ");
                txtEdad.setText(" ");
                txtFechaNacimiento.setText(" ");
                cmbEstado.setSelectedItem(0);
                txtLugarNacimiento.setText(" ");
                txtAlergias.setText(" ");
                txtSinto.setText(" ");
                rbM.setSelected(false);
                rbF.setSelected(false);
                cbCasado.setSelected(false);
                cbSoltero.setSelected(false);
                
            }
        } catch (Exception ex) {
            Logger.getLogger(vtn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    
    
    private void txtFechaNacimientoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaNacimientoKeyReleased
         if(txtFechaNacimiento.getText().length()==2){
            txtFechaNacimiento.setText(txtFechaNacimiento.getText()+"/");
        }else if (txtFechaNacimiento.getText().length()==5){
            txtFechaNacimiento.setText(txtFechaNacimiento.getText()+"/");
        }
    }//GEN-LAST:event_txtFechaNacimientoKeyReleased

    private void tbSintoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSintoActionPerformed

 if(tbSinto.isSelected()){
           pnlSinto.setVisible(true);
       }else{
           txtSinto.setText("");
           pnlSinto.setVisible(false);
       }
                               

    }//GEN-LAST:event_tbSintoActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vtn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vtn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vtn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vtn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vtn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg1;
    private javax.swing.ButtonGroup bg2;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JCheckBox cbCasado;
    private javax.swing.JCheckBox cbSoltero;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel pnlAlergias;
    private javax.swing.JPanel pnlSinto;
    private javax.swing.JRadioButton rbF;
    private javax.swing.JRadioButton rbM;
    private javax.swing.JToggleButton tbAlergias;
    private javax.swing.JToggleButton tbSinto;
    private javax.swing.JTable tblPersonas;
    private javax.swing.JTextArea txtAlergias;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtLugarNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtSinto;
    // End of variables declaration//GEN-END:variables
}

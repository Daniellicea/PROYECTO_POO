
import javax.swing.JOptionPane;
import  java.sql.Connection;
import javax.swing.ImageIcon;


public class Form_registrar_usuario extends javax.swing.JFrame {

    public Form_registrar_usuario() {
        initComponents();
        verificarConexion();
        this.setResizable(false);
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lb_correo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        txt_contrasenia = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        btn_registrar_usuario = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lb_regresar = new javax.swing.JLabel();
        txt_departamento = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36, 36, 36));
        jPanel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

        jPanel5.setBackground(new java.awt.Color(80, 80, 80));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 171, 9));
        jPanel5.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 171, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AGREGAR");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 20, 340, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("USUARIO");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 340, -1));

        lb_correo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lb_correo.setForeground(new java.awt.Color(255, 255, 255));
        lb_correo.setText("Ingrese su usuario");
        jPanel5.add(lb_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese su departamento");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        txt_usuario.setBackground(new java.awt.Color(80, 80, 80));
        txt_usuario.setForeground(new java.awt.Color(255, 255, 255));
        txt_usuario.setBorder(null);
        jPanel5.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 170, 20));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingrese sus apellidos");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 177, -1, 10));

        txt_apellidos.setBackground(new java.awt.Color(80, 80, 80));
        txt_apellidos.setForeground(new java.awt.Color(255, 255, 255));
        txt_apellidos.setBorder(null);
        txt_apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidosActionPerformed(evt);
            }
        });
        jPanel5.add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 170, 20));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingrese su correo");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ingrese su contraseña");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        txt_correo.setBackground(new java.awt.Color(80, 80, 80));
        txt_correo.setForeground(new java.awt.Color(255, 255, 255));
        txt_correo.setBorder(null);
        txt_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correoActionPerformed(evt);
            }
        });
        jPanel5.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 170, 20));

        txt_contrasenia.setBackground(new java.awt.Color(80, 80, 80));
        txt_contrasenia.setForeground(new java.awt.Color(255, 255, 255));
        txt_contrasenia.setBorder(null);
        txt_contrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contraseniaActionPerformed(evt);
            }
        });
        jPanel5.add(txt_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 170, 20));
        jPanel5.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 171, 9));
        jPanel5.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 171, 9));
        jPanel5.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 171, 9));

        btn_registrar_usuario.setBackground(new java.awt.Color(36, 36, 36));
        btn_registrar_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registrar_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_registrar_usuarioMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("REGISTRAR USUARIO");

        javax.swing.GroupLayout btn_registrar_usuarioLayout = new javax.swing.GroupLayout(btn_registrar_usuario);
        btn_registrar_usuario.setLayout(btn_registrar_usuarioLayout);
        btn_registrar_usuarioLayout.setHorizontalGroup(
            btn_registrar_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        btn_registrar_usuarioLayout.setVerticalGroup(
            btn_registrar_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel5.add(btn_registrar_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 190, 40));

        lb_regresar.setForeground(new java.awt.Color(255, 255, 255));
        lb_regresar.setText("REGRESAR");
        lb_regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_regresar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        lb_regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_regresarMouseClicked(evt);
            }
        });
        jPanel5.add(lb_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, 20));

        txt_departamento.setBackground(new java.awt.Color(80, 80, 80));
        txt_departamento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_departamento.setForeground(new java.awt.Color(255, 255, 255));
        txt_departamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Administrativo" }));
        txt_departamento.setBorder(null);
        txt_departamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_departamentoActionPerformed(evt);
            }
        });
        jPanel5.add(txt_departamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 170, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 340, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void verificarConexion(){
        Connection conex = Conexion.conectar();
    }
        
    private  void limpiar_campo(){
        txt_usuario.setText("");
        txt_correo.setText("");
        txt_contrasenia.setText("");
        txt_apellidos.setText("");       
    }
    
    private void txt_apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidosActionPerformed

    private void txt_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correoActionPerformed

    private void txt_contraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contraseniaActionPerformed

    private void btn_registrar_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrar_usuarioMouseClicked
        String nom = txt_usuario.getText();
        String cor = txt_correo.getText();
        String con = txt_contrasenia.getText();
        if ((con.length() <8)){
            JOptionPane.showMessageDialog(this, "La contraseña debe ser de 8 caracteres","Error", JOptionPane.ERROR_MESSAGE);
            return;
        } 
        // Validación del formato del correo electrónico
        if (!cor.matches("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            JOptionPane.showMessageDialog(this, "Formato de correo electrónico inválido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String ape = txt_apellidos.getText();
        String depa = (String) txt_departamento.getSelectedItem();

        // Verificación de campos vacíos
        if (nom.isEmpty() || cor.isEmpty() || con.isEmpty() || ape.isEmpty() || depa.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        USER_CRUD usur = new USER_CRUD();
        boolean status = usur.InsertUsuario(nom, ape, cor, con, depa);

        if (status) {
            JOptionPane.showMessageDialog(this, "Usuario guardado", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Usuario no guardado", "Error", JOptionPane.ERROR_MESSAGE);
        }

        limpiar_campo();
        
    }//GEN-LAST:event_btn_registrar_usuarioMouseClicked

    private void txt_departamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_departamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_departamentoActionPerformed

    private void lb_regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_regresarMouseClicked
        Form_inicio_sesion nuevoFormulario = new Form_inicio_sesion();
        nuevoFormulario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lb_regresarMouseClicked

    
    
    
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
            java.util.logging.Logger.getLogger(Form_registrar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_registrar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_registrar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_registrar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_registrar_usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_registrar_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lb_correo;
    private javax.swing.JLabel lb_regresar;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_contrasenia;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JComboBox<String> txt_departamento;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}

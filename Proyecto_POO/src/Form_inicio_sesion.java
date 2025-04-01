
import javax.swing.JOptionPane;


public class Form_inicio_sesion extends javax.swing.JFrame {

    
    public Form_inicio_sesion() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        //this.setIconImage(img.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        lb_correo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_contrasenia = new javax.swing.JPasswordField();
        lb_olvido_contraseña = new javax.swing.JLabel();
        btn_iniciar_sesion = new javax.swing.JPanel();
        lb_iniciar_sesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(36, 36, 36));
        jPanel4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 272, -1));

        jPanel5.setBackground(new java.awt.Color(80, 80, 80));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 171, 9));
        jPanel5.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 171, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INICIO DE ");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SESION");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        txt_correo.setBackground(new java.awt.Color(80, 80, 80));
        txt_correo.setForeground(new java.awt.Color(255, 255, 255));
        txt_correo.setBorder(null);
        txt_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correoActionPerformed(evt);
            }
        });
        jPanel5.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 140, 190, 20));

        lb_correo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lb_correo.setForeground(new java.awt.Color(255, 255, 255));
        lb_correo.setText("Ingrese su correo");
        jPanel5.add(lb_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese su contraseña");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        txt_contrasenia.setBackground(new java.awt.Color(80, 80, 80));
        txt_contrasenia.setForeground(new java.awt.Color(255, 255, 255));
        txt_contrasenia.setBorder(null);
        txt_contrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contraseniaActionPerformed(evt);
            }
        });
        jPanel5.add(txt_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 211, 20));

        lb_olvido_contraseña.setForeground(new java.awt.Color(255, 255, 255));
        lb_olvido_contraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_olvido_contraseña.setText("¿Olvidaste tu contraseña?");
        lb_olvido_contraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_olvido_contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_olvido_contraseñaMouseClicked(evt);
            }
        });
        jPanel5.add(lb_olvido_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 220, -1));

        btn_iniciar_sesion.setBackground(new java.awt.Color(36, 36, 36));
        btn_iniciar_sesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_iniciar_sesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_iniciar_sesionMouseClicked(evt);
            }
        });

        lb_iniciar_sesion.setBackground(new java.awt.Color(255, 255, 255));
        lb_iniciar_sesion.setForeground(new java.awt.Color(255, 255, 255));
        lb_iniciar_sesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_iniciar_sesion.setText("Iniciar sesion");

        javax.swing.GroupLayout btn_iniciar_sesionLayout = new javax.swing.GroupLayout(btn_iniciar_sesion);
        btn_iniciar_sesion.setLayout(btn_iniciar_sesionLayout);
        btn_iniciar_sesionLayout.setHorizontalGroup(
            btn_iniciar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_iniciar_sesion, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btn_iniciar_sesionLayout.setVerticalGroup(
            btn_iniciar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_iniciar_sesionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lb_iniciar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.add(btn_iniciar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 100, 30));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 340, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correoActionPerformed

    private void txt_contraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contraseniaActionPerformed

    private void lb_olvido_contraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_olvido_contraseñaMouseClicked
        //Form_olvido_contraseña menu = new Form_olvido_contraseña();
        //menu.setVisible(true);
        //this.dispose();

    }//GEN-LAST:event_lb_olvido_contraseñaMouseClicked

    private void btn_iniciar_sesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_iniciar_sesionMouseClicked
        String correo = txt_correo.getText();
        String contrasenia = new String(txt_contrasenia.getPassword());

        if (!correo.matches("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            JOptionPane.showMessageDialog(this, "Formato de correo electrónico inválido","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //verificamos campos vacios
        if (correo.isEmpty() || contrasenia.isEmpty()){
            JOptionPane.showMessageDialog(this,"Todos los campos son obligatorios","Error",JOptionPane.ERROR_MESSAGE );
            return ;
    }//GEN-LAST:event_btn_iniciar_sesionMouseClicked
        try {        
        USER_CRUD usuario = new USER_CRUD();
        
        boolean credencialesValidas = usuario.verificar_inicio_sesion(correo, correo);
        
        if (credencialesValidas) {            
            int idUsuario = usuario.obtenerIdUsuario(correo);
            
            if (idUsuario > 0) {                
                
                //Menu_principal menu = new Menu_principal( idUsuario);
                //menu.setVisible(true);
                this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this,"Error al obtener ID de usuario","Error",JOptionPane.ERROR_MESSAGE);
                }
        } else {
            JOptionPane.showMessageDialog(this, "Correo o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos: " + e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }        
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_inicio_sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_iniciar_sesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lb_correo;
    private javax.swing.JLabel lb_iniciar_sesion;
    private javax.swing.JLabel lb_olvido_contraseña;
    private javax.swing.JPasswordField txt_contrasenia;
    private javax.swing.JTextField txt_correo;
    // End of variables declaration//GEN-END:variables
    }


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
        lb_correo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_departamento = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        btn_form_iniciar_sesion = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_contrasenia = new javax.swing.JPasswordField();
        btn_form_iniciar_sesion1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

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

        lb_correo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lb_correo.setForeground(new java.awt.Color(255, 255, 255));
        lb_correo.setText("Ingrese su correo");
        jPanel5.add(lb_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, 20));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese su departamento");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        txt_departamento.setBackground(new java.awt.Color(80, 80, 80));
        txt_departamento.setBorder(null);
        txt_departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_departamentoActionPerformed(evt);
            }
        });
        jPanel5.add(txt_departamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 170, 20));

        txt_correo.setBackground(new java.awt.Color(80, 80, 80));
        txt_correo.setBorder(null);
        jPanel5.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 170, 20));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingrese su contraseña");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 177, -1, 10));
        jPanel5.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 170, -1));

        btn_form_iniciar_sesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_form_iniciar_sesionMouseClicked(evt);
            }
        });

        jLabel6.setText("Ingresar");

        javax.swing.GroupLayout btn_form_iniciar_sesionLayout = new javax.swing.GroupLayout(btn_form_iniciar_sesion);
        btn_form_iniciar_sesion.setLayout(btn_form_iniciar_sesionLayout);
        btn_form_iniciar_sesionLayout.setHorizontalGroup(
            btn_form_iniciar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
        );
        btn_form_iniciar_sesionLayout.setVerticalGroup(
            btn_form_iniciar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel5.add(btn_form_iniciar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, 30));

        txt_contrasenia.setBackground(new java.awt.Color(80, 80, 80));
        txt_contrasenia.setBorder(null);
        jPanel5.add(txt_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 170, 20));

        btn_form_iniciar_sesion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_form_iniciar_sesion1MouseClicked(evt);
            }
        });

        jLabel7.setText("Registrar usuario");

        javax.swing.GroupLayout btn_form_iniciar_sesion1Layout = new javax.swing.GroupLayout(btn_form_iniciar_sesion1);
        btn_form_iniciar_sesion1.setLayout(btn_form_iniciar_sesion1Layout);
        btn_form_iniciar_sesion1Layout.setHorizontalGroup(
            btn_form_iniciar_sesion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btn_form_iniciar_sesion1Layout.setVerticalGroup(
            btn_form_iniciar_sesion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_form_iniciar_sesion1Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.add(btn_form_iniciar_sesion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 340, 350));

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

    private void txt_departamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_departamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_departamentoActionPerformed

    private void btn_form_iniciar_sesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_form_iniciar_sesionMouseClicked
        String cor = txt_correo.getText();
        String con = new String(txt_contrasenia.getPassword());
        String depa = txt_departamento.getText();
        

        if (!cor.matches("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            JOptionPane.showMessageDialog(this, "Formato de correo electrónico inválido","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (cor.isEmpty() || con.isEmpty() || depa.isEmpty()){
            JOptionPane.showMessageDialog(this,"Todos los campos son obligatorios","Error",JOptionPane.ERROR_MESSAGE );
            return ;       
        }
        try {        
        USER_CRUD usuario = new USER_CRUD();
        
        boolean credencialesValidas = usuario.verificar_inicio_sesion(cor, con, depa);
        
        if (credencialesValidas) {            
            int idUsuario = usuario.obtenerIdUsuario(cor);
            
            if (idUsuario > 0) {                
                
                /*Menu_principal menu = new Menu_principal( idUsuario);
                menu.setVisible(true);
                this.dispose();*/
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
    }//GEN-LAST:event_btn_form_iniciar_sesionMouseClicked

    private void btn_form_iniciar_sesion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_form_iniciar_sesion1MouseClicked
        Form_registrar_usuario menu = new Form_registrar_usuario();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_form_iniciar_sesion1MouseClicked
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_form_iniciar_sesion;
    private javax.swing.JPanel btn_form_iniciar_sesion1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lb_correo;
    private javax.swing.JPasswordField txt_contrasenia;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_departamento;
    // End of variables declaration//GEN-END:variables
    
}
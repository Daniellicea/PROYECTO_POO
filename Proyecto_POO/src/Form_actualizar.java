
import javax.swing.JOptionPane;


public class Form_actualizar extends javax.swing.JFrame {
    private int idUsuario;
    /**
     * Creates new form Form_actualizar
     */
    public Form_actualizar() {
        initComponents();
    }
    public Form_actualizar(int idUsuario) {
        initComponents();
        this.idUsuario = idUsuario;
        cargarDatosUsuario();
    }
private void cargarDatosUsuario() {
    try {
        USER_CRUD crud = new USER_CRUD();
        String datos = crud.cargarDatosUsuario(idUsuario);
        
        if (datos != null) {
            String[] partes = datos.split("\\|\\|\\|");
            if (partes.length >= 5) { // Ahora esperamos 5 partes incluyendo departamento
                txt_usuario.setText(partes[0]); // Nombre
                txt_apellidos.setText(partes[1]); // Apellidos
                txt_correo.setText(partes[2]); // Correo
                txt_contrasenia.setText(partes[3]); // Contraseña
                
                // Configurar el departamento en el ComboBox
                String departamento = partes[4];
                if (departamento.equalsIgnoreCase("Administrativo")) {
                    txt_departamento1.setSelectedIndex(1);
                } else {
                    txt_departamento1.setSelectedIndex(0);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, 
                "No se encontraron datos para el usuario con ID: " + idUsuario, 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, 
            "Error al cargar datos del usuario: " + e.getMessage(), 
            "Error", 
            JOptionPane.ERROR_MESSAGE);
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        txt_departamento = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lb_correo1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_usuario1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_apellidos1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_correo1 = new javax.swing.JTextField();
        txt_contrasenia1 = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        btn_actualizar = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txt_departamento1 = new javax.swing.JComboBox<>();
        lb_iniciar_sesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(80, 80, 80));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 171, 9));
        jPanel5.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 171, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ACTUALIZAR");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 20, 340, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("INFORMACION");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 340, -1));

        lb_correo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lb_correo.setForeground(new java.awt.Color(255, 255, 255));
        lb_correo.setText("Usuario");
        jPanel5.add(lb_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Departamento");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        txt_usuario.setBackground(new java.awt.Color(80, 80, 80));
        txt_usuario.setForeground(new java.awt.Color(255, 255, 255));
        txt_usuario.setBorder(null);
        jPanel5.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 170, 20));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellidos");
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
        jLabel3.setText("Correo");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contraseña");
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
        jLabel7.setText("Actualizar");

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

        jPanel1.setBackground(new java.awt.Color(36, 36, 36));
        jPanel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

        jPanel6.setBackground(new java.awt.Color(80, 80, 80));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 171, 9));
        jPanel6.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 171, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Actualizar");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 20, 340, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("USUARIO");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 340, -1));

        lb_correo1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lb_correo1.setForeground(new java.awt.Color(255, 255, 255));
        lb_correo1.setText("Usuario");
        jPanel6.add(lb_correo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Departamento");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        txt_usuario1.setBackground(new java.awt.Color(80, 80, 80));
        txt_usuario1.setForeground(new java.awt.Color(255, 255, 255));
        txt_usuario1.setBorder(null);
        jPanel6.add(txt_usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 170, 20));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Apellidos");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 177, -1, 10));

        txt_apellidos1.setBackground(new java.awt.Color(80, 80, 80));
        txt_apellidos1.setForeground(new java.awt.Color(255, 255, 255));
        txt_apellidos1.setBorder(null);
        txt_apellidos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidos1ActionPerformed(evt);
            }
        });
        jPanel6.add(txt_apellidos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 170, 20));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Correo");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Contraseña");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        txt_correo1.setBackground(new java.awt.Color(80, 80, 80));
        txt_correo1.setForeground(new java.awt.Color(255, 255, 255));
        txt_correo1.setBorder(null);
        txt_correo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correo1ActionPerformed(evt);
            }
        });
        jPanel6.add(txt_correo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 170, 20));

        txt_contrasenia1.setBackground(new java.awt.Color(80, 80, 80));
        txt_contrasenia1.setForeground(new java.awt.Color(255, 255, 255));
        txt_contrasenia1.setBorder(null);
        txt_contrasenia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contrasenia1ActionPerformed(evt);
            }
        });
        jPanel6.add(txt_contrasenia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 170, 20));
        jPanel6.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 171, 9));
        jPanel6.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 171, 9));
        jPanel6.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 171, 9));

        btn_actualizar.setBackground(new java.awt.Color(36, 36, 36));
        btn_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_actualizarMouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Actualizar");

        javax.swing.GroupLayout btn_actualizarLayout = new javax.swing.GroupLayout(btn_actualizar);
        btn_actualizar.setLayout(btn_actualizarLayout);
        btn_actualizarLayout.setHorizontalGroup(
            btn_actualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_actualizarLayout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );
        btn_actualizarLayout.setVerticalGroup(
            btn_actualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel6.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 190, 40));

        txt_departamento1.setBackground(new java.awt.Color(80, 80, 80));
        txt_departamento1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_departamento1.setForeground(new java.awt.Color(255, 255, 255));
        txt_departamento1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Administrativo" }));
        txt_departamento1.setBorder(null);
        txt_departamento1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_departamento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_departamento1ActionPerformed(evt);
            }
        });
        jPanel6.add(txt_departamento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 170, -1));

        lb_iniciar_sesion.setForeground(new java.awt.Color(255, 255, 255));
        lb_iniciar_sesion.setText("REGRESAR");
        lb_iniciar_sesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_iniciar_sesion.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        lb_iniciar_sesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_iniciar_sesionMouseClicked(evt);
            }
        });
        jPanel6.add(lb_iniciar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, 20));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 340, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
         String nombre = txt_usuario.getText().trim();
    String apellidos = txt_apellidos.getText().trim();
    String correo = txt_correo.getText().trim();
    String contrasenia = txt_contrasenia.getText().trim();
    String departamento = txt_departamento.getSelectedItem().toString();
    
    // Validaciones básicas
    if (nombre.isEmpty() || apellidos.isEmpty() || correo.isEmpty() || contrasenia.isEmpty()) {
        JOptionPane.showMessageDialog(this, 
            "Todos los campos son obligatorios", 
            "Error", 
            JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    if (!correo.matches("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
        JOptionPane.showMessageDialog(this, 
            "Formato de correo electrónico inválido", 
            "Error", 
            JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    try {
        USER_CRUD crud = new USER_CRUD();
        boolean actualizado = crud.actualizar_datos(idUsuario, nombre, apellidos, correo, contrasenia, departamento);
        
        if (actualizado) {
            JOptionPane.showMessageDialog(this, 
                "Usuario actualizado correctamente", 
                "Éxito", 
                JOptionPane.INFORMATION_MESSAGE);
            
            // Regresar al formulario de administración
            Form_administrar_usuarios adminUsuarios = new Form_administrar_usuarios();
            adminUsuarios.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, 
                "Error al actualizar el usuario", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, 
            "Error al actualizar: " + e.getMessage(), 
            "Error", 
            JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_btn_registrar_usuarioMouseClicked

    private void txt_departamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_departamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_departamentoActionPerformed

    private void txt_apellidos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidos1ActionPerformed

    private void txt_correo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correo1ActionPerformed

    private void txt_contrasenia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contrasenia1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contrasenia1ActionPerformed

    private void btn_actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actualizarMouseClicked
     
    }//GEN-LAST:event_btn_actualizarMouseClicked

    private void txt_departamento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_departamento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_departamento1ActionPerformed

    private void lb_iniciar_sesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_iniciar_sesionMouseClicked
        Form_administrar_usuarios nuevoFormulario = new Form_administrar_usuarios();
        nuevoFormulario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lb_iniciar_sesionMouseClicked

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
            java.util.logging.Logger.getLogger(Form_actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_actualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_actualizar;
    private javax.swing.JPanel btn_registrar_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lb_correo;
    private javax.swing.JLabel lb_correo1;
    private javax.swing.JLabel lb_iniciar_sesion;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_apellidos1;
    private javax.swing.JTextField txt_contrasenia;
    private javax.swing.JTextField txt_contrasenia1;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_correo1;
    private javax.swing.JComboBox<String> txt_departamento;
    private javax.swing.JComboBox<String> txt_departamento1;
    private javax.swing.JTextField txt_usuario;
    private javax.swing.JTextField txt_usuario1;
    // End of variables declaration//GEN-END:variables
}

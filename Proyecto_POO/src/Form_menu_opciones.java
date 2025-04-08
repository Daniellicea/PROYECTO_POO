
public class Form_menu_opciones extends javax.swing.JFrame {

    
    public Form_menu_opciones() {
        initComponents();
        
    }

    private int idUsuario;
    public Form_menu_opciones(int idUsuario) {
            initComponents();
            this.idUsuario = idUsuario;


            String nombre = new USER_CRUD().obtenerNombreUsuario(idUsuario);
            txt_nombre.setText(nombre);
    }
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txt_nombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_administrar_usuarios = new javax.swing.JPanel();
        ll = new javax.swing.JLabel();
        btn_comprar_articulos = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btn_administrar_articulos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_reporte_ventas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(36, 36, 36));
        jPanel4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 272, -1));

        jPanel1.setBackground(new java.awt.Color(80, 80, 80));

        txt_nombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USUARIO:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 70));

        btn_administrar_usuarios.setBackground(new java.awt.Color(80, 80, 80));
        btn_administrar_usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_administrar_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_administrar_usuariosMouseClicked(evt);
            }
        });

        ll.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ll.setForeground(new java.awt.Color(255, 255, 255));
        ll.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ll.setText("Administracion de usuarios");
        ll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                llMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_administrar_usuariosLayout = new javax.swing.GroupLayout(btn_administrar_usuarios);
        btn_administrar_usuarios.setLayout(btn_administrar_usuariosLayout);
        btn_administrar_usuariosLayout.setHorizontalGroup(
            btn_administrar_usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_administrar_usuariosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ll, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        btn_administrar_usuariosLayout.setVerticalGroup(
            btn_administrar_usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_administrar_usuariosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ll, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(btn_administrar_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 180, 50));

        btn_comprar_articulos.setBackground(new java.awt.Color(80, 80, 80));
        btn_comprar_articulos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_comprar_articulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_comprar_articulosMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Compra de articulos");

        javax.swing.GroupLayout btn_comprar_articulosLayout = new javax.swing.GroupLayout(btn_comprar_articulos);
        btn_comprar_articulos.setLayout(btn_comprar_articulosLayout);
        btn_comprar_articulosLayout.setHorizontalGroup(
            btn_comprar_articulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_comprar_articulosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        btn_comprar_articulosLayout.setVerticalGroup(
            btn_comprar_articulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_comprar_articulosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(btn_comprar_articulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        btn_administrar_articulos.setBackground(new java.awt.Color(80, 80, 80));
        btn_administrar_articulos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_administrar_articulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_administrar_articulosMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Administracion de articulos");

        javax.swing.GroupLayout btn_administrar_articulosLayout = new javax.swing.GroupLayout(btn_administrar_articulos);
        btn_administrar_articulos.setLayout(btn_administrar_articulosLayout);
        btn_administrar_articulosLayout.setHorizontalGroup(
            btn_administrar_articulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_administrar_articulosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        btn_administrar_articulosLayout.setVerticalGroup(
            btn_administrar_articulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_administrar_articulosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(btn_administrar_articulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        btn_reporte_ventas.setBackground(new java.awt.Color(80, 80, 80));
        btn_reporte_ventas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_reporte_ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_reporte_ventasMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reportes");

        javax.swing.GroupLayout btn_reporte_ventasLayout = new javax.swing.GroupLayout(btn_reporte_ventas);
        btn_reporte_ventas.setLayout(btn_reporte_ventasLayout);
        btn_reporte_ventasLayout.setHorizontalGroup(
            btn_reporte_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_reporte_ventasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        btn_reporte_ventasLayout.setVerticalGroup(
            btn_reporte_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_reporte_ventasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(btn_reporte_ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Regresar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void llMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_llMouseClicked
        Form_administrar_usuarios menu = new Form_administrar_usuarios(this.idUsuario);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_llMouseClicked

    private void btn_administrar_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_administrar_usuariosMouseClicked
        // TODO add your handling code here:
        Form_agregar registrarUsuarioForm = new Form_agregar();
        registrarUsuarioForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_administrar_usuariosMouseClicked

    private void btn_reporte_ventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reporte_ventasMouseClicked
        Reporte_ventas Reporte_ventas = new Reporte_ventas();
        Reporte_ventas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_reporte_ventasMouseClicked

    private void btn_administrar_articulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_administrar_articulosMouseClicked
        // TODO add your handling code here:
        Administrar_articulo administrar_articulo = new Administrar_articulo();
        administrar_articulo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_administrar_articulosMouseClicked

    private void btn_comprar_articulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_comprar_articulosMouseClicked
        // TODO add your handling code here:
        Form_comprar_articulos Form_comprar_articulos = new Form_comprar_articulos();
        Form_comprar_articulos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_comprar_articulosMouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        Form_inicio_sesion Form_inicio_sesion = new Form_inicio_sesion();
        Form_inicio_sesion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel3MouseClicked

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_menu_opciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_administrar_articulos;
    private javax.swing.JPanel btn_administrar_usuarios;
    private javax.swing.JPanel btn_comprar_articulos;
    private javax.swing.JPanel btn_reporte_ventas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel ll;
    private javax.swing.JLabel txt_nombre;
    // End of variables declaration//GEN-END:variables
}

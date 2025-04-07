

public class Reporte_ventas extends javax.swing.JFrame {

    
    public Reporte_ventas() {
        initComponents();
        addButtonText(btn_reporte_pedidos, "Reporte de Pedidos");
        addButtonText(btn_reporte_inventario, "Reporte de Inventario");
        addButtonText(btn_reporte_pedidos_por_fecha, "Pedidos por Fecha");
    }
    private static final String DB_URL = "jdbc:mysql://localhost:3306/tu_basedatos";
    private static final String DB_USER = "usuario";
    private static final String DB_PASS = "contraseña";
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txt_nombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_reporte_pedidos = new javax.swing.JPanel();
        btn_reporte_inventario = new javax.swing.JPanel();
        btn_reporte_pedidos_por_fecha = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(36, 36, 36));
        jPanel4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 272, -1));

        jPanel1.setBackground(new java.awt.Color(80, 80, 80));

        txt_nombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REPORTE DE VENTAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1030, 70));

        btn_reporte_pedidos.setBackground(new java.awt.Color(80, 80, 80));
        btn_reporte_pedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_reporte_pedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_reporte_pedidosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_reporte_pedidosLayout = new javax.swing.GroupLayout(btn_reporte_pedidos);
        btn_reporte_pedidos.setLayout(btn_reporte_pedidosLayout);
        btn_reporte_pedidosLayout.setHorizontalGroup(
            btn_reporte_pedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 186, Short.MAX_VALUE)
        );
        btn_reporte_pedidosLayout.setVerticalGroup(
            btn_reporte_pedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel4.add(btn_reporte_pedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        btn_reporte_inventario.setBackground(new java.awt.Color(80, 80, 80));
        btn_reporte_inventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_reporte_inventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_reporte_inventarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_reporte_inventarioLayout = new javax.swing.GroupLayout(btn_reporte_inventario);
        btn_reporte_inventario.setLayout(btn_reporte_inventarioLayout);
        btn_reporte_inventarioLayout.setHorizontalGroup(
            btn_reporte_inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 186, Short.MAX_VALUE)
        );
        btn_reporte_inventarioLayout.setVerticalGroup(
            btn_reporte_inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel4.add(btn_reporte_inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        btn_reporte_pedidos_por_fecha.setBackground(new java.awt.Color(80, 80, 80));
        btn_reporte_pedidos_por_fecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_reporte_pedidos_por_fecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_reporte_pedidos_por_fechaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_reporte_pedidos_por_fechaLayout = new javax.swing.GroupLayout(btn_reporte_pedidos_por_fecha);
        btn_reporte_pedidos_por_fecha.setLayout(btn_reporte_pedidos_por_fechaLayout);
        btn_reporte_pedidos_por_fechaLayout.setHorizontalGroup(
            btn_reporte_pedidos_por_fechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 186, Short.MAX_VALUE)
        );
        btn_reporte_pedidos_por_fechaLayout.setVerticalGroup(
            btn_reporte_pedidos_por_fechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel4.add(btn_reporte_pedidos_por_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_reporte_pedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reporte_pedidosMouseClicked
       try {
            generarReportePedidos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al generar el reporte: " + e.getMessage(), 
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_reporte_pedidosMouseClicked

    private void btn_reporte_inventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reporte_inventarioMouseClicked
        // TODO add your handling code here:
        try {
            generarReporteInventario();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al generar el reporte: " + e.getMessage(), 
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_reporte_inventarioMouseClicked

    private void btn_reporte_pedidos_por_fechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reporte_pedidos_por_fechaMouseClicked
        // TODO add your handling code here:
        try {
            // Mostrar diálogo para seleccionar rango de fechas
            String fechaInicio = JOptionPane.showInputDialog(this, "Fecha de inicio (YYYY-MM-DD):");
            String fechaFin = JOptionPane.showInputDialog(this, "Fecha de fin (YYYY-MM-DD):");
            
            if (fechaInicio != null && fechaFin != null && !fechaInicio.isEmpty() && !fechaFin.isEmpty()) {
                generarReportePedidosPorFecha(fechaInicio, fechaFin);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al generar el reporte: " + e.getMessage(), 
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_reporte_pedidos_por_fechaMouseClicked
    
    
     * @param args the command line arguments
     */

                                 
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
            java.util.logging.Logger.getLogger(Reporte_ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte_ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte_ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte_ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reporte_ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_reporte_inventario;
    private javax.swing.JPanel btn_reporte_pedidos;
    private javax.swing.JPanel btn_reporte_pedidos_por_fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel txt_nombre;
    // End of variables declaration//GEN-END:variables
}

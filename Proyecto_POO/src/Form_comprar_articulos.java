
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import javax.swing.*;
import java.awt.*;
import org.jfree.chart.title.LegendTitle;

public class Form_comprar_articulos extends javax.swing.JFrame {
    private int idUsuario;
    private int idArticulo;
    private String nombreArticulo;
    private int stockSolicitado;

    public Form_comprar_articulos() {
        initComponents();
        cargarTablaArticulos();
        mostrarGraficaArticulos(); // Mostrar gráfica al iniciar
    }
    /**
     * Creates new form Form_comprar_articulos
     */
    public Form_comprar_articulos(int idUsuario) {
        initComponents();
        this.idUsuario = idUsuario;
        cargarTablaArticulos();
        mostrarGraficaArticulos(); // Mostrar gráfica al iniciar
    }
    
    

    private void cargarTablaArticulos() {
        try {
            ARTICULOS_CRUD crud = new ARTICULOS_CRUD();
            ResultSet rs = crud.obtenerTodosArticulos();

            DefaultTableModel model = (DefaultTableModel) tablaArticulos.getModel();
            model.setRowCount(0); // Limpiar la tabla

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("id_articulo"),
                    rs.getString("nombre"),
                    rs.getString("descripcion"),
                    rs.getDouble("precio"),
                    rs.getInt("stock"),
                    rs.getString("estado")
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                "Error al obtener los artículos: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    private void mostrarGraficaArticulos() {
        try {
        ARTICULOS_CRUD articulosCrud = new ARTICULOS_CRUD();
        ResultSet rs = articulosCrud.obtenerTodosArticulosConPedidos();
        
        DefaultPieDataset dataset = new DefaultPieDataset();
        int totalArticulos = 0;
        int maxMostrar = 5; // Límite de artículos a mostrar
        
        while (rs.next() && totalArticulos < maxMostrar) {
            String nombre = rs.getString("nombre");
            int cantidad = rs.getInt("cantidad_pedidos");
            
            // Mostrar todos los artículos, incluso con 0 pedidos
            dataset.setValue(nombre + " (" + cantidad + ")", cantidad);
            totalArticulos++;
        }
        
        // Si no hay artículos (caso improbable)
        if (totalArticulos == 0) {
            dataset.setValue("No hay artículos registrados", 1);
        }
        
        // Crear el gráfico con estilo mejorado
        JFreeChart chart = ChartFactory.createPieChart(
            "Artículos y sus pedidos", // Título más descriptivo
            dataset,
            true,
            true,
            false
        );
        
        // Personalizar el gráfico
        chart.setBackgroundPaint(new Color(80, 80, 80)); // Fondo oscuro
        chart.getTitle().setPaint(Color.WHITE); // Título blanco
        
        // Configurar leyenda
        LegendTitle legend = chart.getLegend();
        legend.setBackgroundPaint(new Color(80, 80, 80));
        legend.setItemPaint(Color.WHITE);
        
        // Configurar el panel
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(690, 180));
        chartPanel.setBackground(new Color(80, 80, 80));
        
        // Actualizar el panel
        jPanel2.removeAll();
        jPanel2.setLayout(new BorderLayout());
        jPanel2.add(chartPanel, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this,
            "Error al cargar artículos: " + e.getMessage(),
            "Error",
            JOptionPane.ERROR_MESSAGE);
        
        // Mostrar gráfico vacío en caso de error
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Error cargando datos", 1);
        
        JFreeChart chart = ChartFactory.createPieChart(
            "Artículos y sus pedidos", dataset, true, true, false);
        
        ChartPanel chartPanel = new ChartPanel(chart);
        jPanel2.removeAll();
        jPanel2.add(chartPanel, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lb_correo1 = new javax.swing.JLabel();
        txt_articulo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_descrippcion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_precio = new javax.swing.JTextField();
        txt_cantidad = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        btn_realizar_pedido = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btn_regresar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaArticulos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        txt_stock = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36, 36, 36));
        jPanel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

        jPanel6.setBackground(new java.awt.Color(80, 80, 80));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 171, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("SOLICITUD");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 340, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("DE ARTICULOS");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 340, -1));

        lb_correo1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lb_correo1.setForeground(new java.awt.Color(255, 255, 255));
        lb_correo1.setText("Nombre del articulo:");
        jPanel6.add(lb_correo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 20));

        txt_articulo.setBackground(new java.awt.Color(80, 80, 80));
        txt_articulo.setForeground(new java.awt.Color(255, 255, 255));
        txt_articulo.setBorder(null);
        jPanel6.add(txt_articulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 170, 20));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Descripcion:");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, 20));

        txt_descrippcion.setBackground(new java.awt.Color(80, 80, 80));
        txt_descrippcion.setForeground(new java.awt.Color(255, 255, 255));
        txt_descrippcion.setBorder(null);
        txt_descrippcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_descrippcionActionPerformed(evt);
            }
        });
        jPanel6.add(txt_descrippcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 170, 20));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Precio:");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Cantidad:");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 70, -1));

        txt_precio.setBackground(new java.awt.Color(80, 80, 80));
        txt_precio.setForeground(new java.awt.Color(255, 255, 255));
        txt_precio.setBorder(null);
        txt_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_precioActionPerformed(evt);
            }
        });
        jPanel6.add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 170, 20));

        txt_cantidad.setBackground(new java.awt.Color(80, 80, 80));
        txt_cantidad.setForeground(new java.awt.Color(255, 255, 255));
        txt_cantidad.setBorder(null);
        txt_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cantidadActionPerformed(evt);
            }
        });
        jPanel6.add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 170, 20));
        jPanel6.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 171, 9));
        jPanel6.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 171, 9));
        jPanel6.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 171, 9));

        btn_realizar_pedido.setBackground(new java.awt.Color(36, 36, 36));
        btn_realizar_pedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_realizar_pedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_realizar_pedidoMouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Realizar pedido");

        javax.swing.GroupLayout btn_realizar_pedidoLayout = new javax.swing.GroupLayout(btn_realizar_pedido);
        btn_realizar_pedido.setLayout(btn_realizar_pedidoLayout);
        btn_realizar_pedidoLayout.setHorizontalGroup(
            btn_realizar_pedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_realizar_pedidoLayout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );
        btn_realizar_pedidoLayout.setVerticalGroup(
            btn_realizar_pedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel6.add(btn_realizar_pedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 190, 40));

        btn_regresar.setForeground(new java.awt.Color(255, 255, 255));
        btn_regresar.setText("REGRESAR");
        btn_regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_regresar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btn_regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_regresarMouseClicked(evt);
            }
        });
        jPanel6.add(btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, -1, 20));

        tablaArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Descripcion", "Precio", "Stock", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaArticulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaArticulosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaArticulos);
        if (tablaArticulos.getColumnModel().getColumnCount() > 0) {
            tablaArticulos.getColumnModel().getColumn(0).setResizable(false);
            tablaArticulos.getColumnModel().getColumn(1).setResizable(false);
            tablaArticulos.getColumnModel().getColumn(2).setResizable(false);
            tablaArticulos.getColumnModel().getColumn(3).setResizable(false);
            tablaArticulos.getColumnModel().getColumn(4).setResizable(false);
            tablaArticulos.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 690, 230));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 690, 180));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ARTICULOS MAS VENDIDOS");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Stock:");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 50, -1));
        jPanel6.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 171, 9));

        txt_stock.setBackground(new java.awt.Color(80, 80, 80));
        txt_stock.setForeground(new java.awt.Color(255, 255, 255));
        txt_stock.setBorder(null);
        txt_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_stockActionPerformed(evt);
            }
        });
        jPanel6.add(txt_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 170, 20));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 1170, 810));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_descrippcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_descrippcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_descrippcionActionPerformed

    private void txt_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_precioActionPerformed

    private void txt_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cantidadActionPerformed

    private void btn_realizar_pedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_realizar_pedidoMouseClicked
        
        try {
        // Validar que se haya seleccionado un artículo
        int filaSeleccionada = tablaArticulos.getSelectedRow();
        if (filaSeleccionada < 0) {
            JOptionPane.showMessageDialog(this, 
                "Debe seleccionar un artículo de la tabla", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Obtener datos del formulario
        int cantidadSolicitada = Integer.parseInt(txt_cantidad.getText());
        if (cantidadSolicitada <= 0) {
            JOptionPane.showMessageDialog(this, 
                "La cantidad debe ser mayor que cero", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Obtener el id del artículo seleccionado
        DefaultTableModel model = (DefaultTableModel) tablaArticulos.getModel();
        int idArticulo = (int) model.getValueAt(filaSeleccionada, 0);
        
        // Verificar stock disponible
        ARTICULOS_CRUD articulosCrud = new ARTICULOS_CRUD();
        int stockDisponible = articulosCrud.obtenerStockArticulo(idArticulo);
        
        if (cantidadSolicitada > stockDisponible) {
            JOptionPane.showMessageDialog(this, 
                "No hay suficiente stock disponible. Stock actual: " + stockDisponible, 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Crear el pedido
        boolean pedidoCreado = articulosCrud.crearPedido(idUsuario, idArticulo, cantidadSolicitada, "Pendiente");
        
        if (pedidoCreado) {
            // Actualizar el stock del artículo
            int nuevoStock = stockDisponible - cantidadSolicitada;
            articulosCrud.actualizarStockArticulo(idArticulo, nuevoStock);
            
            JOptionPane.showMessageDialog(this, 
                "Pedido realizado con éxito", 
                "Éxito", 
                JOptionPane.INFORMATION_MESSAGE);
            
            // Actualizar la interfaz
            cargarTablaArticulos();
            mostrarGraficaArticulos();
            
            // Limpiar campos
            txt_articulo.setText("");
            txt_descrippcion.setText("");
            txt_precio.setText("");
            txt_stock.setText("");
            txt_cantidad.setText("");
        } else {
            JOptionPane.showMessageDialog(this, 
                "Error al realizar el pedido", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, 
            "Por favor ingrese valores numéricos válidos", 
            "Error", 
            JOptionPane.ERROR_MESSAGE);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, 
            "Error en la base de datos: " + e.getMessage(), 
            "Error", 
            JOptionPane.ERROR_MESSAGE);
    }
    
    }//GEN-LAST:event_btn_realizar_pedidoMouseClicked

    private void btn_regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regresarMouseClicked
        Form_inicio_sesion nuevoFormulario = new Form_inicio_sesion();
        nuevoFormulario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_regresarMouseClicked

    private void tablaArticulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaArticulosMouseClicked
int filaSeleccionada = tablaArticulos.getSelectedRow();
    
    if (filaSeleccionada >= 0) { // Verificar que se haya seleccionado una fila válida
        DefaultTableModel model = (DefaultTableModel) tablaArticulos.getModel();
        
        // Obtener los datos de la fila seleccionada
        String nombre = model.getValueAt(filaSeleccionada, 1).toString();
        String descripcion = model.getValueAt(filaSeleccionada, 2).toString();
        String precio = model.getValueAt(filaSeleccionada, 3).toString();
        String stock = model.getValueAt(filaSeleccionada, 4).toString();
        
        // Asignar los valores a los campos de texto
        txt_articulo.setText(nombre);
        txt_descrippcion.setText(descripcion);
        txt_precio.setText(precio);
        txt_stock.setText(stock);
    }
    }//GEN-LAST:event_tablaArticulosMouseClicked

    private void txt_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_stockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_stockActionPerformed

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
            java.util.logging.Logger.getLogger(Form_comprar_articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_comprar_articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_comprar_articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_comprar_articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_comprar_articulos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_realizar_pedido;
    private javax.swing.JLabel btn_regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JLabel lb_correo1;
    private javax.swing.JTable tablaArticulos;
    private javax.swing.JTextField txt_articulo;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_descrippcion;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_stock;
    // End of variables declaration//GEN-END:variables
}

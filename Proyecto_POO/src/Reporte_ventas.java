import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Element;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Reporte_ventas extends javax.swing.JFrame {

    
    public Reporte_ventas() {
        initComponents();
        
    }       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txt_nombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_generar_reporte_pedidos_departamento = new javax.swing.JButton();
        btn_generar_reporte_inventario_articulos = new javax.swing.JButton();
        btn_generar_reporte_inventario_articulos_por_fecha = new javax.swing.JButton();

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

        btn_generar_reporte_pedidos_departamento.setText("GENERAR REPORTE DE PEDIDOS");
        btn_generar_reporte_pedidos_departamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_generar_reporte_pedidos_departamentoMouseClicked(evt);
            }
        });
        jPanel4.add(btn_generar_reporte_pedidos_departamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 60));

        btn_generar_reporte_inventario_articulos.setText("GENERAR REPORTE DE ARTICULOS");
        btn_generar_reporte_inventario_articulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generar_reporte_inventario_articulosActionPerformed(evt);
            }
        });
        jPanel4.add(btn_generar_reporte_inventario_articulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 220, 60));

        btn_generar_reporte_inventario_articulos_por_fecha.setText("GENERAR REPORTE DE ARTICULOS POR FECHA");
        btn_generar_reporte_inventario_articulos_por_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generar_reporte_inventario_articulos_por_fechaActionPerformed(evt);
            }
        });
        jPanel4.add(btn_generar_reporte_inventario_articulos_por_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 310, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_generar_reporte_pedidos_departamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_generar_reporte_pedidos_departamentoMouseClicked
        // TODO add your handling code here:
         Document documento = new Document();
        
        try{
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/OneDrive/Desktop/Reporte_pedido_departamento.pdf"));

            documento.open();

            // Fuente para el título
            Font fontTitulo = FontFactory.getFont("Arial", 20, Font.BOLD);
            Paragraph titulo = new Paragraph("PEDIDOS POR DEPARTAMENTOS", fontTitulo);
            titulo.setAlignment(Element.ALIGN_CENTER);
            documento.add(titulo);
            documento.add(new Paragraph(" "));

            // Fuente para los datos de la tabla
            Font fontDatos = FontFactory.getFont("Arial", 10);

            PdfPTable tabla = new PdfPTable(7);
            

            // Configurar fuente para las celdas de encabezado
            Font fontHeader = FontFactory.getFont("Arial", 10, Font.BOLD);

            PdfPCell cell;

            // Encabezados
            cell = new PdfPCell(new Phrase("ID solicitud", fontHeader));
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase("Usuario", fontHeader));
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase("Departamento", fontHeader));
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase("Cantidad", fontHeader));
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase("Fecha", fontHeader));
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase("Hora", fontHeader));
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase("Estado", fontHeader));
            tabla.addCell(cell);
                    
            ARTICULOS_CRUD CRUD = new ARTICULOS_CRUD();
        
            ResultSet rs = CRUD.reporteDepartameT();
            if(rs.next()){
                do{
                    tabla.addCell(new Phrase(rs.getString(1), fontDatos));
                    tabla.addCell(new Phrase(rs.getString(2), fontDatos));
                    tabla.addCell(new Phrase(rs.getString(3), fontDatos));
                    tabla.addCell(new Phrase(rs.getString(4), fontDatos));
                    tabla.addCell(new Phrase(rs.getString(5), fontDatos));
                    tabla.addCell(new Phrase(rs.getString(6), fontDatos));
                    tabla.addCell(new Phrase(rs.getString(7), fontDatos));
                }while(rs.next());
                documento.add(tabla);
            }
            documento.close();
            JOptionPane.showMessageDialog(this, "Reporte creado");
        }catch(DocumentException | FileNotFoundException | SQLException e){
             System.out.println("Error al generar PDF: " + e.getMessage());
        }
    }//GEN-LAST:event_btn_generar_reporte_pedidos_departamentoMouseClicked

    private void btn_generar_reporte_inventario_articulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generar_reporte_inventario_articulosActionPerformed
        Document documento = new Document();
    
        try{
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/OneDrive/Desktop/Reporte_inventario_de_articulos.pdf"));

            documento.open();

            // Fuente para el título
            Font fontTitulo = FontFactory.getFont("Arial", 20, Font.BOLD);
            Paragraph titulo = new Paragraph("INVENTARIO DE ARTICULOS", fontTitulo);
            titulo.setAlignment(Element.ALIGN_CENTER);
            documento.add(titulo);
            documento.add(new Paragraph(" "));

            // Fuente para los datos de la tabla
            Font fontDatos = FontFactory.getFont("Arial", 4);
            Font fontHeader = FontFactory.getFont("Arial", 4, Font.BOLD);

            PdfPTable tabla = new PdfPTable(10);

            // Encabezados
            PdfPCell cell;
            cell = new PdfPCell(new Phrase("Codigo articulo", fontHeader));
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase("Articulo", fontHeader));
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase("Descripcion", fontHeader));
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase("Precio unitario", fontHeader));
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase("Cantidad disponible", fontHeader));
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase("Estado inventario", fontHeader));
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase("Estado articulo", fontHeader));
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase("Fecha de ingreso", fontHeader));
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase("Ultima actualizacion", fontHeader));
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase("Numero de pedidos", fontHeader));
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase("Valor total", fontHeader));
            tabla.addCell(cell);            

            ARTICULOS_CRUD CRUD = new ARTICULOS_CRUD();

            ResultSet rs = CRUD.reporteArticulos_por_fecha();

            if(rs.next()){
                do{
                    tabla.addCell(new Phrase(rs.getString(1), fontDatos));
                    tabla.addCell(new Phrase(rs.getString(2), fontDatos));
                    tabla.addCell(new Phrase(rs.getString(3), fontDatos));
                    tabla.addCell(new Phrase(rs.getString(4), fontDatos));
                    tabla.addCell(new Phrase(rs.getString(5), fontDatos));
                    tabla.addCell(new Phrase(rs.getString(6), fontDatos));
                    tabla.addCell(new Phrase(rs.getString(7), fontDatos));
                    tabla.addCell(new Phrase(rs.getString(8), fontDatos));
                    tabla.addCell(new Phrase(rs.getString(9), fontDatos));
                    tabla.addCell(new Phrase(rs.getString(10), fontDatos));
                    tabla.addCell(new Phrase(rs.getString(11), fontDatos));                    
                }while(rs.next());
                documento.add(tabla);
            }
            documento.close();
            JOptionPane.showMessageDialog(this, "Reporte creado");
        }catch(DocumentException | FileNotFoundException | SQLException e){
             System.out.println("Error al generar PDF: " + e.getMessage());
        }
    }//GEN-LAST:event_btn_generar_reporte_inventario_articulosActionPerformed

    private void btn_generar_reporte_inventario_articulos_por_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generar_reporte_inventario_articulos_por_fechaActionPerformed
                Document documento = new Document();
    
        try{
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/OneDrive/Desktop/Reporte_inventario_de_articulos_por_fecha.pdf"));

            documento.open();

            // Fuente para el título
            Font fontTitulo = FontFactory.getFont("Arial", 20, Font.BOLD);
            Paragraph titulo = new Paragraph("INVENTARIO DE ARTICULOS POR FECHA", fontTitulo);
            titulo.setAlignment(Element.ALIGN_CENTER);
            documento.add(titulo);
            documento.add(new Paragraph(" "));

            // Fuente para los datos de la tabla
            Font fontDatos = FontFactory.getFont("Arial", 10);
            Font fontHeader = FontFactory.getFont("Arial", 10, Font.BOLD);

            PdfPTable tabla = new PdfPTable(10);

            // Encabezados
            PdfPCell cell;
            cell = new PdfPCell(new Phrase("Numero de pedido", fontHeader));
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase("Cliente", fontHeader));
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase("Departamento", fontHeader));
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase("Articulo", fontHeader));
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase("Cantidad", fontHeader));
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase("Precio unitario", fontHeader));
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase("Total del pedido", fontHeader));
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase("Estado", fontHeader));
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase("Fecha del pedido", fontHeader));
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase("Hora del pedido", fontHeader));
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase("Ultima actualizacion", fontHeader));
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase("Dias transcurridos", fontHeader));
            tabla.addCell(cell);

            ARTICULOS_CRUD CRUD = new ARTICULOS_CRUD();

            ResultSet rs = CRUD.reporteArticulos_por_fecha();

            if(rs.next()){
                do{
                    tabla.addCell(new Phrase(rs.getString(1), fontDatos));
                    tabla.addCell(new Phrase(rs.getString(2), fontDatos));
                    tabla.addCell(new Phrase(rs.getString(3), fontDatos));
                    tabla.addCell(new Phrase(rs.getString(4), fontDatos));
                    tabla.addCell(new Phrase(rs.getString(5), fontDatos));
                    tabla.addCell(new Phrase(rs.getString(6), fontDatos));
                    tabla.addCell(new Phrase(rs.getString(7), fontDatos));
                    tabla.addCell(new Phrase(rs.getString(8), fontDatos));
                    tabla.addCell(new Phrase(rs.getString(9), fontDatos));
                    tabla.addCell(new Phrase(rs.getString(10), fontDatos));
                    tabla.addCell(new Phrase(rs.getString(11), fontDatos));
                    tabla.addCell(new Phrase(rs.getString(12), fontDatos));
                }while(rs.next());
                documento.add(tabla);
            }
            documento.close();
            JOptionPane.showMessageDialog(this, "Reporte creado");
        }catch(DocumentException | FileNotFoundException | SQLException e){
             System.out.println("Error al generar PDF: " + e.getMessage());
        }
    }//GEN-LAST:event_btn_generar_reporte_inventario_articulos_por_fechaActionPerformed
                    
    
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
    private javax.swing.JButton btn_generar_reporte_inventario_articulos;
    private javax.swing.JButton btn_generar_reporte_inventario_articulos_por_fecha;
    private javax.swing.JButton btn_generar_reporte_pedidos_departamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel txt_nombre;
    // End of variables declaration//GEN-END:variables
}

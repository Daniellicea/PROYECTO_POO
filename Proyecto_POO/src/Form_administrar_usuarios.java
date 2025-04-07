import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Form_administrar_usuarios extends javax.swing.JFrame {

    public Form_administrar_usuarios() {
        initComponents();
    }
    
    private int idUsuario; 
    
    public Form_administrar_usuarios(int idUsuario) {
        initComponents();
        this.idUsuario = idUsuario;
    } 
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txt_id = new javax.swing.JTextField();
        btn_buscar_por_id = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_buscar_todos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_actualizar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btn_limpiar = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(36, 36, 36));
        jPanel4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 272, -1));

        jPanel1.setBackground(new java.awt.Color(80, 80, 80));

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMINISTRACION DE USUARIOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1064, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 80));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellidos", "Correo", "Departamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 870, 260));
        jPanel4.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 100, 30));

        btn_buscar_por_id.setBackground(new java.awt.Color(80, 80, 80));
        btn_buscar_por_id.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscar_por_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_buscar_por_idMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Buscar por id");

        javax.swing.GroupLayout btn_buscar_por_idLayout = new javax.swing.GroupLayout(btn_buscar_por_id);
        btn_buscar_por_id.setLayout(btn_buscar_por_idLayout);
        btn_buscar_por_idLayout.setHorizontalGroup(
            btn_buscar_por_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_buscar_por_idLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );
        btn_buscar_por_idLayout.setVerticalGroup(
            btn_buscar_por_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel4.add(btn_buscar_por_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 150, 30));

        btn_buscar_todos.setBackground(new java.awt.Color(80, 80, 80));
        btn_buscar_todos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscar_todos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_buscar_todosMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Mostrar todos");

        javax.swing.GroupLayout btn_buscar_todosLayout = new javax.swing.GroupLayout(btn_buscar_todos);
        btn_buscar_todos.setLayout(btn_buscar_todosLayout);
        btn_buscar_todosLayout.setHorizontalGroup(
            btn_buscar_todosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_buscar_todosLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );
        btn_buscar_todosLayout.setVerticalGroup(
            btn_buscar_todosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel4.add(btn_buscar_todos, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, -1, -1));

        btn_actualizar.setBackground(new java.awt.Color(80, 80, 80));
        btn_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_actualizarMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Actualizar");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_actualizarLayout = new javax.swing.GroupLayout(btn_actualizar);
        btn_actualizar.setLayout(btn_actualizarLayout);
        btn_actualizarLayout.setHorizontalGroup(
            btn_actualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_actualizarLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );
        btn_actualizarLayout.setVerticalGroup(
            btn_actualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel4.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, -1, -1));

        btn_eliminar.setBackground(new java.awt.Color(80, 80, 80));
        btn_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Eliminar");

        javax.swing.GroupLayout btn_eliminarLayout = new javax.swing.GroupLayout(btn_eliminar);
        btn_eliminar.setLayout(btn_eliminarLayout);
        btn_eliminarLayout.setHorizontalGroup(
            btn_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        btn_eliminarLayout.setVerticalGroup(
            btn_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel4.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, -1));

        btn_agregar.setBackground(new java.awt.Color(80, 80, 80));
        btn_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregarMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Agregar");

        javax.swing.GroupLayout btn_agregarLayout = new javax.swing.GroupLayout(btn_agregar);
        btn_agregar.setLayout(btn_agregarLayout);
        btn_agregarLayout.setHorizontalGroup(
            btn_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_agregarLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        btn_agregarLayout.setVerticalGroup(
            btn_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel4.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, -1, -1));

        btn_limpiar.setBackground(new java.awt.Color(80, 80, 80));
        btn_limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_limpiarMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Limpiar");

        javax.swing.GroupLayout btn_limpiarLayout = new javax.swing.GroupLayout(btn_limpiar);
        btn_limpiar.setLayout(btn_limpiarLayout);
        btn_limpiarLayout.setHorizontalGroup(
            btn_limpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
            .addGroup(btn_limpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_limpiarLayout.createSequentialGroup()
                    .addContainerGap(10, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(4, 4, 4)))
        );
        btn_limpiarLayout.setVerticalGroup(
            btn_limpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
            .addGroup(btn_limpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_limpiarLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel4.add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, -1, -1));

        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Regresar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 420, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscar_por_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscar_por_idMouseClicked
        // TODO add your handling code here:
        String idTexto = txt_id.getText().trim();
        if (idTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "Por favor, ingrese un ID para buscar.", 
                "Campo vacío", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            int id = Integer.parseInt(idTexto);
            USER_CRUD crud = new USER_CRUD();
            ResultSet rs = crud.Buscar_por_id(id);

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0); // Limpiar la tabla

            if (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("id_usuario"),
                    rs.getString("nombre"),
                    rs.getString("apellidos"),
                    rs.getString("correo"),
                    rs.getString("departamento"),                   
                });
            } else {
                JOptionPane.showMessageDialog(this, 
                    "No se encontró un usuario con el ID proporcionado.", 
                    "No encontrado", 
                    JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, 
                "El ID debe ser un número entero.", 
                "Formato inválido", 
                JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                "Error al buscar el usuario: " + e.getMessage(), 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_buscar_por_idMouseClicked

    private void btn_buscar_todosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscar_todosMouseClicked
            // TODO add your handling code here:
        DefaultTableModel modeloT = (DefaultTableModel) jTable1.getModel();
        modeloT.setRowCount(0); // Limpiar la tabla

        try {
            USER_CRUD crud = new USER_CRUD();
            ResultSet todos = crud.obtenerTodosUsuarios();

            while(todos.next()) {
                modeloT.addRow(new Object[]{
                    todos.getInt("id_usuario"),
                    todos.getString("nombre"),
                    todos.getString("apellidos"),
                    todos.getString("correo"),
                    todos.getString("departamento"),                    
                });
            }
        } catch(SQLException x) {
            System.out.println("Error al llenar la tabla: " + x.getMessage());
            JOptionPane.showMessageDialog(this, 
                "Error al cargar los usuarios: " + x.getMessage(), 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_buscar_todosMouseClicked

    private void btn_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseClicked
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, 
                "Por favor, seleccione un usuario para eliminar.", 
                "Selección requerida", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, 
            "¿Está seguro de que desea eliminar este usuario permanentemente?", 
            "Confirmar eliminación", 
            JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            int id = (int) jTable1.getValueAt(selectedRow, 0);

            try {
                USER_CRUD crud = new USER_CRUD();
                boolean eliminado = crud.eliminarUsuario(id);

                if (eliminado) {
                    JOptionPane.showMessageDialog(this, 
                        "Usuario eliminado correctamente.", 
                        "Éxito", 
                        JOptionPane.INFORMATION_MESSAGE);
                    limpiar_campo();
                } else {
                    JOptionPane.showMessageDialog(this, 
                        "Error al eliminar el usuario.", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, 
                    "Error al eliminar el usuario: " + e.getMessage(), 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_btn_eliminarMouseClicked

    private void btn_limpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_limpiarMouseClicked
        // TODO add your handling code here:
        limpiar_campo();
    }//GEN-LAST:event_btn_limpiarMouseClicked

    private void btn_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarMouseClicked
        // TODO add your handling code here:
        Form_agregar registrarUsuarioForm = new Form_agregar();
        registrarUsuarioForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_agregarMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
       
    }//GEN-LAST:event_jLabel5MouseClicked

    private void btn_actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actualizarMouseClicked
       try {
        // Obtener la fila seleccionada en la tabla
        int filaSeleccionada = jTable1.getSelectedRow();
        
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, 
                "Por favor seleccione un usuario de la tabla", 
                "Advertencia", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // Obtener el ID del usuario de la tabla (asumiendo que está en la columna 0)
        int idUsuario = (int) jTable1.getValueAt(filaSeleccionada, 0);
        
        // Crear y mostrar el formulario de actualización
        Form_actualizar formActualizar = new Form_actualizar(idUsuario);
        formActualizar.setVisible(true);
        this.dispose();
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, 
            "Error al intentar actualizar el usuario: " + e.getMessage(), 
            "Error", 
            JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btn_actualizarMouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        Form_menu_opciones Form_menu_opciones = new Form_menu_opciones(idUsuario);
        Form_menu_opciones.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel2MouseClicked
    private  void limpiar_campo(){
        DefaultTableModel modeloT = (DefaultTableModel) jTable1.getModel() ;
        modeloT.setRowCount (0);
        
        modeloT.addRow(new Object[]{"","","","",""});
        
    }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_administrar_usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_actualizar;
    private javax.swing.JPanel btn_agregar;
    private javax.swing.JPanel btn_buscar_por_id;
    private javax.swing.JPanel btn_buscar_todos;
    private javax.swing.JPanel btn_eliminar;
    private javax.swing.JPanel btn_limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
}

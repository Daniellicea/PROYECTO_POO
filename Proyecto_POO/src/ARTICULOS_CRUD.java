import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class ARTICULOS_CRUD {
    private Connection conexion;
    
    public ARTICULOS_CRUD(){
        conexion = Conexion.conectar();
    
    }
    public boolean insertarArticulo(String nombre, String descripcion, double precio, int stock, String estado) {
        String insertSQL = "INSERT INTO articulos(nombre, descripcion, precio, stock, estado) VALUES (?,?,?,?,?)";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(insertSQL);
            ps.setString(1, nombre);
            ps.setString(2, descripcion);
            ps.setDouble(3, precio);
            ps.setInt(4, stock);
            ps.setString(5, estado);
            
            return ps.executeUpdate() > 0;
        } catch(SQLException e) {
            System.out.println("Error al insertar artículo: " + e.getMessage());
            return false;
        }
    }
    
    public boolean actualizarArticulo(int idArticulo, String nombre, String descripcion, double precio, int stock, String estado) {
        String actualizarSQL = "UPDATE articulos SET nombre = ?, descripcion = ?, precio = ?, stock = ?, estado = ? WHERE id_articulo = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(actualizarSQL);
            ps.setString(1, nombre);
            ps.setString(2, descripcion);
            ps.setDouble(3, precio);
            ps.setInt(4, stock);
            ps.setString(5, estado);
            ps.setInt(6, idArticulo);
            
            return ps.executeUpdate() > 0;
        } catch(SQLException e) {
            System.out.println("Error al actualizar artículo: " + e.getMessage());
            return false;
        }
    }
   
    public boolean eliminarArticulo(int idArticulo) {
        String eliminarSQL = "DELETE FROM articulos WHERE id_articulo = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(eliminarSQL);
            ps.setInt(1, idArticulo);
            
            return ps.executeUpdate() > 0;
        } catch(SQLException e) {
            System.out.println("Error al eliminar artículo: " + e.getMessage());
            return false;
        }
    }
    
    public ResultSet buscarPorId(int idArticulo) {
        String buscarSQL = "SELECT * FROM articulos WHERE id_articulo = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(buscarSQL);
            ps.setInt(1, idArticulo);
            
            return ps.executeQuery();
        } catch(SQLException e) {
            System.out.println("Error al buscar artículo: " + e.getMessage());
            return null;
        }
    }
    

    
    
    public ResultSet obtenerTodosArticulos() throws SQLException {
        String sql = "SELECT id_articulo, nombre, descripcion, precio, stock, estado FROM articulos";
        PreparedStatement ps = conexion.prepareStatement(sql);
        return ps.executeQuery();
    }
    
    // Método para obtener el stock de un artículo específico
    public int obtenerStockArticulo(int idArticulo) throws SQLException {
        String sql = "SELECT stock FROM articulos WHERE id_articulo = ?";
        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setInt(1, idArticulo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("stock");
            }
            return 0; // Si no encuentra el artículo
        }
    }
    
    // Método para actualizar el stock de un artículo
    public boolean actualizarStockArticulo(int idArticulo, int nuevoStock) throws SQLException {
        String sql = "UPDATE articulos SET stock = ? WHERE id_articulo = ?";
        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setInt(1, nuevoStock);
            ps.setInt(2, idArticulo);
            return ps.executeUpdate() > 0;
        }
    }
    
    // Método para obtener los artículos más vendidos (para la gráfica)
    public ResultSet obtenerArticulosMasVendidos() throws SQLException {
        String sql = "SELECT a.nombre, SUM(p.cantidad) as cantidad_vendida " +
                     "FROM pedidos p " +
                     "JOIN articulos a ON p.id_articulo = a.id_articulo " +
                     "GROUP BY a.nombre " +
                     "ORDER BY cantidad_vendida DESC " +
                     "LIMIT 5"; // Los 5 más vendidos
        
        PreparedStatement ps = conexion.prepareStatement(sql);
        return ps.executeQuery();
    }
    
    // Método para crear un pedido (alternativa al que está en USER_CRUD)
    public boolean crearPedido(int idUsuario, int idArticulo, int cantidad, String estatus) throws SQLException {
        String sql = "INSERT INTO pedidos (id_usuario, id_articulo, cantidad, estatus, fecha_pedido) " +
                     "VALUES (?, ?, ?, ?, CURRENT_TIMESTAMP)";
        
        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setInt(1, idUsuario);
            ps.setInt(2, idArticulo);
            ps.setInt(3, cantidad);
            ps.setString(4, estatus);
            
            return ps.executeUpdate() > 0;
        }
    }
    
    
    public ResultSet obtenerTodosArticulosConPedidos() throws SQLException {
    String sql = "SELECT a.id_articulo, a.nombre, " +
                 "COALESCE(COUNT(p.id_articulo), 0) as cantidad_pedidos " +
                 "FROM articulos a " +
                 "LEFT JOIN pedidos p ON a.id_articulo = p.id_articulo " +
                 "GROUP BY a.id_articulo, a.nombre " +
                 "ORDER BY cantidad_pedidos DESC";
    
    PreparedStatement ps = conexion.prepareStatement(sql);
    return ps.executeQuery();
}
    
    
    
}    


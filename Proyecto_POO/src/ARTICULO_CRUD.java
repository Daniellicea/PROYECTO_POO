/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Emiliano
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ARTICULO_CRUD {
    private Connection conexion;
    
    public ARTICULO_CRUD() {
        conexion = Conexion.conectar();
    }
    
    /**
     * Inserta un nuevo artículo en la base de datos
     * @param nombre Nombre del artículo
     * @param descripcion Descripción del artículo
     * @param precio Precio del artículo
     * @param stock Cantidad en stock
     * @param estado Estado del artículo
     * @return true si la inserción fue exitosa, false en caso contrario
     */
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
    
    /**
     * Actualiza un artículo existente en la base de datos
     * @param idArticulo ID del artículo a actualizar
     * @param nombre Nuevo nombre
     * @param descripcion Nueva descripción
     * @param precio Nuevo precio
     * @param stock Nuevo stock
     * @param estado Nuevo estado
     * @return true si la actualización fue exitosa, false en caso contrario
     */
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
    
    /**
     * Elimina un artículo de la base de datos
     * @param idArticulo ID del artículo a eliminar
     * @return true si la eliminación fue exitosa, false en caso contrario
     */
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
    
    /**
     * Busca un artículo por su ID
     * @param idArticulo ID del artículo a buscar
     * @return ResultSet con los datos del artículo
     */
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
    
    /**
     * Obtiene todos los artículos de la base de datos
     * @return ResultSet con todos los artículos
     */
    public ResultSet obtenerTodosArticulos() {
        String consultaSQL = "SELECT * FROM articulos";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(consultaSQL);
            return ps.executeQuery();
        } catch(SQLException e) {
            System.out.println("Error al obtener artículos: " + e.getMessage());
            return null;
        }
    }
}


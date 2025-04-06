import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

public class USER_CRUD {
    private Connection conexion;
    
    public USER_CRUD(){
        conexion = Conexion.conectar();
    }
    
   public  boolean InsertUsuario (String nombre, String apellidos , String correo, String contra, String depa){
        String insertSQL="Insert into usuarios(nombre, apellidos , correo,contrasenia, departamento) values (?,?,?,?,?)";
        
        try{
            PreparedStatement ps = conexion.prepareStatement(insertSQL);
            ps.setString(1,nombre);
            ps.setString(2,apellidos);
            ps.setString(3,correo);
            ps.setString(4,contra);
            ps.setString(5,depa);
            
            return ps.executeUpdate()>0;
        }catch(SQLException e){
            System.out.println("Error al crear al usuario "+e.getMessage());
            return false;
        }
    }
 public boolean actualizar_datos (int idUsuario, String nombre, String apellidos, String correo, String contra){
        String actualizar = "UPDATE usuarios SET nombre = ?,apellidos = ?, correo = ?, contrasenia = ? WHERE id_usuario = ?";
        try{
            PreparedStatement ps = conexion.prepareStatement(actualizar);
            ps.setString(1,nombre);
            ps.setString(2,apellidos);
            ps.setString(3,correo);
            ps.setString(4,contra);
            ps.setInt(5, idUsuario);
            return ps.executeUpdate()>0;
        }catch(SQLException e){
            System.out.println("Error al actualizar al usuario "+e.getMessage());
            return false;
        }
    }
 
public boolean verificar_inicio_sesion(String correo, String contra, String depa) {
    String verificar = "SELECT * FROM usuarios WHERE correo = ? AND contrasenia = ? AND departamento = ?";
    
    try {
        // Preparar la consulta
        PreparedStatement verifi = conexion.prepareStatement(verificar);
        verifi.setString(1, correo);
        verifi.setString(2, contra);
        verifi.setString(3, depa);

        // Ejecutar la consulta y obtener los resultados
        ResultSet rs = verifi.executeQuery();

        // Si hay al menos un registro, el usuario y contraseña son válidos
        return rs.next();

    } catch (SQLException e) {
        System.out.println("Error al verificar el inicio de sesión: " + e.getMessage());
        return false;
        }
    }


    public ResultSet Buscar_por_id (int id){
        String sq_buscar_id = "Select * from usuarios where id_usuario = ? ";
        try{
            PreparedStatement ps = conexion.prepareStatement(sq_buscar_id);
            ps.setInt(1, id);
            return ps.executeQuery();
        }catch (SQLException e){
            System.out.println("Error al buscar por Idi"+e.getMessage());
            return null;
        }
    }
    public int obtenerIdUsuario(String correo) {
        String sql = "SELECT id_usuario FROM usuarios WHERE correo = ?";

        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setString(1, correo);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt("id_usuario");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener ID: " + e.getMessage());
        }
        return 0; // O algún valor por defecto que indique error
    }
    
    public String obtenerContrasenia(String correo) {
    String sql = "SELECT contrasenia FROM usuarios WHERE correo = ?";
    
    try (PreparedStatement ps = conexion.prepareStatement(sql)) {
        ps.setString(1, correo);
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            return rs.getString("contrasenia");
        }
    } catch (SQLException e) {
        System.out.println("Error al obtener contraseña: " + e.getMessage());
    }
    return null;
}
    
    public String obtenerNombreUsuario(int idUsuario) {
    String sql = "SELECT nombre, apellidos FROM usuarios WHERE id_usuario = ?";
    
    try (PreparedStatement ps = conexion.prepareStatement(sql)) {
        ps.setInt(1, idUsuario);       
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            return rs.getString("nombre") + " " + rs.getString("apellidos");
        }
    } catch (SQLException e) {
        System.out.println("Error al obtener nombre: " + e.getMessage());
    }
    return "";
}
    
    public String cargarDatosUsuario(int idUsuario) {
        String sql = "SELECT nombre, apellidos, correo, contrasenia FROM usuarios WHERE id_usuario = ?";

        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setInt(1, idUsuario);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getString("nombre") + "|||" + rs.getString("apellidos") + "|||" + rs.getString("correo") + "|||" + rs.getString("contrasenia");
            }
        } catch (SQLException e) {
            System.out.println("Error al cargar datos: " + e.getMessage());
        }
        return null;
    }
    ///////////////////////////////////////////////
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
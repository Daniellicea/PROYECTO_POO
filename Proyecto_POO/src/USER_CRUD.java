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
    
    public ResultSet obtenerTodosUsuarios() throws SQLException {
        String sql = "SELECT id_usuario, nombre, apellidos, correo, departamento FROM usuarios";
        PreparedStatement ps = conexion.prepareStatement(sql);
        return ps.executeQuery();
    }
    
    public ResultSet buscar_por_Id(int id) throws SQLException {
        String sql = "SELECT id_usuario, nombre, apellidos, correo, departamento FROM usuarios WHERE id_usuario = ?";
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, id);
        return ps.executeQuery();
    }

    public String cargarDatosUsuario(int idUsuario) {
    String sql = "SELECT nombre, apellidos, correo, contrasenia, departamento FROM usuarios WHERE id_usuario = ?";

    try (PreparedStatement ps = conexion.prepareStatement(sql)) {
        ps.setInt(1, idUsuario);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            return rs.getString("nombre") + "|||" + 
                   rs.getString("apellidos") + "|||" + 
                   rs.getString("correo") + "|||" + 
                   rs.getString("contrasenia") + "|||" +
                   rs.getString("departamento");
        }
    } catch (SQLException e) {
        System.out.println("Error al cargar datos: " + e.getMessage());
    }
    return null;
}

public boolean actualizar_datos(int idUsuario, String nombre, String apellidos, 
                              String correo, String contra, String departamento) {
    String actualizar = "UPDATE usuarios SET nombre = ?, apellidos = ?, correo = ?, "
                      + "contrasenia = ?, departamento = ? WHERE id_usuario = ?";
    try {
        PreparedStatement ps = conexion.prepareStatement(actualizar);
        ps.setString(1, nombre);
        ps.setString(2, apellidos);
        ps.setString(3, correo);
        ps.setString(4, contra);
        ps.setString(5, departamento);
        ps.setInt(6, idUsuario);
        return ps.executeUpdate() > 0;
    } catch (SQLException e) {
        System.out.println("Error al actualizar al usuario " + e.getMessage());
        return false;
    }
}
    
    public boolean eliminarUsuario(int id) throws SQLException {
        String sql = "DELETE FROM usuarios WHERE id_usuario = ?";
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, id);
        int rowsAffected = ps.executeUpdate();
        conexion.close();
        return rowsAffected > 0;
    }
    
   
    
    
    
    
    
    
    
    
    
    
    
}


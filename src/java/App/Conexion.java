package App;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexion {
    
    private static String JDBC_DRIVER="com.mysql.jdbc.Driver";
    private static String JDBC_URL="jdbc:mysql://localhost:3306/sporting?serverTimezone=UTC&useSSL=false";
    private static String JDBC_USER="root";
    private static String JDBC_PASS="";    
    private static Driver driver = null;
    
    
    public static synchronized Connection conectar() throws SQLException{
    
        if (driver ==null) {
            try {
                Class jdbcDriverClass = Class.forName(JDBC_DRIVER);
                driver = (Driver) jdbcDriverClass.newInstance();
                DriverManager.registerDriver(driver);
                
            } catch (Exception e) {
                e.printStackTrace();
                e.getCause();
                e.getMessage();
                e.getLocalizedMessage();
            }
        }
        
        Connection myConexion = DriverManager.getConnection(JDBC_URL,JDBC_USER, JDBC_PASS);
        
        return myConexion;
    }
    
    public static Connection conectar2(){//no se usa este método Conectar2
    
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost:3306/biblioteca","root","");
            
            return conexion;
                
        } catch(ClassNotFoundException e){
            
            return null;
        
        } catch (SQLException ex){
            
            return null;
        }       
        
    }
    
    //close ResultSet
    public static void close(ResultSet rs){
    
        try {
            
            if (rs !=null) {
                rs.close();
            }
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        }
    }
    
    //Close Statement
    
    public static void close(PreparedStatement stmt){
        
        try {
            if (stmt != null) {
                
                stmt.close();
            }
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        }
        
    
    }
    
    //close Connection
    public static void close(Connection conn) {
    //public static void close(Connection conn){
        
        try {
            
            if (conn != null) {
                
                conn.close();
            }            
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        }
    
    
    }
}

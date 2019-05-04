package login_ragister_design;

//import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 1BestCsharp
 */
public class jdbc {

    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname  = "music_info";
    private static Integer portnumber  = 3306;
    private static String password = "";
    
    public static Connection getConnection()
    {
        Connection jdbc = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        try {
            jdbc = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(" Get Connection -> " + jdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return jdbc;
    }

    public static void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
package pharmacymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ASUS
 */
public class database {
    
    public static Connection connectDb(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3307/pharmacy", "root", ""); // root is the default username while "" or empty is for the pass
            return connect;
        }catch(Exception e){e.printStackTrace();}
        return null;
    }
    
}

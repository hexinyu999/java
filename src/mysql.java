import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author hexin
 * @create 2021/6/18 16:40
 */
public class mysql {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/学生数据库?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args)  {
        Connection conn = null;
        Statement stmt = null;
        try {
            //加载驱动
            Class.forName(JDBC_DRIVER);


            try {
                conn = DriverManager.getConnection(DB_URL,USER,PASS);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            System.out.println(conn);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}

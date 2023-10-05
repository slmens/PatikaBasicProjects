package Week6.JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnect {
    public static final String DB_URL = "jdbc:mysql://localhost/employees";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        String sql = "Select * FROM employees";

        try {
            conn = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
            st = conn.createStatement();
            ResultSet data = st.executeQuery(sql);

            while (data.next()){
                System.out.println("##############");
                System.out.println("Employee ID: " + data.getInt("employee_id") + ", Employee Name: " + data.getString("employee_name") + ", Employee Poisition: " + data.getString("employee_position") + ", Employee Salary: " + data.getInt("employee_salary"));
            }


        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}

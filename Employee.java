package EMP;

import java.sql.*;

public class Employee {
    public static void main(String[] args) {
        String driver_name  = "com.mysql.cj.jdbc.Driver";
        String host = "jdbc:mysql://localhost:3306/Employee";
        String username = "root";
        String password = "Aryan1234@";
        String create_Table = """
        CREATE TABLE IF NOT EXISTS employee(id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(50) NOT NULL, dept VARCHAR(50), salary DECIMAL(10,2))
        """;
        try {
            Class.forName(driver_name);
            System.out.println("Driver ready");
            Connection con = DriverManager.getConnection(host,username, password);
            System.out.println("Host is ready");
            Statement smt  = con.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            smt.execute(create_Table);
            System.out.println("Table is ready");
//            int rowAffected  = smt.executeUpdate("""
//              insert into employee
//              (name,dept, salary) values('Emp2','IT',40000),('Emp3','IT',60000)
//              """);
//             if(rowAffected > 0){
//                 System.out.printl n("Record inserted");
//             } else {
//                 System.out.println("Record was not inserted");
//             }
            ResultSet rs  = smt.executeQuery("select * from employee");
            System.out.println("ID\tName\tDept\tSalary");

                 while(rs.next()){
                     rs.moveToInsertRow();
                     rs.updateString("name","Emp6");
                     rs.updateString("dept","MCA");
                     rs.updateDouble("Salary",80000);
                     rs.insertRow();
                     break;
                 }
            rs.close();
            smt.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e){
                   e.printStackTrace();
        }
    }
}

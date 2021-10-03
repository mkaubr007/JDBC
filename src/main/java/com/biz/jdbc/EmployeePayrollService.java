package com.biz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class EmployeePayrollService {

    public static void main(String[] args) throws SQLException {
        EmployeePayrollService service = new EmployeePayrollService();
        service.getConnection();
    }
    private Connection getConnection() {
        String url = "jdbc:mysql://127.0.0.1:3306/payroll_service";
        String userName = "root";
        String password = "Mkaubr007@gmail.com";
        Connection connection = null;
        try {
            //1 . load and register the driver
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection established");
        } catch (SQLException e) {
            System.out.println(e);
        }
        return connection;
    }

}

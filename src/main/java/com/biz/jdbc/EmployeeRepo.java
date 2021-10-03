package com.biz.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepo {
    private Connection getConnection() throws SQLException {
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


    public List<EmployeeInfo> retrieveData() throws SQLException {
        ResultSet resultSet = null;
        List<EmployeeInfo> employeeInfoList = new ArrayList<>();
        try (Connection connection = getConnection()) {
            Statement statement = connection.createStatement();
            String sql = "select * from employee_payroll;";
            resultSet = statement.executeQuery(sql);
            int count = 1;
            while (resultSet.next()) {
                count++;
                EmployeeInfo employeeInfo = new EmployeeInfo();
                employeeInfo.setId(resultSet.getInt("id"));
                employeeInfo.setName(resultSet.getString("name"));
                employeeInfo.setGender(resultSet.getString("gender"));
                employeeInfo.setStart_date(resultSet.getDate("start_date"));
                employeeInfo.setEmployee_phone(resultSet.getLong("employee_phone"));
                employeeInfo.setAddress(resultSet.getString("address"));
                employeeInfo.setDepartment(resultSet.getString("department"));
                employeeInfo.setBasic_pay(resultSet.getDouble("basic_pay"));
                employeeInfo.setDeductions(resultSet.getDouble("deductions"));
                employeeInfo.setTaxable_pay(resultSet.getDouble("taxable_pay"));
                employeeInfo.setIncome_tax(resultSet.getDouble("income_tax"));
                employeeInfo.setNet_pay(resultSet.getDouble("net_pay"));
                employeeInfo.setEmployeeId(resultSet.getInt("employeeId"));
                employeeInfoList.add(employeeInfo);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return employeeInfoList;
    }
    public void updateSalary(int id, int salary) {
        try (Connection connection = getConnection()) {
            Statement statement = connection.createStatement();
            String query = "update employee_payroll set salary=" + salary + " where id=" + id + "";
            int result = statement.executeUpdate(query);
            if (result == 1)
                System.out.println("salary updated");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}

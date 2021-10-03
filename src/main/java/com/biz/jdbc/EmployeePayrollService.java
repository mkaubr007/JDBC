package com.biz.jdbc;

import java.sql.SQLException;
import java.util.List;

public class EmployeePayrollService {
    EmployeeRepo employeeRepo=new EmployeeRepo();
    public static void main(String[] args) throws SQLException {
        EmployeePayrollService service = new EmployeePayrollService();
        service.retrieveData();
        service.updateSalary();
        service.updateSalaryUsingPreparedSt();
    }
    private void retrieveData() throws SQLException {
        List<EmployeeInfo> employeeInfoList = employeeRepo.retrieveData();
        System.out.println(employeeInfoList);
    }
   private void updateSalary(){
        employeeRepo.updateSalary(12,30000000);
   }
    private void updateSalaryUsingPreparedSt() {
        employeeRepo.updateSalaryUsingPreparedSt(12,80000);
    }
}

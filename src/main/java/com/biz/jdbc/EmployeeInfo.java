package com.biz.jdbc;

import java.util.Date;

public class EmployeeInfo {
    private int id;
    private String name;
    private double salary;
    private Date start_date;
    private  String gender;
    private long employee_phone;
    private String address;
    private String department;
    private double basic_pay;
    private double deductions;
    private double taxable_pay;
    private double income_tax;
    private double net_pay;
    private int employeeId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getEmployee_phone() {
        return employee_phone;
    }

    public void setEmployee_phone(long employee_phone) {
        this.employee_phone = employee_phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getBasic_pay() {
        return basic_pay;
    }

    public void setBasic_pay(double basic_pay) {
        this.basic_pay = basic_pay;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public double getTaxable_pay() {
        return taxable_pay;
    }

    public void setTaxable_pay(double taxable_pay) {
        this.taxable_pay = taxable_pay;
    }

    public double getIncome_tax() {
        return income_tax;
    }

    public void setIncome_tax(double income_tax) {
        this.income_tax = income_tax;
    }

    public double getNet_pay() {
        return net_pay;
    }

    public void setNet_pay(double net_pay) {
        this.net_pay = net_pay;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "EmployeeInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", start_date='" + start_date + '\'' +
                ", gender='" + gender + '\'' +
                ", employee_phone=" + employee_phone +
                ", address='" + address + '\'' +
                ", department='" + department + '\'' +
                ", basic_pay=" + basic_pay +
                ", deductions=" + deductions +
                ", taxable_pay=" + taxable_pay +
                ", income_tax=" + income_tax +
                ", net_pay=" + net_pay +
                ", employeeId=" + employeeId +
                '}';
    }
}
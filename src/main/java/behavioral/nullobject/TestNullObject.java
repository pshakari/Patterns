package main.java.behavioral.nullobject;

public class TestNullObject {
    public static void main(String[] args) {
        Employee employee = EmployeeData.getEmployee("Olga");
        Employee employee2 = EmployeeData.getEmployee("Kari");
        Employee employee3 = EmployeeData.getEmployee("Adam");
        Employee employee4 = EmployeeData.getEmployee("moa");

        System.out.println(employee.getName());
        System.out.println(employee2.getName());
        System.out.println(employee3.getName());
        System.out.println(employee4.getName());

    }
}

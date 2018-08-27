package main.java.behavioral.nullobject;

public class EmployeeData {
    public static final String[] names = {"Adam","Kari","Moa","Olga"};

    public static Employee getEmployee(String name) {
        for(String n: names) {
            if(n.equalsIgnoreCase(name)){
                return new Programmer(n);
            }
        }
        return new NoOne();
    }

}

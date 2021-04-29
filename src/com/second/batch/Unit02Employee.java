package com.second.batch;

public class Unit02Employee {
    private int empId = 101;
    private String name = "Ankit";
    private long salary = 50000L;
    public static String designation = "Developer";

    public Unit02Employee(int empId, String name, long salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
    public Unit02Employee() {
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
    public int getWorkingHours(){
        int mHours = 10;
        return mHours;
    }

    public static String getDesignation() {
        return designation;
    }

    public static void setDesignation(String designation) {
        Unit02Employee.designation = designation;
    }

    public static void main(String[] args) {
        Unit02Employee emp1 = new Unit02Employee();
        emp1.setEmpId(102);
        emp1.setName("Mahi");
        emp1.setSalary(100000L);
        System.out.println("empId : "+emp1.getEmpId());
        System.out.println("empName : "+emp1.getName());
        System.out.println("empSalary : "+emp1.getSalary());
        System.out.println("working hours : "+emp1.getWorkingHours());

        Unit02Employee emp2 = new Unit02Employee(201,"Amar",1000L);
        System.out.println("empId : "+emp2.getEmpId() + " empName : "+emp2.getName() +" empSalary : "+emp2.getSalary());

        System.out.println("designation : "+Unit02Employee.designation);
        Unit02Employee.setDesignation("Dev");
        System.out.println("designation : "+Unit02Employee.designation);

       // Item item = new Item(101,"mango");
        Item item =  Item.getInstance(101,"mango");
        System.out.println("itemId : "+item.getItemId());
        System.out.println("itemName : "+item.getItemName());

    }
}

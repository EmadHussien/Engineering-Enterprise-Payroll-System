public abstract class Employee {
    private static int IDs = 1000;

    public static int getIDs() {
        return IDs;
    }

    public static void setIDs(int IDs) {
        Employee.IDs = IDs;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    protected int empID;
    protected String empName;
    protected int empAge;
    protected double empSalary;

    public Employee(String empName , int empAge) {
        this.empID = IDs++;
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = 0;
    }

    public abstract double CalculateSalary();
    public abstract String showEmployeeData();

}

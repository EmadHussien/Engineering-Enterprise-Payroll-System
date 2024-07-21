public class HR extends Employee{
    public HR(String empName, int empAge) {
        super(empName, empAge);
    }

    @Override
    public double CalculateSalary() {
        return 4500;
    }

    @Override
    public String showEmployeeData() {
        return this.empID +" "+ this.empName + " " + this.empAge +" "+ CalculateSalary();
    }
}

public class Engineer extends Employee {

    double workingHours;
    Grade grade;

    public Engineer(String EngineerName, int EngineerAge, double workingHours, Grade grade)
    {
        super(EngineerName,EngineerAge);
        this.workingHours = workingHours;
        this.grade = grade;
    }


    @Override
    public double CalculateSalary() {
        return this.workingHours * grade.PayRate - (this.workingHours * grade.PayRate * grade.TaxRate);
    }

    @Override
    public String showEmployeeData() {
        return this.empID + " " + this.empName + " " + this.empAge + " " + this.workingHours + " " + this.grade.Position + " " + CalculateSalary();
    }
}

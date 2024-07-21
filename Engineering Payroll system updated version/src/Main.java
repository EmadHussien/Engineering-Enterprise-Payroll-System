//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // creating Admin Object and Login
        var admin = new Admin();
        var isLogged = admin.AdminLogin("emad@gmail.com","123456@emad");
        System.out.println(isLogged ? "Admin has Logged Successfully" : "Invalid Credentials");

        // Creating instances from Employees Types
        var engineer = new Engineer("Emad Hussein",26,8,new Grade(Position.TeamMember));
        var trainee = new Trainee("Mohamed Amr",25,"MUST",3.9,"2020");
        var hrEmployee = new HR("Salma Hussien", 28);

        // Adding Employees
        System.out.println(admin.AddEmployee(engineer));
        System.out.println(admin.AddEmployee(trainee));
        System.out.println(admin.AddEmployee(hrEmployee));
        // Read employees based on their types
        System.out.println(admin.viewEmployeesByType(Engineer.class));
        System.out.println(admin.viewEmployeesByType(Trainee.class));
        System.out.println(admin.viewEmployeesByType(HR.class));

        // Update Employees
        admin.EditExistingEmployee(engineer.getEmpID(), new Engineer("Emad Hussein Abdel", 26, 8, new Grade(Position.TeamMember)));
        admin.EditExistingEmployee(hrEmployee.getEmpID(), new HR("Salma Hussien Abdelaal", 28));

        // Delete Employee
        admin.deleteEmployee(1000);
        System.out.println(admin.viewEmployeesByType(Engineer.class));
        System.out.println(admin.viewEmployeesByType(Trainee.class));

        // calculating employees Salaries
        var engineerSalary = admin.CalculateSalary(engineer);
        System.out.println("Engineer Salary "+engineerSalary);

        var traineeSalary = admin.CalculateSalary(trainee);
        System.out.println("Trainee Salary "+traineeSalary);

    }
}
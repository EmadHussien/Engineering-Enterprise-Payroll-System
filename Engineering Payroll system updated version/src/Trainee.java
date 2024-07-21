public class Trainee extends Employee{
    String universityName;
    double GPA;
    String academicYear;
    private final double traineeSalary = 2000;


    public Trainee(String TraineeName , int TraineeAge , String university, double GPA,String academicYear)
    {
        super(TraineeName , TraineeAge);
        this.universityName = university;
        this.GPA = GPA;
        this.academicYear = academicYear;
    }

    @Override
    public double CalculateSalary() {
        return traineeSalary;
    }

    @Override
    public String showEmployeeData() {
        return  this.empID + " " + this.empName + " "+ this.empAge + " "+
                this.universityName+ " "+ this.GPA + " "+ CalculateSalary();
    }
}

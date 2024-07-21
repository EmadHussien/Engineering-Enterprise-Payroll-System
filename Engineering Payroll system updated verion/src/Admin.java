import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class Admin {
    private final String adminEmail = "emad@gmail.com";
    private final String adminPassword = "123456@emad";
    private boolean isLoggedIn = false;

    private Map<Class<?>, List<Employee>> employeeDictionary = new HashMap<>();

    public boolean AdminLogin(String email, String password)
    {
        if (adminEmail.equalsIgnoreCase(email) && adminPassword.equalsIgnoreCase(password)) {
            this.isLoggedIn = true;
            return true;
        }
        return false;
    }

    public String AddEmployee(Employee employee)
    {
        if (!isLoggedIn)
            return "{Status Code: 401 , Message: Not Authinticated }";

        Class<? extends Employee> employeeType = employee.getClass();
        if (!employeeDictionary.containsKey(employeeType)) {
            employeeDictionary.put(employeeType, new ArrayList<>());
        }
        employeeDictionary.get(employeeType).add(employee);

        return "{Status Code: 201 , Message: Employee "+employee.empName+" has been added successfully }";
    }

    public double CalculateSalary(Employee employee)
    {
        if (!isLoggedIn)
        {
            System.out.println("{Status Code: 401 , Message: Not Authinticated }");
            return 0;
        }
        return employee.CalculateSalary();
    }
    public <T extends Employee> String viewEmployeesByType(Class<T> classType) {
        if (!isLoggedIn)
            return "{Status Code: 401 , Message: Not Authenticated}";

        if (employeeDictionary.containsKey(classType)) {
            System.out.println("Employees of type " + classType.getSimpleName() + ":");
            for (Employee employee : employeeDictionary.get(classType)) {
                System.out.println(employee.showEmployeeData());
            }
        } else {
            System.out.println("No employees of type " + classType.getSimpleName() + " found.");
        }
        return "";
    }

    public void EditExistingEmployee(int empID,Employee employee)
    {
        if (!isLoggedIn)
        {
            System.out.println("{Status Code: 401 , Message: Not Authinticated }");
            return;
        }

        Object[] indexAndType = findIndexById(empID);

        int index = (int) indexAndType[0];
        Class<?> type = (Class<?>) indexAndType[1];

        if (index != -1 && employeeDictionary.containsKey(type)) {
            List<Employee> employeesOfType = employeeDictionary.get(type);
            employeesOfType.remove(index);
            employee.setEmpID(empID);
            employeesOfType.add(employee);
            System.out.println("{Status Code: 200 , Message: Employee "+ employee.empName + " has been Modified Successfully }");
        } else {
            System.out.println("Message: Employee Not Found");
        }
    }


    public void deleteEmployee(int empID) {
        if (!isLoggedIn) {
            System.out.println("{Status Code: 401 , Message: Not Authenticated }");
            return;
        }

        Object[] indexAndType = findIndexById(empID);

        int index = (int) indexAndType[0];
        Class<?> type = (Class<?>) indexAndType[1];

        if (index != -1 && employeeDictionary.containsKey(type)) {
            Employee employee = employeeDictionary.get(type).get(index);
            employeeDictionary.get(type).remove(index);
            System.out.println("{Status Code: 200 , Message: Employee "+ employee.empName +" has been Deleted Successfully }");
        } else {
            System.out.println("Message: Employee Not Found");
        }
    }


    private Object[] findIndexById(int id) {
        for (Map.Entry<Class<?>, List<Employee>> entry : employeeDictionary.entrySet()) {
            Class<?> employeeType = entry.getKey();
            List<Employee> employeesOfType = entry.getValue();

            for (int i = 0; i < employeesOfType.size(); i++) {
                if (employeesOfType.get(i).getEmpID() == id) {
                    return new Object[]{i, employeeType};
                }
            }
        }
        return new Object[]{-1, null};
    }

}

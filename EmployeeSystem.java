import java.util.ArrayList;
import java.util.List;

public class EmployeeSystem {
    private List<Employee> employees;

    public EmployeeSystem() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displaySalaries() {
        for (Employee e : employees) {
            System.out.println("Сотрудник: " + e.getName() +
                    ", Должность: " + e.getPosition() +
                    ", Зарплата: " + e.calculateSalary());
        }
    }
}

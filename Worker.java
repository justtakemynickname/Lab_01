public class Worker extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Worker(String name, String employeeId, String position, double hourlyRate, int hoursWorked) {
        super(name, employeeId, position);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

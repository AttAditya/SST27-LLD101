package exercise.wrappers;

import exercise.Employee;
import exercise.EmployeeCSV;

public class EmployeeCSVWrapper implements Employee {
    private EmployeeCSV employeeCSV;

    public EmployeeCSVWrapper(EmployeeCSV employeeCSV) {
        this.employeeCSV = employeeCSV;
    }

    @Override
    public String getId() {
        return this.employeeCSV.tokens()[0];
    }

    @Override
    public String getFirstName() {
        return this.employeeCSV.tokens()[0];
    }

    @Override
    public String getLastName() {
        return this.employeeCSV.tokens()[0];
    }

    @Override
    public String getEmail() {
        return this.employeeCSV.tokens()[0];
    }
}

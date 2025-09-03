package exercise.wrappers;

import exercise.Employee;
import exercise.EmployeeDB;

public class EmployeeDBWrapper implements Employee {
    private EmployeeDB employeeDB;

    public EmployeeDBWrapper(EmployeeDB employeeDB) {
        this.employeeDB = employeeDB;
    }

    @Override
    public String getId() {
        return this.employeeDB.getId() + "";
    }

    @Override
    public String getFirstName() {
        return this.employeeDB.getFirstName();
    }

    @Override
    public String getLastName() {
        return this.employeeDB.getSurname();
    }

    @Override
    public String getEmail() {
        return this.employeeDB.getEmailAddress();
    }
}

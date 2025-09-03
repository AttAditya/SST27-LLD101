package exercise.wrappers;

import exercise.Employee;
import exercise.EmployeeDB;

public class EmployeeDBWrapper implements Employee {
    private String id;
    private String firstName;
    private String lastName;
    private String email;

    public EmployeeDBWrapper(EmployeeDB employeeDB) {
        this.id = employeeDB.getId() + "";
        this.firstName = employeeDB.getFirstName();
        this.lastName = employeeDB.getSurname();
        this.email = employeeDB.getEmailAddress();
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getEmail() {
        return this.email;
    }
}

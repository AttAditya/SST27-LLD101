package exercise.wrappers;

import exercise.Employee;
import exercise.EmployeeCSV;

public class EmployeeCSVWrapper implements Employee {
    private String id;
    private String firstName;
    private String lastName;
    private String email;

    public EmployeeCSVWrapper(EmployeeCSV employeeCSV) {
        String[] tokens = employeeCSV.tokens();

        if (tokens.length != 4)
            throw new RuntimeException(
                "Invalid Token Count"
            );

        this.id = tokens[0];
        this.firstName = tokens[1];
        this.lastName = tokens[2];
        this.email = tokens[3];
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

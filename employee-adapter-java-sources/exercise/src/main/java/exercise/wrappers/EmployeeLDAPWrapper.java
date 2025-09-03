package exercise.wrappers;

import exercise.Employee;
import exercise.EmployeeLDAP;

public class EmployeeLDAPWrapper implements Employee {
    private String id;
    private String firstName;
    private String lastName;
    private String email;

    public EmployeeLDAPWrapper(EmployeeLDAP employeeLDAP) {
        this.id = employeeLDAP.get("uid");
        this.firstName = employeeLDAP.get("givenName");
        this.lastName = employeeLDAP.get("sn");
        this.email = employeeLDAP.get("mail");
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

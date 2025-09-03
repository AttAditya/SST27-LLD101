package exercise.wrappers;

import exercise.Employee;
import exercise.EmployeeLDAP;

public class EmployeeLDAPWrapper implements Employee {
    private EmployeeLDAP employeeLDAP;

    public EmployeeLDAPWrapper(EmployeeLDAP employeeLDAP) {
        this.employeeLDAP = employeeLDAP;
    }

    @Override
    public String getId() {
        return this.employeeLDAP.get("uid");
    }

    @Override
    public String getFirstName() {
        return this.employeeLDAP.get("givenName");
    }

    @Override
    public String getLastName() {
        return this.employeeLDAP.get("sn");
    }

    @Override
    public String getEmail() {
        return this.employeeLDAP.get("mail");
    }
}

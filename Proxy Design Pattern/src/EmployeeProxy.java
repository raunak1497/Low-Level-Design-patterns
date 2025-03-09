public class EmployeeProxy implements EmployeeDao {
    EmployeeDaoImpl employee;

    public EmployeeProxy() {
        this.employee = new EmployeeDaoImpl(); // Initialize the object
    }

    @Override
    public void create(String client, Employee obj) throws Exception {
        if (client.equals("ADMIN")) {
            employee.create(client, obj); // Call the actual method
            return; // Exit the method after successful execution
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if (client.equals("ADMIN")) {
            employee.delete(client, employeeId); // Call the actual method
            return; // Exit the method after successful execution
        }
        throw new Exception("Access Denied");
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        if (client.equals("ADMIN") || client.equals("USER")) {
            return employee.get(client, employeeId); // Call the actual method and return its result
        }
        throw new Exception("Access Denied");
    }
}
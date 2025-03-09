public class Main {
    public static void main(String[] args) {
        try {
            EmployeeDao employeeProxy = new EmployeeProxy();

            // Test create with ADMIN client (should succeed)
            employeeProxy.create("ADMIN", new Employee());
            System.out.println("Created a new employee");

            // Test create with USER client (should fail)
            employeeProxy.create("USER", new Employee());
            System.out.println("Created a new employee"); // This line will not be reached
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage()); // Prints "Access Denied"
        }

        try {
            EmployeeDao employeeProxy = new EmployeeProxy();

            // Test delete with ADMIN client (should succeed)
            employeeProxy.delete("ADMIN", 123);
            System.out.println("Deleted an employee");

            // Test delete with USER client (should fail)
            employeeProxy.delete("USER", 123);
            System.out.println("Deleted an employee"); // This line will not be reached
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage()); // Prints "Access Denied"
        }

        try {
            EmployeeDao employeeProxy = new EmployeeProxy();

            // Test get with ADMIN client (should succeed)
            Employee employee = employeeProxy.get("ADMIN", 123);
            System.out.println("Fetched employee: " + employee);

            // Test get with USER client (should succeed)
            employee = employeeProxy.get("USER", 123);
            System.out.println("Fetched employee: " + employee);

            // Test get with GUEST client (should fail)
            employee = employeeProxy.get("GUEST", 123);
            System.out.println("Fetched employee: " + employee); // This line will not be reached
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage()); // Prints "Access Denied"
        }
    }
}
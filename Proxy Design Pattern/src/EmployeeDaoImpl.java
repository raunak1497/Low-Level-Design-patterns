public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void create(String client,Employee obj){
        System.out.println("Added a User");
    }

    @Override
    public void delete(String client, int employeeId){
        System.out.println("Deleted a User");
    }

    @Override
    public Employee get(String client, int employeeId){
        System.out.println("Fetching a User");
        return new Employee();
    }
}

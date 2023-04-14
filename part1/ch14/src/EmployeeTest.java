public class EmployeeTest {
    public static void main(String[] args) {
        Employee    employeeLee = new Employee();
        Employee    employeeKim= new Employee();

        employeeLee.setEmployeeName("Lee");
        employeeKim.setEmployeeName("Kim");

        System.out.println(employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeId());
        System.out.println(Employee.getSerialNum());
    }
}

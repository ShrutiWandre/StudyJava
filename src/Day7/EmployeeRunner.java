package Day7;

import java.math.BigDecimal;

public class EmployeeRunner {

    public static void main(String[] args) {
            Employee employee = new Employee();
            employee.setPersonName("Shruti");
            employee.setPersonPhone("1111236440");
            employee.setPersonEmail("shruti@idigicloud.com");
            employee.setEmpEmployer("IDC");
            employee.setEmpTitle("Software Engineer");
            employee.setEmpGrade('A');
            employee.setEmpSalary(new BigDecimal(25000));
            System.out.println(employee);
    }
}

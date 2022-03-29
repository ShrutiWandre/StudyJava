package Day7;

import java.math.BigDecimal;

public class Employee extends Person{

    private String empTitle;
    private String empEmployer;
    private char empGrade;
    private BigDecimal empSalary;

    public String getEmpTitle() {
        return empTitle;
    }

    public void setEmpTitle(String empTitle) {
        this.empTitle = empTitle;
    }

    public String getEmpEmployer() {
        return empEmployer;
    }

    public void setEmpEmployer(String empEmployer) {
        this.empEmployer = empEmployer;
    }

    public char getEmpGrade() {
        return empGrade;
    }

    public void setEmpGrade(char empGrade) {
        this.empGrade = empGrade;
    }

    public String toString(){
        return super.toString() + "\tTitle --> " + empTitle + "\tEmployer --> " + empEmployer + "\tGrade --> " + empGrade
        + "\tSalary --> " + empSalary;
    }


    public BigDecimal getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(BigDecimal empSalary) {
        this.empSalary = empSalary;
    }





}

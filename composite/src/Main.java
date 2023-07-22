import com.rgl.composite.*;

public class Main {
    public static void main(String[] args) {
        // Create ITDepartment object
        Department itDepartment = new ITDepartment(101, "IT Department");

        // Create HRDepartment object
        Department hrDepartment = new HRDepartment(102, "HR Department");

        // Create FinanceDepartment object
        Department financeDepartment = new FinanceDepartment(103, "Finance Department");

        HeadDepartment headDepartment = new HeadDepartment(100, "Head Department");

        headDepartment.addDepartment(financeDepartment);
        headDepartment.addDepartment(itDepartment);
        headDepartment.addDepartment(hrDepartment);
        headDepartment.addDepartment(headDepartment);

        headDepartment.printDepartmentDetails();
    }
}
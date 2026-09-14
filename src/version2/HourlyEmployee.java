package version2;

public class HourlyEmployee {

    private int empID;
    private String empName;
    private float totalHoursWorked;
    private double ratePerHour;

    public HourlyEmployee() {
        this.empID = 0;
        this.empName = "N/A";
        this.totalHoursWorked = 0;
        this.ratePerHour = 0;
    }

    public HourlyEmployee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
        this.totalHoursWorked = 0;
        this.ratePerHour = 0;
    }

    public HourlyEmployee(int empID, String empName, float totalHoursWorked, double ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        setTotalHoursWorked(totalHoursWorked);
        setRatePerHour(ratePerHour);
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        if (totalHoursWorked < 0) {
            this.totalHoursWorked = 0;
        } else {
            this.totalHoursWorked = totalHoursWorked;
        }
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        if (ratePerHour < 0) {
            this.ratePerHour = 0;
        } else {
            this.ratePerHour = ratePerHour;
        }
    }

    public double computeSalary() {
        final double REGULAR_HOURS_THRESHOLD = 40;
        double salary;

        if (totalHoursWorked <= REGULAR_HOURS_THRESHOLD) {
            salary = totalHoursWorked * ratePerHour;
        } else {
            double regularPay = REGULAR_HOURS_THRESHOLD * ratePerHour;
            double overtimeHours = totalHoursWorked - REGULAR_HOURS_THRESHOLD;
            double overtimePay = overtimeHours * (ratePerHour * 1.5);
            salary = regularPay + overtimePay;
        }
        return salary;
    }

    public void displayHourlyEmployee() {
        System.out.printf("ID: %d | Name: %s | Hours: %.2f | Rate: ₱%.2f/hr%n",
                empID, empName, totalHoursWorked, ratePerHour);
    }

    @Override
    public String toString() {
        return String.format("HourlyEmployee [ID: %d, Name: %s, Hours: %.2f, Rate: ₱%.2f, Total Salary: ₱%.2f]",
                empID, empName, totalHoursWorked, ratePerHour, computeSalary());
    }
}

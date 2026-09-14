package version1;

public class Main {

    public static void main(String[] args) {

        System.out.println("--- Hourly Employee Test ---");

        HourlyEmployee hEmp1 = new HourlyEmployee(101, "Alice Smith");
        hEmp1.setTotalHoursWorked(45.0f);
        hEmp1.setRatePerHour(200.0);

        HourlyEmployee hEmp2 = new HourlyEmployee(102, "Mark Cruz", 38.5f, 150.0);

        System.out.println("\n[displayHourlyEmployee()]");
        hEmp1.displayHourlyEmployee();
        hEmp2.displayHourlyEmployee();

        System.out.println("\n[toString()]");
        System.out.println(hEmp1);
        System.out.println(hEmp2);

        System.out.println("\n--- Piece Worker Employee Test ---");

        PieceWorkerEmployee pEmp1 = new PieceWorkerEmployee(201, "Bob Jones");
        pEmp1.setTotalPiecesFinished(250);
        pEmp1.setRatePerPiece(15.0);

        PieceWorkerEmployee pEmp2 = new PieceWorkerEmployee(202, "Grace Lim", 95, 12.5);

        System.out.println("\n[displayPieceWorkerEmployee()]");
        pEmp1.displayPieceWorkerEmployee();
        pEmp2.displayPieceWorkerEmployee();

        System.out.println("\n[toString()]");
        System.out.println(pEmp1);
        System.out.println(pEmp2);

        System.out.println("\n--- Commission Employee Test ---");

        CommissionEmployee cEmp1 = new CommissionEmployee(301, "Carla Reyes");
        cEmp1.setTotalSale(75000.0);

        CommissionEmployee cEmp2 = new CommissionEmployee(302, "Dennis Uy", 620000.0);

        System.out.println("\n[displayCommissionEmployee()]");
        cEmp1.displayCommissionEmployee();
        cEmp2.displayCommissionEmployee();

        System.out.println("\n[toString()]");
        System.out.println(cEmp1);
        System.out.println(cEmp2);

        System.out.println("\n--- Base Plus Commission Employee Test ---");

        BasePlusCommissionEmployee bEmp1 = new BasePlusCommissionEmployee(401, "Ella Santos");
        bEmp1.setTotalSale(120000.0);
        bEmp1.setBaseSalary(10000.0);

        BasePlusCommissionEmployee bEmp2 = new BasePlusCommissionEmployee(402, "Frank Tan", 45000.0, 8000.0);

        System.out.println("\n[displayBasePlusCommissionEmployee()]");
        bEmp1.displayBasePlusCommissionEmployee();
        bEmp2.displayBasePlusCommissionEmployee();

        System.out.println("\n[toString()]");
        System.out.println(bEmp1);
        System.out.println(bEmp2);
    }
}

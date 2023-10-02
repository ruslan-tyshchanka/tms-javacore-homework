package HomeTask6.Register;

import java.time.*;
public class EmployeeContract implements Contract{
    int documentNumber;
    LocalDate documentDate;
    String employeeName;
    LocalDate contractEndDate;

    EmployeeContract()
    {
        documentNumber=random.nextInt(1,2000);
        documentDate=LocalDate.of(2023,10,2);
        employeeName="John Doe";
        contractEndDate=LocalDate.of(2024,10,2);
    }

    EmployeeContract(int documentNumber, LocalDate documentDate, String employeeName, LocalDate contractEndDate)
    {
        this.documentNumber=documentNumber;
        this.documentDate=documentDate;
        this.employeeName=employeeName;
        this.contractEndDate=contractEndDate;
    }

    public void displayContractInfo() {
        System.out.println("Document Number: "+documentNumber);
        System.out.println("Document Date: "+documentDate);
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Contract End Date: "+contractEndDate);
    }
}

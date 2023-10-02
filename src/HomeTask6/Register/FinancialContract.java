package HomeTask6.Register;

import java.time.*;

public class FinancialContract implements Contract{
    int documentNumber;
    LocalDate documentDate;
    int finalMonthlyAmount;
    String departmentCode;

    FinancialContract()
    {
        documentNumber=random.nextInt(1,2000);
        documentDate=LocalDate.of(2023,10,2);
        finalMonthlyAmount=0;
        departmentCode="Undefined";
    }

    FinancialContract(int documentNumber, LocalDate documentDate, int finalMonthlyAmount, String departmentCode)
    {
        this.documentNumber=documentNumber;
        this.documentDate=documentDate;
        this.finalMonthlyAmount=finalMonthlyAmount;
        this.departmentCode=departmentCode;
    }

    public void displayContractInfo() {
        System.out.println("Document Number: "+documentNumber);
        System.out.println("Document Date: "+documentDate);
        System.out.println("Final Monthly Amount: "+finalMonthlyAmount);
        System.out.println("Department Code: "+departmentCode);
    }
}

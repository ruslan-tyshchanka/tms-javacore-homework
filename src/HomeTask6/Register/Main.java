package HomeTask6.Register;

import java.time.*;

public class Main {
    public static void main(String[] args) {

        Register register = new Register();

        Contract contract1 = new ItemDistContract();
        register.displayInfo(contract1);
        register.saveDocument(contract1);

        Contract contract2 = new ItemDistContract(103, LocalDate.of(2022, 11,12), "Delivery", 10);
        register.displayInfo(contract2);
        register.saveDocument(contract2);

        Contract contract3 = new EmployeeContract();
        register.displayInfo(contract3);
        register.saveDocument(contract3);

        Contract contract4 = new EmployeeContract(1232, LocalDate.of(1990, 11,5),"Peter Parker", LocalDate.of(2000,5,4));
        register.displayInfo(contract4);
        register.saveDocument(contract4);

        Contract contract5 = new FinancialContract();
        register.displayInfo(contract5);
        register.saveDocument(contract5);

        Contract contract6 = new FinancialContract(445, LocalDate.of(2018, 3, 11), 3000, "DPT01");
        register.displayInfo(contract6);
        register.saveDocument(contract6);
    }
}

package HomeTask6.Register;

import java.time.*;

public class ItemDistContract implements Contract{
    int documentNumber;
    LocalDate documentDate;
    String itemType;
    int numberOfItems;

    ItemDistContract()
    {
        documentNumber=random.nextInt(1,2000);
        documentDate=LocalDate.of(1, 10,2);
        itemType="Undefined";
        numberOfItems=0;
    }
    ItemDistContract(int documentNumber, LocalDate documentDate, String itemType, int numberOfItems)
    {
        this.documentNumber=documentNumber;
        this.documentDate=documentDate;
        this.itemType=itemType;
        this.numberOfItems=numberOfItems;
    }
    public void displayContractInfo() {
        System.out.println("Document Number: "+documentNumber);
        System.out.println("Document Date: "+documentDate);
        System.out.println("Item Type: "+itemType);
        System.out.println("Number of Items: "+numberOfItems);
    }
}
